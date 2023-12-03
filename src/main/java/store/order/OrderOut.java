package store.order;

import java.util.List;

public record OrderOut(

    String id,
    List<ItemOut> items

) {

    public OrderOut(String id) {
        this(id, null);
    }

}