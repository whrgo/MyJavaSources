public class BankAccountPO {
    static int balance = 0;

    public static void main(String[] args) {
        deposit(10000); // 입금
        checkMyBalance();
        withdraw(3000); // 출금
        checkMyBalance();
    }

    public static int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public static int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public static int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}
