

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

    <title>Author Views </title>
</head>
<body>
<jsp:include page="/pagesAuthorization/_header.jsp"/>
<div class="container">
    <p>Name ${requestScope.Author}</p>
    <p>Description ${requestScope.Author.discription}</p>
    <p></p>
    <div class="row row-cols-3">
        <c:forEach items="${requestScope.Author.arrays}" var="book">

            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="${book.img}" class="card-img-top" alt="...">

                    <div class="container">
                        <form action="/linkAuthor" method="get">
                            <h4>${book.name}</h4>
                            <input type="hidden" name="id" value="${book.author.id}">
                            <button>${book.author}</button>
                            <h5 class="card-title">Genre: ${book.genre}</h5>
                        <c:if test="${sessionScope.isUser}">
                        </form>
                        <form action="/basket" method="get">
                            <input type="hidden" name="id" value="${book.id}">
                            <button>Add</button>
                        </form>
                        </c:if>
                    </div>
                </div>
            </div><br>
        </c:forEach>

</div>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>

</body>
</html>
