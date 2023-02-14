public class Main {

    public static void main(String[] args) {
        int test = 5;
        recursion(test);
        System.out.println();
        iteration(test);

    }

    static void recursion(int test) {

        if (test < 1)
            return;
        else {
            System.out.printf("%d", test);
            recursion(test - 1);
            System.out.printf("%d", test);
            return;
        }
    }

    static void iteration(int test) {

        for(int i = 0; i < test; i++){
            System.out.print(test - i);
        }
        for(int k = 0; k < test; k++){
            System.out.print(k + 1);
        }
    }
}
