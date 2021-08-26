import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String prod1 = "Computer";
		String prod2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s which price %f ", prod1 , price1);
		System.out.printf("%s which price %f ", prod2 , price2);
		
		System.out.printf("%d yeras old , code  %d and  gender: %s ", age , code, gender);
		
		System.out.printf("Measure with eight  decimal places %f ", measure);
		
	}

}
