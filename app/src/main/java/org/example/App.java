
package org.example;

public class App {
    public static void main(String[] args) {
        DishStack dishStack = new DishStack();

        Dish dish1 = new Dish("Dish one");
        Dish dish2 = new Dish("Dish two");
        Dish dish3 = new Dish("Dish three");
        Dish dish4 = new Dish("Dish four");

        int stackSize = dishStack.size();
        System.out.println("Initial stack size: " + stackSize);
        dishStack.push(dish1);
        dishStack.push(dish2);
        dishStack.push(dish3);
        dishStack.push(dish4);

        int sizeAfterPush = dishStack.size();
        System.out.println("Stack size after pushing dishes: " + sizeAfterPush);

        Dish peekedDish = dishStack.peek();
        System.out.println("Peeked dish: " + peekedDish.getDescription());

        Dish poppedDish = dishStack.pop();
        System.out.println("Popped dish: " + poppedDish.getDescription());

        Dish anotherPoppedDish = dishStack.pop();
        System.out.println("Another popped dish: " + anotherPoppedDish.getDescription());

        int finalStackSize = dishStack.size();
        System.out.println("Final stack size: " + finalStackSize);
    }
}
