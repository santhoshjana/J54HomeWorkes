class Grade{
	public static void main(String[] args){
		int mark = 51;
		
		
		if(mark >= 90){
			System.out.println("A");
		}
		else if(mark >= 75){
			System.out.println("B");
		}
		else if(mark >= 50){
			System.out.println("C");
		}
		else if(mark < 50){
			System.out.println("Fail");
		}
	}
}