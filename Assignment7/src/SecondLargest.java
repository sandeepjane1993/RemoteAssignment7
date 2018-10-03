
import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] array = {22,43,2,13,65,5,38};
		SecondLargest obj = new SecondLargest();
		System.out.println(obj.secondLargestArray(array));
	}
	public int secondLargestArray(int[] array )
	{
		 Arrays.sort(array);
		return (array[array.length-2]);
	}

}
