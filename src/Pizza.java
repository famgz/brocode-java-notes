public class Pizza {
    
    String bread;
    String sauce;
    String cheese;

    // constructor 1, only bread
    Pizza(String bread) {
        this.bread = bread;
    }

    // constructor 2, without cheese
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }
    
    // constructor 3, with all ingredients
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
}
