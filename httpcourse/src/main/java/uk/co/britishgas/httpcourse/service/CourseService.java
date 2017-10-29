package uk.co.britishgas.httpcourse.service;

import org.springframework.stereotype.Component;
import uk.co.britishgas.httpcourse.model.Course;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseService {
    private static List<Course> courses = new ArrayList<Course>();
    static{
        courses.add(new Course("1","Fluid mechanics", "Fluid mechanics"));
        courses.add(new Course("2","Computer science", "Computer science"));
        courses.add(new Course("3","geography", "geography"));
        courses.add(new Course("4","maths", "maths"));
        courses.add(new Course("5","Social", "Social"));
        courses.add(new Course("6","Politics", "Politics"));
        courses.add(new Course("7","Natural science", "Natural science"));
        courses.add(new Course("8","Mechanical engineering", "Mechanical engineering"));
    }
    public Course getCourseDetails(String courseId){
        return courses.stream().filter(course-> course.getId().equals(courseId)).findFirst().get();
    }
}
