public class BurgerMain {
    public static void main(String[] args) {
        System.out.println("Бургери дня:");
        Burger originalBurger = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        Burger dietBurger = new Burger("булочка", "м'ясо", "сир", "зелень");
        Burger doubleMeatBurger = new Burger("подвійне м'ясо");
    }
}
