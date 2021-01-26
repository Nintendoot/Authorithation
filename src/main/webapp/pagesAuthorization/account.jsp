<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Account</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container">
    <p>Account</p>
    <br>
    <h5> Name ${sessionScope.user.name}</h5>
    <br>
    <p>Basket:</p>
    <br>
    <ul>
        <div class="row row-cols-3">
        <c:forEach items="${sessionScope.basket.all}" var="book">
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="${book.img}" class="card-img-top" alt="...">
                    <h5 class="card-title"> ${book.name}</h5>
                    <div class="container">
                        <form action="/linkAuthor" method="get">
                            <input type="hidden" name="id" value="${book.author.id}">
                            <button>${book.author}</button>
                            <h5 class="card-title">Genre: ${book.genre}</h5>
                        </form>
                    </div>
                </div>
            </div><br>
        </c:forEach>
        </div>
    </ul>

</div>
</body>
</html>
