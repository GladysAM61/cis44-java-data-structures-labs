/**
 *
 * @author gladysarias
 */



// TODO: Implement the AVLNode class
class AVLNode {
    int key, height;
    AVLNode left, right;

    // Constructor
    AVLNode(int key) {
        // TODO: Initialize key, height, left, and right
        this.key=key; 
        height =1; // starting at 1 since it is a leaf node
        left = null;
        right = null;
        
    }
}

public class AVLTree {
    AVLNode root;

    // TODO: Return height of a node
    int height(AVLNode N) {
        //checking to see if its empty first 
        //if it is then we return zero
        if (N == null) {
            return 0;
        }
        //otherwise we return the height
        return N.height; 
    }
    
    // TODO: Return maximum of two integers
    int max(int a, int b) {
        //checking if a is the maximum
        if(a>b){
            return a;
        }
        
        //if a is not the maximum, then b is the maximum or equal to a
        //therefore we can return b
        else{
            return b;
        }
    }
    
    
    // TODO: Compute balance factor
    int getBalance(AVLNode N) {
    // If the node doesn't exist, it has no balance issue
        if (N == null) {
            return 0;
        }
    // returning the balance by subtracting the left subtree from the right subtree
        return height(N.left) - height(N.right);   
    }
    
    
     // TODO: Right rotation
    AVLNode rightRotate(AVLNode y) {
        //grab y left child
          AVLNode x = y.left;
            y.left = x.right;
            x.right = y;
            //recalculate the height
            y.height = max(height(y.left), height(y.right)) + 1;
            x.height = max(height(x.left), height(x.right)) + 1;
            //new parent
            return x;
    }
    
    // TODO: Left rotation
    AVLNode leftRotate(AVLNode x) {
            //grab x right child
            AVLNode y = x.right;
            x.right = y.left;
            y.left = x;
            //recalculate the height
            x.height = max(height(x.left), height(x.right)) + 1;
            y.height = max(height(y.left), height(y.right)) + 1;
            //new parent
            return y;
    }
    
    // TODO: Left-Right rotation
    AVLNode leftRightRotate(AVLNode z) {
        //doing a left rotation on z child
        z.left = leftRotate(z.left);
        
        //right rotation on z
        return rightRotate(z); // placeholder
    }

    // TODO: Right-Left rotation
    AVLNode rightLeftRotate(AVLNode y) {
        //doing a right rotation first
        y.right = rightRotate(y.right);
        
        //then a left rotation
        return leftRotate(y); // placeholder
    }
//     Public insert method
    public void insert(int key) {
        root = insert(root, key);
    }
    
    
    // TODO: Recursive insertion with rebalancing
    private AVLNode insert(AVLNode node, int key) {
        
         // 1. Standard BST Insertion
        if (node == null){
            return new AVLNode(key);
        }
        
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node; // Duplicates aren't allowed
        }
        
        // 2. Update Height
        node.height = 1 + Math.max(height(node.left), height(node.right));
        
        // 3. Check Balance Factor
        int balance = getBalance(node);
        
        // 4. Perform Rotations if Unbalanced
        // Case 1: Left Left (LL)
        if (balance > 1 && key<node.left.key){
            return rightRotate(node);
        }
            
        // Case 2: Right Right (RR)
        if (balance < -1 && key > node.right.key){
            return leftRotate(node);
        }
        
        // Case 3: Left Right (LR)
        
        if (balance > 1 && key > node.left.key) {
            return leftRightRotate(node);
        }
        
        
        // Case 4: Right Left (RL)
        if (balance < -1 && key < node.right.key) {
            return rightLeftRotate(node);
        }
        
        return node; 
    }
    
    // TODO: Traversal methods
    public void inorder() {
        inorder(root);
        System.out.println();
    }
    
    private void inorder(AVLNode node) {
       
         if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }  
    }
    
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(AVLNode node) {
        if (node != null) {
            System.out.print(node.key + " "); //printing out the key first
            preorder(node.left);      
            preorder(node.right);          
        }
    }
    
    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(AVLNode node) {
       if (node != null) {
           postorder(node.left);
           postorder(node.right);
           System.out.print(node.key + " ");//printing out the key last
       }
    }
    
}
