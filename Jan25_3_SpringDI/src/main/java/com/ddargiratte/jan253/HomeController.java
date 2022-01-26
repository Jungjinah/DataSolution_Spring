package com.ddargiratte.jan253;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ddargiratte.jan253.human.Human;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("jan253Beans.xml");
		aac.registerShutdownHook();
		
		Human h1 = aac.getBean("h1", Human.class);
		System.out.println(h1.getName());
		System.out.println(h1.getAge());
		for (String nn : h1.getNickname()) {	// 신형for문으로 배열 list (값이 여러개일때) 가져오기!
			System.out.println(nn);
		}
		
		for (String f : h1.getFriend()) {
			System.out.println(f);
		}
		
		
		Human h2 = aac.getBean("h2", Human.class);
		System.out.println(h2.getName());
		System.out.println(h2.getAge());
		for (String nn : h2.getNickname()) {	// 신형for문으로 배열 list (값이 여러개일때) 가져오기!
			System.out.println(nn);
		}
		
		for (String f : h2.getFriend()) {
			System.out.println(f);
		}
		
		System.out.println(h1.getFamily().get("아버지"));	// hashmap은 for문 반영 x / 키에 대한 value값 가져오는것이므로
		System.out.println(h1.getFamily().get("어머니"));
		System.out.println(h1.getPet().getName());
		System.out.println(h1.getPet().getAge());
		System.out.println(h1.getPet2().getName());
		System.out.println(h1.getPet2().getAge());
		
		return "home";	// home인 jsp로 가겠다!
	}
	
}
