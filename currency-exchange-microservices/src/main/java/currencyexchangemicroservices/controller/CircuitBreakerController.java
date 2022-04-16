package currencyexchangemicroservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class CircuitBreakerController {
	
	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/sample-api")
	/* @Retry(name ="sample-api",fallbackMethod = "hardCodedResponse") *///by default it retry 3 times to get specific no. of retry goto application.properties
	@CircuitBreaker(name ="sample-api",fallbackMethod = "hardCodedResponse")
	public String sampleApi() {
		logger.info("Sample API call recieved");
		//intentionally writing the code which give error
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", String.class);
		return forEntity.getBody();
	}
	
	public String hardCodedResponse(Exception ex) {
		return "Fallback Response!";
	}
}
