
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

    <title>Add Author</title>
</head>
<body>
<jsp:include page="/pagesAuthorization/_header.jsp"/>
<div class="container">

    <form class="row g-3" action="/addAuthor" method="post">
        <div class="col-md-6">
            <label class="form-label">Name Author</label>
            <input type="text" name="name" class="form-control">
        </div>
        <div class="col-md-6">
            <label  class="form-label">Surname</label>
            <input type="text" class="form-control" name="surname">
        </div>
        <div class="col-md-6">
            <label  class="form-label">Discription</label>
            <input type="text" class="form-control" name="discription" >
        </div><br>
        <div class="col-12">
            <button class="btn btn-primary" type="submit">Submit form</button>
        </div>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>

</body>
</html>
