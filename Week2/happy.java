public class MyClass {
    public static void main(String args[]) {
        System.out.println(happy(203)); //True
        System.out.println(happy(11)); //false
        System.out.println(happy(107)); //false
    }
    
    public static boolean happy(int num) {
        while (true)
        {
            String numStr = String.valueOf(num);
            int sum = 0;
            for (int i = 0; i< numStr.length(); i++)
            {
                int value = Character.getNumericValue( numStr.charAt(i) );
                sum += value * value;
                //System.out.println(numStr.charAt(i) + "  "+ value + " " + sum);
            }
            //System.out.println("Sum is: " + sum);
            
            if (sum == 1)
                return true;
            else if (sum == 4)
                return false;
            else
            {
                num = sum;
            }
        }
    }
}