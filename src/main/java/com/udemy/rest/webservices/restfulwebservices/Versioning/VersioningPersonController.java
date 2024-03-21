package com.udemy.rest.webservices.restfulwebservices.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	//URI Versioning
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new  PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new  PersonV2(new Name("Bob","Charlie"));
	}
	
	//Request Parameter Versioning
	
	@GetMapping(path = "/person",params="version=1")
	public PersonV1 getFirstVersionOfPersonRequestParameter() {
		return new  PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person",params="version=2")
	public PersonV2 getSecondVersionOfPersonRequestParameter() {
		return new  PersonV2(new Name("Bob","Charlie"));
	}

}
