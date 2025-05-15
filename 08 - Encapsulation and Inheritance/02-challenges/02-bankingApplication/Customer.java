public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("MJ2025", "Mukul Joshi");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(-40);
    }
}
