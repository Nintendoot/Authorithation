
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <title>_headers</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <c:if test="${sessionScope.person!=null}">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Hello ${sessionScope.person.name}</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        </c:if>
        <c:if test="${sessionScope.person==null}">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Hello Guest</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            </c:if>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/home">Home</a>
                </li>
            <c:if test="${sessionScope.person==null}">
                <li class="nav-item">
                    <a class="nav-link" href="/pagesAuthorization/Authorization.jsp">Authorization</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/pagesAuthorization/Registration.jsp">Registration</a>
                </li>
                </c:if>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Menu
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="/calc">Calculator</a></li>
                        <li><a class="dropdown-item" href="/all">All Person</a></li>
                    </ul>
                </li>
                <c:if test="${sessionScope.person!=null}">
                <li class="nav-item">
                    <a class="nav-link" href="/out" >Exit</a>
                </li>
            </ul>

            <form action="/search" method="get" class="d-flex">
                <input class="form-control me-2" type="text" name="login"  placeholder="Search Person" aria-label="Search">
                <input class="btn btn-outline-success" type="submit"/>
            </form>
            </c:if>
        </div>
    </div>
</nav>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
</body>
</html>
