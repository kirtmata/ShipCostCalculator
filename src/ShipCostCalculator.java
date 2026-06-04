void main() {
        double itemPrice = 0.0;
        double shippingRate = 0.02;
        double shippingCost = 0.0;
        double totalCost;
        String badInput = "";

    System.out.println("Enter the cost of your item: ");
    Scanner in = new Scanner(System.in);
    if (in.hasNextDouble()){
        itemPrice = in.nextDouble();

        in.close();

        if (itemPrice >= 100.00){
            totalCost = itemPrice;
        } else {
            shippingCost = shippingRate * itemPrice;
            totalCost = shippingCost + itemPrice;
        }
        System.out.println("The shipping cost is: $" + shippingCost);
        System.out.println("The total price is: $" + totalCost);
        //scanner.nextLine();
    } else {
        System.out.println("Please enter a valid number.");
        badInput = in.nextLine();
    }


}
