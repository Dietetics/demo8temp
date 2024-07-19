package org.example;

import java.util.List;

/**
 * The Calculator class represents a simple calculator.
 * It provides basic arithmetic operations such as addition, subtraction, multiplication, and division.
 */
public class Cal {

    /**
     * Additionne deux entiers.
     *
     * @param a Le premier entier.
     * @param b Le deuxième entier.
     * @return La somme des deux entiers.
     */
    public int add(int a, int b) {
        return a + b;
    }


    /**
     * Soustrait le deuxième entier du premier.
     *
     * @param a Le premier entier.
     * @param b Le deuxième entier.
     * @return La différence entre le premier et le deuxième entier.
     */
    public int subtract(int a, int b) {
        return a - b;
    }


    /**
     * Multiplie deux entiers.
     *
     * @param a Le premier entier.
     * @param b Le deuxième entier.
     * @return Le produit des deux entiers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }




    /**
     * Divise le premier entier par le deuxième entier.
     *
     * @param a Le numérateur.
     * @param b Le dénominateur (ne doit pas être zéro).
     * @return Le résultat de la division.
     * @throws IllegalArgumentException Si le dénominateur est zéro.
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

}

