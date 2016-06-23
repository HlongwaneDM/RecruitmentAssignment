public class EvaluateIntegers{ //Main class

    public static void main(String []args){//Main methord
		        
        //Exercise 1 Inputs
        int evenTes1 = 0; int evenTes2 = 3; int evenTes3 = 6;//Even number inputs
        int primeTes1 = 1; int primeTes2 = 3; int primeTes3 = 110; int primeTes4 = 113;//Prime number inputs
        int palindromeTest1 = 10; int palindromeTest2 = 101; int palindromeTest3 = 123321;//Palindrome number inputs
        
        
        //Unit Test for even numbers
	System.out.println("Exercise 1: Integers");
	System.out.println("================Test Even================");
        System.out.println("Test Case 1: Input = " + evenTes1 + " , Output = " + IsEven(evenTes1));
        System.out.println("Test Case 2: Input = " + evenTes2 + " , Output = " + IsEven(evenTes2));
        System.out.println("Test Case 6: Input = " + evenTes3 + " , Output = " + IsEven(evenTes3));
        System.out.println("======================================");
        
	//Unit Test for prime numbers
        System.out.println("");
	System.out.println("================Test Prime================");
        System.out.println("Test Case 1: Input = " + primeTes1 + " , Output = " + IsPrime(primeTes1));
        System.out.println("Test Case 2: Input = " + primeTes2 + " , Output = " + IsPrime(primeTes2));
        System.out.println("Test Case 3: Input = " + primeTes3 + " , Output = " + IsPrime(primeTes3));
        System.out.println("Test Case 4: Input = " + primeTes4 + " , Output = " + IsPrime(primeTes4));
        System.out.println("======================================");
        
	//Unit Test for palindrome numbers
        System.out.println("");
	System.out.println("================Test Palindrome================");
	System.out.println("Test Case 1: Input = " + palindromeTest1 + " , Output = " + IsPalindrome(palindromeTest1));
	System.out.println("Test Case 2: Input = " + palindromeTest2 + " , Output = " + IsPalindrome(palindromeTest2));
	System.out.println("Test Case 3: Input = " + palindromeTest3 + " , Output = " + IsPalindrome(palindromeTest3));
        System.out.println("======================================");
    }
    
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