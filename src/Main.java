public class Main {

    public static void main(String[] args) {

        Card card = new Card("hearts", 5);
        Card card1 = new Card("diamonds", 7);

        System.out.println(card.beats(card1));

    }

}
