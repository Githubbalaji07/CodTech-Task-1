package com.balajichavan.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.balajichavan.portfolio.model.FormData;
import com.balajichavan.portfolio.service.FormDataService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class FormController {
	
	@Autowired
	private FormDataService formService;
	
	@PostMapping("/api/formdata")
    public ResponseEntity<String> saveEnquiry(@RequestBody FormData formData) {
		formService.saveForm(formData);
        return ResponseEntity.ok("Enquiry submitted successfully!");
    }
}
