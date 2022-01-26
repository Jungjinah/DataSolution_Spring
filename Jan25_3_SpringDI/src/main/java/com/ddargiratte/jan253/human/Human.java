package com.ddargiratte.jan253.human;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.ddargiratte.jan253.bird.Bird;
import com.ddargiratte.jan253.dog.Dog;

public class Human {
	
	// 기본형인 자료형
	private String name;
	private int age;
	
	// 컬렉션
	private String[] nickname;
	private ArrayList<String> friend;
	private HashMap<String, Integer> family;	// 가족구성원은 어떻게 되는가
	
	// Has A 관계
	private Dog pet;
	
	// .xml에 등록된 Bird 객체 자동으로 연결(생성자, setter 필요 없음!) <= 'autowired'
	@Autowired
	private Bird pet2;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, String[] nickname, ArrayList<String> friend, HashMap<String, Integer> family,
			Dog pet, Bird pet2) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
		this.friend = friend;
		this.family = family;
		this.pet = pet;
		this.pet2 = pet2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getNickname() {
		return nickname;
	}

	public void setNickname(String[] nickname) {
		this.nickname = nickname;
	}

	public ArrayList<String> getFriend() {
		return friend;
	}

	public void setFriend(ArrayList<String> friend) {
		this.friend = friend;
	}

	public HashMap<String, Integer> getFamily() {
		return family;
	}

	public void setFamily(HashMap<String, Integer> family) {
		this.family = family;
	}

	public Dog getPet() {
		return pet;
	}

	public void setPet(Dog pet) {
		this.pet = pet;
	}

	public Bird getPet2() {
		return pet2;
	}
	
	// 방금 지운 이유는 autowired 때문에ㅈ ㅣ움!
	// .xml에 등록된 Bird 객체 자동으로 연결(생성자, setter 필요 없음!)
}
