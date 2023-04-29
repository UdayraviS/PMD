package com.cruds.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.evs.bean.ElectionBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.CandidateFormBean;
import com.cruds.evs.form.ProfileFormBean;
import com.cruds.evs.service.ElectionService;
import com.cruds.evs.service.ElectionServiceImpl;

@Controller
public class ElectionController {

	@Autowired
	ElectionServiceImpl electionservice;
	

	@RequestMapping(value = "election.html", method= RequestMethod.GET)
	public String ShowElectionForm(Model model)
	{
		model.addAttribute("command", new ElectionBean());	
		model.addAttribute("UPCOMINGELECTION", electionservice.viewAllUpcomingElections());
		model.addAttribute("ELECTION", electionservice.viewElections());
		return "election";	
	}
	@RequestMapping(value="election.html", method=RequestMethod.POST)
	public String addElection(@ModelAttribute ("ElectionBean") ElectionBean electionbean
							 ,RedirectAttributes redirectAttributes)
	
	{
		System.out.println(electionbean);
		try 
		{
			if(electionservice.add(electionbean))
			{
				redirectAttributes.addFlashAttribute("message", "User Created Successfully");
				redirectAttributes.addFlashAttribute("newuser", electionbean);
			}
			else
			{
				redirectAttributes.addFlashAttribute("error", "Unknown error while creating User!");
			}
		} catch (EVSException e) {
			redirectAttributes.addFlashAttribute("error", e.getExceptionInfo());
		}
		return "redirect:election.html";
	}


}
