package com.cruds.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.evs.bean.ApplicationBean;
import com.cruds.evs.bean.PartyBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.ApplicationFormBean;
import com.cruds.evs.form.ProfileFormBean;
import com.cruds.evs.service.AdminDAOImplService;

@Controller
public class ApplicationController {

	@Autowired
	 AdminDAOImplService adminservice;
	

	@RequestMapping(value = "application.html", method= RequestMethod.GET)
	public String ShowappicationForm(Model model)
	{
		model.addAttribute("command", new ProfileFormBean());	
		model.addAttribute("APP", adminservice.viewAllAdminPendingApplications());
		return "application";	
	}
	@RequestMapping(value="application.html", method=RequestMethod.POST)
	public String addElection(@ModelAttribute ("ProfileFormBean") ProfileFormBean applicationbean
							 ,RedirectAttributes redirectAttributes) throws EVSException
	
	{
		System.out.println(applicationbean);
		if(adminservice.addApplication(applicationbean))
		{
			redirectAttributes.addFlashAttribute("message", "User Created Successfully");
			redirectAttributes.addFlashAttribute("newuser", applicationbean);
		}
		else
		{
			redirectAttributes.addFlashAttribute("error", "Unknown error while creating User!");
		}
		return "redirect:application.html";
	}
	
	
	
}
