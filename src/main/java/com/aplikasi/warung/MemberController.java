package com.aplikasi.warung;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aplikasi.warung.domain.Member;
import com.aplikasi.warung.repository.MemberRepository;


@Controller
public class MemberController {
	@Autowired
	MemberRepository mr;
	
	@RequestMapping(value = "/Register",method=RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("memberBean", new Member());
		
		return mv;
	}
	
	@RequestMapping(value = "/Register/add",method=RequestMethod.POST)
	public ModelAndView addMember(@ModelAttribute Member Member) {
		ModelAndView mv = new ModelAndView("redirect:/tempTestRegist");
		this.mr.addMember(Member);
		return mv;
	}
	@RequestMapping(value= "/tempTestRegist",method=RequestMethod.GET)
	public ModelAndView testing(){
		ModelAndView mv = new ModelAndView("tempTestRegist");
		mv.addObject("members", this.mr.getMemberAll());
		return mv;
	}
	@RequestMapping(value= "/akunku",method=RequestMethod.GET)
	public ModelAndView akunku(){
		ModelAndView mv = new ModelAndView("akunku");
		mv.addObject("members", this.mr.getMemberAll());
		return mv;
	}
	
}

