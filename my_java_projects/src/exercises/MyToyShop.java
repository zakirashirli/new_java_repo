package exercises;

public class MyToyShop {
    public static void main(String[] args) {
        MyProducts product1 = new MyProducts();
        // product1 data
        product1.id = 1;
        product1.name = "car toy";
        product1.price = 4.99;
        product1.rating = 11; // 8/10
        product1.age_restriction = 3;

        // product1 methods
        product1.product_info();
        product1.setAge_restriction(3);
        product1.evaluateRating();

        MyProducts product2 = new MyProducts();
        // product2 data
        product2.id = 2;
        product2.name = "Lego";
        product2.price = 80.99;
        product2.rating = 9; // 9/10
        product2.age_restriction = 6;

        // product2 methods
        product2.product_info();
        product2.setAge_restriction(16);
        product2.evaluateRating();
    }
}


class MyProducts {
    int id;
    String name;
    double price;
    int rating; // po 10 balnoy
    int age_restriction;
    int child_age;

    void product_info() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("rating: " + rating);
        System.out.println("age_restriction: " + age_restriction);

    }

    void setAge_restriction(int child_age) {
       if (child_age < age_restriction) {
           System.out.println("Ребенку меньше " + age_restriction + ", Покупка запрещена!");
       } else{
           System.out.println("Возрост Подходит!");
       }
    }

    void evaluateRating(){
        if(rating >= 7) {
            System.out.println("Товар Отличный!");
        } else if(rating >= 5) {
            System.out.println("Товар не плохой!");
        } else {
            System.out.println("Низкий Рейтинг!");
        }

        System.out.println("-----------");
    }
}
