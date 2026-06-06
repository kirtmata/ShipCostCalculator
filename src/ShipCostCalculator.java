void main() {
//initialized variables
        double itemPrice = 0.0;
        double shippingRate = 0.02;
        double shippingCost = 0.0;
        double totalCost;
        String badInput = "";
//print instructions
    System.out.println("Enter the cost of your item: ");
    //create scanner
    Scanner in = new Scanner(System.in);
    // check to see if itemPrice is double
    if (in.hasNextDouble()){
        // set itemPrice
        itemPrice = in.nextDouble();
// calculate shipping costs
        if (itemPrice >= 100.00){
            totalCost = itemPrice;
        } else {
            shippingCost = shippingRate * itemPrice;
            totalCost = shippingCost + itemPrice;
        }
        // print output
        System.out.println("The shipping cost is: $" + shippingCost);
        System.out.println("The total price is: $" + totalCost);
        //scanner.nextLine();
    } else {
        // print error message
        System.out.println("Please enter a valid number.");
        badInput = in.nextLine();
    }


}
