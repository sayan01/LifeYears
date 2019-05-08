import java.util.*;
class LifeYears{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter your date of birth (DD MM YYYY): ");
		String[] dob_tokens = sc.nextLine().split("[ /-.]+");
		GUI gui = new GUI(calculate(dob_tokens));
	}
	static int calculate(String[] dob_tokens){
		Calendar currentInstance = Calendar.getInstance();
		Calendar dobInstance = Calendar.getInstance();
		dobInstance.set(Integer.parseInt(dob_tokens[2])
						,Integer.parseInt(dob_tokens[1])-1
						,Integer.parseInt(dob_tokens[0]) , 0,0,0);
		if(dobInstance.after(currentInstance)){
			System.out.println("You are not born yet!");
			System.exit(1);
		}
		int years = 0;
		while(!dobInstance.after(currentInstance)){
			years++;
			dobInstance.add(Calendar.YEAR,1);
		}
		years--;
		if(years>100){
			System.out.println("You are more than 100 years old!");
			System.exit(1);
		}
		System.out.printf("No. of Years: %d\n",years);
		return years;
	}
}
