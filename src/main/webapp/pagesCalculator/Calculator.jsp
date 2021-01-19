<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
<jsp:include page="/pagesAuthorization/_header.jsp"/>
<div class="container">
    <label class="form-label">Calculator</label>
<form action="/calc" method="post">
        <div class="mb-3">
  <input type="text" class="form-control" name="FirstNumber" placeholder="First Number"
         style="width:260px; height:50px;">
</div><br>

            <div class="mb-3">
  <input type="text" class="form-control" name="SecondNumber" placeholder="Second Number"
         style="width:260px; height:50px;">
</div><br>

        <div class="btn-group" role="group" aria-label="Basic outlined example">
    <input type="submit" class="btn btn-primary" name="simbol" value="+" style="width:66px; height:50px;"></input>
    <input type="submit" class="btn btn-primary" name="simbol" value="-" style="width:66px; height:50px;"></input>
    <input type="submit" class="btn btn-primary" name="simbol" value="*" style="width:66px; height:50px;"></input>
    <input type="submit" class="btn btn-primary" name="simbol" value="/" style="width:66px; height:50px;"></input>
</div><br><br>
            <div class="mb-3">
  <input type="text" class="form-control" placeholder="${requestScope.result}" style="width:260px; height:50px;">
</div><br>
    </span>
</form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
        crossorigin="anonymous"></script>
</body>
</html>
