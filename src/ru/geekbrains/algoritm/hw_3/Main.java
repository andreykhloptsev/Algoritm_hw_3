package ru.geekbrains.algoritm.hw_3;

public class Main {

    public static void main(String[] args)  throws NoSuchFieldException{
        Deck<Integer> deck= new Deck<>();
        deck.addRight(4);
        deck.deleteLeft();
        deck.addRight(1);
        deck.addLeft(5);
        deck.addRight(6);
        deck.deleteRight();
        deck.addLeft(2);
        deck.addRight(7);
        deck.deleteRight();

        System.out.println(deck.toString());


        /**
        Stack<Character> stack= new Stack<>();
	    stack.push('a');
        stack.push('b');
        stack.push('d');
        stack.push('s');
        stack.push('r');
        stack.push('s');
        stack.push('t');
        stack.push('s');
        System.out.println(stack);
        stack.reverse();
        stack.pop();
        System.out.println(stack);
         */
    }
}
