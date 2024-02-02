import java.util.Scanner;
/*We make a method named input which is used to get input from the user.
We also make a method named add which is used to perform addition and return the result
back to input method where we finally print the result.

*
 */
public class calculator {
int a, b, add ;
    public void input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");
         a = sc.nextInt();
        System.out.println("enter the value of b : ");
         b = sc.nextInt();
         int add =add();
         int sub = sub();

        System.out.println("addition is "+add);
        System.out.println("subtraction is "+sub);


    }
    public int add(){
         add = a+b;
        return add;
    }
    public int sub(){
        int sub = a-b;
        return sub;

    }


    public static void main(String[] args) {
        calculator sc = new calculator();

        sc.input();



    }
}

