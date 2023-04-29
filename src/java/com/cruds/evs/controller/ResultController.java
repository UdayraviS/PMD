package com.cruds.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.evs.bean.ResultBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.ResultFormBean;
import com.cruds.evs.service.VoterServiceImpl;

@Controller
public class ResultController {
	

	@Autowired
	VoterServiceImpl voterservice;
	
	

	@RequestMapping(value = "result.html", method= RequestMethod.GET)
	public String ShowpartyForm(Model model)
	{
		model.addAttribute("command", new ResultFormBean());	
		model.addAttribute("RES", voterservice.viewListOfElectionsResults());
		return "result";	
	}
	@RequestMapping(value="result.html", method=RequestMethod.POST)
	public String addVote(@ModelAttribute ("ResultFormBean") ResultFormBean resultbean
							 ,RedirectAttributes redirectAttributes) throws EVSException
	
	{
		System.out.println(resultbean);
	if(voterservice.addResult(resultbean))
		{
			redirectAttributes.addFlashAttribute("message", "User Created Successfully");
			redirectAttributes.addFlashAttribute("newuser", resultbean);
		}
		else
		{
			redirectAttributes.addFlashAttribute("error", "Unknown error while creating User!");
		}
		return "redirect:result.html";
	}

}

	


