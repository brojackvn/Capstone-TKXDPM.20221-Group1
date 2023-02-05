package utils.calculatefee;

import entity.category.Category;
import entity.rent.Rent;

import java.sql.Timestamp;

public class  CalFee1 extends BaseCalculateFee {
    public int calculate(int id) {
        int return_cost = 0;
        try {
            int timeMinute = Rent.thoigiandathue();
            int cost_category = (int) category.getCategoryById(id).getCostPerHour();
            
            System.out.println("Category Id" + id);
            if (timeMinute < 10) {
                return_cost = 0;
            }
            else if (timeMinute < 30) {
                return_cost = cost_category;
            }
            else {
                return_cost = (int) (cost_category + (Math.floor((timeMinute-30)/15) + 1) * 3000);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return return_cost;
    }
}
