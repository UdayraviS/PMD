package com.cruds.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.cruds.evs.bean.PartyBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.service.AdminDAOImplService;

@Controller
public class PartyController {
	
	@Autowired
	 AdminDAOImplService adminservice;
	

	@RequestMapping(value = "party.html", method= RequestMethod.GET)
	public String ShowpartyForm(Model model)
	{
		model.addAttribute("command", new PartyBean());	
		model.addAttribute("PARTY", adminservice.viewAllParty());
		return "party";	
	}
	@RequestMapping(value="party.html", method=RequestMethod.POST)
	public String addElection(@ModelAttribute ("PartyBean") PartyBean partybean
							 ,RedirectAttributes redirectAttributes) throws EVSException
	
	{
		System.out.println(partybean);
		if(adminservice.addParty(partybean))
		{
			redirectAttributes.addFlashAttribute("message", "User Created Successfully");
			redirectAttributes.addFlashAttribute("newuser", partybean);
		}
		else
		{
			redirectAttributes.addFlashAttribute("error", "Unknown error while creating User!");
		}
		return "redirect:party.html";
	}

	

}
