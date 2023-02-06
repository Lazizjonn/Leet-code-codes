public class Main {
    public static void main(String[] args) {
        System.out.println(fun(100));
    }

    public static int fun(int x) {
        if (x == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        return 4 * fun(x - 1) - 8 * fun(x - 2);
    }

}