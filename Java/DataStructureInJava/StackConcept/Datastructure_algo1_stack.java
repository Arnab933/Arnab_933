package DataStructureInJava.StackConcept;
import java.util.*;

public class Datastructure_algo1_stack {
   public static void main(String[] args) {
      Stack<String> stack = new Stack<String>();
      /* stack is works mainly FIFO process:means first in and last out */
      /*
       * push is a method that store any data and pop is a method that remove the last
       * data
       */

      stack.push("arnab");
      stack.push("sujit");
      stack.push("ap");
      stack.push("pratihar");
      System.out.println(stack);
      System.out.println(stack.search("arnab"));
      System.out.println(stack.empty());// peek method peeks the top most object
      System.out.println(stack.peek());
      System.out.println(stack.size());
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      System.out.println(stack);
      System.out.println(stack.empty());// stack.empty is a boolean method that ehecks the stack is empty or
      // not end return

      // for (int i = 0; i < 100000000; i++){
      // stack.push("arnab");
      // }
   }
}