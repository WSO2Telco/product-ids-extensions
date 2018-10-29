<%@ page import="java.util.List" %>

<%@ page import="com.wso2telco.ids.makerchecker.util.HumanTaskUtil" %>
<%@ page import="com.wso2telco.ids.makerchecker.util.CommonUtil" %>
<%@ page import="com.wso2telco.ids.makerchecker.dto.HumanTaskDto" %>
<%@ page import="com.wso2telco.ids.makerchecker.exception.HumanTaskException" %>
<%@ page import="com.wso2telco.ids.makerchecker.util.CommonUtil" %>

<%
    String user = (String)session.getAttribute("username");
    if (user == null || user.isEmpty()) {
       response.sendRedirect("login.jsp?errorMessage=Please login again to continue.");
       return;
    }

    String sessionCookie = (String)session.getAttribute("sessionCookie");
    if (sessionCookie == null || sessionCookie.isEmpty()) {
        response.sendRedirect("login.jsp?errorMessage=Please login again to continue.");
        return;
    }

    String tasksEndpoint = CommonUtil.constructServerUrl(request) + "/mc-dashboard/api/v1/tasks";
    String serviceEndpoint = CommonUtil.constructServerUrl(request) + "/services/HumanTaskClientAPIAdmin/";

    String taskFilter = request.getParameter("taskFilter");
    String errorMessage = (String)request.getParameter("errorMessage");

    if (taskFilter == null || taskFilter.isEmpty()) {
        taskFilter = "RESERVED";
    }

    List<HumanTaskDto> taskList = null;
    try {
        taskList = HumanTaskUtil.getAllTasks(sessionCookie, taskFilter, serviceEndpoint);
    } catch (HumanTaskException e) {
        response.sendRedirect("login.jsp?errorMessage=Failed to load task list. Please re-login.");
        return;
    }
%>

<html>
    <head>
        <title>Dashboard - Maker Checker</title>
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css"/>

        <script type="text/javascript" src="assets/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="assets/js/popper.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
    </head>

    <body>

        <%@include file="includes/confirm_dialog.jsp" %>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <a class="navbar-brand" href="#">DASHBOARD / HOME</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
            </ul>
            <div class="form-inline my-2 my-lg-0">

            <div class="btn-group">
                <button class=" btn dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <img src="assets/img/person.svg" alt="user icon" width="16px"/>
                    <span><%=user%></span>
                </button>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="logout.jsp">Logout</a>
                </div>
            </div>
            </div>
          </div>
        </nav>

        <hr/>

        <div class="container">
            <div class="row justify-content-center align-items-center">
                <div class="alert alert-warning alert-dismissible fade show invisible" role="alert" id="main-alert">
                  <strong id="message-content"></strong>
                  <button type="button" class="close" aria-label="Close" id="main-alert-close">
                    <span aria-hidden="true">&times;</span>
                  </button>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <div class="form-group">
                        <label for="taskFilterOptions">Filter Tasks</label>
                        <select class="form-control" id="taskFilterOptions">
                            <option selected hidden><%= taskFilter %></option>
                            <option value="ALL">ALL</option>
                            <option value="COMPLETED">COMPLETED</option>
                            <option value="IN_PROGRESS">IN PROGRESS</option>
                            <option value="READY">READY</option>
                            <option value="RESERVED">RESERVED</option>                         
                        </select>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <table class="table table-striped table-condensed">
                        <thead>
                            <th>Task Id</th>
                            <th>Subject</th>
                            <th>Status</th>
                            <th>Priority</th>
                            <th>Created On</th>
                            <th>Actions</th>
                        </thead>

                        <tbody>
                            <% for (HumanTaskDto task: taskList) { %>
                                <tr>
                                    <td><%=task.getTaskId()%></td>
                                    <td><%=task.getSubject()%></td>
                                    <td><%=task.getStatus()%></td>
                                    <td><%=String.valueOf(task.getPriority())%></td>
                                    <td><%=task.getCreatedTime().toString()%></td>

                                    <td>
                                        <!-- <div class="dropdown">
                                            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                Actions
                                            </button>
                                            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                                <a class="dropdown-item" href="#">Approve</a>
                                                <a class="dropdown-item" href="#">Reject</a>
                                                <a class="dropdown-item" href="#">More info</a>
                                            </div>
                                        </div>
                                        <button class="btn btn-info" onClick="showTaskInfo('<%=task.getTaskId()%>')">More Info</button>-->
                                        <div id="accordion-<%=task.getTaskId()%>">
                                          <div class="card">                                         
                                            <button class="btn btn-link" data-toggle="collapse" data-target="#collapse-<%=task.getTaskId()%>" aria-expanded="true" aria-controls="collapse-<%=task.getTaskId()%>" onClick="fetchTaskData('<%=task.getTaskId()%>')">
                                              Manage Task
                                            </button>                                
                                          </div>
                                      </div>
                                    </td>
                                </tr>

                                <tr>
                                <td colspan="6">
                                    <div id="collapse-<%=task.getTaskId()%>" class="collapse" aria-labelledby="headingOne" data-parent="#accordion-<%=task.getTaskId()%>">
                                      <div class="card-body">
                                        <p>
                                            <b>Request ID:</b> 
                                            <span id="requestId-<%=task.getTaskId()%>"></span>
                                        </p>
                                        <p>
                                            <b>Username:</b> 
                                            <span id="username-<%=task.getTaskId()%>"></span>
                                        </p> 
                                        <p>
                                            <b>Userstore Domain:</b> 
                                            <span id="userstore-domain-<%=task.getTaskId()%>"></span>
                                        </p> 
                                        <p>
                                            <b>Roles:</b> 
                                            <span id="roles-<%=task.getTaskId()%>"></span>
                                        </p> 
                                        <p>
                                            <b>Claims:</b> 
                                            <span id="claims-<%=task.getTaskId()%>"></span>
                                        </p> 
                                        <%if (!task.getStatus().equals("COMPLETED")) {%>
                                            <button type="button" class="btn btn-primary" onClick="completeTask('<%=task.getTaskId()%>', 'approve')">Approve</button>
                                            <button type="button" class="btn btn-danger" onClick="completeTask('<%=task.getTaskId()%>', 'reject')">Reject</button>
                                            <button type="button" class="btn btn-secondary" onClick="completeTask('<%=task.getTaskId()%>', 'release')">Release</button>
                                        <%}%>
                                      </div>
                                    </div>
                                </td>
                            </tr>
                            <% } %>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <script type="text/javascript">
            $('#main-alert-close').on('click', function () {
                $("#main-alert").addClass("invisible");
            });

            $("#taskFilterOptions").on("click", e => {
                let option = $("#taskFilterOptions").val();

                window.location = "index.jsp?taskFilter=" + option;
            });

            function showConfirmDialog(taskId, command) {
                if (command === 'approve') {
                    $("#confirmDialogContent").html("Do you want to approve this task?<br>TaskId: " + taskId);
                } else if (command === 'reject') {
                    $("#confirmDialogContent").html("Do you want to reject this task?<br>TaskId: " + taskId);  
                } else if (command === 'release') {
                    $("#confirmDialogContent").html("Do you want to release this task?<br>TaskId: " + taskId); 
                }

                $("#confirmDialogTaskId").val(taskId);
                $("#confirmDialogCommand").val(command);                
                $("#taskInfoModal").modal("show");
            }

            function completeTask(taskId, command) {
                showConfirmDialog(taskId, command);
            }

            function fetchTaskData(taskId) {
                $.ajax({
                    url: "<%=tasksEndpoint%>/" + taskId,
                    method: "get",
                    success: (response) => {
                        if (response) {
                            $("#requestId-" + taskId).html(response.requestId);
                            $("#username-" + taskId).html(response.username);
                            $("#userstore-domain-" + taskId).html(response.userStoreDomain);
                            $("#roles-" + taskId).html(response.roles);
                            $("#claims-" + taskId).html(response.claims);
                        } else {
                            $("#requestId-" + taskId).html("Query Failed");
                            $("#username-" + taskId).html("Query Failed");
                            $("#userstore-domain-" + taskId).html("Query Failed");
                            $("#roles-" + taskId).html("Query Failed");
                            $("#claims-" + taskId).html("Query Failed");
                        }
                    }
                });
            }


            function showAlert(message) {
                $("#message-content").html(message);
                $("#main-alert").removeClass("invisible");
                setTimeout(function(){
                    $("#main-alert").addClass("invisible");
                }, 5000);
            }

            <%
                if (errorMessage != null && (!errorMessage.isEmpty())) {
                    %>
                    showAlert("<%=errorMessage%>");
                    <%
                }
            %>
        </script>
    </body>
</html>