
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Person List</title>
</head>
<body>

<jsp:include page="_header.jsp"/>
<div class="container">
<h3>Person List</h3>
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
    <c:forEach var="person" items="${sessionScope.personList}"  >
        <tr>
            <td> ${person.name}</td>
            <td> ${person.surname}</td>
            <td> ${person.age}</td>
            <td> ${person.location}</td>
            <td> ${person.login}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</div>
</body>
</html>
