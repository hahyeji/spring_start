package spring.core.order;

public interface OrderService {

    Order createOrder(Long memId, String itemName, int itemPrice);

}
