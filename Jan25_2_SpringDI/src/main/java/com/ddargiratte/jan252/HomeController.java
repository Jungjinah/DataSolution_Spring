package com.ddargiratte.jan252;

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

import com.ddargiratte.jan252.animation.Animation;
import com.ddargiratte.jan252.stock.Stock;

@Controller
public class HomeController {
	
	// Spring : Java에서 IoC로 DI를 해주는 Framework
	//			객체를 .java에서 만들기 - Spring에선 X
	//			객체를 외부 파일(.xml파일)에 만들기 -> .java에서는 객체를 붋러오게
	
	// 사이트에 첫 접속은 GET방식으로 하게따! 문구,,
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		// DI(Dependency Injection - 의존성 주입)
		//		객체를 만들고, 속성 값 넣고...
		
		// 원래는 이렇게 객체를 만들었다면...
//		Stock s = new Stock("NAVER" , 323000);
//		System.out.println(s.getName());
//		System.out.println(s.getPrice());
		
		// jan252Beans.xml에 저장되어있고, 불러와야함! -> 거기에 등록해 놓응ㄴ 객체가 다 만들어짐
		// AbstractApplication : Bean객체를 생성하고 관리하는 기능
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("jan252Beans.xml");
		
		// aac가 없어질 때 jan252Beans.xml에 등록해놓은 객체들 다 없애라
		aac.registerShutdownHook();
		
		// id가 s1인 Stock객체 불러오기
		Stock s = aac.getBean("s2", Stock.class);
		System.out.println(s);
	
		Stock ss = aac.getBean("s2", Stock.class);
		System.out.println(ss.getName());
		System.out.println(ss.getPrice());
		System.out.println("---------------");
		
		// 새로운 객체를 만들어서 DI를 한번!
		Animation a = aac.getBean("ani", Animation.class);
		System.out.println(a);
	
		Animation aa = aac.getBean("ani", Animation.class);
		System.out.println(aa.getTitle());
		System.out.println(aa.getName());
		System.out.println(aa.getYear());
		System.out.println("-------------");
		
		Stock sss = aac.getBean("s3", Stock.class);
		System.out.println(sss.getName());
		System.out.println(sss.getPrice());
		System.out.println("-------------");
		
		Animation aaa = aac.getBean("animation", Animation.class);
		System.out.println(aaa.getTitle());
		System.out.println(aaa.getName());
		System.out.println(aaa.getYear());
		System.out.println("-------------");
		
		// GC발동 (Garbage Collection) : 더이상 jan252Beans.xml에 접근할 방법이 없어지면...
		
		// aac없애면 GC발동! -> aac를 없애면 xml에 접근할 방법 없어짐...!
		aac.close();
		
		return "home";
	}
	
}
