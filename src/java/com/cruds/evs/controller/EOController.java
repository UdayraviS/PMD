package com.cruds.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.evs.bean.EOBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.service.EODAOServiceImpl;

@Controller
public class EOController {
	
	@Autowired
	EODAOServiceImpl eoservice;
	

	@RequestMapping(value = "eo.html", method= RequestMethod.GET)
	public String ShowappicationForm(Model model)
	{
		model.addAttribute("command", new EOBean());	
		model.addAttribute("EO", eoservice.view());
		return "eo";	
	}
	@RequestMapping(value="eo.html", method=RequestMethod.POST)
	public String addElection(@ModelAttribute ("EOBean") EOBean eobean
							 ,RedirectAttributes redirectAttributes) throws EVSException
	
	{
		System.out.println(eobean);
		if(eoservice.addEO(eobean))
		{
			redirectAttributes.addFlashAttribute("message", "User Created Successfully");
			redirectAttributes.addFlashAttribute("newuser", eobean);
		}
		else
		{
			redirectAttributes.addFlashAttribute("error", "Unknown error while creating User!");
		}
		return "redirect:eo.html";
	}
	
	

}
