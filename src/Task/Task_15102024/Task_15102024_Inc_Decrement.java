package Task.Task_15102024;

public class Task_15102024_Inc_Decrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13
        System.out.println(--a + a++ + a--);
        System.out.println(a);

    }
}