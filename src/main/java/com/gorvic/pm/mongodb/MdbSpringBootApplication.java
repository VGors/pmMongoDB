package com.gorvic.pm.mongodb;

import com.gorvic.pm.mongodb.model.GroceryItem;
import com.gorvic.pm.mongodb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringBootApplication implements CommandLineRunner {

    @Autowired
    ItemRepository grocceryItemRepo;

    public static void main(String[] args) {
        SpringApplication.run(MdbSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------CREATE GROCERY ITEMS-------------------------------\n");
        createGroceryItems();
        System.out.println("\n----------------SHOW ALL GROCERY ITEMS---------------------------\n");
        showAllGroceryItems();
        System.out.println("\n--------------GET ITEM BY NAME-----------------------------------\n");
        getGroceryItemByName("Whole Wheat Biscuit");
        System.out.println("\n-----------GET ITEMS BY CATEGORY---------------------------------\n");
        getItemsByCategory("millets");
        System.out.println("\n-----------UPDATE CATEGORY NAME OF SNACKS CATEGORY----------------\n");
        updateCategoryName("snacks");
        System.out.println("\n----------DELETE A GROCERY ITEM----------------------------------\n");
        deleteGroceryItem("Kodo Millet");
        System.out.println("\n------------FINAL COUNT OF GROCERY ITEMS-------------------------\n");
        findCountOfGroceryItems();
        System.out.println("\n-------------------THANK YOU---------------------------");
    }

    //    CREATE
    void createGroceryItems() {
        System.out.println("Data creation started...");
        grocceryItemRepo.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snaks"));
        grocceryItemRepo.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
        grocceryItemRepo.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chili", 2, "spices"));
        grocceryItemRepo.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
        grocceryItemRepo.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snaks"));
        System.out.println("Data creation complete...");
    }

    //    READ
    //    1. Show all the data
    public void showAllGroceryItems() {
        grocceryItemRepo.findAll().forEach(item -> System.out.println(getItemDetails(item)));
    }

    //    2. Get item by name
    public void getGroceryItemByName(String name) {
        System.out.println("Getting item by name: " + name);
        GroceryItem item = grocceryItemRepo.findItemByName(name);
        System.out.println(getItemDetails(item));
    }

    //    3. Get name and quantity of all items of a particular category
    public void getItemsByCategory(String category) {
        System.out.println("Getting items for the category: " + category);
        List<GroceryItem> list = grocceryItemRepo.findAll(category);
        list.forEach(item -> System.out.println("Name: " + item.getName() + ", Quantity: " + item.getQuantity()));
    }

    //    4. Get count of documents in the collection
    public void findCountOfGroceryItems() {
        long count = grocceryItemRepo.count();
        System.out.println("Number of documents in the collection: " + count);
    }

    //    Print details in readable form
    public String getItemDetails(GroceryItem item) {
        System.out.println("Item name: " + item.getName() + ", \nQuantity: " + item.getQuantity() + ", \nItem Category: " + item.getCategory());
        return "";
    }

    //  UPDATE
    public void updateCategoryName(String category) {
//        Change to this new value
        String newCategory = "Munchies";

//        Find all the items with the category snacks
        List<GroceryItem> list = grocceryItemRepo.findAll(category);
//        Update the category in each document
        list.forEach(item -> {
            item.setCategory(newCategory);
        });
//        Save all the items in database
        List<GroceryItem> itemsUpdated = grocceryItemRepo.saveAll(list);

        if (itemsUpdated != null) {
            System.out.println("Successfully updated " + itemsUpdated.size() + " items.");
        }
    }

//    DELETE
    public void deleteGroceryItem(String id){
        grocceryItemRepo.deleteById(id);
        System.out.println("Item with id: " + id + " deleted...");
    }
}
