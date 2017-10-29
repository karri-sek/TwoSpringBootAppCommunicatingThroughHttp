package uk.co.britishgas.httpstudent.controller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import uk.co.britishgas.httpstudent.model.Student;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnStudent1WithId1() throws Exception{
        ResponseEntity<Student> responseEntity = restTemplate.getForEntity("/students/1", Student.class);
        assertEquals("1", responseEntity.getBody().getId());
    }

    @Test
    public void shouldReturnStudentWithNameJohn() {
        ResponseEntity<Student> responseEntity = restTemplate.getForEntity("/students/2", Student.class);
        assertEquals("John", responseEntity.getBody().getName());
    }

    @Test
    public void shouldReturnStudentWithCourseDetails() throws Exception{
        ResponseEntity<Student> responseEntity = restTemplate.getForEntity("/students/1/courses/1", Student.class);
        assertEquals("1", responseEntity.getBody().getId());
        assertEquals("1", responseEntity.getBody().getCourse().getId());
        assertEquals("Fluid mechanics", responseEntity.getBody().getCourse().getDescription());
    }

}