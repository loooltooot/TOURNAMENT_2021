package deposit;
/*
Author: Zakrewski
Date: 29.10.2021
*/

public class TermDeposit extends Deposit {
    private int percent;
    private int accruedPercents = 0;

    public TermDeposit(String clientSurname, int balance, int percent) {
        super(clientSurname, balance);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getAccruedPercents() {
        return accruedPercents;
    }

    public void setAccruedPercents(int accruedPercents) {
        this.accruedPercents = accruedPercents;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.printf("Percents: %d\n", getPercent());
        System.out.printf("Accrued percents: %d\n", getAccruedPercents());
    }
}
