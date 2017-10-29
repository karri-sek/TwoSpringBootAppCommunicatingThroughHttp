package uk.co.britishgas.httpcourse.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import uk.co.britishgas.httpcourse.model.Course;
import uk.co.britishgas.httpcourse.service.CourseService;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CourseControllerTest {



    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnCourse1WithId1() throws Exception{
        ResponseEntity<Course> responseEntity = restTemplate.getForEntity("/courses/1", Course.class);
        assertEquals("1", responseEntity.getBody().getId());
    }

    @Test
    public void shouldReturnCourse2withNameComputerScience() {
        ResponseEntity<Course> responseEntity = restTemplate.getForEntity("/courses/2", Course.class);
        assertEquals("Computer science", responseEntity.getBody().getName());
    }

}
