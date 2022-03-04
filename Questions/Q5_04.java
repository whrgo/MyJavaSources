package Questions;

public class Q5_04 {
    public static void main(String[] args) {
        int num = 1;
        int result = 0;

        while(num < 100) {
            result += num;
            num++;    
        }

        System.out.println(result);
    }
}
