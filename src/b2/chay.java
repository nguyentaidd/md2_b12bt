package b2;

public class chay {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);
        bt.insert(3);
        bt.insert(10);
        bt.insert(9);
        bt.insert(15);
        bt.postOrder(bt.getRoot());
    }
}
