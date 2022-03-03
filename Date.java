
//Program to  accept and display date,time,month using class//
import java.util.*;

class Date{
	private int month;
	private int day;
	private int year;
	public Date(int M,int D, int Y){
		month = M;
		day = D;
		year = Y;
	}
	public void setMonthDate(int M){
		month = M;
	}
	public int getMonthDate(){
		return month;
	}
	public void setDayDate(int D){
		day = D;
	}
	public int getDayDate(){
		return day;
	}
	public void setYearDate(int Y){
		year = Y;
	}
	public int getYearDate(){
		return year;
	}
	public void displayDate(){
	System.out.print("Date is : ");
	System.out.println(month + "/" + day + "/"+ year);
	}
}

class DateTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Date myDate = new Date(10, 01, 2001);

		System.out.println("Enter The Month: ");
		int myMonth = input.nextInt();
		myDate.setMonthDate(myMonth);

		System.out.println("Enter the Date: ");
		int myDay = input.nextInt();
		myDate.setDayDate(myDay);

		System.out.println("Enter the Year: ");
		int myYear = input.nextInt();
		myDate.setYearDate(myYear);
		myDate.displayDate();
	}
}