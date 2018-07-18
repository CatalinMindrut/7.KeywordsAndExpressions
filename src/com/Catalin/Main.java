package com.Catalin;

public class Main {
    public static void main(String[] args) {
        /**Java has about 50 reserved keywords that are highlighted in blue (orange if you're using the black theme)
         * int int = 5; is not valid, because, as far as Java is concerned, int is a reserved word and it can not be used
         * as a variable. int int2 = 5; would be valid because you are using part of the word, not the exact word.
         * Keywords examples: public, static, int, double, false, true, etc.
         */

        /**Expressions are built with values, variables, operators and method calls.
         */

        //a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        /**Data types do not form and are not normally part of an expression.
         * In the above example "kilometers = (100 * 1.609344)" is the expression, formed of the variable, operators and
         * values or operands.
         * The expression in combination with the data type and the semicolon at the end, forms a valid Java STATEMENT.
         */
        int highScore = 50;
        if(highScore == 50){
            /**In this example, the expression is just the content between the brackets "highScore == 50". The if keyword,
             * the brackets and the curly brackets are not part of the expression.
              */
            System.out.println("This is an expression");
            /** Here the component between the brackets is the expression, including the double quotes.
             * Statements are formed of components, thus, an expression is a component of a statement.
             * Recap: if you define a variable, everything between the data type and the semicolon is an expression. If you
             * have a control statement (if), everything between the brackets is an expression and the same goes for a
             * method call.
             */
        }

        //Challenge
        //In the following code, write down what parts of the code are expressions.
        int score = 100;
        if (score > 99){
            System.out.println("You got the high score!");
            score = 0;
        }
        /**Line 37: score = 100
         * Line 38: score > 99
         * Line 39: "You got the high score!"
         * Line 40: score = 0
         */




    }
}