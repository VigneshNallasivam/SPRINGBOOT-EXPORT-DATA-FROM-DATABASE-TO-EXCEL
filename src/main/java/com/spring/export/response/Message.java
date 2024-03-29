package com.spring.export.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Message
{
	private String message;
	private Object object;
	public Message(String message, Object object) {
		super();
		this.message = message;
		this.object = object;
	}
	public Message(String message) {
		super();
		this.message = message;
	}
	
	
}
