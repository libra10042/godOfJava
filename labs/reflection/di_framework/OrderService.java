package labs.reflection.di_framework;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    @Autowired
    OrderRepository orderRepository;
}
