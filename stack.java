
public class stack {

    Node top;

    static class Node {
        int data;
        Node next;
    }

    stack() {
        this.top = null;
    }

    public void push(int key) {
        Node newNode = new Node();

        newNode.data = key;
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        Node toDeleted = top;
        top = top.next;

        return toDeleted.data;
    }

    public int peek() {
        return top.data;
    }

    public boolean isEmpty() {
        if (top == null)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        stack stack = new stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());

        System.out.println(stack.top.data);

        stack.push(40);
        System.out.println(stack.top.data);

        stack.pop();
        stack.pop();
        System.out.println(stack.top.data);

        stack.peek();
    }
}
