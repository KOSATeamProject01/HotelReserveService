package com.teamproject.myapp.reservation.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Hotel { //Hotel Table
	
	private int hotelId; //호텔아이디(Primary Key)
	private String hotelName; //호텔명
	private String address; //주소
	private String hotelNumber; //호텔전화번호
	private int price; //1박당 가격
	private double rating; //평점
	private byte[] hotelImage; //대표이미지
	
}
