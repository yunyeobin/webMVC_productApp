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
    <title>상품 추가</title>
</head>
<body>
<h1>상품 등록 하기</h1>
<form action="/product/register" method="post">
    <div>
        <input type="text" name="pname" placeholder="상품 이름">
    </div>
    <div>
        <input type="text" name="price" placeholder="상품 가격">
    </div>
    <div>
        <input type="text" name="stock" placeholder="상품 재고">
    </div>
    <div>
        <button type="reset">다시쓰기</button>
        <button type="submit">추가하기</button>
    </div>
</form>
</body>
</html>
