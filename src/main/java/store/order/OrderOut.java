package store.order;

import java.util.List;

import store.customer.CustomerOut;

public record OrderOut (
    String id,
    String date,
    CustomerOut customer,
    List<ItemOut> items
) {
    OrderOut(String id) {
        this(id, null, null, null);
    }
 }
