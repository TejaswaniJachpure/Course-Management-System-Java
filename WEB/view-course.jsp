<%@ page import="java.util.*, dao.CourseDAO, model.Course" %>
<%
    CourseDAO dao = new CourseDAO();
    List<Course> courses = dao.getAllCourses();
%>
<h2>All Courses</h2>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Description</th><th>Instructor</th></tr>
    <%
        for (Course c : courses) {
    %>
        <tr>
            <td><%= c.getId() %></td>
            <td><%= c.getName() %></td>
            <td><%= c.getDescription() %></td>
            <td><%= c.getInstructor() %></td>
        </tr>
    <%
        }
    %>
</table>
