import java.util.*;
class BinarySearchTree {
    static Node root;

    class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data < data) {
            root.left = insert(root.right, data);
        } else if (root.data > data) {
            insert(root.left, data);
        }

        return root;
    }
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        int choice;
        while (true) {
            System.out.println("1. Insert\n2.Inorder\n0.Exit\n");
            choice = scan.nextInt();
            if (choice == 1) {
                int n = scan.nextInt();
                root = tree.insert(root, n);
            } else if (choice == 2) {
                tree.inorder(root);
            } else {
                break;
            }
            
        }
        scan.close();
    }
}