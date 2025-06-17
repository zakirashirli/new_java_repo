package exercises;

public class MyToyShop {
    public static void main(String[] args) {
        MyProducts product1 = new MyProducts();
        product1.id = 1;
        product1.name = "car toy";
        product1.price = 4.99;
        product1.rating = 3;
        product1.age_restriction = "3-8";
        product1.product_info();

    }
}


class MyProducts {
    int id;
    String name;
    double price;
    int rating;
    String age_restriction;

    void product_info() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("rating: " + rating);
        System.out.println("age_restriction: " + age_restriction);
    }
}
