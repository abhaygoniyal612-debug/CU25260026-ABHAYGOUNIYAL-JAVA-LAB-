public class QUES4 {
    public static void main(String[] args) {

        int visitors = 0;
        System.out.println("Visitor enters: " + (++visitors));
        System.out.println("Visitor enters: " + (visitors++));
        System.out.println("Current visitors: " + visitors);
        System.out.println("Visitor leaves: " + (--visitors));
        System.out.println("Visitor leaves: " + (visitors--));
        System.out.println("Final visitors in store: " + visitors);
    }
}