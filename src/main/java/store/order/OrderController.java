package store.order;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient("store-order")
public interface OrderController {

    @GetMapping("/order/")
    public List<OrderOut> list(
        @RequestHeader(value = "id-user", required = true) String idUser
    );

    @GetMapping("/order/{id}")
    public OrderOut get(
        @RequestHeader(value = "id-user", required = true) String idUser,        
        @PathVariable(required = true) String id
    );

    @DeleteMapping("/order/{id}")
    public void delete(
        @RequestHeader(value = "id-user", required = true) String idUser,        
        @PathVariable(required = true) String id
    );

    @PostMapping("/order/")
    public ResponseEntity<Object> create(
        @RequestHeader(value = "id-user", required = true) String idUser,        
        @RequestBody OrderIn in
    );

}