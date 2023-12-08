package store.order;

import store.product.ProductOut;

public record ItemOut(

    String id,
    OrderOut order,
    ProductOut product,
    Integer qtd,
    Double price,
    Double total

) { }
