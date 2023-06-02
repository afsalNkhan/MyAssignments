package week1.day2;

public class Maths {

	
		
	
public int addition(int a,int b) {
	return a+b;
}
public int subtraction(int a,int b) {
return a-b;
}
public int division(int a, int b) {
	return a/b;
}
public static void main(String[]args) {
	Maths cal=new Maths();
	System.out.println(cal.addition(7, 6));
	System.out.println(cal.subtraction(8, 4));
	System.out.println(cal.division(25, 5));
	
	
}
}
