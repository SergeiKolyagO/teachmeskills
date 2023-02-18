package CreditCard;

class CreditCard {
    int accountNumber;
    int currentSum;
    public CreditCard (int cardAccountNumber, int cardCurrentSum){
        accountNumber = cardAccountNumber;
        currentSum = cardCurrentSum;
    }
    public void addSum (){
        currentSum += 100;
    }
    public void getInfoCard(){
        System.out.println("Карта №: " + accountNumber);
        System.out.println("текущий счет: "+ currentSum);
    }
    public void takeOff() {
        currentSum -= 100;
    }


}
