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
    <style>
        .title{
            background-color: darkslategray;
            display: flex;
            justify-content: center;
            align-items: center;
            width: 100%;
            height: 150px;
        }
        .title h1{
            color: white;
        }
        .form_div{
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 40px;
        }
        .button_div{
            margin-top: 50px;
        }
    </style>
</head>
<body>
<div class="title">
<h1>상품 등록 하기</h1>
</div>
<div class="form_div">
<form action="/product/register" method="post">
    <div>
        <label>상품이름</label>
        <input type="text" name="pname" placeholder="상품 이름">
    </div>
    <div>
        <label>상품가격</label>
        <input type="text" name="price" placeholder="상품 가격">
    </div>
    <div>
        <label>상품재고</label>
        <input type="text" name="stock" placeholder="상품 재고">
    </div>
    <div class="button_div">
        <button type="reset">다시쓰기</button>
        <button type="submit">추가하기</button>
    </div>
</form>
</div>
</body>
</html>
