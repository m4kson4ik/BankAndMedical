package bank;

public class Main {
    public static void main(String[] args) {
        CashMachine bank = new CashMachine(3, 4, 1);
        bank.withdrawMoney(340);
        bank.addMoney(22, 22, 22);
        bank.withdrawMoney(2020);
    }
}
