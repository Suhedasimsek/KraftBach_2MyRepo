package day_35_─░nheritance;

public class Vehicle {
    String type;
    double price;
    String color;

    public void SellPricewithTax (double price){
        price+=price*0.10;
        System.out.println(price);
    }
}
