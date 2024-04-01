package com.Annotations;


//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component("junior")
public class JuniorEmployee implements Employee {

	public String getMessage() {
		return "this is junior";
	}
}
