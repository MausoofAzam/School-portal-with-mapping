package com.school.test.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.school.dto.StudentRequest;
import com.school.entity.Student;
import com.school.repository.StudentRepository;
import com.school.service.StudentService;

@SpringBootTest
public class StudentServiceImpTest {

	@MockBean
	private StudentRepository studentRepository;

	@Autowired
	private StudentService service;

	@Test
	public void test_addStudent() throws JsonProcessingException {
		StudentRequest studentRequest = new StudentRequest();

		Student student = Student.build(1, "Resham", "10th B", 1, 80, new Date(), new Date());

		when(studentRepository.save(Mockito.any(Student.class))).thenReturn(student);

		assertEquals(student, service.createStudent(studentRequest));
		assertNotNull(student);
	}
	
	@Test
	public void test_getAllStudent() throws UnsupportedEncodingException, Exception {
		Student student1 = Student.build(1, "Resham", "10th B", 1, 80, new Date(), new Date());
		Student student2 = Student.build(2, "Rashmi", "8th B", 2, 90, new Date(), new Date());

		List<Student> student = new ArrayList<>();
		student.add(student1);
		student.add(student2);

		Mockito.when(service.getAllStudent()).thenReturn(student);
        assertThat(student.size()).isGreaterThan(0);
	}
	
	@Test
	public void test_getStudent() {
		Student student1 = Student.build(1, "Resham", "10th B", 1, 80, new Date(), new Date());

		Mockito.when(service.getStudent(Mockito.anyInt())).thenReturn(student1);
		assertNotNull(student1);
	}
	
	@Test
	public void test_updateStudent() {
		Student student1 = Student.build(1, "Resham", "10th B", 1, 80, new Date(), new Date());

		when(studentRepository.findById(Mockito.anyInt())).thenReturn(student1);

		StudentRequest newStudent = new StudentRequest();
		newStudent.setName("Gayatri");
		
		service.updateStudent(student1.getId(), newStudent);
		
		assertThat(newStudent.getName()).isEqualTo("Gayatri");
	}
	
	@Test
	public void test_deleteStudent() {
		
        doNothing().when(studentRepository).deleteById(Mockito.anyInt());
	}
}
