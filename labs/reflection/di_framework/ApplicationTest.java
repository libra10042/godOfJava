package labs.reflection.di_framework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void getObject_OrderRepository() throws Exception {
        OrderRepository object = ApplicationContext.getInstance(OrderRepository.class);
        assertNotNull(object);
    }

    @Test
    public void getObject_OrderService() throws Exception {
        OrderService orderService = ApplicationContext.getInstance(OrderService.class);
        assertNotNull(orderService);
        assertNotNull(orderService.orderRepository);
    }
}