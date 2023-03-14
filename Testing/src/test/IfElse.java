package test;

public class IfElse {

	public static void main(String[] args) {
		
		// intention : I have to write code for largest number
		
//		     R--->father
//				   C--->SON
		
//		let n = 5;
//		let string = "";
//		// External loop
//		for (let i = 1; i <= n; i++) {
//		  // printing spaces
//		  for (let j = 1; j <= n - i; j++) {
//		    string += " ";
//		  }
//		  // printing star
//		  for (let k = 0; k < 2 * i - 1; k++) {
//		    string += "*";
//		  }
//		  string += "\n";
//		}
//		console.log(string);
//		
		
		int n = 5;
		for(int i=1;i<=n;i++) {
			String bag = "";
			for(int j=1;j<=n-1;j++) {
				bag += " ";
			}
			for(int k = 0; k<2*i-1;k++) {
				bag+= "*";
			}
			
			System.out.println(bag);
		}
		
		
		
//		
//		
			
		 
		
		
	}
	
}




