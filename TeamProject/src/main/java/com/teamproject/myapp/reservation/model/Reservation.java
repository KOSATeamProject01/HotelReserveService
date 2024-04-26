package com.teamproject.myapp.reservation.model;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Reservation { //Reservation Table
	
	private int reserveId; //예약아이디(Primary Key)
	private int customerId; //고객아이디(참조)
	private int hotelId; //호텔아이디(참조)
	private Timestamp reserveDate; //예약일
	private Date checkinDate; //체크인 날짜
	private Date checkoutDate; //체크아웃 날짜
	private int roomNumber; //예약 객실 수
	private int peopleNumber; //투숙객 수
	
}
