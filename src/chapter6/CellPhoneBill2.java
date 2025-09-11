//package chapter6;
//import java.util.Scanner;
//
//public class CellPhoneBill2 {
//
//    /*
//    Enhance Phone Bill exercise by redoing it in an object-oriented style
//    Phone bill needs:
//        ID
//        base cost
//        number of allotted minutes
//        number of minutes used
//        overage
//        tax
//        total
//        print
//     */
//
//    private int id;
//    private double baseCost;
//    private int allottedMinutes;
//    private int minutesUsed;
//
//    Scanner scanner = new Scanner(System.in);
//
//
//    public CellPhoneBill2(){
//        id = 0;
//        baseCost = 79.99;
//        allottedMinutes = 800;
//        minutesUsed = 800;
//    }
//
//    public CellPhoneBill2(int id){
//        this.id = id;
//        baseCost = 79.99;
//        allottedMinutes = 800;
//        minutesUsed = 800;
//    }
//
//    public CellPhoneBill2(int id, double baseCost, int allottedMinutes, int minutesUsed){
//        this.id = id;
//        this.baseCost = baseCost;
//        this.allottedMinutes = allottedMinutes;
//        this.minutesUsed = minutesUsed;
//    }
//
//
//    public int getId(){
//        return id;
//    }
//
//    public void setId(int id){
//        this.id = id;
//    }
//
//    public double getBaseCost(){
//        return baseCost;
//    }
//
//    public void setBaseCost(double baseCost){
//        this.baseCost = baseCost;
//    }
//
//    public double getAllottedMinutes(){
//        return allottedMinutes;
//    }
//
//    public void setAllottedMinutes(int minutes){
//        allottedMinutes = minutes;
//    }
//
//    public int getMinutesUsed(){
//        return minutesUsed;
//    }
//
//    public void setMinutesUsed(int minutes){
//        minutesUsed = minutes;
//    }
//
//    public double getOverage(){
//        double overage = minutesUsed - allottedMinutes;
//
//        if(minutesUsed >= allottedMinutes){
//            return 0;
//        }
//
//        double overageRate = 0.25;
//        double overageMinutes = minutesUsed - allottedMinutes;
//        return overageMinutes * overageRate;
//    }
//
//    public double getTax(){
//        double taxRate = 0.15;
//        return taxRate * (baseCost + getOverage());
//    }
//
//    public double getTotal(){
//        return baseCost + getOverage + getTax;
//    }
//
//    public void printItemizedBill(){
//        System.out.println("ID: " + id);
//        System.out.println("Base Rate: $" + baseCost);
//        System.out.println("Overage Fee: $"
//                + String.format("%.2f", calculateOverage()));
//        System.out.println("Tax: $"
//                + String.format("%.2f", calculateTax()));
//        System.out.println("Total: $"
//                + String.format("%.2f", calculateTotal()));
//    }
//
//}
