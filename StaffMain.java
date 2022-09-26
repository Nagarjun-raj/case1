package com.global.myApplication;

import java.util.Scanner;

public class StaffMain {
	public static Double totalCalculation(Applicant applicant) {
		double marks1=applicant.getSubject1Marks();
		double marks2=applicant.getSubject2Marks();
		double marks3=applicant.getSubject3Marks();
		if(marks1<50 | marks2<50 | marks3<50) {
			return (double)0;
		}
		double total=marks1+marks2+marks3;
		return total;
		

	}
	public static Double percentageCalculation (Double total) {
		double percentage=(total/300)*100;
		return percentage;

	}

	public static void main(String[] args) throws MarksException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of applicants:");
		int num=Integer.parseInt(s.nextLine());
		Applicant app[]=new Applicant[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter applicant details:");
			String str=s.nextLine();
			String stg[]=str.split(",");
			try {
			Double marks1=Double.parseDouble(stg[1]);
			if(marks1<0 | marks1>100) {
				throw new MarksException("Invalid marks");
			}
			Double marks2=Double.parseDouble(stg[2]);
			if(marks2<0 | marks2>100) {
				throw new MarksException("Invalid marks");
			}
			Double marks3=Double.parseDouble(stg[3]);
			if(marks3<0 | marks3>100) {
				throw new MarksException("Invalid marks");
			}
			Applicant applicant=new Applicant(stg[0],marks1,marks2,marks3);
			Double total=totalCalculation(applicant);
			Double percentage=percentageCalculation (total);
			Applicant applicant1=new Applicant(stg[0],marks1,marks2,marks3,total,percentage);
			app[i]=applicant1;
			
			
			
			
		}
			catch(MarksException me)
			{
				System.out.println(me.getMessage());
			}
			
			

	}
		for(Applicant a:app) {
			System.out.println(a);
		}

		

}
}
