import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter first number");
        a = s.nextInt();
        System.out.println("Please enter second number");
        b = s.nextInt();
        System.out.println("Please enter first number");
        c = s.nextInt();

        if(a > b && a > c){
            System.out.println(a);
        }else if (b > a && b > c){
            System.out.println(a);
        }else {
            System.out.println(c);
        }



//        if(a > b){
//            if (a>c){
//                System.out.println(a);
//            }else {
//                System.out.println(c);
//            }
//        }else if(b>c){
//            System.out.println(b);
//        }else {
//            System.out.println(c);
//        }
    }
}
