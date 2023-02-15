<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>

<head>
<title>ログイン画面</title>
</head>

<body>
ログイン画面

<html:form action="/menu">

<br/>
ユーザーID:  <html:text property="id"/>
<br/>
パスワード:  <html:text property="password" />
<br/>
<br/>
<html:submit property="login" value="ログイン" />

</html:form>
</body>

</html:html>