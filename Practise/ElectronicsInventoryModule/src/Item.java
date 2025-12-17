public class Item{


	private String itemId;
	private ItemType type;
	private ItemStatus status;

	Item(int id, ItemType type, ItemStatus status){


		this.itemId = String.format("SKU-A-%d", id);
		this.type = type;
		this.status = status;


	}

	public String getitemId(){

		return itemId;

	}

	public ItemType getItemType(){

		return type;

	}

	public ItemStatus getItemStatus(){

		return status;

	}
	



}