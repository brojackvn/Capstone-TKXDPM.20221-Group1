package entity.payment;

public class CreditCard {
    private String cardCode = "tkxdpm-kstn";
    private String owner = "Nhom1";
    private String cvvCode = "123";
    private String dateExpired = "0123";
    public CreditCard() {}
    public CreditCard(String cardCode, String owner, String cvvCode, String dateExpired) {
        this.cardCode = cardCode;
        this.owner = owner;
        this.cvvCode = cvvCode;
        this.dateExpired = dateExpired;
    }

    public String getCardCode() {
        return cardCode;
    }

    public String getOwner() {
        return owner;
    }

    public String getCvvCode() {
        return cvvCode;
    }

    public String getDateExpired() {
        return dateExpired;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
    }

    public void setDateExpired(String dateExpired) {
        this.dateExpired = dateExpired;
    }
}
