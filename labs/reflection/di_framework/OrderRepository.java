package labs.reflection.di_framework;

import org.junit.jupiter.api.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    Map<Integer, Order> orderIdToOrderMap = new HashMap<>();

    public Order getById(Integer orderId){
        return orderIdToOrderMap.get(orderId);
    }
}
