import java.util.*;
import java.util.ArrayList;

class MyClass
{
      public static void main(String[] args) {

    Stack<Int> peg1 = new Stack<Int>();
    Stack<Int> peg2 = new Stack<Int>();
    Stack<Int> peg3 = new Stack<Int>();


    switch(pegs)
    {
        case 1:
            if(peg1.peek() < peg2.peek())
            peg1.push();
            break;
        case 2:
            if(peg2.peek() < peg3.peek())
            peg2.push();
            break;
        case 3:
            if(peg3.peek() < peg1.peek())
            peg3.push();
            break;
        default:
            peg1.pop();
    }

}
    System.out.println("pop => " + disks.pop());
    System.out.println("pop => " + disks.pop());
    System.out.println("pop => " + disks.pop());
}