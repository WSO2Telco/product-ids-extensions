<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%--
  ~ Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
  ~
  ~ WSO2 Inc. licenses this file to you under the Apache License,
  ~ Version 2.0 (the "License"); you may not use this file except
  ~ in compliance with the License.
  ~ You may obtain a copy of the License at
  ~
  ~ http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing,
  ~ software distributed under the License is distributed on an
  ~ "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  ~ KIND, either express or implied.  See the License for the
  ~ specific language governing permissions and limitations
  ~ under the License.
  --%>
<link rel="stylesheet" type="text/css" href="css/table-styles.css">
<%
    String storeLoginURL = "";
    if (session.getAttribute("storeLoginURL") != null) {
        storeLoginURL = (String) session.getAttribute("storeLoginURL");
    }
%>
<jsp:include page="includes/header_signup.jsp"></jsp:include>

<body>
    <%
		Boolean status = (Boolean) request.getAttribute("validationStatus");
		if (status) {
	%>
<h2><font color='green'>Password has been changed successfully.</font></h2>
    <%
		} else {
	%>
<h2><font color='red'>Password reset failed.</font></h2>
    <%
			}
		%>
		
<input type="button" class="btn btn-primary" value="Home" onclick="javascript:location.href='<%=storeLoginURL%>'"/>
<script
  src="https://code.jquery.com/jquery-3.3.1.min.js"
  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
  crossorigin="anonymous"></script>
  
<script type="text/javascript">
$(document).ready(function () {
    // Handler for .ready() called.
    window.setTimeout(function () {
    	window.location.replace('<%=storeLoginURL%>');
        }, 5000); });
</script>