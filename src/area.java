public class area {

    public int triangle(int b, int h) {
        int area = (int) (0.5 * b * h);
        return area;
    }

    public int rectangle(int l, int b) {
        int area = l * b;
        return area;
    }

    public static void main(String[] args) {
       area sc = new area();

        int tri = sc.triangle(20, 10);
        int rec = sc.rectangle(20, 40);
        System.out.println("Area of triangle is " + tri);
        System.out.println("Area of rectangle is " + rec);
    }
}
