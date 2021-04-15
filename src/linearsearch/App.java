package linearsearch;

public class App {
	static int[] values = {1, 3, 5, 7, 9};

	public static void main(String[] args) {
		int result = linearSearch(values, 7);
		System.out.println("Search result index: "+ result);
	}
	
	public static int linearSearch(int [] a, int x){
		for(int i=0; i<a.length; i++){
			if(a[i] == x){
				return i;
			}
		}
		return -1;
	}

}
