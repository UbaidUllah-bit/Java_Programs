package sp25_bcs_134;

public class CommercialMarket{

    private final Shop[] shops;
    private final String name = "Commercial Market";
    private int shopCount = 0;
    
    private static final int DEFAULT_SHOP_COUNT = 15;

    CommercialMarket(String blockName){

        this.shops = new Shop[DEFAULT_SHOP_COUNT];

        for (int i = 0; i < DEFAULT_SHOP_COUNT; i++){

            String shopId = blockName + "-S" + String.format("%02d", i + 1);
            shops[shopCount++] = new Shop(shopId);

        }
    }

    public int getShopCount(){ 

	return shopCount;

	 }

    public Shop[] getVacantShops() {

	int vacantCount = 0;

        for (int i = 0; i < shopCount; i++) {

            if (shops[i].isVacant()) {

                vacantCount++;

            }

        }

        Shop[] vacantArray = new Shop[vacantCount];

        int fillIndex = 0;

        for (int i = 0; i < shopCount; i++) {

            if (shops[i].isVacant()) {

                vacantArray[fillIndex++] = shops[i];

            }

        }

        return vacantArray;
    }
    
    public boolean bookShop(String shopId) {

        for (int i = 0; i < shopCount; i++) {

            if (shops[i].getId().equals(shopId)) {

                return shops[i].book();

            }

        }

        return false;

    }

    @Override
    public String toString() {

        return String.format("%s (Total Shops: %d, Vacant: %d)", name, shopCount, getVacantShops().length);
    }

}
