
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

    <title>Registration</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container">

<form action="/reg" method="post" class="row g-3" >
    <div class="col-md-6">
        <input type="text" name="name" class="form-control"  placeholder="Name" >
    </div>
    <div class="col-md-6">
        <input type="text" name="surname" class="form-control"  placeholder="Surname" >
    </div>
    <div class="col-md-6">
        <input type="text" name="age" class="form-control"  placeholder="Age" >
    </div>
        <div class="col-md-4">
            <select id="inputState" class="form-select" name="country"  >
                <option selected > Belarus</option>
                <option selected >England</option>
                <option selected >German</option>
                <option selected >Greek</option>
                <option selected >Italian</option>
                <option>...</option>
            </select>
        </div>
    <div class="col-md-6">
        <input type="text" name="login" class="form-control"  placeholder="Login">
    </div>
    <div class="col-12">
        <input type="text" class="form-control" name="password" placeholder="Password">
    </div>
    <div class="col-12">
        <input type="submit" value="Registration" class="btn btn-primary"></input>
    </div>

</form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>

</body>
</html>
