<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 선택한 부서 번호는 </h1>
<c:forEach items="${paramValues.dept_list }" var="dept">
 ${dept } , 
</c:forEach>
<h1>  입니다. </h1>

<c:forEach items="${empdeptlist }" var="vo" >
<h3> 이름 ${vo.first_name }  부서번호 ${vo.department_id } </h3>
</c:forEach>
</body>
</html>