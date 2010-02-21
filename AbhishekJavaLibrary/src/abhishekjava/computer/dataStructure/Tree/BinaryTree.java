/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.computer.dataStructure.Tree;

/**
 *
 * @author Abhishek
 */
public class BinaryTree {

    public class Node {

        Node left;
        int item;
        Node right;

        public Node(int item) {
            this.item = item;
        }

        public Node(Node left, int item, Node right) {
            this.left = left;
            this.item = item;
            this.right = right;
        }

        public int getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
    Node root;

    public void insert(Node newNode){

    }

    public boolean search(int item){
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
}
