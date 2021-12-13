public class MyClass {
    public static void main(String args[]) {
        System.out.println(waysToClimb(1) + "\n");
        System.out.println(waysToClimb(2)+ "\n");
        System.out.println(waysToClimb(5));

        System.out.println(waysToClimb2(1) + "\n");
        System.out.println(waysToClimb2(2)+ "\n");
        System.out.println(waysToClimb2(5));
    }
    
    //This is basically fibonacci sequence
    public static int waysToClimb(int n){
        //System.out.println("n: " + n);
        
        if (n == 1 || n == 0)
            return 1;
        else
        {
            return waysToClimb(n-1) + waysToClimb(n-2); 
        }        
    }

    //Learning Dynamic Programming
    //Concept is doing it bottom up, starting from f(0) and f(1) and keep on going until f(n)
    //Since Fibonacci sequence only needs the previous 2 number
    public static int waysToClimb2(int n) {
        //If n is 0 or 1, just return 1, no need for calculation
        if (n == 0 || n == 1)
            return 1;
        
        //def the first two number, fibonacci first 2 number is always 1;
        int num1 = 1;
        int num2 = 1;
        
        /*for (int i = 2; i <= n; i++)
        {
            //Getting the result for current i
            int sum = num1 + num2;
            //System.out.println("i: " + i + " | Sum: " + sum);
            
            //Replacing the two numbers
            num1 = num2;
            num2 = sum;
        }*/
        
        //Trying to replace numbers without creating new integer
        for (int i = 2; i <= n; i++)
        {
            num2 += num1;
            num1 = num2 - num1;
        }
        
        //num2 is the latest result so we return that.
        return num2;
    }
}