package grade_calculator;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
	Scanner grade = new Scanner(System.in);
	System.out.println("Grade Calculator System");
		System.out.println("Enter your grade");
		
		System.out.print("Oral Communication                      : ");
		float oralcom = grade.nextFloat();
		System.out.print("Earth & Life Science                    : ");
		float science = grade.nextFloat();  
		System.out.print("Empowerment Technology                  : ");
		float ict = grade.nextFloat();
		System.out.print("General Mathematics                     : ");
		float math = grade.nextFloat();
		System.out.print("Understanding Culture, Social & Politics: ");
		float ucsp = grade.nextFloat();
		System.out.print("English for Academic Purposes           : ");
		float eapp = grade.nextFloat();
		System.out.print("Philosophy                              : ");
		float philo = grade.nextFloat();
		System.out.print("PE & music                           : ");
		float pe = grade.nextFloat();
		
		float average = (oralcom + science + ict + math + ucsp + eapp + philo + pe)/8;
		System.out.println("The total average is: " + average);
	
		if(average > 89) {
			System.out.println("ANG TALINO MO NAMAN, KANINONG ANAK KA?");
		}else if(average >75){
			System.out.println("UY PASADO SI IDOL");
		}else {
			System.out.println("UY BAGSAK BAWI NEXT LIFE!");
		}
		
 	}
}	