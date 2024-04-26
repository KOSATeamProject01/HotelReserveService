package com.teamproject.myapp.reservation.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Customer { //Customer Table
	
	private int customerId; //고객아이디(Primary Key)
	private String customerName; //고객이름
	private String password; //비밀번호
	private Date birth; //생년월일
	private String phoneNumber; //고객 전화번호
	private String email; //이메일
	
}
