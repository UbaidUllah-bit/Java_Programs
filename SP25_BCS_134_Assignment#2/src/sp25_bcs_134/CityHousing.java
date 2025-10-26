package sp25_bcs_134;

public class CityHousing{

    private HousingSociety[] societies;
    private int logicalSize;

    private static final int INITIAL_CAPACITY = 2; 

    CityHousing(){

        this.societies = new HousingSociety[INITIAL_CAPACITY];
        this.logicalSize = 0;
        
        addSociety(new HousingSociety("LDA Avenue 1"));
        addSociety(new HousingSociety("LDA Avenue 2"));
    }

    private void resizeArray(){

        int newCapacity = societies.length * 2;
        HousingSociety[] newSocieties = new HousingSociety[newCapacity];

        for (int i = 0; i < logicalSize; i++){

            newSocieties[i] = societies[i];

        }

        this.societies = newSocieties;
        System.out.println(" CityHousing array resized to " + newCapacity);

    }

    public void addSociety(HousingSociety society){

        if (logicalSize == societies.length){

            resizeArray();

        }

        societies[logicalSize++] = society;
    }

    public HousingSociety findSociety(String societyName) {

        for (int i = 0; i < logicalSize; i++) {

            if (societies[i].getName().equals(societyName)) {

                return societies[i];

            }

        }

        return null;

    }
    
    public boolean relayBooking(String fullPlotPath, boolean isBooking) {
        String societyName;
        String compoundId;
        
        int arrowIndex = fullPlotPath.indexOf(" > ");
        if (arrowIndex == -1) return false;

        societyName = fullPlotPath.substring(0, arrowIndex);
        compoundId = fullPlotPath.substring(arrowIndex + 3);
        
        HousingSociety hs = findSociety(societyName);
        if (hs != null){

            return hs.relayBooking(compoundId, isBooking);

        }

        return false;
    }

    public int computeCityWideAvailablePlots(){

        int total = 0;

        for(int i = 0; i < logicalSize; i++){

            total += societies[i].getAvailablePlots();
        }

        return total;
    }

    public String findFirstAvailableRes1KanalCornerPlot(){

        for (int i = 0; i < logicalSize; i++){

            HousingSociety society = societies[i];

            for (Block block : society.getBlocks()){
                for (Plot[] street : block.getPlots()) {

                    for (Plot plot : street) {

                        if (plot.isAvailable() && plot.isCornerPlot() && plot.getType() == PlotType.RES_1_KANAL) {
                            
                            double priceValue = plot.getListPrice();
                            
                            return String.format("%s > %s > Plot %s (RES_1_KANAL CORNER, area %.1f su, %.0f PKR).",

                                society.getName(), block.getName(), plot.getId(), 
                                plot.getArea(), 
                                priceValue);
                        }
                    }
                }
            }
        }

        return "No available RES_1_KANAL CornerPlot found city-wide.";
    }

    public HousingSociety[] getSocieties(){ 

        HousingSociety[] activeSocieties = new HousingSociety[logicalSize];
        for (int i = 0; i < logicalSize; i++) {
            activeSocieties[i] = societies[i];

        }

        return activeSocieties; 
    }
}
