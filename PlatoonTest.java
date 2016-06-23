public class PlatoonTest{ //Main class

    public static void main(String []args){//Main methord
		
        EvaluateIntiger evaluateIntiger = new EvaluateIntiger(); //Constructor to call class called EvaluateIntiger
        StringReverse stringReverse = new StringReverse(); //Constructor to call class called StringReverse
        
        //Exercise 1 Inputs
        int evenTes1 = 0; int evenTes2 = 3; int evenTes3 = 6;//Even number inputs
        int primeTes1 = 1; int primeTes2 = 3; int primeTes3 = 110; int primeTes4 = 113;//Prime number inputs
        int palindromeTest1 = 10; int palindromeTest2 = 101; int palindromeTest3 = 123321;//Palindrome number inputs
        
        //Exercise 2 Inputs
        String reversetest1 = "HelloWorld"; //String value input1
		String reversetest2 = "8BitPlatoon";//String value input2
        
        //Unit Test for even numbers
		System.out.println("Exercise 1: Integers");
		System.out.println("================Test Even================");
        System.out.println("Test Case 1: Input = " + evenTes1 + " , Output = " + evaluateIntiger.IsEven(evenTes1));
        System.out.println("Test Case 2: Input = " + evenTes2 + " , Output = " + evaluateIntiger.IsEven(evenTes2));
        System.out.println("Test Case 6: Input = " + evenTes3 + " , Output = " + evaluateIntiger.IsEven(evenTes3));
        System.out.println("======================================");
        
		//Unit Test for prime numbers
        System.out.println("");
		System.out.println("================Test Prime================");
        System.out.println("Test Case 1: Input = " + primeTes1 + " , Output = " + evaluateIntiger.IsPrime(primeTes1));
        System.out.println("Test Case 2: Input = " + primeTes2 + " , Output = " + evaluateIntiger.IsPrime(primeTes2));
        System.out.println("Test Case 3: Input = " + primeTes3 + " , Output = " + evaluateIntiger.IsPrime(primeTes3));
        System.out.println("Test Case 4: Input = " + primeTes4 + " , Output = " + evaluateIntiger.IsPrime(primeTes4));
        System.out.println("======================================");
        
		//Unit Test for palindrome numbers
        System.out.println("");
		System.out.println("================Test Palindrome================");
		System.out.println("Test Case 1: Input = " + palindromeTest1 + " , Output = " + evaluateIntiger.IsPalindrome(palindromeTest1));
		System.out.println("Test Case 2: Input = " + palindromeTest2 + " , Output = " + evaluateIntiger.IsPalindrome(palindromeTest2));
		System.out.println("Test Case 3: Input = " + palindromeTest3 + " , Output = " + evaluateIntiger.IsPalindrome(palindromeTest3));
        System.out.println("======================================");
		
		//Unit Test for Reverse String		
        System.out.println("");
        System.out.println("Exercise 2: Strings");
		System.out.println("================Test Reverse String================");
        System.out.println("Test Case 1: Input = " + reversetest1 + " , Output = " + stringReverse.ReverseString(reversetest1));
        System.out.println("Test Case 1: Input = " + reversetest2 + " , Output = " + stringReverse.ReverseString(reversetest2));
        System.out.println("=============Thanks================");
        
     }
}

class EvaluateIntiger{ //Class to evaluate intigers

        public static boolean IsEven(int even){ //Methord to evaluate even numbers
            boolean isValid = false; // control varialble
            
            if(even % 2 == 0){ //use mode to prove if number is even
                isValid = true; //change contoller value is if even,
            }
            
            return isValid;
        }
        
        public static boolean IsPrime(int prime){ //Methord to evaluate prime numbers
            boolean isValid = false; //control varialble
                  
            if(prime > 1) // check if number is greater than 1
            {
                if(prime % 2 != 0) //continue if number is not even
                {
                    if(prime % 3 != 0) //check if number is prime
                    {
                        isValid = true;
                    }
                    else if(prime == 3) //accomodate input value 3
                    {
                        isValid = true;
                    }
                }
            }
            
            return isValid;
        }
        
	public static boolean IsPalindrome(int palindrome){ //Methord to evaluate palindrome numbers
		boolean isValid = false;
		
		int originalValue = palindrome; //Store original value before changes
		int temp = 0; //declare holder of reversed value
		
		while(palindrome != 0) {
			temp = temp * 10 + palindrome % 10; //take the last digit of the input value and assign it to temp
			palindrome = palindrome / 10; //take the last digit of the input
		}
		
		if(originalValue == temp) {
			isValid = true; //check if original value and new value are equal
		}
		
		return isValid;
	}
}
	
class StringReverse{ //Class to reverse string

    public static String ReverseString(String originalValue){
	
		StringBuilder reversed = new StringBuilder();//Declare StringBuilder constructor
		reversed.append(originalValue);//Add original string to StringBuilder
		reversed.reverse(); // Use StringBuilder reverse methord
		
		return reversed.toString();
	}
}
