//// id: 2020-2-60-209
//// Nishat Vasker
/// Assaignment 01



public class VendingMachine {

    private static double totalSales;
    private int totalItems;
    private VendingItem[] shelf;


    public VendingMachine() {

        shelf = new VendingItem[10];
        totalSales = 0;
        totalItems = 10;

        restock();

    }

    public void stock(VendingItem item) {

        if(totalItems < 10) {
            shelf[totalItems] = item;
            totalItems++;
            System.out.println("Items Added: "+item);
        }

    }

    public void stock(VendingItem[] item) {

        String sem = "Items Added: ";

        if(totalItems < 10) {
            for (int i = totalItems, j = 0; i < shelf.length && j < item.length; i++, j++) {
                shelf[i] = item[j];
                totalItems++;
                sem += item[j] + ", ";
            }
            System.out.println(sem);
        }

    }


    public VendingItem vend(int code) {
        int i;
        if(code > 10) {return null;}

        else if(shelf[code] == null) {
            return null;
        }

        else {
            VendingItem temp = shelf[code];
            totalSales += shelf[code].getPrice();

            for (i = code; i < totalItems-1; i++) {
                shelf[i] = shelf[i+1];
            }

            shelf[i] = null;
            totalItems--;
            return temp;
        }
    }


    public void restock(){
        shelf[0] = new VendingItem("Lays", "c", 1.50);
        shelf[1] = new VendingItem("Doritos", "c", 1.50);
        shelf[2] = new VendingItem("Coke", "d", 2.50);
        shelf[3] = new VendingItem("Rubiks Cube", "s", 30);
        shelf[4] = new VendingItem("Pie", "p", 3.14);
        shelf[5] = new VendingItem("Clicker", "s", 55.55);
        shelf[6] = new VendingItem("Cheetos", "c", 1.25);
        shelf[7] = new VendingItem("Cold Pizza", "p", 0.99);
        shelf[8] = new VendingItem("Graphing Calculator", "s", 120);
        shelf[9] = new VendingItem("Ramen", "n", 3.15);
    }

    public static double getTotalSales() {
        return totalSales;
    }

    public int getTotalItems() {
        return totalItems;
    }


    public double getTotalValue() {

        double totalValue = 0;
        for (int i = 0; i < totalItems; i++) {
            totalValue += shelf[i].getPrice();
        }
        return totalValue;
    }


    public String cheapItems(int val) {

        String sem = "";

        for (int i = 0; i < totalItems; i++) {

            if(shelf[i].getPrice() < val) {
                sem +=  shelf[i].getName() + " ";
            }
        }

        return sem;
    }

    public String getItems(int val) {

        String sem = "";

        for (int i = 0; i < totalItems; i++) {

            if(this.shelf[i].getPrice() < val) {
                sem +=  shelf[i].getName() + ", ";
            }
        }


        System.out.println(sem);
        return sem;
    }

    public String getItems(String t) {
        StringBuilder sb = new StringBuilder();
        String delim = "";

        for (int i = 0; i < totalItems; i++) {
            if(shelf[i] != null && shelf[i].getType().equals(t)) {
                sb.append(delim);
                sb.append(shelf[i].getName());
                delim = ", ";
            }
        }

        return sb.toString();
    }


    public VendingItem getCheapestItems(String t) {
        VendingItem cheapestItem = shelf[0];

        for (int i = 0; i < totalItems; i++) {
            if(shelf[i] != null && shelf[i].getPrice() < cheapestItem.getPrice() && shelf[i].getType().equals(t)) {
                cheapestItem = shelf[i];
            }
        }
        return cheapestItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String delim = "";
        for (int i = 0; i < totalItems; i++) {
            if(shelf[i] != null) {
                sb.append(delim);
                sb.append(shelf[i].getName());
                delim = ",";
            }
        }

        return sb.toString();

    }

}



