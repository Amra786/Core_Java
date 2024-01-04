package exceptionhandling;

 class TooYoungException extends RuntimeException{
	 TooYoungException(String s){
	super(s);
	}
}
class TooOldException extends RuntimeException{
	TooOldException(String s){
		super(s);
	}
}
class CustException {
	public static void main(String[] args) {
	int age = Integer.parseInt(args[0]);
	if(age>60){
		throw new TooYoungException("please wait some more time...You will get best match soon");
		}
	else if(age<18)
	{
		throw new TooOldException("your age is already crossed marriage age...no chance of getting marriage");
	}
	else {
		System.out.println("you will get match details soon by email...!");
		}
	}
}	
	
	
	

	

