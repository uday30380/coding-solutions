import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        
        // Add items to the shopping list
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Cheese");
        shoppingList.add("Apples");
        shoppingList.add("Chicken");
        shoppingList.add("Rice");
        
        // Your code here
        // 1. Remove item at index 3 ("Cheese")
        
        shoppingList.remove(3);
        
        // 2. Remove item "Bread" by object
        shoppingList.remove("Bread");
        
        
        // Print the final shopping list
        System.out.println("Final shopping list: " + shoppingList);
    }
}
