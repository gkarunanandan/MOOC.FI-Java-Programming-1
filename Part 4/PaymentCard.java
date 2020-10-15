/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gopi
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        if (this.balance - 2.60 >= 0) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        // write code here
        if (this.balance - 4.60 >= 0) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        // write code here
        if (amount < 0) {
            this.balance += 0;
        }

        else if(this.balance + amount <= 150)
        {
            this.balance += amount;
        }
        else {
            this.balance = 150.0;
        }
    }
}
