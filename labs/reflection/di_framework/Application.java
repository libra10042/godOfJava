package labs.reflection.di_framework;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        try {
            OrderService orderService = applicationContext.getInstance(OrderService.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
