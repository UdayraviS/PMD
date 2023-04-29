package com.cruds.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.PartyBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.service.VoterServiceImpl;

@Controller
public class VoteController {
	
	
	@Autowired
	VoterServiceImpl voterservice;
	
	

	@RequestMapping(value = "vote.html", method= RequestMethod.GET)
	public String ShowpartyForm(Model model)
	{
		model.addAttribute("command", new CandidateBean());	
		model.addAttribute("VOTE", voterservice.castVote(0, null));
		return "vote";	
	}
	@RequestMapping(value="vote.html", method=RequestMethod.POST)
	public String addVote(@ModelAttribute ("CandidateBean") CandidateBean candiadatebean
							 ,RedirectAttributes redirectAttributes) throws EVSException
	
	{
		System.out.println(candiadatebean);
	//	if(voterservice.castVote(0, null))
		{
			redirectAttributes.addFlashAttribute("message", "User Created Successfully");
			redirectAttributes.addFlashAttribute("newuser", candiadatebean);
		}
	//	else
		{
			redirectAttributes.addFlashAttribute("error", "Unknown error while creating User!");
		}
		return "redirect:vote.html";
	}

}
