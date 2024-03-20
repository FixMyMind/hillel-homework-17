public class Burger {

    String bun = "булочка";
    String meat;
    String cheese = "сир";
    String greens = "зелень";
    String mayo = "майонез";

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println(String.format("\"Звичайний бургер\" - до складу цього бургера входить: %s, %s, %s, %s та " +
                "%s.", this.bun, this.meat, this.cheese, this.greens, this.mayo));
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println(String.format("\"Дієтичний бургер\" - до складу цього бургера входить: %s, %s, %s та %s.",
                this.bun, this.meat, this.cheese, this.greens));
    }

    public Burger(String meat) {
        this.meat = meat;
        System.out.println(String.format("\"Бургер з подвійним м'ясом\" - до складу цього бургера входить: %s, %s, " +
                "%s, %s та %s.", bun, this.meat, cheese, greens, mayo));
    }
}
