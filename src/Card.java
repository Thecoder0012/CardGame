public class Card {

    private final int suits;
    private final int value;

    public Card(String suits, int value) {
        this.value = value;

        if (suits.equals("hearts")) {
            this.suits = 4;
        } else if (suits.equals("diamonds")) {
            this.suits = 3;
        } else if (suits.equals("spades")) {
            this.suits = 2;
        } else {
            this.suits = 1;
        }
    }

    public boolean beats(Card card) {
        boolean win = false;
        if (this.getSuits() > card.getSuits()) {
            System.out.println("You won!");
            win = true;
        } else if (this.getSuits() == card.getSuits()) {
            if (this.getValue() > card.getValue()) {
                win = true;
            }

        }
        return win;
    }

    public int getSuits() {
        return suits;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " suits = " + suits +
                " value = " + value;
    }
}
