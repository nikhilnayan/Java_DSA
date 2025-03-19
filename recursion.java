public class recursion {
    public static void show(int times){
        if(times == 0) return;

        System.out.println("Show - " + times);
        show(times-1);
        System.out.println("--" + times+ "--");
    }

    public static int fib(int term){
        if(term ==0) return 0;
        if(term ==1) return 1;

        return fib(term-1) + fib(term-2);
    }

    public static void main(String[] args) {
        show(10);

        fib(9);
    }
}
