import java.util.Stack;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class preOrder_Traversal {
    Node root;

    void preorderIterative(Node node) {
        if (node == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null)
                stack.push(current.right);
            if (current.left != null)
                stack.push(current.left);
        }
    }

    public static void main(String[] args) {
        preOrder_Traversal tree = new preOrder_Traversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree (Iterative):");
        tree.preorderIterative(tree.root);
    }
}
