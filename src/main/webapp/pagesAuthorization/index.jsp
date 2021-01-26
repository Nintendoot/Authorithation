
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<jsp:include page="_header.jsp"/>
<div class="container">
    <div class="row row-cols-3">
        <c:forEach items="${requestScope.books}" var="book">

            <div class="col">
                <div class="card" style="width: 18rem;">
            <img src="${book.img}" class="card-img-top" alt="...">
                    <div class="container">
                        <form action="/linkAuthor" method="get">
                            <h4>${book.name}</h4>
                            <input type="hidden" name="id" value="${book.author.id}">
                            <button>${book.author}</button>
                            <h5 class="card-title">Genre: ${book.genre}</h5>
                        </form>
                     <c:if test="${sessionScope.isUser}">
                        <form action="/basket" method="get">
                            <input type="hidden" name="id" value="${book.id}">
                            <button>Add</button>
                        </form>
                     </c:if>
            </div>
        </div>
    </div><br>
    </c:forEach>
</body>
</html>
