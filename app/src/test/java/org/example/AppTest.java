
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testInitialStackSize() {
        DishStack dishStack = new DishStack();
        assertEquals(0, dishStack.size(), "Initial stack size should be 0");
    }

    @Test
    public void testPushAndSize() {
        DishStack dishStack = new DishStack();
        dishStack.push(new Dish("Dish one"));
        dishStack.push(new Dish("Dish two"));
        assertEquals(2, dishStack.size(), "Stack size should be 2 after pushing two dishes");
    }

    @Test
    public void testPeekDoesNotChangeSize() {
        DishStack dishStack = new DishStack();
        Dish dish = new Dish("Peek Test Dish");
        dishStack.push(dish);
        Dish top = dishStack.peek();
        assertEquals("Peek Test Dish", top.getDescription());
        assertEquals(1, dishStack.size(), "Stack size should remain 1 after peek");
    }

    @Test
    public void testPopReturnsTop() {
        DishStack dishStack = new DishStack();
        Dish dish1 = new Dish("Dish one");
        Dish dish2 = new Dish("Dish two");
        dishStack.push(dish1);
        dishStack.push(dish2);
        Dish popped = dishStack.pop();
        assertEquals("Dish two", popped.getDescription(), "Popped dish should be the last pushed dish");
        assertEquals(1, dishStack.size(), "Stack size should be 1 after popping one dish");
    }

    @Test
    public void testPopOnEmptyStack() {
        DishStack dishStack = new DishStack();
        stack.push(new Dish("Dish one"));
        stack.pop();
        assertEquals(0, dishStack.size(), "Stack size should be 0 after popping the only dish");
        Dish popped = dishStack.pop();
        assertNull(popped, "Popping from an empty stack should return null");
    }

    @Test
    puvoid testPushFullStack() {
        DishStack dishStack = new DishStack();
        for (int i = 0; i < 10; i++) {
            dishStack.push(new Dish("Dish " + i));
        }
        assertEquals(10, dishStack.size(), "Stack size should be 10 after pushing 10 dishes");
        dishStack.push(new Dish("Overflow Dish"));
        assertEquals(10, dishStack.size(), "Stack size should remain 10 after attempting to push to a full stack");
    }
}
