package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.CarService;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));

      CarService carService = context.getBean(CarService.class);

      Car car1 = new Car("one", 1);
      Car car2 = new Car("two", 2);
      Car car3 = new Car("three", 3);
      Car car4 = new Car("four", 4);

      carService.add(car1);
      carService.add(car2);
      carService.add(car3);
      carService.add(car4);

      userService.add(new User("User5", "Lastname5", "user5@mail.ru", car1));
      userService.add(new User("User6", "Lastname6", "user6@mail.ru", car2));
      userService.add(new User("User7", "Lastname7", "user7@mail.ru", car3));
      userService.add(new User("User8", "Lastname8", "user8@mail.ru", car4));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("Car name = " + user.getCar().getName());
         System.out.println("Car series = " + user.getCar().getSeries());
         System.out.println();
      }

      context.close();
   }
}
