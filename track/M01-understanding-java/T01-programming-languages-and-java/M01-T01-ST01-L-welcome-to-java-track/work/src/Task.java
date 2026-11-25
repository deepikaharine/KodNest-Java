public class Task {
    public static void main(String[] args) {
        String customerName = "Rahul";
        int unitsConsumed = 350;
        int bill;
        int surcharge = 0;
        int total;

        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 2;
        } else if (unitsConsumed <= 200) {
            bill = unitsConsumed * 3;
        } else if (unitsConsumed <= 300) {
            bill = unitsConsumed * 5;
        } else {
            bill = unitsConsumed * 7;
        }

        if (bill > 1000) {
            surcharge = bill * 5 / 100;
        }

        if (unitsConsumed <= 0) {
            System.out.println("Invalid Units");
        }

        total = bill + surcharge;

        System.out.println("Customer name: " + customerName);
        System.out.println("Units consumed: " + unitsConsumed);
        System.out.println("Electricity bill: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total bill: " + total);
    }
}
