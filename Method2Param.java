public class Method2Param {
    public static void main(String[] args) {
        double myHeight = 175.9;
        hiEveryone(12, 12.5);
        hiEveryone(13, myHeight);
        byEveryone();
    }

    public static void hiEveryone(int age, double height) {
        System.out.println("My age is " + age);
        System.out.println("My height is " + height + "cm :)");
    }

    public static void byEveryone() {
        System.out.println("See you at Next Time :D");
    }
}
