package deposit;
/*
Author: Zakrewski
Date: 29.10.2021
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Deposit {
    private final UUID ID = UUID.randomUUID();
    private String clientSurname;
    private String date = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss z").format(new Date());
    private int balance;

    public Deposit(String clientSurname, int balance) {
        this.clientSurname = clientSurname;
        this.balance = balance;
    }

    public void increaseBalance(int amount) {
        this.balance += amount;
    }

    public void decreaseBalance(int amount) {
        if(amount > this.balance) {
            System.out.println("You can't afford it.");
        } else this.balance -= amount;;
    }

    public UUID getID() {
        return ID;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void getInfo() {
        System.out.printf("ID: %s\n", getID().toString());
        System.out.printf("Client surname: %s\n", getClientSurname());
        System.out.printf("Date: %s\n", getDate());
        System.out.printf("Balance: %d\n", getBalance());
    }
}
