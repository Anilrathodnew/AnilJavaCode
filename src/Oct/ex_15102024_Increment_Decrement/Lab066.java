package Oct.ex_15102024_Increment_Decrement;

public class Lab066 {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(result);
        System.out.println(a);

        // Line No. | Exp  |  a
        //  5       |      |  10
        //  6       |  result = 10   |  11
        //  7       |  result = 10   |  11
    }
}