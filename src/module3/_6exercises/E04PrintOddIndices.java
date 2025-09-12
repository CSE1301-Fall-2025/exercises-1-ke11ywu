package module3._6exercises;

public class E04PrintOddIndices {
	//Exercise 4: Complete this code to print out the Strings
	//at the odd indices of the array
    public static void main(String[] args) {
        String[] stArr1 = {"Destini", "Landon", "Anaya", "Gabby", "Evert"};
        for (int i = 0; i < stArr1.length; i++){
            if (i % 2 != 0){
                System.out.println(stArr1[i]);
            }
        }
        
    }
}
