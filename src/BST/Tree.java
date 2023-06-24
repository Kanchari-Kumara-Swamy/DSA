package BST;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }

    public void levelOrder(){
        if(root != null){
            int height = height(root);
            for (int level = 1; level <= height; level++) {
                root.levelOrder(root, level);
                System.out.println();
            }
        }
    }

    private int height(TreeNode node) {
        if (node == null)
            return 0;
        int leftHeight = height(node.getLeftChild());
        int rightHeight = height(node.getRightChild());
        return Math.max(leftHeight, rightHeight) + 1;
    }



    public void preOrder(){
        if(root != null){
            System.out.print("Data : " );
            root.preOrder();
        }
    }

    public void inOrder(){
        if(root != null){
            System.out.print("Data : " );
            root.inOrder();
        }
    }

    public TreeNode getNode(int value){
        if(root != null){
            return root.getNode(value);
        }

        return null;
    }

    public void getMin(){
        if(root != null){
            System.out.println(root.min());
        }
    }

    public void getMax(){
        if(root != null){
            System.out.println(root.max());
        }
    }
}
