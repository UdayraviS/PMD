package com.cruds.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.CandidateFormBean;
import com.cruds.evs.service.AdminDAOImplService;

@Controller
public class Candidate1Controller {
	
	@Autowired
	AdminDAOImplService adminservice;
	

	@RequestMapping(value = "candidatelist.html", method= RequestMethod.GET)
	public String ShowElectionForm(Model model, String partyId)
	{
		model.addAttribute("command", new CandidateBean());	
		model.addAttribute("CANDI", adminservice.viewCandidateDetailsByParty(partyId));
		return "candidatelist";	
	}
	@RequestMapping(value="candidatelist.html", method=RequestMethod.POST)
	public String addElection(@ModelAttribute ("CandidateBean") CandidateBean candidatebean
							 ,RedirectAttributes redirectAttributes) throws EVSException
	
	{
		System.out.println(candidatebean);
		if(adminservice.addCandidate(candidatebean))
		{
			redirectAttributes.addFlashAttribute("message", "User Created Successfully");
			redirectAttributes.addFlashAttribute("newuser", candidatebean);
		}
		
		else
		{
			redirectAttributes.addFlashAttribute("error", "Unknown error while creating User!");
		}
		return "redirect:candidatelist.html";
	}


}
