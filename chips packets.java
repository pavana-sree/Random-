import java.io.*;

class ChipsPackets {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("How many chips packets do you want?");
        int numberOfChipsPackets = Integer.parseInt(br.readLine());

        System.out.println("Please enter the cash in rupees");
        int cash = Integer.parseInt(br.readLine());

        if (cash < 10) {
            System.out.println("Sorry, the minimum amount is 10 rupees.");
        } else {
            // Calculate the maximum number of packets that can be bought
            int maxAffordablePackets = cash / 10;

            if (numberOfChipsPackets > maxAffordablePackets) {
                System.out.println("You can only buy up to " + maxAffordablePackets + " chips packets with " + cash + " rupees.");
            } else {
                int totalCost = numberOfChipsPackets * 10;
                int remainingAmount = cash - totalCost;

                System.out.println("You get " + numberOfChipsPackets + " chips packets.");

                if (remainingAmount > 0) {
                    System.out.println("Take the remaining amount: " + remainingAmount + " rupees.");
                } else {
                    System.out.println("Thank you! You have received all the chips packets.");
                }
            }
        }
    }
}