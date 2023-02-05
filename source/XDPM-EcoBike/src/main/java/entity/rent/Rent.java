package entity.rent;

import entity.bike.Bike;
import entity.payment.CreditCard;
import entity.user.User;

import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Rent {
    private static Timestamp endTime;
    private static Timestamp startTime;
    private static Bike bike;
    private static int depositFee;
    private static CreditCard card;
    private static int station_id;
    private static List<Timestamp> timestampList = new ArrayList<>();

    public static int getStation_id() {
        return station_id;
    }

    public static void setStation_id(int station_id) {
        Rent.station_id = station_id;
    }

    public static CreditCard getCard() {
        return card;
    }

    public static void setCard(CreditCard card) {
        Rent.card = card;
    }

    //    private static User user;
    public static Timestamp getEndTime() {
        return endTime;
    }

    public static void setEndTime() {
        Rent.endTime = new Timestamp(System.currentTimeMillis());
    }

    public static Timestamp getStartTime() {
        return startTime;
    }

    public static void addToTimeList(Timestamp timestamp) {
        timestampList.add(timestamp);
    }

    public static void setStartTime() {
        if (!timestampList.isEmpty()) {
            timestampList.clear();
        }
        timestampList.add(new Timestamp(System.currentTimeMillis()));
        Rent.startTime = new Timestamp(System.currentTimeMillis());
    }

    public static List<Timestamp> getTimestampList() {
        return timestampList;
    }

    public static Bike getBike() {
        return bike;
    }

    public static void setBike(Bike bike) {
        Rent.bike = bike;
    }

    public static int getDepositFee() {
        return depositFee;
    }

    public static void setDepositFee(int depositFee) {
        Rent.depositFee = depositFee;
    }

    public Rent() {
    }

    public static int thoigiandathue() throws SQLException {
        System.out.println("Vao thoi gian da thue");
        int sumTime = 0;
//        timestampList.add(new Timestamp(System.currentTimeMillis()));
        for (int i = 0; i < timestampList.size()-1; ++i) {
            if (timestampList.get(i) != null && timestampList.get(i+1) != null) {
                sumTime += between_time(timestampList.get(i), timestampList.get(i + 1));
            } else {
                ++i;
            }
        }
        System.out.println(timestampList);
        return sumTime;
    }

    public static void reset() {
        endTime = null;
        startTime = null;
        bike = null;
        depositFee = 0;
        card = null;
        timestampList.clear();
    }
    public static int between_time(Timestamp t1, Timestamp t2) {
        return (t2.getDay() - t1.getDay())*24*60 + (t2.getHours() - t1.getHours())*60 + (t2.getMinutes() - t1.getMinutes());
    }
}