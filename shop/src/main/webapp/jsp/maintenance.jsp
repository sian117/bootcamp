<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>

<head>
<title>ユーザーマスタメンテ画面</title>
</head>

<body>
ユーザーマスタメンテ画面

<html:form >
<div>
ようこそ：　<bean:write name="mainteForm" property="userName" />　 さん
</div>
<br/>

<input type="test" name="hoge" >&nbsp;
<html:submit value="検索"></html:submit>

<br/>
<br/>

<table border="1">
	<tr>
		<td>#</td>
		<td>ユーザID</td>
		<td>ユーザー名</td>
		<td>メールアドレス</td>
		<td>住所</td>
		<td>電話番号</td>
	</tr>
	<tr>
		<td>1</td>
		<td>admin</td>
		<td>管理ユーザー</td>
		<td>admin@arrow-systems.co.jp</td>
		<td>東京都豊島区テスト２－１４－１</td>
		<td>03-1111-1111</td>
	</tr>
	<tr>
		<td>2</td>
		<td>testuser</td>
		<td>テスト太郎</td>
		<td>test@arrow-systems.co.jp</td>
		<td>東京都文京区テスト１－３－１</td>
		<td>090-0123-4567</td>
	</tr>
	<tr>
		<td>3</td>
		<td>sian</td>
		<td>川上亘</td>
		<td>w.kawakami@arrow-systems.co.jp</td>
		<td>埼玉県越谷市３３－３</td>
		<td>090-XXX-YYYY</td>
	</tr>
	
</table>


</html:form>
</body>

</html:html>