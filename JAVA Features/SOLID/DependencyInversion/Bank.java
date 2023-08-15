package SOLID.DependencyInversion;

public class Bank
{
    Card card;

    Bank (Card card) {
        this.card = card;
    }

    public void applyCard () {
        card.apply();
    }
}
