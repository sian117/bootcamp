<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>

<head>
<title>メニュー画面</title>
</head>

<body>
メニュー画面

<html:form >
<div>
ようこそ：　<bean:write name="menuForm" property="userName" />　 さん
</div>
<br/>
<html:link action="/mainte01">マスタメンテ</html:link>

<br/>
<br/>

</html:form>
</body>

</html:html>