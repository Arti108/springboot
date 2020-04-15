package com.niit.inventory.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


//import com.niit.inventory.model.Address;
import com.niit.inventory.model.Customer;
import com.niit.inventory.model.Product;
import com.niit.inventory.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService lservice;
	//@Autowired
	//private ProductService service;

	
	@RequestMapping("/")
	public String viewHomePage() {
	return "index";
	}
	
	@RequestMapping("/register")
	public String viewRegisterPage(Model model) {
	Customer customer = new Customer();
	model.addAttribute("customer", customer);
	return "register";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCusomer(HttpServletRequest req,@ModelAttribute("customer") Customer customer) {
	lservice.saveCustomer(customer);
	return "index";
	}
	
	
	@GetMapping("/login")
	public String showLoginForm(Model theModel) {
	//Dealer d = new Dealer();
	//theModel.addAttribute("dealer", d);
	return "login";
	}
	
	@PostMapping("/loginCustomer")
	public ModelAndView loginDealer(HttpServletRequest req,@ModelAttribute("customer") Customer customer) {
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		String pass2=encryptPass(pass);
		
		StringTokenizer st = new StringTokenizer(email, "@");
		String s2 = st.nextToken();
		
		 ModelAndView mav=null;
		 Customer c = lservice.findByEmail(email);
		 
		 if(c==null) {
			 mav= new ModelAndView("login");
				mav.addObject("error", "User Doesn't Exists");
		 }
		 else  if(email.equals(c.getEmail()) && pass2.equals(c.getPassword()))
		 {
					 
		 req.getSession().setAttribute("user", s2);	
		 
		  mav = new ModelAndView("customer-dash");
		 mav.addObject("customer", c);
	     		    
		 } 
		 
		 else
		 {mav= new ModelAndView("login");
			mav.addObject("error", "Invalid Username or Password");
		 }
		 
		 return mav;
	}
	
	private String encryptPass(String pass) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = pass;
		String encodedString = encoder.encodeToString(
	    normalString.getBytes(StandardCharsets.UTF_8) );
		return encodedString;
	}
	
	@GetMapping("/login-admin")
	public String showLoginAdminForm(Model theModel) {
	//Dealer d = new Dealer();
	//theModel.addAttribute("dealer", d);
	return "login-admin";
	}
	
	@PostMapping("/loginAdmindash")
	public String loginAdmin(HttpServletRequest req) {
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		if(email.equals("arti108@gmail.com")&&pass.equals("redhat"))
		{
			return "admin-dash";
					
		}
		else {
			return "login-admin";
		}
	}
	
	
	//view Customer to admin
	@RequestMapping("/view-cust")
	public String viewCustomer(Model model)
	{
		List<Customer> listCustomer=lservice.listAll();
		model.addAttribute("listCustomer",listCustomer);
		return "view-cust";
		}

	@GetMapping("/logout-admin")
	public String logoutAdmin(HttpServletRequest req) {
	req.getSession().invalidate();
	return "index";
	}
	
	@GetMapping("/logout-cust")
	public String logoutCustomer(HttpServletRequest req) {
	req.getSession().invalidate();
	return "index";
	}
	
	/*
	//view and edit Customer profile
	@RequestMapping("/profile-cust")
	public ModelAndView showCustomerProfile(@RequestParam("id") int id) {
	ModelAndView mav = new ModelAndView("profile-cust");
	Customer customer = lservice.get(id);
	mav.addObject("customer", customer);

	return mav;
	}*/


	
}