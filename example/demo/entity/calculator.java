package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//@Table(name = "calculator")
public class calculator implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serial_no;
	
	@Override
	public String toString() {
		return "calculator [Serial_no=" + serial_no + ", Input1=" + input1 + ", Input2=" + input2 +
				 "]";
	}
	
	@Column(name="input1")
	private int input1;
	
	@Column(name="input2")
	private int input2;

	
	public Long getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(Long serial_no) {
		this.serial_no = serial_no;
	}

	public int getInput1() {
		return input1;
	}

	public void setInput1(int input1) {
		this.input1 = input1;
	}

	public int getInput2() {
		return input2;
	}

	public void setInput2(int input2) {
		this.input2 = input2;
	}
	
}
