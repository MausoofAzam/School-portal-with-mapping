package com.school.test.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.controller.TeachersController;
import com.school.service.TeacherService;

@WebMvcTest(controllers = TeachersController.class)
class TeachersControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	private  TeacherService  teacherService;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Test
	void test_findAllTeachers() {
//		List<Teachers> teachersList = new ArrayList<>();
//		List<Teachers> empList = new ArrayList<>();
//		empList.add(new Teachers(101, "Sharma", "Manager"));
//		empList.add(new Employee(102L, "Suman", "Kapoor", "suman@gmail.com", "Clerk"));
//		when(employeeService.findAll()).thenReturn(empList);
//		assertNotNull(empList);
//
//		// calling rest api
//		ResultActions response = mockMvc.perform(get("/emp/all").contentType(MediaType.APPLICATION_JSON));
//
//		// then - verify the output
//		response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.size()", is(empList.size())));
	}
	

}
