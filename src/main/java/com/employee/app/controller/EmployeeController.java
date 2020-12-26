package com.employee.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.app.dto.Employee;
import com.employee.app.repository.EmployeeRepository;

@Controller
@RequestMapping("/mynew_java_update/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
//	public Employee getEmployee() {
//		
//		Employee e1=new Employee(1, "Nobita","nobita@gmail.com", 457812545,"abcd123");
//		
//		return e1;
//	}
	
	@GetMapping("/mynew_java_update/login")
	public String loginPage() {
		
		return "registration";
	}
	
	@PostMapping("/empsave")
	public String empRegister(Employee ep,Model model) {
		
		employeeRepository.save(ep);
		
		List<Employee> elist=employeeRepository.findAll();
		model.addAttribute("elist", elist);
		
		return "result";
	}
	
	@GetMapping("/regist")
	public String getRegistPage() {
		
		return "registration";
	}
	
//	@PostMapping("/emplogin")
//	public String loginEmp(HttpServletRequest req) {
//		
//		String email=req.getParameter("email");
//		String pass=req.getParameter("password");
//		
//		Employee e=getEmployee();
//		
//		if(e.getEmail().equalsIgnoreCase(email) && e.getPassword().equalsIgnoreCase(pass)) {
//			return "registration";
//		}else {
//			return "login";
//		}
//		
//		//return "registration";
//	}
}
