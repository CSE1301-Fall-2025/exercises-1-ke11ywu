package module2._10exercises;

public class E10LoopRewrite3 {
	
	//Exercise 10: Rewrite the following to use a while loop
	//instead of a for loop
    public static void main(String[] args) {
    //    for (int x = 10; x <= 100; x=x+10)
    //        System.out.println(x);

        int x = 10;
        while (x <= 100) {
            System.out.println(x);
            x+=10;
        }

    }
}
