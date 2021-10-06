public class Card {
    String suit;
    int number;

    String face(){
        return (this.suit + "/" + this.number);
    }

    public Card(){
        this.suit = "";
        this.number = 0;
    }
}
