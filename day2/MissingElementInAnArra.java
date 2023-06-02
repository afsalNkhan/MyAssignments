package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArra {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i= 0;i< arr.length;i++)
		{
			 if(i!=arr[i-2])
			 {
				 System.out.println(i);
				 break;
	}

}
}
}