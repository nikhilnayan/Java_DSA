public class trees {

    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    trees() {
        this.root = null;
    }

    public Node insertData(Node root, int key) {
        if (root == null)
            return new Node(key);
        else if (key < root.data)
            root.left = insertData(root.left, key);
        else if (key > root.data)
            root.right = insertData(root.right, key);

        return root;
    }

    public static void main(String args[]) {
        trees bst = new trees();
        bst.insertData(bst.root, 60);
        bst.insertData(bst.root, 30);
        bst.insertData(bst.root, 100);

        
    }
}
