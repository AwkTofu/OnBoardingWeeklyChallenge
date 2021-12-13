public class MyClass {
    public static void main(String args[]) {
        System.out.println(almostPalindrome("abcdcbg") + "\n");
        System.out.println(almostPalindrome("abccia")+ "\n");
        System.out.println(almostPalindrome("abcdaaa"));
    }
    
    public static boolean almostPalindrome(String input){
        //System.out.println("Input: " + input);
        
        int len = input.length();
        int error = 0;
        
        for(int i = 0; i < len/2; i++)
        {
            //System.out.println(input.charAt(i) + " " + input.charAt(len - i - 1) + " " + (input.charAt(i) == input.charAt(len - i - 1)));
            if (input.charAt(i) != input.charAt(len - i - 1))
                error++;
        }
        
        //System.out.println("Error: " + error);
        return error < 2 ? true : false;
    }
}