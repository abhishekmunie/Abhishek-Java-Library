/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.computer.dataStructure.Tree;

/**
 *
 * @author Abhishek
 */
public class BinarySearchTree extends BinaryTree {

    @Override
    public void insert(Node newNode) {
        insert(newNode, root);
    }

    void insert(Node newNode, Node node) {
        if (node == null) {
            node = newNode;
        } else if (newNode.item < node.item) {
            insert(newNode, node.left);
        } else if (newNode.item > node.item) {
            insert(newNode, node.right);
        }
    }

    @Override
    public boolean search(int item) {
        return search(item, root);
    }

    boolean search(int item, Node node) {
        if (root.item == item) {
            return true;
        } else if (item < root.item) {
            search(item, node.left);
        } else if (item > root.item) {
            search(item, node.right);
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
