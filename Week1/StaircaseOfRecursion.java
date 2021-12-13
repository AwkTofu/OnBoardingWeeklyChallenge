public class MyClass {
    public static void main(String args[]) {
        System.out.println(waysToClimb(1) + "\n");
        System.out.println(waysToClimb(2)+ "\n");
        System.out.println(waysToClimb(5));
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

    
}