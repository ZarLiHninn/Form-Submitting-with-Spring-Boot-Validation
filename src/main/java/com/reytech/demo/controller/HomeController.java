package com.reytech.demo.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.reytech.demo.constant.Gender;
import com.reytech.demo.constant.Subject;
import com.reytech.demo.model.Student;

@Controller
public class HomeController {

	@GetMapping("/form")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("gender_value", Gender.values());
		model.addAttribute("subject_value", Subject.values());
		return "form";
	}

	@PostMapping("/form/result")
	public String submitForm(@Valid Student student, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("student", student);
			model.addAttribute("gender_value", Gender.values());
			model.addAttribute("subject_value", Subject.values());
			return "form";
		} else {
			model.addAttribute("result", student);
			return "result";
		}
    }

	@GetMapping("/back")
	public String backHome() {
		return "redirect:/form";
	}

}