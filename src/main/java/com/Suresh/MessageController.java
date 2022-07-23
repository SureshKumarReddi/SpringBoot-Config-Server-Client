package com.Suresh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

	@Value("${message}")
	private String message;

	@GetMapping("/msg")
	public String getMessage() {
		System.out.println("message in console \n " + message);
		return this.message;
	}
}
