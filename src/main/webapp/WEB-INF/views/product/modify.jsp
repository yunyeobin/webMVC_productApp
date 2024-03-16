<%--
  Created by IntelliJ IDEA.
  User: fabul
  Date: 2024-03-16
  Time: 오후 4:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>상품 수정</title>
</head>
<body>
<form id="form1" action="/product/modify" method="post">
    <div>
        <label>상품번호</label>
        <input type="text" name="pno" value="${dto.pno}" readonly>
    </div>
    <div>
        <label>상품이름</label>
        <input type="text" name="pname" value="${dto.pname}" >
    </div>
    <div>
        <label>상품가격</label>
        <input type="text" name="price" value="${dto.price}">
    </div>
    <div>
        <label>상품재고</label>
        <input type="text" name="stock" value="${dto.stock}">
    </div>

    <div>
        <button type="submit">수정</button>
    </div>
</form>

<form id="form2" action="/product/remove" method="post">
    <input type="hidden" name="pno" value="${dto.pno}" readonly> <%--타입을 hidden을 이용하면 보이지 않는다.--%>
    <div>
        <button type="submit">제거</button>
    </div>
</form>
</body>
</html>
