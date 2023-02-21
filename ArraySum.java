
public class ArraySum {

	public int sumOfArray(Integer[] a, int index) { //1,5,10,20,50,100
		
		//base case
		if(index==a.length)
			return a[index];
		
		//recursive case
		return sumOfArray(a, index+1)+a[index];
		
	}
	
	
}
