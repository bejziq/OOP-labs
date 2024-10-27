package org.example.week4.Encapsulation;

import java.security.InvalidParameterException;
import java.util.Date;

public class AccountBallance {
    private int customerId;
    private int ballance;
    private Date date;
    private boolean isActive;
    private CardType cardType;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        if (ballance < 0) {
            throw new InvalidParameterException("Balance cannot be negative");
        }
        this.ballance = ballance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

}

