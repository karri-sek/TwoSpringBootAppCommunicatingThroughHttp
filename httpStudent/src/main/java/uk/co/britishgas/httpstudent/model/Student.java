package uk.co.britishgas.httpstudent.model;

public class Student {

    private String id;
    private String name;
    private String courseId;
    private Course course;
    public Student() {}

    public Student(String id, String name, String courseId) {
        super();
        this.id = id;
        this.name = name;
        this.courseId = courseId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", courseId=" + courseId +
                '}';
    }
}
