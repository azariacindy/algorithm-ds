public class function06 {

    private static int[][] flowerStock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };

    private static int[] flowerPrices = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        displayIncomeAndStockForEachBranch();
    }

    private static void displayIncomeAndStockForEachBranch() {
        System.out.println("Income and stock for each branch after the reduction:");

        // Reduction details due to flower death
        int[] deathReduction = {-1, -2, 0, -5};

        for (int i = 0; i < flowerStock.length; i++) {
            int branchIncome = calculateBranchIncome(i);
            System.out.println("Branch RoyalGarden " + (i + 1) + " - Income: " + branchIncome);

            // Reduce stock based on death information
            for (int j = 0; j < flowerStock[i].length; j++) {
                flowerStock[i][j] += deathReduction[j];
            }

            displayFlowerStock(i);
        }
    }

    private static int calculateBranchIncome(int branchIndex) {
        int branchIncome = 0;
        for (int j = 0; j < flowerStock[branchIndex].length; j++) {
            branchIncome += flowerStock[branchIndex][j] * flowerPrices[j];
        }
        return branchIncome;
    }

    private static void displayFlowerStock(int branchIndex) {
        System.out.println("Flower stock at Branch RoyalGarden " + (branchIndex + 1) + ":");

        for (int j = 0; j < flowerStock[branchIndex].length; j++) {
            String flowerType = getFlowerType(j);
            System.out.println(flowerType + ": " + flowerStock[branchIndex][j]);
        }

        System.out.println(); // Blank line as a separator
    }

    private static String getFlowerType(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
}
