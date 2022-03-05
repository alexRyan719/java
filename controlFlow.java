
public class controlFlow {

	public static char grade(int score) {
		
		if(score >= 90) {
			return 'A';
		}
		else if(score >= 80) {
			return 'B';
		}
		else if(score >= 70) {
			return 'C';
		}
		else if(score >= 60) {
			return 'D';
		}
		else{
			return 'F';
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(grade(90));
		System.out.println(grade(80));
		System.out.println(grade(70));
		System.out.println(grade(60));
		System.out.println(grade(0));
		System.out.println(grade(9000));
		System.out.println(grade(-1));
		System.out.println(grade(-1000000));
		
	}

}
