package Test;
class Model{
	
	int number;

	public int captrueInput(){
		
		System.out.print("Please enter a number :");
		number = Integer.parseInt(System.console().readLine());
		return number;

	}
	public String processResult(int i){
		
		if(i<0)

			return	"You Have Entered Negative Value";	

		else if(i==0)

			return	"You Have Entered Zero";	
			
		else if(i>0)
			
			return	"You Have Entered Positive Value";	
            return null;

	}
	
}
class TestDemo{
	
	public static void main (String[] args){

		System.out.println("This program will accept number as input and respond accordingly");
		Test.Model t1 = new Test.Model();
		System.out.println(t1.processResult(t1.captrueInput()));		
	
	}
}