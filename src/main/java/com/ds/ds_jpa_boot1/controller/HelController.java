package com.ds.ds_jpa_boot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hc")
public class HelController {
	@GetMapping("")
	public String hc() {
		return"running";
	}

}
