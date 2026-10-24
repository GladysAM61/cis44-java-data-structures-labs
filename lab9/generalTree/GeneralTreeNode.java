/**
 *
 * @author gladysarias
 */
import java.util.ArrayList;
import java.util.List;

public class GeneralTreeNode {
    String name; // Employee name or department title
    GeneralTreeNode parent;
    List children;

    public GeneralTreeNode(String name) {
        this.name = name;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    // Method to add a child to this node
    public void addChild(GeneralTreeNode child) {
        child.parent = this;
        this.children.add(child);
    }

   

    /**
     * Performs a preorder traversal starting from this node.
     * Prints the name of each node visited.
     * (Visit Parent, then visit children)
     */
    public void traversePreorder() {
        // Your code here
        // 1. Print this node's name
       System.out.print(this.name + " ");
       // 2. Recursively call traversePreorder on each child
        for (Object obj : this.children) {
            //making the object a generalTreeNode so it doesn't throw an error
            GeneralTreeNode child = (GeneralTreeNode) obj;
            child.traversePreorder();
        }
        
    }

    /**
     * Performs a postorder traversal starting from this node.
     * Prints the name of each node visited.
     * (Visit children, then visit Parent)
     */
    public void traversePostorder() {
        // Your code here
        // 1. Recursively call traversePostorder on each child
        for (Object obj : this.children) {
            //making the object a generalTreeNode so it doesn't throw an error
            GeneralTreeNode child = (GeneralTreeNode) obj;
            child.traversePostorder();
        }
        // 2. Print this node's name
        System.out.print(this.name + " ");
    }
}


