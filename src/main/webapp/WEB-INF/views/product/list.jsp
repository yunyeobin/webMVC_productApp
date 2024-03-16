<%--
  Created by IntelliJ IDEA.
  User: fabul
  Date: 2024-03-16
  Time: 오후 4:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>상품 목록</title>
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
        .table_div{
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 40px;
        }
        .prod_tbl{
            width: 800px;
            text-align: center;
        }
        .button_div{
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 50px;
        }
    </style>
</head>
<body>
<div class="title">
<h1>상품 관리 메인</h1>
</div>
<div class="table_div">
<table class="prod_tbl">
    <thead>
    <tr>
        <th>상품번호</th>
        <th>상품이름</th>
        <th>상품가격</th>
        <th>상품재고</th>
        <th>수정/삭제</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${dtoList}" var="dto">
        <tr>
            <td><a href="/product/read?pno=${dto.pno}">${dto.pno}</a></td> <%--pno에 해당하는 read컨트롤러 호출--%>
            <td><c:out value="${dto.pname}"/></td>
            <td><c:out value="${dto.price}"/></td>
            <td><c:out value="${dto.stock}"/></td>
            <td><a href="/product/read?pno=${dto.pno}">수정/삭제</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
<div class="button_div">
<form action="/product/register" method="get">
    <button type ="submit">상품등록하러가기</button>
</form>
</div>
</body>
</html>
