package store.order;

public record ItemIn(

    String orderId,
    String productId,
    Integer qtd

) { }
