package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CourseDAO;      // Your DAO package
import model.Course;      // Your Model package

@WebServlet("/addCourse")
public class AddCourseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        // Get parameters from request
        String courseName = request.getParameter("name");
        String courseDescription = request.getParameter("description");

        // Create Course object (assuming a constructor with these parameters exists)
        Course course = new Course();
        course.setName(courseName);
        course.setDescription(courseDescription);

        // Call DAO to save course
        CourseDAO courseDAO = new CourseDAO();
        courseDAO.addCourse(course);

        // Redirect or respond
        response.sendRedirect("courseList.jsp");
    }
}
