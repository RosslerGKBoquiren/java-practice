package chapter5;
import java.util.Scanner;

public class CellPhoneBill {

    /* Calculate the final cell phone bill total
    - allow the operator to input the plan fee and the number of average minutes
    - charge the user 0.25 for every minute they were over their plan,
    - 15% tax on subtotal
    - create separate methods to calculate the tax, overage fees, and final total.
    - print the itemized bill
    */

    static Scanner scanner = new Scanner(System.in);


    public static void main (String[] args){

        // enter the plan fee
        System.out.println("Enter plan fee: ");
        double planFee = scanner.nextDouble();

        // enter overage minutes
        System.out.println("Enter overage minutes: ");
        double overageMinutes = scanner.nextDouble();

        double overageCharge = chargePerMinute(overageMinutes);
        double tax = chargeTax(planFee, overageCharge);
        double total = finalTotal(planFee, overageCharge, tax);

        itemizedBill(planFee, overageCharge, tax, total);

    }

    public static double chargePerMinute(double overageMinutes){

        // calculate charge per overage minutes
        return 0.25 * overageMinutes;
    }

    public static double chargeTax(double planFee, double overageCharge){
        return (planFee + overageCharge) * 0.15;
    }

    public static double finalTotal(double planFee, double overageCharge, double tax){
        return planFee + overageCharge + tax;
    }

    public static void itemizedBill(double planFee, double overageCharge, double tax, double total){

        System.out.println("Plan fee: $" + planFee + "\n" +
                "Overage Charge: $" + overageCharge + "\n" + "Tax: $" + tax + "\n" + "Total: $" + total);
    }


}
