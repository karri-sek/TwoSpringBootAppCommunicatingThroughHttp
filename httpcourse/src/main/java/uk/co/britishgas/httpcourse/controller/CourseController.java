package uk.co.britishgas.httpcourse.controller;

import uk.co.britishgas.httpcourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uk.co.britishgas.httpcourse.model.Course;
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses/{courseId}")
    public Course retrieveDetailsForCourse(@PathVariable String courseId) {
        return courseService.getCourseDetails(courseId);
    }

}
