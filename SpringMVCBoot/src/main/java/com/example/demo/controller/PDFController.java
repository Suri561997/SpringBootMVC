package com.example.demo.controller;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.StudentDetails;
import com.example.demo.services.StudentService;
import com.example.demo.util.GeneratePDF;

@Controller
public class PDFController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/generatepdf", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> generatePDF()
	{
		List<StudentDetails> list = studentService.getAllStudentDetails(); 
		ByteArrayInputStream bis = GeneratePDF.PDFReport(list);
		HttpHeaders headers = new HttpHeaders();
		
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");
		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));
	}
	
}
