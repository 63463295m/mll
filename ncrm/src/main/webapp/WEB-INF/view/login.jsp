<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/init/init.jsp" %>

<html>
<head>
<link rel="stylesheet" href="${path}/common/bootstrap/css/bootstrap.min.css">

<script src="${path}/common/bootstrap/js/jquery-1.9.1.js"></script>
<script src="${path}/common/bootstrap/js/bootstrap.min.js"></script>
<style type="text/css">
ul#tabNav{
width: 400px;list-style: none;border-bottom: solid 1px green;margin: 0;
padding-left: 0;padding-bottom: 0;
}
ul#tabNav li{
float: left;height: 25px;margin: 0 10px -2px 0;color: black;border: solid 1px green;
border-bottom: 0;padding: 0;
}
#tabNav a:link,#tabNav a:visited{
display: block;text-decoration: none;padding: 5px 10px 3px 10px;
}
#tabContent{
	width: 400px;height: 200px;border: solid 1px green;border-top-width: 0;
}
li.tabSelected{
	background-color: #ffcc00;color: #ffffff;
}
div#tabContent > div{
	display: none;
}
div#tabContent .curr{
	display: block;
}

</style>
</head>
<body>
<h2>Hello World!</h2>
<h2></h2> <br>
注册时间: <br>

<a href="${path}/loginController/allLogin" >get所有用户</a>

<div class="container">
		<div class="row">
				<ul id="tabNav">
					<c:forEach items="${stuList}" var="stu" varStatus="s">
					<li onclick="Mao.show(${s.count})" id='tab${s.count}' class="">
						<a href="javascript:;" >第${s.count}页</a>
					</li>
					</c:forEach>
				</ul>

				

		</div>
	</div>

	<div id="tabContent">
		<c:forEach items="${stuList}" var="stu" varStatus="status">
			<div <c:if test="status.count == 1">class="curr"</c:if> id="content${stu.id}">
			<label>
				<input type="checkbox"  />${status.count}
			</label>
			${stu.user_name}
			
			</div>
		</c:forEach>
	</div>



<script type="text/javascript">
var Mao = {
		show:function(index){
			$("#tab" + index).addClass('tabSelected').siblings().removeClass('tabSelected');
			$("#content" + index).addClass('curr').siblings().removeClass('curr');
			
		}

}
/**
 * 启用localStorage
 */
var s = null, travel_hotelBooking = {};
if(!window.localStorage){
    console.log("浏览器不支持localStorage,请切换至极速模式");
}else{
	console.log("支持localStorage,请切换至极速模式");
}
</script>
</body>
</html>
