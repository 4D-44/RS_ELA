import java.util.LinkedList;
import java.util.Stack;

public class class3 {
    // 5 foundational courses:
    // 110, 111, 220(Hardest theory), 221(Hardest lab since software checks and gives no partial marking), 370?
    public static void main(String[] args) {
        // Recursion:
        // 5! = 5*4!--> 4*3!--> 3*2!--> 2*1!
        System.out.println(test.fact(10));
        // Stack ni tsuite:
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list);
        System.out.println();
        // interview questions: stack memory ki? etc
        // a pc has 2 memory types: stack memory and heap memory
        // the stack memory in pc is implicit
        // but when we make/add stack memory in database, it's explicit stack memory
        // push() = insertion
        // pop() = removal; Removes AND returns top element 
        // peek() = get
        // stack sys: LIFO (Last in First out [same in recursion])

        // Problem 1: Push an element at the bottom of the stack (O(1)) -- Amazon question
        // Sol: Through recursion, take out each top element and store in variable. Then after all elements are gone, insert the required element.
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        stackSol sol = new stackSol();
        sol.pushAtBottom(s, 4);
        System.out.println(s);
        System.out.println();

        // Problem reverse a string using a stack
        // Sol: By LIFO, just put a string in a stack, then take it out. It's already in reverse

        // Problem: Why do we do encapsulation? Ok so you use getter and setter, so how does that protect it? -- someIT Solutions
        // Sol: We can put conditions in the methods we create (getter), that if so and so ID/password don't match, then it won't provide any info

        // Problem reverse a stack (O(1))
        // Sol: remove all elements, then pushAtBottom() for all elements
        Stack<Integer> s2 = new Stack<>();
        s2.push(30);
        s2.push(20);
        s2.push(10);
        System.out.println(s2);
        sol.reverseStack(s2);
        System.out.println(s2);

        // Tip: You might not be able to solve a code properly sometimes, but try by yourself. You might be able to do it yourself, maybe it won't be efficient. So you look at an editorial, then try again. If you still can't, THEN look for the tutorials.
        // Industries expect you to know 80% of the things you need (just about)


    }
}
class test {
    static int fact (int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n-1);
    }
}
class stackSol {
    public void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return; // "An empty stack is by-default a reverse stack"
        }
        int top = s.pop(); // basically int top = s.peek(); s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
}
