/**
 *
 * @author gladysarias
 */
public class AVLTreeDriver {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

//        // TODO: Insert test values
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        // TODO: Add more insertions to test all 4 rotation cases
        tree.insert(7);
        tree.insert(4);  // LL case


        tree.insert(40);
        tree.insert(37); // RL case
        tree.insert(35); // LR case
        
        // TODO: Print traversals
        System.out.print("Inorder: ");
        tree.inorder();

        System.out.print("Preorder: ");
        tree.preorder();

        System.out.print("Postorder: ");
        tree.postorder();

        
    }
}
