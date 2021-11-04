/*
Author: Zakrewski
Date: 29.10.21
*/

import deposit.Deposit;
import deposit.OrdinaryDeposit;
import deposit.TermDeposit;

public class Main {

    public static void main(String[] args) {
	    BankDB db = BankDB.getDb();
        Deposit deposit = new Deposit("Zakrewski", 100);
        OrdinaryDeposit ordinaryDeposit = new OrdinaryDeposit(
                "Petrov", 50, false, true);
        TermDeposit termDeposit = new TermDeposit("Ivanov", 80, 3);

        db.addDeposit(deposit);
        db.addDeposit(ordinaryDeposit);
        db.addDeposit(termDeposit);

        for(Deposit d : db.getListOfDeposits()) {
            d.getInfo();
            System.out.println();
        }

        ordinaryDeposit.increaseBalance(200);
        termDeposit.decreaseBalance(30);
        termDeposit.setPercent(5);

        db.getDepositInfo(ordinaryDeposit.getID());
        db.getDepositInfo(termDeposit.getID());
    }
}
