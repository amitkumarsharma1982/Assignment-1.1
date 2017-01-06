class StudentModel{
	
	int marks;
        int age;

	public void captrueMarksAge(){
		
		System.out.print("Please enter your marks :");
		marks = Integer.parseInt(System.console().readLine());
		System.out.print("Please enter your age :");
                age = Integer.parseInt(System.console().readLine());
	}
	public String processGrade(){
		
		if (age>=15){
                    
                    if (marks>=70)
                        return "Grade A";
                    else if (marks>=61 && marks<70 )
                        return "Grade B";
                    else if (marks<61)  
                        return "Grade C";
                    
                }else if (age<15){
                    
                    if (marks>=60)
                        return "Grade A";
                    else if (marks>=45 && marks<60 )
                        return "Grade B";
                    else if (marks<45)  
                        return "Grade C";
                        
                }
                
            return null;

	}
	
}
class StudentResult{
	
	public static void main (String[] args){

		System.out.println("This program will print the grade for given marks and age");
		StudentModel t1 = new StudentModel();
                t1.captrueMarksAge();
		System.out.println("Your Grade is :"+t1.processGrade()+" ,your age is "+t1.age);		
	
	}
}