public class recursion {
    public static void show(int times){
        if(times == 0) return;

        System.out.println("Show - " + times);
        show(times-1);
        System.out.println("--" + times+ "--");
    }

    public static void main(String[] args) {
        show(10);
    }
}
