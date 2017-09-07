
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
    .top{
        background: white;
        width: 400px;
        border: 1px;
    }
    .top-hf{
        margin-top: 10px;
        margin-left: 10px;
        background: #B2B2B2;
        border: 1px;
    }
    .top-commenttime{
            text-align: right;
    }
    .input{
        width: 360px;
        height:50px;
    }
    .button{
        text-align: center;
        color: blue;
        width: 51px;
        height: 24px;
        margin-right: 15px;
    }
     .fabiao{
         margin-bottom: 10px;
         text-align: center;
     }
    </style>
</head>
<body>
        <div class="top">
            <div class="top-comment">
                <div class="top-commentuser">用户名</div>
                <div class="top-commentcontent">发表内容</div>
                <div class="top-commenttime">
                    <span>时间</span>
                    <span>|</span>
                    <span>回复(4)</span>
                </div>
            </div>
            <div class="top-hf">
                <div class="top-hfdiv">
                    <span>回复用户名</span>
                    <span>h回复内容</span>
                    <div class="top-commenttime">
                        <span>回复时间</span>
                        <span>|</span>
                        <span>回复</span>
                    </div>
               </div>
                <div class="top-hfdiv">
                    <span>用户名</span>
                    <span>h回复内容</span>
                    <div class="top-commenttime">
                        <span>回复时间</span>
                        <span>|</span>
                        <span>回复</span>
                    </div>
                </div>
                <div class="top-hfdiv">
                    <span>用户名</span>
                    <span>h回复内容</span>
                    <div class="top-commenttime">
                        <span>回复时间</span>
                        <span>|</span>
                        <span>回复</span>
                    </div>
                </div>
                <div  class="top-hfdiv">
                    <span>用户名</span>
                    <span>h回复内容</span>
                    <div class="top-commenttime">
                        <span>回复时间</span>
                        <span>|</span>
                        <span>回复</span>
                    </div>
                </div>
                <div class="fabiao">
                    <div><input type="text" class="input"/></div>
                    <div><input type="button" class="button" value="发表"></div>

                </div>
            </div>
        </div>
</body>
</html>
