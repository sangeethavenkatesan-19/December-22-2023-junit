package Phase2_JUNIT.Friday;

public class AgeCalculator {
	//calculate age
	public int calculateAge(int yearOfBirth) {
		int currentYear = 2023;
		if(yearOfBirth>0)
			return currentYear - yearOfBirth;
		else
			return 0;
	}
	
	//calculate retirement
	public boolean isRetired(int yearOfBirth) {
		int age = calculateAge(yearOfBirth);
		int retage = 60;
		if(age > retage)
			return true;
		else
			return false;
	}
}
