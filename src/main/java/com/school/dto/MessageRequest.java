package com.school.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class MessageRequest {

	@NotEmpty(message="Please write some message in text.")
	private String text;
	
	@NotEmpty(message="sendTo shouldn't be empty or null")
	private String sentTo;
	
	@NotEmpty(message="receivedBy shouldn't be empty or null")
	private String receivedBy;
	
	private Integer teacherId;

	private Date createdDate;
	private Date updatedDate;
}
