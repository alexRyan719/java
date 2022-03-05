
//public class debugging {
//	
//	public static void main(String[] args) {
//		
//		String test = new String("Hello");
//		for(int i = 0; i < test.length(); i++) {
//			// Trying to get an index outside of the range will result
//			// in a StringIndexOutOfBoundsException
//			System.out.println(test.charAt(i - 1));
//			
//		}
//		
//		// println() is misspelled and the ; at the end of the line is 
//		// missing
//		System.out.printline("Hello World")
//		
//	// You would need another } here to balance the curly brackets
//	
//}

	
	
	public class debugging {
		
		public static void main(String[] args) {
			
			String test = new String("Hello");
			
			for(int i = 0; i < test.length(); i++) {

				System.out.println(test.charAt(i));
				
			}
			
			System.out.println("Hello World");
			
		}
		
	}