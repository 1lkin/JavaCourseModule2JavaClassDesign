/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

/**
 * IKIN HASANOV's response to Homework "Java class design", Module 2.
 *
 *   Task:
 *      Create a class from the attached document according to the order
 *      in your group (2.Rectangle). The class must contain:
 *          1. Constructor.
 *          2. Getters/Setters.
 *          3. 5 methods.
 *          4. Override toString() method.
 *          5. Override hash() and equals() methods.
 *
 * @version 1.10
 * @since 21-03-2021
 * @class Rectangle
 * @author Ilkin Hasanov
 */
public class Main {
    public static void main(String[] args) {
        Rectangle figure1 = new Rectangle(3,4);
        Rectangle figure2 = new Rectangle(5.12,3.432);

        System.out.println(figure1.toString());
    }
}
