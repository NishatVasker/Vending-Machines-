public class VendingWorld {
    public static void main(String[] args) {
        VendingMachine cseVendingMachine = new VendingMachine();
        VendingMachine eeeVendingMachine = new VendingMachine();
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        VendingItem boughtItem = cseVendingMachine.vend(0);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        boughtItem = cseVendingMachine.vend(3);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        boughtItem = cseVendingMachine.vend(6);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        //case for vend method when code position does not contain any item
        boughtItem = cseVendingMachine.vend(9);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        //case for vend method when code position is invalid >=10
        boughtItem = cseVendingMachine.vend(20);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        //check if getTotalSales() works correctly
        boughtItem = eeeVendingMachine.vend(0);
        System.out.println(boughtItem);
        System.out.println(eeeVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(eeeVendingMachine.getTotalItems());
        System.out.println(eeeVendingMachine.getTotalValue());
        System.out.println();

        //check if Stock(VendingItem item) works correctly
        VendingItem item1 = new VendingItem("Pepsi", "d", 1.5);
        cseVendingMachine.stock(item1);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        //check if Stock(VendingItem[] item) works correctly
        VendingItem item2 = new VendingItem("Fanta", "d", 1.15);
        VendingItem item3 = new VendingItem("Cadbery", "p", 0.46);
        VendingItem item4 = new VendingItem("Bournville", "p", 0.65);
        VendingItem[] items = {item2, item3, item4};
        cseVendingMachine.stock(items);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        //check if getItems(int val) works correctly
        cseVendingMachine.getItems(1);
        System.out.println();

        //check if getItems(String t) works correctly
        cseVendingMachine.getItems("d");
        System.out.println();

        //check if getItems(String t) works correctly
        VendingItem cheapestItem = cseVendingMachine.getCheapestItems("d");
        System.out.println(cheapestItem);

    }
}
