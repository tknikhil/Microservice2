package tk.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.microservices.limitservice.configure.Configuration;
import tk.microservices.limitservice.model.Limits;

@RestController
public class LimitController {
	/*
	 * @GetMapping("/limits") public Limits retriveLimits() { return new Limits(1,
	 * 1000); }
	 */
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}

}
