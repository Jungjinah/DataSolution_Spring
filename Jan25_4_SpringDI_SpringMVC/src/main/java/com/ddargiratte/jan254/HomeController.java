package com.ddargiratte.jan254;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ddargiratte.jan254.fruit.Fruit;
import com.ddargiratte.jan254.member.MemberDAO;

@Controller
public class HomeController {
	
	@Autowired	// 과일을 가져올거임!
	private Fruit f;	// 아까와는 다른 f얌	(보통 자동완성 안될때 가져오는데 더 알아봐..)
	
	@Autowired
	private MemberDAO mDAO;	// autowired는 dao 할때 거의 쓰인다!로 알고 있엉
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println(f.getName());	// 이거 f. 자동완성 되게 하려고 위에 autowired 해줌!
		System.out.println(f.getPrice());
		
		// MemberDAO.			// test 메소드 안나옴,,
		mDAO.test();			// 자동완성 나오게 하려면 autowired 해야함!
		return "home";
	}
	
}

// @Annotation: 사전적 의미로는 '주석'
//		코드 사이에 주석처럼 쓰이면서 기능을 수행하도록 하는 기술
//			- 코드 작성 문법에러를 체크하도록 정보를 제공
//			- 개발 툴이 코드를 자동으로 생성할 수 있도록
//			- 실행 시 특정한 기능을 수행하도록

// 종류
//	1. @Bean
//		-> 직접 제어가 불가능한 외부 라이브러리 등을 Bean으로 만드려고 할 때 사용
//		ex) sqlsession / sqlsessionTemplete
//	2. @Autowired
//		-> 속성, setter, 생성자에서 사용, 타입에 따라서 Bean을 주입해준다!
//	3. @Controller
//		-> 말 그대로 Controller
//	4. @RestController
//		-> Controller 중에서 View로 응답하지 않는 Controller
//			data(json, xml) return이 주 목적!
//	5. @ResponseBody
//		-> 자바 객체를 HTTP 요청의 body의 내용으로 매핑하는 역할
//	3,4,5번 => @RestController = @Controller + @ResponseBody

//	6. @Service
//		-> 어떤 기능을 수행하는 Class를 나타내는 용도 
//	7. @XmlRootElemnt / @XmlElement
//		-> 어떤 특정한 데이터를 XML형식으로 만드는데 사용 (먀샬링 : Mashalling)
//			그 반대도 가능(언마샬링 : Unmashalling)
//			XmlRootElement : Javabean 객체의 Class 명시
//			XmlElement : Javabean 객체의 setter에 명시
//	8. @RequestMapping (value / method 나옴)
//		-> 요청에 따라 어떤 Controller, 어떤 Method가 구현될지 매핑하기 위해서 사용
//			value : 요청받을 주소(url)을 설정
//			method : 어떤 방식으로 요청을 받을지 설정할 수 있음 (GET, POST방식)
//	9. @RequestParam
//		-> 요청 파라미터를 설정 
