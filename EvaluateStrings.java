public class EvaluateStrings{ //Main class

    public static void main(String []args){//Main methord
	
        //Exercise 2 Inputs
        String reversetest1 = "HelloWorld"; //String value input1
	String reversetest2 = "8BitPlatoon";//String value input2
        
        System.out.println("");
        System.out.println("Exercise 2: Strings");
		System.out.println("================Test Reverse String================");
        System.out.println("Test Case 1: Input = " + reversetest1 + " , Output = " + ReverseString(reversetest1));
        System.out.println("Test Case 1: Input = " + reversetest2 + " , Output = " + ReverseString(reversetest2));
        System.out.println("=============Thanks================");
        
    }
    
    public static String ReverseString(String originalValue){
	
	StringBuilder reversed = new StringBuilder();//Declare StringBuilder constructor
	reversed.append(originalValue);//Add original string to StringBuilder
	reversed.reverse(); // Use StringBuilder reverse methord
	
	return reversed.toString();
    }
}