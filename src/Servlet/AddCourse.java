package servlet;

import dao.CourseDAO;
import model.Course;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Course course = new Course();
        course.setName(request.getParameter("name"));
        course.setDescription(request.getParameter("description"));
        course.setInstructor(request.getParameter("instructor"));

        try {
            new CourseDAO().addCourse(course);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("view-courses.jsp");
    }
}
