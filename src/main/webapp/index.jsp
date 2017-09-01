

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@include file="/WEB-INF/jsp/common/taglib.jsp" %>
    <title>登陆</title>
    <script src="${ctx}/static/jquery/jquery-3.1.1.js"></script>
    <script src="${ctx}/static/jquery/jquery-3.1.1.min.js"></script>
    <script src="${ctx}/static/layer/layer.js"></script>
</head>

<body>
<div>用户名:<input type="text" id="userName"/></div>
<div>密 &nbsp;&nbsp;码:<input type="text" id="passWord"/></div>
<div> <input type="button" id="button" value="登陆"></div>
<script type="text/javascript">
    $("#button").click(function(){
        if($("#userName").val()==""){
            layer.msg("请输入用户名");
            return
        }
        if($("#passWord").val()==""){
            layer.msg("请输入密码");
        }
        $.ajax({
            url:"${ctx}/user/showUser",
            typr:"post",
            data:{
                userName:$("#userName").val(),
                passWord:$("#passWord").val()
            },
            success:function(result){
                if(result=="0"){
                   window.location.href="${ctx}/user/toUser";
                }else {
                    layer.msg("登陆失败");
                }
            }
        })
    })
</script>
</body>
</html>  