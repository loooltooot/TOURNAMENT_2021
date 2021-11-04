/*
Author: Zakrewski
Date: 29.10.2021
*/

import deposit.Deposit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// макет "базы данных" для наглядности

public class BankDB {
    private static BankDB db;
    private List<Deposit> listOfDeposits = new ArrayList<>();

    private BankDB() {}

    public static BankDB getDb() {
        if(db == null) {
            db = new BankDB();
            return db;
        }
        return db;
    }

    public void addDeposit(Deposit deposit) {
        listOfDeposits.add(deposit);
    }

    public void removeDeposit(Deposit deposit) {
        listOfDeposits.remove(deposit);
    }

    public Deposit getDeposit(UUID id) {
        for(Deposit deposit : listOfDeposits) {
            if(deposit.getID().equals(id)) return deposit;
        }
        return null;
    }

    public void getDepositInfo(UUID id) {
        for(Deposit deposit : listOfDeposits) {
            if(deposit.getID().equals(id)) {
                deposit.getInfo();
                System.out.println();
            }
        }
    }

    public List<Deposit> getListOfDeposits() {
        return listOfDeposits;
    }
}
