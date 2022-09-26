package com.global.myApplication;

public class Applicant {
	private Integer id;
	private String name;
	private Double subject1Marks;
	private Double subject2Marks;
	private Double subject3Marks;
	private Double total;
	private Double percentage;
	public static int idgen=100; 
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Applicant(String name, Double subject1Marks, Double subject2Marks, Double subject3Marks, Double total,
			Double percentage) {
		super();
		this.id=++idgen;
		this.name = name;
		this.subject1Marks = subject1Marks;
		this.subject2Marks = subject2Marks;
		this.subject3Marks = subject3Marks;
		this.total = total;
		this.percentage = percentage;
	}
	
	public Applicant(String name, Double subject1Marks, Double subject2Marks, Double subject3Marks) {
		super();
		this.name = name;
		this.subject1Marks = subject1Marks;
		this.subject2Marks = subject2Marks;
		this.subject3Marks = subject3Marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSubject1Marks() {
		return subject1Marks;
	}
	public void setSubject1Marks(Double subject1Marks) {
		this.subject1Marks = subject1Marks;
	}
	public Double getSubject2Marks() {
		return subject2Marks;
	}
	public void setSubject2Marks(Double subject2Marks) {
		this.subject2Marks = subject2Marks;
	}
	public Double getSubject3Marks() {
		return subject3Marks;
	}
	public void setSubject3Marks(Double subject3Marks) {
		this.subject3Marks = subject3Marks;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		String output=String.format("%-5s %-10s %-5s %-5s %-5s %-10s %-10s",id,name,subject1Marks,subject2Marks,subject3Marks,total,percentage);
		return output;
		

	}
	
	
	

}
