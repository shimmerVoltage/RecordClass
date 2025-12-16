import java.awt.*;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

void main() {
    User user0 = new User("Valerij", 54);
    User user1 = new User("Lexus", 25);
    User user2 = new User("Jesus", 30);
    User user3 = new User("Lexus", 25);
    User user4 = new User("Backflip", 28);

    System.out.println("--------------------------");
    System.out.println(user0);
    System.out.println(user1);
    System.out.println(user2);
    System.out.println(user3);
    System.out.println(user4);
    System.out.println(user0.equals(user1));
    System.out.println(user1.equals(user3));
    System.out.println(user4.toString());

    System.out.println("--------------------------");
    Product product = new Product("Christ", 1000);

    System.out.println("--------------------------");
    List<OrderItem> orderItems = List.of(
            new OrderItem("Hammer", 2, 99.99),
            new OrderItem("Screw driver", 3, 9.50),
            new OrderItem("Knife", 5, 19.99),
            new OrderItem("Machine gun", 1, 45.00),
            new OrderItem("Cocaine", 2, 35.75),
            new OrderItem("Helicopter", 4, 89.90)
    );
    System.out.println("TOTAL: " + orderItems.stream().mapToDouble(OrderItem::totalPrice).sum());

    Optional<OrderItem> maxItemOptional = orderItems.stream().max(Comparator.comparingDouble(OrderItem::totalPrice));
    if (maxItemOptional.isPresent()) {
        OrderItem maxItem = maxItemOptional.get();
        System.out.println("MAX price:");
        System.out.printf("  Name: %s%n", maxItem.productName());
        System.out.printf("  Quantity: %d%n", maxItem.quantity());
        System.out.printf("  Price per unit: $%.2f%n", maxItem.pricePerUnit());
        System.out.printf("  Total: $%.2f%n", maxItem.totalPrice());
    }

    //
}
