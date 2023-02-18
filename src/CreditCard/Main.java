package CreditCard;
public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1, 1500);
        CreditCard card2 = new CreditCard(2, 1000);
        CreditCard card3 = new CreditCard(3, 700);
        card1.getInfoCard();
        card2.getInfoCard();
        card3.getInfoCard();
        card1.addSum();
        card2.addSum();
        card3.takeOff();
        card1.getInfoCard();
        card2.getInfoCard();
        card3.getInfoCard();
    }

}
