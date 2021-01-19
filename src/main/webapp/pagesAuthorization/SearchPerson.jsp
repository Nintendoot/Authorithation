
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search</title>
</head>
<body>

<jsp:include page="_header.jsp"/>
<div class="container">
    <h3>Search</h3>
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Age</th>
            <th>Country</th>
            <th>Login</th>
        </tr>
        </thead>
        <tbody>
            <tr>
                <td> ${requestScope.per.name}</td>
                <td> ${requestScope.per.surname}</td>
                <td> ${requestScope.per.age}</td>
                <td> ${requestScope.per.location}</td>
                <td> ${requestScope.per.login}</td>
            </tr>
        </tbody>
    </table>

</div>
</body>
</html>
