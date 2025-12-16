public record OrderItem (String productName, int quantity, double pricePerUnit){
    public double totalPrice() {
        return quantity * pricePerUnit;
    }
}
