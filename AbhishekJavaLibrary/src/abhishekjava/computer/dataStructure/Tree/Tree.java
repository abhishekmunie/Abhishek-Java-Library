/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.computer.dataStructure.Tree;

import java.util.Arrays;

/**
 *
 * @author Abhishek
 */
public class Tree {

    public class Node<V> {

        V item;
        Node[] childrenNodes;

        public Node(V item) {
            this.item = item;
        }

        public Node(V item, Node[] childrenNodes) {
            this.item = item;
            this.childrenNodes = childrenNodes;
        }

        public V getItem() {
            return item;
        }

        public void setItem(V item) {
            this.item = item;
        }

        public Node[] getChildrenNodes() {
            return childrenNodes;
        }

        public void setChildrenNodes(Node[] childrenNodes) {
            this.childrenNodes = childrenNodes;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Node<V> other = (Node<V>) obj;
            if (this.item != other.item && (this.item == null || !this.item.equals(other.item))) {
                return false;
            }
            if (!Arrays.deepEquals(this.childrenNodes, other.childrenNodes)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 53 * hash + (this.item != null ? this.item.hashCode() : 0);
            hash = 53 * hash + Arrays.deepHashCode(this.childrenNodes);
            return hash;
        }

    }
    Node root;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
