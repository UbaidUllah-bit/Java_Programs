package sp25_bcs_134;

public class HousingSociety{

    private String name;
    private Block[] blocks;
    private int logicalSize; 

    private static final int INITIAL_CAPACITY = 3; 

    HousingSociety(String name){

        this.name = name;
        this.blocks = new Block[INITIAL_CAPACITY];
        this.logicalSize = 0;
        
        int[] defaultLengths = {10, 11, 12, 13, 14};
        addBlock(new Block("Block A", defaultLengths));
        addBlock(new Block("Block B", defaultLengths));
        addBlock(new Block("Block C", defaultLengths));
    }

    private void resizeArray(){

        int newCapacity = blocks.length * 2;
        Block[] newBlocks = new Block[newCapacity];

        for (int i = 0; i < logicalSize; i++){

            newBlocks[i] = blocks[i];

        }

        this.blocks = newBlocks;
        System.out.println(" HousingSociety array resized to " + newCapacity);

    }

    public void addBlock(Block block){

        if (logicalSize == blocks.length){

            resizeArray();

        }

        blocks[logicalSize++] = block;
    }

    public Block findBlock(String blockName){

        for (int i = 0; i < logicalSize; i++){

            if (blocks[i].getName().equals(blockName)) {

                return blocks[i];
            }
        }

        return null;
    }
    

    public boolean relayBooking(String compoundId, boolean isBooking){

        String blockName;
        String plotId;

        int dashIndex = compoundId.indexOf('-');
        if (dashIndex == -1) return false;
        
        blockName = compoundId.substring(0, dashIndex);
        plotId = compoundId.substring(dashIndex + 1);
        
        Block b = findBlock(blockName);

        if (b != null){

            return b.relayBooking(plotId, isBooking);

        }

        return false;
    }

    public int getTotalPlots(){

        int total = 0;
        for (int i = 0; i < logicalSize; i++) {

            int streetCount = 0;

            for(Plot[] street : blocks[i].getPlots()){

                streetCount += street.length;

            }

            total += streetCount;
        }

        return total;
    }
    
    public int getAvailablePlots(){

        int total = 0;
        for (int i = 0; i < logicalSize; i++){

            total += blocks[i].getAvailablePlotCount();

        }

        return total;
    }


    public String getName(){ 

	return name;

	 }
    
    public Block[] getBlocks(){

        Block[] activeBlocks = new Block[logicalSize];

        for (int i = 0; i < logicalSize; i++) {

            activeBlocks[i] = blocks[i];

        }

        return activeBlocks; 
    }
    
    @Override
    public String toString() {

        return String.format("Society: %s | Blocks: %d | Total Plots: %d | Available: %d", name, logicalSize, getTotalPlots(), getAvailablePlots());

    }

}
