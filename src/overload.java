public class overload {

    void add(int a , int b ){
        int sum = a+b;
        System.out.println("addition is "+sum);
    }
    void add(int a , int b , int c ){
        int sum = a+b+c;
        System.out.println("addition is "+sum);

    }
    void add( int a , int b ,int c , int d ){
        int sum = a+b+c+d;
        System.out.println("addition is "+sum);
    }

    public static void main(String[] args) {
        overload sc = new overload();
        sc.add(10,20);
        sc.add(10,20,30);
        sc.add(10,20,30,40);
    }
}
