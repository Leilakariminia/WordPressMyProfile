package testNGProject;

public class Tamrin1 {
	public static void main(String[] args) {
		
	
	String[] arr = {"ac","bd","ct","de","e","f","g","hz","t","1"};
	for (int i=0;i<arr.length-1;i++) {
		if(arr[i].contains("t") && arr[i].charAt(i)!='t') {
			System.out.println("Value not allowed");
		}else 
			System.out.println(arr[i]);
			
		}
	}

}