package com.Annotations;

import org.springframework.stereotype.Component;

@Component("Senior")
public class SeniorEmployee implements Employee {
	public String getMessage() {
		return "this is senior";
	}

}
