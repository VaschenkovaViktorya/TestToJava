public class Numbers {


    public static void main(String[] args) {
        int a = (int) (Math.random()*(200+1)) - 100;
        int b = (int) (Math.random()*(200+1)) - 100;
        reverse(a, b);
    }

    public static void reverse(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("После замены");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
