package week1.day2;

public class Duplicate {
	public static void main(String[] args) {
	int[] num= {1,6,89,7,2,1,89,7};
	for(int i= 0;i< num.length;i++)
	{
		for(int j=i+1;j< num.length;j++)
		{
			if(num[i] == num[j])
		
				System.out.println(num[i]);
		}
		}
	}
}
