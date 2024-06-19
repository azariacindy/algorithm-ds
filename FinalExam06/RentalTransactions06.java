package FinalExam06;

public class RentalTransactions06 {
   private static int transactionCounter = 1;

    int transactionCode;
    String borrowerName;
    int lengthOfLoan;
    double totalCost;
    RentalItems06 rentalItem;

    public RentalTransactions06(String borrowerName, int lengthOfLoan, RentalItems06 rentalItem) {
        this.transactionCode = transactionCounter++;
        this.borrowerName = borrowerName;
        this.lengthOfLoan = lengthOfLoan;
        this.totalCost = lengthOfLoan * rentalItem.rentalFee;
        this.rentalItem = rentalItem;
    }

    public String display() {
        return "Transaction Code: " + transactionCode + ", Borrower Name: " + borrowerName + 
            ", Length of Loan: " + lengthOfLoan + ", Total Cost: " + totalCost + 
            ", Rental Item: [" + rentalItem.display() + "]";
    }
}
