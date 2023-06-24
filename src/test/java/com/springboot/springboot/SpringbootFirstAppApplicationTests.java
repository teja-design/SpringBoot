package com.springboot.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc

class SpringbootFirstAppApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void testTwoNumbers() throws Exception {
		String requestBody = "{\"number1\": 5, \"number2\": 10}";

	mockMvc.perform(MockMvcRequestBuilders.post("/add")
			.contentType(MediaType.APPLICATION_JSON)
	.content(requestBody))
	.andExpect(status().isOk())
	.andExpect(MockMvcResultMatchers.content().string("15"));
	}

}
