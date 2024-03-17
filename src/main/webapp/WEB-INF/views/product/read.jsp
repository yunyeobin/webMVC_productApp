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
    <title>상품 정보</title>
    <style>
        .title {
            background-color: darkslategray;
            display: flex;
            justify-content: center;
            align-items: center;
            width: 100%;
            height: 150px;
        }

        .title h1 {
            color: white;
        }

        .colurm_div {
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 10px;

        }

        .button_div {
            margin-top: 20px;
            margin-outside: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            font-size: large;
        }
        .button_div a{
            background-color: darkslategray;
            padding-top: 10px;
            color: white;
            width: 200px;
            height: 40px;
            text-align: center;
            border-radius: 10px;
        }
        .prod_div input{
            width: 500px;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<div class="title">
    <h1>상품 정보</h1>
</div>
<div class="prod_div">
    <div class="colurm_div">
        <label>상품번호</label>
        <input type="text" name="pno" value="${dto.pno}" readonly>
    </div>
    <div class="colurm_div">
        <label>상품이름</label>
        <input type="text" name="pname" value="${dto.pname}" readonly>
    </div>
    <div class="colurm_div">
        <label>상품가격</label>
        <input type="text" name="price" value="${dto.price}" readonly>
    </div>
    <div class="colurm_div">
        <label>상품재고</label>
        <input type="text" name="stock" value="${dto.stock}" readonly>
    </div>
</div>
<div class="button_div">
    <a href="/product/modify?pno=${dto.pno}">수정/제거</a> <%-- /product/modify 해당하는 컨트롤러 호출 --%>
</div>
<div class="button_div">
    <a href="/product/list">목록으로 돌아가기</a>
</div>
</body>
</html>
