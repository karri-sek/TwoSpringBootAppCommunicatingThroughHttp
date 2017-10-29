package uk.co.britishgas.httpstudent.service;

import org.springframework.stereotype.Component;
import uk.co.britishgas.httpstudent.model.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    private static List<Student> students = new ArrayList<Student>();
    static{
       students.add(new Student("1","Adam", "1"));
        students.add(new Student("2","John", "2"));
        students.add(new Student("3","King", "3"));
        students.add(new Student("4","Jesus", "5"));
        students.add(new Student("5","Simmonds", "1"));
        students.add(new Student("6","Jack", "2"));
        students.add(new Student("7","Johnny", "3"));
        students.add(new Student("8","Jack", "2"));
    }

    public Student getStudentDetails(String studentId){
        return students.stream().filter(student-> student.getId().equals(studentId)).findFirst().get();
    }
}
