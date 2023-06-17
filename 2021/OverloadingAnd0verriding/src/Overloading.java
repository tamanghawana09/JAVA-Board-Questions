public class Overloading {
    public static int add(int n1, int n2){
        return n1+n2;
    }
    public static int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
    }
}
