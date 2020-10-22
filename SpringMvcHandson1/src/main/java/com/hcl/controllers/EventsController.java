package com.hcl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventsController {
	@GetMapping("/events")
	public String showEvents() {
		return "events";
	}
}
