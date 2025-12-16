public record Product(String name, double price) {
    public Product {
        if(name == null || name == ""){
            throw new IllegalArgumentException("Name cannot be NULL!");
        }

        if(price < 0){
            throw new IllegalArgumentException("Price must be POSITIVE!");
        }
    }
}
