package BST;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }


    @Override
    public String toString() {
        return "Data = " + data;
    }

    public void insert(int value) {
        if (value == data) return;

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        }

        if (value > data) {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void preOrder() {
        System.out.print(data + " ");

        if (leftChild != null) {
            leftChild.preOrder();
        }

        if (rightChild != null) {
            rightChild.preOrder();
        }
    }

    public void inOrder() {
        if (leftChild != null) {
            leftChild.inOrder();
        }

        System.out.print(data + " ");

        if (rightChild != null) {
            rightChild.inOrder();
        }
    }


    public void levelOrder(TreeNode node, int level) {
        if (node == null)
            return;
        if (level == 1) {
            System.out.print(node.data + " ");
        } else if (level > 1) {
            levelOrder(node.leftChild, level - 1);
            levelOrder(node.rightChild, level - 1);
        }
    }

    public TreeNode getNode(int value) {
        if (value == data) return this;

        if (value < data) {
            if (leftChild != null)
                return leftChild.getNode(value);
        } else {
            if (rightChild != null)
                return rightChild.getNode(value);
        }
        return null;
    }

    public int min(){
        if(leftChild == null) return this.data;
        return leftChild.min();
    }

    public int max(){
        if(rightChild == null) return this.data;
        return rightChild.max();
    }

    public void deleteNode(int value){
        if(value == data){
            if
        }
    }
}
