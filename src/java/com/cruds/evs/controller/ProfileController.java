package com.cruds.evs.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.ProfileFormBean;
import com.cruds.evs.service.UserServiceImpl;
import com.cruds.evs.bean.ProfileBean;
import com.cruds.evs.bean.CredentialsBean;

@Controller
public class ProfileController {
	
	
	@Autowired
	private UserServiceImpl userService;
	
	
	@RequestMapping(value = "profile.html", method= RequestMethod.GET)
	public String ShowProfileForm(Model model)
	{
		model.addAttribute("command", new ProfileFormBean());	
		return "profile";	
	}
	
	@RequestMapping(value="profile.html", method=RequestMethod.POST)
	public String createUser(@ModelAttribute ("ProfileFormBean") ProfileFormBean profileFormBean
							 ,RedirectAttributes redirectAttributes)
	{
		System.out.println(profileFormBean);
		try 
		{
			if(userService.create(profileFormBean))
			{
				redirectAttributes.addFlashAttribute("message", "User Created Successfully");
				redirectAttributes.addFlashAttribute("newuser", profileFormBean);
			}
			else
			{
				redirectAttributes.addFlashAttribute("error", "Unknown error while creating User!");
			}
		} catch (EVSException e) {
			redirectAttributes.addFlashAttribute("error", e.getExceptionInfo());
		}
		return "login";
	}
	
	@RequestMapping(value="/profilelist.html")
	public String showUserPage(Model model)
	{
		model.addAttribute("profile", new ProfileFormBean());
		model.addAttribute("PROFILE", userService.getAll());
		model.addAttribute("CREDENTIALS", userService.getAllCredentials());
		return "profilelist";
	}
	
	@RequestMapping(value="profilelist.html" , method=RequestMethod.POST)
	public String List(@ModelAttribute("ProfileFormBean") ProfileFormBean user )
	{
		System.out.println(user);
		return "redirect:profilelist.html";
	}
	
	
	@RequestMapping(value="/user-edit-{id}", method=RequestMethod.GET)
	public String edit(@PathVariable("id") Long id,Model model)
	{
		model.addAttribute("command",userService.edit(id));
		return "edituser";
	}
	
	@RequestMapping(value="editUser.html" , method=RequestMethod.POST)
	public String update(@ModelAttribute("ProfileBean") ProfileBean user )
	{
		userService.update(user);
		System.out.println(user);
		return "redirect:profilelist.html";
	}
	
	 @RequestMapping(value = { "/searchuser.html"}, method = RequestMethod.GET)
	    public String showSearchPage(ModelMap model) {
			model.addAttribute("user", new CredentialsBean());
	        return "user";
	    }
		
		@RequestMapping(value = { "/searchuser.html"}, method = RequestMethod.POST)
	    public String search(@ModelAttribute CredentialsBean user, Model model) {
			Set<CredentialsBean> userList = userService.searchUser(user.getId(), user.getUserID());
			model.addAttribute("USERLIST", userList);
	        return "user";
	    }
	
	@RequestMapping(value="/userinactive-{id}", method=RequestMethod.GET)
	public String editCred(@PathVariable("id") Long id,Model model)
	{
		model.addAttribute("command",userService.findUserById(id));
		return "inactivate";
	}
	
	@RequestMapping(value = {"/search.html"}, method = RequestMethod.GET)
	public String showUserListPage(ModelMap model) {
		model.addAttribute("Credentials", new CredentialsBean());
		return "search";
	}

	@RequestMapping(value = {"/search.html"}, method = RequestMethod.POST)
	public String searchUser(@ModelAttribute CredentialsBean cb, Model model) {
		Set<CredentialsBean> user = userService.searchUser(cb.getId(), cb.getUserID());
		model.addAttribute("User", user);
		return "search";
	}
	
	@RequestMapping(value="inActivate.html" , method=RequestMethod.POST)
	public String inActivatUser(@ModelAttribute("CredentialsBean") CredentialsBean user )
	{
		userService.inActivateUser(user);
		System.out.println(user);
		return "redirect:profilelist.html";
		
		
		
	}

}
