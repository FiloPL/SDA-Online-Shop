<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<body>

<h2>Dostępne produkty! </h2>
<c:forEach items="${PRODUCT}" var="p">
${p.name}<br>
${p.price}<br>
    <hr>

</c:forEach>

</body>
</html>