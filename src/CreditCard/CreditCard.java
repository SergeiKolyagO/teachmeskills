package CreditCard;

public class CreditCard {
    int accountNumber;
    int currentSum;
    public  CreditCard (int cardAccountNumber, int cardCurrentSum){
        accountNumber = cardAccountNumber;
        currentSum = cardCurrentSum;
    }
    public void addSum (){
        currentSum += 200;

    }
    public void getInfoCard(){
        System.out.println("Карта №: " + accountNumber);
        System.out.println("текущий счет: "+ currentSum);
    }
    public void takeOff(){
        currentSum -=100;

    }
}
