package com.cg.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound  extends Exception
{

	public ResourceNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ResourceNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


	
	

}
