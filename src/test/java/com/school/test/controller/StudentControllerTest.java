//package com.school.test.controller;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//
//import java.util.Date;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.school.controller.StudentController;
//import com.school.dto.StudentRequest;
//import com.school.entity.Student;
//import com.school.service.StudentServiceImpl;
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
////@WebMvcTest(controllers = StudentController.class)
////@ExtendWith(SpringExtension.class)
//public class StudentControllerTest {
//	
//	@Autowired
//	MockMvc mockMvc;
//	
////	@MockBean
////	private StudentController controller;
////	
//	@MockBean
//	private StudentServiceImpl service;
//	
//	private String mapToJson(Object object) throws JsonProcessingException {
//		ObjectMapper objectMapper = new ObjectMapper();
//		return objectMapper.writeValueAsString(object);
//	}
//	
//	@Test
//	public void test_saveStudent() throws Exception {
//		
//		Student student = new Student(); //.build(1, "Resham", "10th B", 1, 90, new Date(), new Date());
//		
//		student.setId(1);
//		student.setName("Resham");
//		String InputInJson = this.mapToJson(student);
//		
////		when(service.createStudent(Mockito.any(StudentRequest.class))).thenReturn(student);
////		
////		ResultActions response = mockMvc.perform(post("/student/add").contentType(MediaType.APPLICATION_JSON).content(InputInJson));
////		
////		response.andDo(print()).andExpect(status().isCreated())
////		.andExpect(jsonPath("$.name", is(student.getName())))
////		.andExpect(jsonPath("$.className", is(student.getClassName())))
////		.andExpect(jsonPath("$.rollNo", is(student.getRollNo())))
////		.andExpect(jsonPath("$.grade", is(student.getGrade())))
////		.andExpect(jsonPath("$.createdDate", is(student.getCreatedDate())))
////		.andExpect(jsonPath("$.updatedDate", is(student.getUpdatedDate())));
//		
//		RequestBuilder requestBuilder = MockMvcRequestBuilders
//				.post("/students/create")
//				.content(InputInJson)
//				.contentType(MediaType.APPLICATION_JSON)
//				.accept(MediaType.APPLICATION_JSON);
//		
//		mockMvc.perform(requestBuilder)
//		      .andExpect(status().isCreated())
//		      .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists());
//	}
//
//
//	@Test
//	public void test_getAllStudent() {
//		
//	}
//	
//	@Test
//	public void test_getStudent() {
//		
//	}
//	
//	@Test
//	public void test_updateStudent() {
//		
//	}
//	
//	@Test
//	public void test_deleteStudent() {
//		
//	}
//}
