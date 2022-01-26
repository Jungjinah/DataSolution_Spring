package com.ddargiratte.jan254.member;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 어떤 사이트에서 회원이 생년월일을 기입해서 가입했다!
//	사이트에서 연/월/일  -> 연-월-일 시:분:초

// 이 service의 기능은 servlet-context.xml에 MemberDAO를 등록한 효과! (DAO에서 하나의 객체로 쓸 수 있게! servlet과 연결한다,,)
@Service
public class MemberDAO {
	// 여기서 저렇게 바꾸기는 힘들어보임,,,
	//	여기서 하기보다는 servlet-context.xml에 가서 하기!
	
	@Autowired
	private SimpleDateFormat sdf;
	
	public void test() {
		Date now = new Date();
		System.out.println(sdf.format(now));	// 현재 날짜!
	}
	
}
