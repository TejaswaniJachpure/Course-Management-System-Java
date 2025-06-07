<!-- <form action="add-course" method="post">
    Course Name: <input type="text" name="name"><br>
    Description: <textarea name="description"></textarea><br>
    Instructor: <input type="text" name="instructor"><br>
    <input type="submit" value="Add Course">
</form> -->
<!-- addCourse.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Add Course</title>
</head>
<body>
    <h2>Add New Course</h2>
    <form action="addCourse" method="post">
        <label>Course Name:</label><br/>
        <input type="text" name="name" required /><br/><br/>
        
        <label>Course Description:</label><br/>
        <textarea name="description" required></textarea><br/><br/>
        
        <input type="submit" value="Add Course" />
    </form>
</body>
</html>
