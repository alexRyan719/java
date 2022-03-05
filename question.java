
public class question {

	String correct;
	String false1;
	String false2;
	String false3;
	int qID;
	
	public question(String answer, String firstFalse, String secondFalse, String thirdFalse, int qID) {
		this.correct = answer;
		this.false1 = firstFalse;
		this.false2 = secondFalse;
		this.false3 = thirdFalse;
		this.qID = qID;
	}

	public int getID() {
		return this.qID;
	}
	
	public void setID(int newNum) {
		this.qID = newNum;
	}
	
	public String showCorrect() {
		return "Correct answer: " + this.correct;
	}
	
	public String showFalse() {
		return "Wrong answer #1: " + this.false1 + "\n" 
			+ "Wrong answer #2: " + this.false2 + "\n" 
			+ "Wrong answer #3: " + this.false3;
	}
	
	public static void main(String[] args) {
		//int var1 = 9;
		//System.out.println(var1);		
		// TODO Auto-generated method stub
		question test1 = new question("Taco", "Pizza", "Gyro", "Noodles", 42);
		
		System.out.println("test1 ID: " + test1.getID());
		System.out.println("We made a test");
		test1.setID(777);
		System.out.println(test1.showCorrect());
		System.out.println(test1.showFalse());
		System.out.println("test1 ID: " + test1.getID());
	}

}
