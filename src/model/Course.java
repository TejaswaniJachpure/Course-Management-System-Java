package model;

public class Course {
    private int id;
    private String name;
    private String description;
    private String instructor;

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Description
    public String getDescription() {
        return description;
    }

    // Setter for Description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for Instructor
    public String getInstructor() {
        return instructor;
    }

    // Setter for Instructor
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}

