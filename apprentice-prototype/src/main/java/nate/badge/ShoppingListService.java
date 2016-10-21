package nate.badge;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by roondog on 9/30/16.
 */
public class ShoppingListService {

	@Autowired
	private ShoppingListStore shoppingListStore;

	public Item getItem(String lid) {
		return shoppingListStore.getItem(lid);
	}

	public Collection<Item> getAllItems() {
		return shoppingListStore.getAllItems();
	}

	public void deleteItem(String lid) {
		shoppingListStore.deleteItem(lid);
	}

	public void addItem(Item item) {
		shoppingListStore.addItem(item);
	}

	public void updateItem(String lid, Item item) {
		shoppingListStore.getItem(lid).setName(item.getName());
	}
}
