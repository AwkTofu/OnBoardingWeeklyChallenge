public class MyClass {

    /* 
        A pronic number (or otherwise called as heteromecic) is a number which is a product of two 
        consecutive integers, that is, a number of the form n(n + 1). Create a function that determines 
        whether a number is pronic or not.
    */
    public static void main(String args[]) {
        System.out.println(isHeteromecic(0) + "\n"); //True
        // 0 (0 + 1) = 0 1 = 0
        System.out.println(isHeteromecic(2) + "\n"); //true
        // 1 (1 + 1) = 1 2 = 2
        System.out.println(isHeteromecic(7) + "\n"); //false
        System.out.println(isHeteromecic(110) + "\n"); //true
        // 10 (10 + 1) = 10 11 = 110
        System.out.println(isHeteromecic(136) + "\n"); //false
        System.out.println(isHeteromecic(156)); //true
    }
    
    public static boolean isHeteromecic(int num) {
        
        for (int i = 0; i<= num; i++)
        {
            int product = i * (i+1);
            //System.out.println("Product: " + product + " Num:" + num);
            if (product == num)
                return true;
        }

        return false;
    }
}