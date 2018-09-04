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

<script type="text/javascript">
    function doCheck() {
        var pass = document.getElementById("password").value;
        if (validatePassword(pass)) {
            var confPass = document.getElementById("confirmPassword").value;
            if (pass != confPass) {
                document.getElementById("message").innerHTML = "Passwords do not match";
                document.getElementById('password').focus();
                return false;
            } else {
                return true;
            }
        } else {
        	return false;
        }
    }
    function check() {
        var pass = document.getElementById("password").value;
        if (validatePassword(pass)) {
            var confPass = document.getElementById("confirmPassword").value;
            if (pass != confPass) {
                document.getElementById("message").innerHTML = "Passwords do not match";
            } else {
                document.getElementById("message").innerHTML = "";
            }
        } else {
        	//do nothing
        }
    }
    function validatePassword(password) {
        if (password.length < 6 || password.length > 30) {
        	document.getElementById("message").innerHTML = "Use 6 to 30 characters";
            return false;
        }
        else if (password.search(/[0-9]/) < 0) {
            document.getElementById("message").innerHTML = "Use at least one number";
            return false; 
        }
        else if ((password.search(/[a-z]/) < 0) || (password.search(/[A-Z]/) < 0)) {
            document.getElementById("message").innerHTML = "Mix uppercase and lowercase letters";
            return false;
        }
        else if (password.search(/[!@#$%^&*]/) < 0) {
            document.getElementById("message").innerHTML = "Add special characters (such as @,?,#)";
            return false; 
        }
        return true;
    }
</script>

<jsp:include page="includes/header_signup.jsp"></jsp:include>

<form method="POST" action='./update' id="resetPasswordForm" onsubmit="return doCheck()">
    <table>
        <tbody>
        <tr class="spaceUnder">
            <td>Enter new password</td>
            <td><input type="password" name="password" id="password" required onkeyup='check();'/></td>
        </tr>
        <tr class="spaceUnder">
            <td>Confirm password</td>
            <td><input type="password" name="confirmPassword" id="confirmPassword" onkeyup='check();'/></td>
        </tr>
        <tr id="buttonRow">
            <td><input class="btn btn-primary" type="submit" value="Submit"/></td>
            <td><p id="message"></p></td>
        </tr>
        </tbody>
    </table>
</form>
