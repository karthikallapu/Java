package javapractice;
	import java.util.*;

	public class AnagramOrNot {
	    public static boolean isPangram(String sentence) {
	        Set<Character> alphabetSet = new HashSet<>();

	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            alphabetSet.add(ch);
	        }

	        for (char ch : sentence.toLowerCase().toCharArray()) {
	            if (alphabetSet.contains(ch)) {
	                alphabetSet.remove(ch);
	            }

	            if (alphabetSet.isEmpty()) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Please enter a sentence: ");
	        String inputSentence = sc.nextLine();

	        boolean isPangramResult = isPangram(inputSentence);

	        if (isPangramResult) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }
	}

