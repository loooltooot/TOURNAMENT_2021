package deposit;
/*
Author: Zakrewski
Date: 29.10.2021
*/

public class OrdinaryDeposit extends Deposit {
    private boolean isRetirement;
    private boolean isByCard;

    public OrdinaryDeposit(String clientSurname, int balance, boolean isRetirement, boolean isByCard) {
        super(clientSurname, balance);
        this.isRetirement = isRetirement;
        this.isByCard = isByCard;
    }

    public boolean isRetirement() {
        return isRetirement;
    }

    public void setRetirement(boolean retirement) {
        isRetirement = retirement;
    }

    public boolean isByCard() {
        return isByCard;
    }

    public void setByCard(boolean byCard) {
        isByCard = byCard;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.printf("Retirement: %s\n", isRetirement());
        System.out.printf("By card: %s\n", isByCard());
    }
}
