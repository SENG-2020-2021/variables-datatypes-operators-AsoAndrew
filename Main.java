class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
    int daysDefaulted = 100;
    int amountPerDay = 5000;
    int amountPaid = 48000;
   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
    int totalAmountToPay;
    int daysPaidFor;
    int amountLeftToPay;
    int daysNotPaidFor;

   // calculate and print total amount the debtor is to pay
    totalAmountToPay = daysDefaulted * amountPerDay;
    System.out.println("Total amount to pay: " + totalAmountToPay);

   // calculate and print the days the debtor paid for
    daysPaidFor = amountPaid / amountPerDay;
    System.out.println("Days paid for: " + daysPaidFor);
  
  // calculate and print the amount whose day was not captured because the amount was incomplete
    int amountNotCaptured = amountPaid % amountPerDay;
    System.out.println("Amount not captured: " + amountNotCaptured);

   // calculate and print amount the debtor is left to pay
    amountLeftToPay = totalAmountToPay - amountPaid;
    System.out.println("Amount left to pay: " + amountLeftToPay);

   // calculate and print days the debtor has not payed for
    daysNotPaidFor = daysDefaulted - daysPaidFor;
    System.out.println("Days not paid for: " + daysNotPaidFor);
  }
}
