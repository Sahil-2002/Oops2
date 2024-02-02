public class object {
static int count=0;

    object(){
        count++;

    }

    public static void main(String[] args) {
        object sc = new object();
        object sc1 = new object();
        object scj= new object();
        System.out.println("total number of object are "+count);
    }
}
