package Questions;

public class Q5_02 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        int big;
        int diff;
    
        if(num1 > num2)
            big = num1;
        else
            big = num2;
        System.out.println("큰수: " + big);
    
        if(num1 > num2)
            diff = num1 - num2;
        else
            diff = num2 - num1;
        System.out.println("절댓값: " + diff);
    }
}
