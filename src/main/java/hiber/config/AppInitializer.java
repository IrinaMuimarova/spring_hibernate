package hiber.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class <?> [] getRootConfigClasses() {
        return new Class[] {
                WebMvcConfig.class, HiberConfig.class, SecurityConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
//        return new Class[]{
//                WebMvcConfig.class
//        };
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }
}