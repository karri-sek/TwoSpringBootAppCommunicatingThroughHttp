package uk.co.britishgas.httpstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import uk.co.britishgas.httpstudent.model.Course;
import uk.co.britishgas.httpstudent.model.Student;
import uk.co.britishgas.httpstudent.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students/{studentId}/courses/{courseId}")
    public Student retrieveStudentWithCourseDetails(@PathVariable String studentId) {
        RestTemplate restTemplate = new RestTemplate();
        String uri = "http://localhost:8020/courses/";
        Student student = studentService.getStudentDetails(studentId);
        if(student != null) {
            Course course = restTemplate.getForObject( uri + student.getCourseId(), Course.class);
            student.setCourse(course);
        }
        return student;
    }

    @GetMapping("/students/{studentId}")
    public Student retrieveStudentDetails(@PathVariable String studentId) {
        return studentService.getStudentDetails(studentId);
    }
}
