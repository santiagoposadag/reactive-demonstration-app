package com.santiagoposada.restlibrarymongo.respository;

import com.santiagoposada.restlibrarymongo.entity.Sales;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends MongoRepository<Sales, String> {
}
