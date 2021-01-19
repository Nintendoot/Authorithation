
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Person List</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<c:forEach items="${sessionScope.personList}" var="person">
    <ul> ${person}</ul>
</c:forEach>

</body>
</html>
