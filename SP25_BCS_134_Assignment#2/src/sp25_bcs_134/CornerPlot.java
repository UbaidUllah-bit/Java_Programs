package sp25_bcs_134;

public class CornerPlot extends Plot{

    private static final double PREMIUM_PERCENT = 0.08; 
    private final double premiumPrice;

    CornerPlot(String id, PlotType type, ShapeType shape, double w1, double d1, double w2, double d2, double front, double back){

        super(id, type, shape, w1, d1, w2, d2, front, back); 
        this.premiumPrice = getBasePrice() * (1 + PREMIUM_PERCENT);

    }

    @Override
    public double getListPrice(){

        return premiumPrice;

    }

    @Override
    public String toString(){

        String baseString = super.toString();
        return baseString.replace(getType().getName(), getType().getName() + " CORNER");

    }

    @Override
    public boolean isCornerPlot(){ 

	return true; 

	} 

}
