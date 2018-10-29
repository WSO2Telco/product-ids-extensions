<%
    session.setAttribute("username", null);
    session.setAttribute("sessionCookie", null);

    response.sendRedirect("login.jsp");
%>