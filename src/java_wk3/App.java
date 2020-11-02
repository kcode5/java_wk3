package java_wk3;

public class App {

	public static void main(String[] args) {
		
		//1 create an array of type int and call it ages
		int[] ages = new int [8];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		//1a/b subtract first element value from last element value
		System.out.println((ages[ages.length - 1]) - ages[0]);
	
	
		//1c loop thru the array to calculate the average age
		double sum = 0;
		for (int age : ages) {
			sum += age;
		}	
		System.out.println("Average age is: " + sum / ages.length);	
		
		
		//2 create an array of type String called names
		String[] names = new String [6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//2a loop thru to calculate the average number of letters per name
		double totalLetters = 0;
		for (String letters : names) {
			totalLetters += letters.length();
		}
		System.out.println(totalLetters / names.length);
			
		//2b loop thru the array to concatenate names
		String concatNames = "";
		for (String name : names) {
			concatNames += (name + " ");
		}
			System.out.println(concatNames);	
		
		//3 how to access the last element in an array?
		System.out.println(names[names.length - 1]);
		
		
		//4 how to access the first element in an array?
		System.out.println(names[0]);
		
		
		//5 create an array of type int called nameLengths. write a loop to iterate over names array  
		//and add length of each element to nameLengths array.
		int[] nameLengths = new int [10];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println("Length of name at index: " + i + " is " + nameLengths[i]);
		}	
		
		//6 calculate the sum of all elements in the nameLengths array
		int sum2 = 0;
			
		for(int eachElement : nameLengths) {
			sum2 += eachElement;		
		}
		System.out.println("The sum of all values is: " + sum2);
		
		//7 call concatString
		System.out.println(concatString("Hello", 3));
		
		//8 call concatName
		System.out.println(concatName("Barney", "Rubble"));
		
		//9 call sumArray and pass ages array
		System.out.println(sumArray(ages));
		
		//10 call calcAvg and pass grades array, below
		double grades[] = new double [3];
		grades[0] = 80;
		grades[1] = 91;
		grades[2] = 67;
		
		System.out.println(calcAvg(grades));
		
		//11 call compArrays and pass grades array and grades2 array, below
		double grades2[] = new double [3];
		grades2[0] = 80;
		grades2[1] = 91;
		grades2[2] = 65;
		
		System.out.println(compArrays(grades, grades2));
		
		//12 call buyDrink vars def below
		boolean isHotOutside = false;
		double moneyInPocket = 11.75;
		
		System.out.println(buyDrink(isHotOutside, moneyInPocket));
		
		//13 call printRecords method and pass stringData array
		String stringData[] = new String [3];
		stringData[0] = "37123741283947979797923k414";
		stringData[1] = "4167857,959578685556454";
		stringData[2] = "9634553x3315875935645";
		
		printRecords(stringData);
		
	}
	
	//7 method that takes a String and an int and returns the string concatenated to itself n number of times
	public static String concatString(String word, int n) {
		String newString = "";
		for (int i = 0; i < n; i++) {
			newString += word;
		}
		return newString;
	}	

	//8 method that takes two strings and returns both separated by a space
	public static String concatName(String a, String b) {
		return a + " " + b;
	}
	
	//9 method that takes an array of int and returns true if the sum of all ints > 100
	public static boolean sumArray(int[] numbers) {
		int sum = 0;						
		for(int number : numbers) {
			sum += number;	
		}
			if (sum > 100) {
				return true;
			} else
				return false;
	}
	//10 method that takes an array of double and returns the average of all elements in the array
	public static double calcAvg(double[] numbers) {
		double sum = 0;
		for(double number : numbers) {
			sum += number;	
		}
		return sum / numbers.length;
	}	
	
	//11 method that takes two arrays of double and returns true if the average of elements
	//in the first array is > than the average of the elements in the second array
	public static boolean compArrays(double[] numbersArr1, double[] numbersArr2) {
		double sum1 = 0;
		double sum2 = 0;
		for(double num1 : numbersArr1) {
			sum1 += num1;
		}	
		for(double num2 : numbersArr2) {
			sum2 += num2; 	
		}
			if (sum1 / numbersArr1.length > sum2 / numbersArr2.length) {
				return true;
			} else
				return false;
	}
	//12 method that takes a boolean and a double and returns true if boolean is true AND double is > 10.50
	public static boolean buyDrink(boolean answer, double amount) {
		if (answer && amount > 10.50) {
			return true;
		} else
			return false;
	}
	//13 simple method that takes an array of type String and prints out every element in the array. 
	public static void printRecords(String[] stringData) {
			for(int i = 0; i < stringData.length; i++) {			 
				System.out.println("Index:" + i + " " + stringData[i]);			
			}
	}
	
}
