package com.java.springbootTest.SpringbootProject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes=SpringbootProjectApplication.class,webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringControllerTest {
	
	@Autowired
	private TestRestTemplate template;
	
	@Test
	public void hello_ok() throws Exception{
		ResponseEntity<String> response = template.getForEntity("/test", String.class);
        assertThat(response.getBody()).isEqualTo("SpringBoot Hello world!");
	}
	

}
