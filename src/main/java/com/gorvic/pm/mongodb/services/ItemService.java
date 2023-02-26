package com.gorvic.pm.mongodb.services;

public class ItemService {
}

//    CREATE
//    void createGroceryItems() {
//        System.out.println("Data creation started...");
//        groceryItemRepo.save(new GroceryItem("Whole Wheat Biscuit", 5, "snaks"));
//        groceryItemRepo.save(new GroceryItem( "XYZ Kodo Millet healthy", 2, "millets"));
//        groceryItemRepo.save(new GroceryItem( "Dried Whole Red Chili", 2, "spices"));
//        groceryItemRepo.save(new GroceryItem( "Healthy Pearl Millet", 1, "millets"));
//        groceryItemRepo.save(new GroceryItem( "Bonny Cheese Crackers Plain", 6, "snaks"));
//        System.out.println("Data creation complete...");
//    }

//    READ
//    1. Show all the data
//    public void showAllGroceryItems() {
//        groceryItemRepo.findAll().forEach(item -> System.out.println(getItemDetails(item)));
//    }
//
//    //    2. Get item by name
//    public void getGroceryItemByName(String name) {
//        System.out.println("Getting item by name: " + name);
//        GroceryItem item = groceryItemRepo.findItemByName(name);
//        System.out.println(getItemDetails(item));
//    }
//
//    //    3. Get name and quantity of all items of a particular category
//    public void getItemsByCategory(String category) {
//        System.out.println("Getting items for the category: " + category);
//        List<GroceryItem> list = groceryItemRepo.findAll(category);
//        list.forEach(item -> System.out.println("Name: " + item.getName() + ", Quantity: " + item.getQuantity()));
//    }
//
//    //    4. Get count of documents in the collection
//    public void findCountOfGroceryItems() {
//        long count = groceryItemRepo.count();
//        System.out.println("Number of documents in the collection: " + count);
//    }
//
//    //    Print details in readable form
//    public String getItemDetails(GroceryItem item) {
//        System.out.println("Item name: " + item.getName() + ", \nQuantity: " + item.getQuantity() + ", \nItem Category: " + item.getCategory());
//        return "";
//    }
//
//    //  UPDATE
//    public void updateCategoryName(String category) {
////        Change to this new value
//        String newCategory = "Munchies";
//
////        Find all the items with the category snacks
//        List<GroceryItem> list = groceryItemRepo.findAll(category);
////        Update the category in each document
//        list.forEach(item -> {
//            item.setCategory(newCategory);
//        });
////        Save all the items in database
//        List<GroceryItem> itemsUpdated = groceryItemRepo.saveAll(list);
//
//        if (itemsUpdated != null) {
//            System.out.println("Successfully updated " + itemsUpdated.size() + " items.");
//        }
//    }
//
////    DELETE
//    public void deleteGroceryItem(String id){
//        groceryItemRepo.deleteById(id);
//        System.out.println("Item with id: " + id + " deleted...");
//    }
//}