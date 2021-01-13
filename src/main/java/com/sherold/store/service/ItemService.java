package com.sherold.store.service;

import com.sherold.store.entity.Category;
import com.sherold.store.entity.Item;
import com.sherold.store.mapper.ItemMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

  ItemMapper itemMapper;

  public ItemService(ItemMapper itemMapper) {
    this.itemMapper = itemMapper;
  }

  public List<Item> getAllItems() {
    return itemMapper.getAllItems();
  }

  public Item getItem(int id) {
    return itemMapper.getItem(id);
  }

  public Item createItem(Item newItem) {
    int rows = itemMapper.createItem(newItem);
    if (rows == 0) {
      return new Item();
    }
    else {
      //TODO: check if this actually works
      return newItem;
    }
  }

  public boolean updateItem(Item updatedItem) {
    int rows = itemMapper.updateItem(updatedItem);
    if (rows == 0) {
      return false;
    }
    else {
      return true;
    }
  }

  public boolean deleteItem(Item deletedItem) {
    int rows = itemMapper.deleteItem(deletedItem.getId());
    if (rows == 0) {
      return false;
    }
    else {
      return true;
    }
  }

  public List<Category> getCategories(int itemId) {
    return itemMapper.getCategories(itemId);
  }

}
