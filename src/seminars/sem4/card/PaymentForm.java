package seminars.sem4.card;

public class PaymentForm {
    private CreditCard creditCard;

    public PaymentForm(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void pay(double amount) {
//        amount += 100;
        creditCard.charge(amount);
    }
}
