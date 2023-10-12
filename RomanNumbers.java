package javapractice;
	import java.util.HashMap;
	import java.util.Scanner;

	public class RomanNumbers {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = sc.nextLine();

	        int result = romanToInt(romanNumeral);
	        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
	    }

	    public static int romanToInt(String s) {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        

	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            int curValue = romanMap.get(s.charAt(i));
	            if (curValue < prevValue) {
	                result -= curValue;
	            } else {
	                result += curValue;
	            }
	            prevValue = curValue;
	        }

	        return result;
	    }

}
