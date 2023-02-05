package controller;

import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;
import screen.notification.SuccessNotificationHandler;
import subsystem.interbanksystem.InterbankSubsystem;
import subsystem.interbanksystem.InterbankSubsystemController;
import screen.popup.PopupScreen;
import utils.Configs;

import java.io.IOException;
import java.text.ParseException;

/**
 * Quan ly thanh toan
 */
public class PaymentController extends BaseController{
    InterbankSubsystem interbankSubsystem =  new InterbankSubsystem();

    public boolean payRental(int amount, String content, String cardCode, String owner,String cvvCode, String dateExpired) throws IOException {
        CreditCard card = new CreditCard(cardCode,owner,cvvCode,dateExpired);
//        CreditCard card = new CreditCard();
        try {
            PaymentTransaction paymentTransaction = interbankSubsystem.payRental(card,amount,content);
            return true;
        }
        catch (Exception ex) {
//            PopupScreen.error(ex.getMessage());
        }
        return false;
    }

    public boolean refund(int amount,String content ,CreditCard card) {
        try {
            interbankSubsystem.refund(card, amount, content);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
}
