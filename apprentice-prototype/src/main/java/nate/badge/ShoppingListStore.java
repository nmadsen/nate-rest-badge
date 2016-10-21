package nate.badge;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Map;

/**
 * Created by roondog on 10/1/16.
 */
public class ShoppingListStore {

	@Autowired
	private Map<String, Item> items;
	private static int lid = 1;

	public Collection<Item> getAllItems() {
		return items.values();
	}

	public Item getItem(String lid) {
		return items.get(lid);
	}

	public void addItem(Item item) {
		String key = String.valueOf(lid++);
		item.setId(key);
		items.put(key, item);
	}

	public void updateItem(String lid, Item item) {
		items.get(lid).setName(item.getName());
		items.get(lid).setComment(item.getComment());
	}

	public void deleteItem(String lid) {
		items.remove(lid);
	}
}
