package com.santiagoposada.libraryreactive.routes;


import com.santiagoposada.libraryreactive.entity.Sales;
import com.santiagoposada.libraryreactive.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/sales")
public class SalesRoutes {

    @Autowired
    private SalesRepository saleRepo;


    @GetMapping(value="get/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Sales> getAllSales(){
        return saleRepo.findAll();
    }

//    @Bean
//    public RouterFunction<ServerResponse> getAllSales(){
//        return route(GET("sales/get/all"), request ->
//                ServerResponse.ok()
//                        .body(BodyInserters.fromPublisher(saleRepo.findAll(), Sales.class)));
//    }
//    @Bean
//    public RouterFunction<ServerResponse> getSaleById(){
//        return route(GET("sales/{id}"), request ->
//                ServerResponse.ok()
//                        .body(BodyInserters.fromPublisher(saleRepo.findById(request.pathVariable("id")), Sales.class)));
//    }

}