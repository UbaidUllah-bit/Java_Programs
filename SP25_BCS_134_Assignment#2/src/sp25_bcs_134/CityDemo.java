package sp25_bcs_134;

public class CityDemo{

    public static void main(String[] args){

        System.out.println("--- LAHORE HOUSING SOCIETY MANAGEMENT SYSTEM ---\n");
        
        CityHousing lahore = new CityHousing();
        HousingSociety[] preloadedSocieties = lahore.getSocieties();

        System.out.println("--- 1. INITIAL SYSTEM STATE ---");
        System.out.println("City-wide Available Plots: " + lahore.computeCityWideAvailablePlots());
        
        for (HousingSociety society : preloadedSocieties){

            System.out.println("\n" + society.toString());

            for (Block block : society.getBlocks()){

                System.out.println(block.getCompactStreetLayout());
                System.out.println(block.getAmenitiesReport());

            }
        }
        
        System.out.println("\n--- 2. WORKFLOW SIMULATION ---");
        String plotToBook = "LDA Avenue 1 > Block A-3-007";
        String shopToBook = "Block C-S01";
        
        // a. Booking plot 3-007 in LDA Avenue 1, Block A
        System.out.println("\nAttempting to book: " + plotToBook); 
        System.out.println("  Booking result (3-007): " + (lahore.relayBooking(plotToBook, true) ? "SUCCESS" : "FAILED (Already Booked)"));

        // b. Attempting to book the same plot again to show proper rejection
        System.out.println("Attempting to book: " + plotToBook + " (AGAIN)!");
        System.out.println("  Booking result (3-007): " + (lahore.relayBooking(plotToBook, true) ? "ERROR - SHOULD BE FAILED" : "FAILED (Already Booked)"));
        
        // c. Booking a shop in Block C Market of LDA Avenue 1
        HousingSociety lda1 = lahore.findSociety("LDA Avenue 1");
        Block blockC = lda1.findBlock("Block C");

        if (blockC != null){

            System.out.println("Attempting to book shop: " + shopToBook);
            System.out.println("  Shop Booking result: " + (blockC.getMarket().bookShop(shopToBook) ? "SUCCESS" : "FAILED"));

        }
        
        System.out.println("\nAttempting to cancel booking: " + plotToBook);
        System.out.println("  Cancellation result: " + (lahore.relayBooking(plotToBook, false) ? "SUCCESS" : "FAILED (Was not booked)"));

        // e. Printing the affected street layout to confirm the state change (Street 3 in Block A)
        Block blockA = lda1.findBlock("Block A");

        if (blockA != null){

            System.out.println("\n-- State Check: Block A, Street 3 (RES_1_KANAL) --");
            System.out.println(blockA.getCompactStreetLayout()); 

        }

	// a. Finding the first available Residential 1 Kanal cornerPlot

        System.out.println("\n First available RES_1_KANAL CornerPlot:"); 
        System.out.println("  -> " + lahore.findFirstAvailableRes1KanalCornerPlot());

        // b. List the first three vacant shops in the Block C market of LDA Avenue 1

        System.out.println("\n First three vacant shops in LDA Avenue 1, Block C:");

        if (blockC != null){

            Shop[] vacantShops = blockC.getMarket().getVacantShops();
            System.out.print("  -> ");
            int limit = 0;

            if (vacantShops.length > 0){
                 // Manual min function implementation
                 limit = vacantShops.length < 3 ? vacantShops.length : 3;
            }

            if (limit == 0){
                System.out.println("No vacant shops available.");
            } 

	    else{

                for (int i = 0; i < limit; i++){

                    System.out.print(vacantShops[i].getId() + (i < limit - 1 ? ", " : ""));
                }

                System.out.println();
            }

        }

        System.out.println("\n Largest available plot by area in LDA Avenue 2, Block B:");
        HousingSociety lda2 = lahore.findSociety("LDA Avenue 2");
        Block blockB = lda2.findBlock("Block B");

        if (blockB != null){

            Plot largestPlot = blockB.findLargestAvailablePlot();
            System.out.println("  -> " + (largestPlot != null ? largestPlot.toString() : "None found."));

        }

    }

}
