package com.gorvic.pm.mongodb.repositories;

import com.gorvic.pm.mongodb.models.GroceryItem;
import com.gorvic.pm.mongodb.models.Security_Object;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface SecurityObjectRepository extends MongoRepository<Security_Object, String> {
    List<Security_Object> findByName(String name);

//    @Query("{name: '?0'}")
//    GroceryItem findItemByName(String name);
//
//    @Query(value = "{category: '?0'}", fields = "{'name': 1, 'quantity': 1}")
//    List<GroceryItem> findAll(String category);
//    public long count();

}

