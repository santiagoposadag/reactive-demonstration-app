package com.santiagoposada.libraryreactive.repository;

import com.santiagoposada.libraryreactive.entity.Sales;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends ReactiveMongoRepository<Sales, String> {
}
