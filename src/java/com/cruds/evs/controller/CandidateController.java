package com.cruds.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ElectionBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.CandidateFormBean;
import com.cruds.evs.service.AdminDAOImplService;
import com.cruds.evs.service.ElectionServiceImpl;

@Controller
public class CandidateController {
      
	@Autowired
	AdminDAOImplService adminservice;
	

	@RequestMapping(value = "candidate.html", method= RequestMethod.GET)
	public String ShowElectionForm(Model model)
	{
		model.addAttribute("command", new CandidateFormBean());	
		model.addAttribute("CANDIDATE", adminservice.viewCandidateDetailsByElectionName());
		return "candidate";	
	}
	@RequestMapping(value="candidate.html", method=RequestMethod.POST)
	public String addElection(@ModelAttribute ("CandidateFormBean") CandidateFormBean candidatebean
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
		return "redirect:candidate.html";
	}
}
