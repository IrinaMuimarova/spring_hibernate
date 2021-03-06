<%--
  Created by IntelliJ IDEA.
  User: А
  Date: 23.12.2019
  Time: 0:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Add new User</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>
        <a class="w3-btn w3-round-large" href="/logout">Log out</a>
    </h1>
</div>
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Add User</h1>
</div>
<div class="w3-container w3-padding">
    <div class="w3-card-4">
        <div class="w3-container w3-center w3-green">
            <h2>Add user</h2>
        </div>
        <form:form action="saveUser" method="post" class="w3-selection w3-light-grey w3-padding" modelAttribute="user">
            <form:hidden path="id"/>
            <label>Name:
                <form:input path="name" class="w3-input w3-animate-input w3-border w3-round-large"
                            style="width: 30%"/>
            </label>
            <label>Login:
                <form:input path="login" class="w3-input w3-animate-input w3-border w3-round-large"
                            style="width: 30%"/>
            </label>
            <label>Password:
                <form:input path="password" class="w3-input w3-animate-input w3-border w3-round-large"
                            style="width: 30%"/>
            </label>
            <label>Role:
                <br><form:checkbox path="roles" value="ADMIN" label="ADMIN"/></br>
                <br><form:checkbox path="roles" value="USER" label="USER"/></br>
            </label>
            <form:button class="w3-btn w3-green w3-round-large w3-margin-bottom">Sing Up</form:button>
        </form:form>
    </div>

    <div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
        <label>
            <button class="w3-btn w3-round-large" onclick="location.href='../../..'">Back to main</button>
        </label>
    </div>
</div>
</body>
</html>
