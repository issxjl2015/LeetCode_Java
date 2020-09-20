package Leetbook.datastructure.illustration_of_algorithm.datastructure.Offer09_用两个栈实现队列;

import java.util.Stack;

public class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        // stack1 和 stack2 都为 空
        if (stack2.size() == 0) {
            stack2.push(value);
        } else {
            while (stack2.size() != 0) {
                stack1.push(stack2.pop());
            }
            stack1.push(value);
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
    }

    public int deleteHead() {
        if (stack2.size() == 0) {
            return -1;
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println("==========================");
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
