package module2._10exercises;

public class E18MessageX {
	//Exercise 18: Complete the program so that it prints the
	//message each time through a loop, removing one "x" each time, until there are no more.
    public static void main(String[] args) {
        String message = "Ix lovex youxxx";
        System.out.println(message);

        int index = 0;

        while (message.indexOf("x") >= 0)  {
            index = message.indexOf("x");
            String firstpart = message.substring(0,index);
            String lastpart = message.substring(index+1);
            message = firstpart + lastpart;
            System.out.println(message);
        }
    }
}
