import java.util.Scanner;

public class nestedmethod{
static int l, b, h;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length breadth and height ");
l= sc.nextInt();
b=sc.nextInt();
h= sc.nextInt();;

    }
    int volume( ){

        int volume = l*b*h;
        return volume;

    }
    int area(){

        int area = 2*((l*b)+(b*h)+(l*h));
        return area;

    }
    int perimeter(){
        int peri = 4*(l+b+h);
        return peri;

    }

    public static void main(String[] args) {
        nestedmethod sc = new nestedmethod();
        sc.input();
        int volume = sc.volume();
        System.out.println("volume of cuboid is "+volume);
       int area = sc.area();
        System.out.println("area of cuboid is "+area);
        int peri = sc.perimeter();
        System.out.println("perimeter of cuboid is "+peri);

    }
}