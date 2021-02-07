package com.example.MyWebApp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	public ArrayList<Item> items = new ArrayList<Item>();
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/additem")
	public ModelAndView additem(@RequestParam("task") String task,
			@RequestParam("date") String date,
			@RequestParam("time") String time) {
		ModelAndView mv = new ModelAndView();
		
		Item item = new Item();
		
		item.setId(items.size() + 1);
		item.setTask(task);
		item.setDate(date);
		item.setTime(time);
		
		System.out.println(item.getId());
		items.add(item);
		
		mv.addObject("items", items);
		
		mv.setViewName("home");
		return mv;
	}
}

//projectlombok.org/p2
