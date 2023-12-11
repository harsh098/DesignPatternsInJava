public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(100);
        account.deposit(20);
        account.withdraw(80);
        float balance = account.getBalance();
        System.out.println(balance);
    }
}