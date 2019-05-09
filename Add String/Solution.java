public class Solution {  
   public static String addStrings(String num1, String num2) {
        int num1Head = num1.length() - 1;
        int num2Head = num2.length() - 1;
        StringBuffer sumBuffer = new StringBuffer();
        int carry = 0;
    
        // iterate over all digits starting from the last index
        while (num1Head >= 0 || num2Head >= 0 || carry != 0) {
            int digit1 = num1Head >= 0 ? num1.charAt(num1Head) - '0' : 0;
            int digit2 = num2Head >= 0 ? num2.charAt(num2Head) - '0' : 0;
            int sum = (digit1 + digit2 + carry);
            
            carry = sum >= 10 ? 1 : 0;   
            sumBuffer.append(sum % 10);
            num1Head--;
            num2Head--;
        }
        
        return sumBuffer.reverse().toString();
    }

    public static void main(String[] args) {
          System.out.print(addStrings("123", "123"));
    }
}