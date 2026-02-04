class ArithmaticOpra{
	public static void main(String[] args){
		int num1 = 251;
		int num2 = 25;
		char opra = '+';
		
		if(opra == '*'){
			System.out.println(num1* num2);
		}
		else if(opra == '+'){
			System.out.println(num1 + num2);
		}
		else if(opra == '-'){
			System.out.println(num1 - num2);
		}

		else if(opra == '/'){
			System.out.println(num1 / num2);
		}
	}
}