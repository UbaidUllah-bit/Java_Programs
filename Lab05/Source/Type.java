
public enum Type{

    Regular(500), Premium(750), Vip(1000), Recliner(1200);

    private int price;

    Type(int price){

        this.price = price;

    }

    public int getPrice(){

        return price;

    }


}
