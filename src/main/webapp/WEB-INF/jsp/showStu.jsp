<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/10/22
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<button class="btn btn-primary navbar-btn" data-toggle="modal" data-target="#myModal">添加</button>
<!--登陆按钮模态框-->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 50%; margin: 0 auto;">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <h4 class="modal-title" id="myModalLabel">用户登陆</h4>
        </div>
        <div class="modal-body">
            <form class="form-horizontal" role="form" method="post" action="/students/insertStudent">
                <div class="form-group">
                    <label for="firstid" class="col-sm-2 control-label">用户名：</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="stuName" id="firstid" placeholder="请输入用户名" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="firstpass" class="col-sm-2 control-label">密码：</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="stuPass" id="firstpass" placeholder="请输入密码" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="firstpass" class="col-sm-2 control-label">年龄：</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="stuAge"  placeholder="请输入密码" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="firstpass" class="col-sm-2 control-label">地址：</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="stuAddress"  placeholder="请输入密码" />
                    </div>
                </div>
                <input class="btn btn-success" type="submit" value="添加">
            </form>
        </div>
    </div>
</div>
<table class="table table-hover">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>地址</th>
        <th>删除</th>
        <th>修改</th>
        <th></th>
    </tr>
    <%int i=1;%>
    <c:forEach  var="stu" items="${stuList}">
        <%i++;%>
        <tr>
            <td id="myTd">${stu.stuId}
            </td>
            <td>${stu.stuName}
            </td>
            <td>******
            </td>
            <td>${stu.stuAge}
            </td>
            <td>
                ${stu.stuAddress}
            </td>
            <td><a href="javascript:void(0)" onclick="del(${stu.stuId})" class="btn btn-sm btn-success">删除</a></td>
            <td>
                <button class="btn btn-sm btn-success" data-toggle="modal" data-target="#<%=i%>">更改</button>
                <!--登陆按钮模态框-->
                <div class="modal fade" id="<%=i%>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 50%; margin: 0 auto;">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabels">用户登陆</h4>
                        </div>
                        <div class="modal-body">
                            <form class="form-horizontal" role="form" method="post" action="/students/updateStudent">
                                <div class="form-group">
                                    <label for="firstid" class="col-sm-2 control-label">用户名：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="stuName"  value="${stu.stuName}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="firstpass" class="col-sm-2 control-label">密码：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="stuPass"  value="${stu.stuPass}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="firstpass" class="col-sm-2 control-label">年龄：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="stuAge"  value="${stu.stuAge}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="firstpass" class="col-sm-2 control-label">地址：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="stuAddress"  value="${stu.stuAddress}" />
                                    </div>
                                </div>
                                <input type="hidden" name="stuId" value="${stu.stuId}">
                                <input class="btn btn-success" type="submit" value="更改">
                            </form>
                        </div>
                    </div>
                </div>
            </td>
        </tr>
    </c:forEach>
</table>
<ul class="pagination">
    <li><a href="/students/all?flag=page&currents=1">&laquo;</a></li>
    <c:if test="${page.currentPage==1}">
        <li class="disabled"><a href="/students/all?flag=page&currents=${page.currentPage-1}">&lt;</a></li>
    </c:if>
    <c:if test="${page.currentPage!=1}">
        <li><a href="/students/all?flag=page&currents=${page.currentPage-1}">&lt;</a></li>
    </c:if>

    <c:forEach begin="1" end="${page.totalPage}" varStatus="status">
        <c:if test="${page.currentPage == status.index}">
            <li class="active"><a href="/students/all?flag=page$currents=${status.index}">${status.index}</a></li>
        </c:if>
        <c:if test="${page.currentPage != status.index}">
            <li class="#"><a href="/students/all?flag=page&currents=${status.index}">${status.index}</a></li>
        </c:if>
    </c:forEach>

    <c:if test="${page.currentPage == page.totalPage}">
        <li class="disabled"><a href="/students/all?flag=page&currents=${page.currentPage+1}">&gt;</a></li>
    </c:if>
    <c:if test="${page.currentPage != page.totalPage}">
        <li><a href="/students/all?flag=page&currents=${page.currentPage+1}">&gt;</a></li>
    </c:if>
    <li><a href="/students/all?flag=page&currents=${page.totalPage}">&raquo;</a></li>
</ul>
</body>

<script
        src="https://code.jquery.com/jquery-1.12.4.js"
        integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.js"></script>
<script>
    function del(stuId) {
        var del = confirm("确认删除吗")
        if (del){
            location.href="/students/del?stuId="+stuId;
        }
    }
</script>
</html>
