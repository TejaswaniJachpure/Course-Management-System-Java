package dao;

import model.Course;
import java.sql.*;
import java.util.*;

public class CourseDAO {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/course_db";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "your_password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    public void addCourse(Course course) throws SQLException {
        String sql = "INSERT INTO courses (name, description, instructor) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, course.getName());
            stmt.setString(2, course.getDescription());
            stmt.setString(3, course.getInstructor());
            stmt.executeUpdate();
        }
    }

    public List<Course> getAllCourses() throws SQLException {
        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM courses";
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Course c = new Course();
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setDescription(rs.getString("description"));
                c.setInstructor(rs.getString("instructor"));
                courses.add(c);
            }
        }
        return courses;
    }
}
