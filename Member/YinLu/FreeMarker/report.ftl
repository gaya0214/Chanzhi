<!DOCTYPE HTML>
<html>
<meta charset='utf-8'/>
<body>
	<h1>${stuname}软件测试用例</h1>
	<table  border="1">
		<tr>
			<td bgcolor="green">成功</td>
		</tr>
		<tr>
			<td>
			<#list slist as s>
				${s?size}
				${s.method} ${s.status}
			</#list>
			</td>
		</tr>
		<tr>
			<td bgcolor="red">失败</td>
		</tr>
		<tr>
			<td>
				<#list slist1 as s1>
					${s1?size}
				</#list>
			</td>
		</tr>
</body>
</html>
