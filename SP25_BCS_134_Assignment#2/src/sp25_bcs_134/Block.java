package sp25_bcs_134;

public class Block{
    private final String name;
    private final Plot[][] plots; 
    private final CommercialMarket market;
    private final Park[] parks; 
    private int parkCount = 0;
    
    Block(String name, int[] streetLengths){

        this.name = name;
        this.plots = new Plot[streetLengths.length][];
        
        this.market = new CommercialMarket(name);
        this.parks = new Park[2]; 

        for (int i = 0; i < streetLengths.length; i++) {

            plots[i] = new Plot[streetLengths[i]];

            for (int j = 0; j < streetLengths[i]; j++) {

                plots[i][j] = generatePlot(i + 1, j + 1);

            }
        }

        addPark(new Park(name + " Park 1 (Rectangular)", ShapeType.RECTANGLE, 100, 50, 0, 0, 0, 0));
        addPark(new Park(name + " Park 2 (L-Shape)", ShapeType.L_SHAPE, 40, 40, 20, 10, 0, 0));
    }

    private Plot generatePlot(int streetIndex, int plotNumber){

        int streetArrIndex = streetIndex - 1; 
        String id = streetIndex + "-" + String.format("%03d", plotNumber);

        PlotType[] allPlotTypes = PlotType.values();
        
        PlotType baseType = allPlotTypes[streetArrIndex];
        
        PlotType type = baseType;
        ShapeType shape = baseType.getDefaultShape(); // Get default shape from enum

        if (plotNumber % 5 == 0) {

            type = PlotType.PARKING;
            shape = PlotType.PARKING.getDefaultShape(); 

        }

        double w1 = 50, d1 = 40, w2 = 0, d2 = 0, front = 50, back = 50; 
        
        if (baseType == PlotType.RES_1_KANAL) {

            front = 45; back = 35; 
        }

        if (streetIndex >= 1 && streetIndex <= 3 && plotNumber % 4 == 0) {

            return new CornerPlot(id, type, shape, w1, d1, w2, d2, front, back);

        } 

	else{

            return new Plot(id, type, shape, w1, d1, w2, d2, front, back);

        }

    }
    
    public void addPark(Park park) {

        if (parkCount < parks.length) {

            parks[parkCount++] = park;

        }
    }

    public Plot findPlot(String plotId) {

        for (int i = 0; i < plots.length; i++) {
            for (int j = 0; j < plots[i].length; j++) {

                if (plots[i][j].getId().equals(plotId)) {
                    return plots[i][j];

                }

            }

        }

        return null;
    }

    public Plot findLargestAvailablePlot() {
        Plot largest = null;
        double maxArea = -1.0;

        for (Plot[] street : plots) {
            for (Plot plot : street) {
                if (plot.isAvailable() && plot.getArea() > maxArea) {
                    maxArea = plot.getArea();
                    largest = plot;
                }
            }
        }

        return largest;
    }

    public int getAvailablePlotCount() {
        int count = 0;

        for (Plot[] street : plots) {
            for (Plot plot : street) {

                if (plot.isAvailable()) {

                    count++;

                }
            }
        }

        return count;
    }
    
    public String getCompactStreetLayout(){

        StringBuilder sb = new StringBuilder();
        sb.append("Compact Layout for Block ").append(name).append(":\n");
        PlotType[] allPlotTypes = PlotType.values();
        
        for (int i = 0; i < plots.length; i++) {

            PlotType streetType = allPlotTypes[i];
            sb.append("  Street ").append(i + 1).append(" (").append(streetType.getName()).append("): [");

            for (int j = 0; j < plots[i].length; j++) {

                sb.append(plots[i][j].getCompactStatus());

            }

            sb.append("]\n");
        }

        return sb.toString();
    }
    
    public String getAmenitiesReport(){

        StringBuilder sb = new StringBuilder();
        sb.append("\nBlock ").append(name).append(" Amenities:\n");
        
        sb.append("  Market: ").append(market.toString()).append("\n");
        Shop[] vacantShops = market.getVacantShops();
        sb.append("    Vacant Shops (IDs): ");

        if(vacantShops.length == 0){

            sb.append("None\n");

        } 

	else{

            for (int i = 0; i < vacantShops.length; i++) {

                sb.append(vacantShops[i].getId());

                if (i < vacantShops.length - 1) sb.append(", ");
            }

            sb.append("\n");

        }
        
        sb.append("  Parks (Total: ").append(parkCount).append("):\n");
        for (int i = 0; i < parkCount; i++) {
            sb.append("    ").append(parks[i].toString()).append("\n");
        }
        
        return sb.toString();
    }

    public String getName(){ 

	return name; 
	}

    public CommercialMarket getMarket(){ 

	return market;

	 }

    public Plot[][] getPlots(){

	 return plots; 

	} 

    public boolean relayBooking(String plotId, boolean isBooking){

        Plot p = findPlot(plotId);

        if (p != null) {

            if (isBooking) {

                return p.book();

            } 

	else{

                return p.cancel();
            }

        }

        return false; 
    }
    
    public Plot findFirstAvailablePlotByType(PlotType targetType) {

        for (Plot[] street : plots){
            for (Plot plot : street){

                if (plot.getType() == targetType && plot.isAvailable()) {
                    return plot;

                }
            }
        }

        return null;
    }
}
