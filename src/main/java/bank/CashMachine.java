package bank;

public class CashMachine {
    int nominalTwenty;
    int nominalFifty;
    int nominalHundred;

    public CashMachine(int nominalTwenty, int nominalFifty, int nominalHundred) {
        this.nominalTwenty = nominalTwenty;
        this.nominalFifty = nominalFifty;
        this.nominalHundred = nominalHundred;
    }


    public void addMoney(int nominalTwenty, int nominalFifty, int nominalHundred) {
        this.nominalTwenty += nominalTwenty;
        this.nominalFifty += nominalFifty;
        this.nominalHundred += nominalHundred;
    }

    public boolean withdrawMoney(int money) {
        if (money > 0) {
            int nominalTwenty = 0, nominalFifty = 0, nominalHundred = 0;
            while (money >= 100 && this.nominalHundred > 0) {
                money -= 100;
                this.nominalHundred --;
                nominalHundred++;
            }
            while (money >= 50 && this.nominalFifty > 0) {
                money -= 50;
                this.nominalFifty --;
                nominalFifty++;
            }
            while (money >= 20 && this.nominalTwenty > 0) {
                money -= 20;
                this.nominalTwenty --;
                nominalTwenty++;
            }

            if (money == 0) {
                System.out.println("Выдано -" +
                        "\n20 - "+ nominalTwenty + "штук" +
                        "\n50 - "+ nominalFifty + "штук" +
                        "\n100 - "+ nominalHundred + "штук");
                return true;
            } else {
                System.out.println("Произошла ошибка!");
                this.nominalHundred += nominalHundred;
                this.nominalFifty += nominalFifty;
                this.nominalTwenty += nominalTwenty;
                return false;
            }
        } else {
            return false;
        }
    }
}
