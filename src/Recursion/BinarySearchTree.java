package Recursion;

import java.util.ArrayList;
import java.util.List;

class BinarySearchTree<T extends Comparable<T>> {      // na durvoto slagame Comparable za da mojem da sravnqvame, zashtoto inache ne stava
    private TreeNode<T> root;     // tova ni e korena na durvoto
    private int size;             // tova e razmera na durvoto

    BinarySearchTree(){                 // tova ni e constructora
        root = null;
        size = 0;
    }
    public void add(T value){
        TreeNode<T> node = new TreeNode<>(value);
        if(root == null){
            root = node;
            return;
        }
        TreeNode<T> current = root;
        while(true){
            if(node.getValue().compareTo(current.getValue()) == 0){      // tova ni prechi da dobavqme povtarqshti se chisla
                System.out.println("Cannot add same number");
                break;
            }
            if(node.getValue().compareTo(current.getValue()) < 0){   // kogato node < current vrushta otricatelno chislo, inache obratnoto, ako sa ravni 0
                if(current.getLeft() == null){
                    TreeNode<T> newNode = new TreeNode<>(value);
                    node.setLeft(newNode);
                    newNode.setParent(node);
                    break;      // za da spre while loopa
                }
                current = current.getLeft();
                // go left
            }else{
                if(current.getRight()==null){
                    current.setRight(node);
                    break;
                }
                current = current.getRight();
                //go right
            }
        }
    }

    public List<T> getAllEllements(){
        List<T> values = new ArrayList<>();
        traverse(root, values);
        return values;
    }

    private void traverse(TreeNode<T> node, List<T> values) {           // tova e metoda za inOrder, t.e. da mi sortira int posledovatelno
        if(node==null){
            return;
        }
        traverse(node.getLeft(), values);
        values.add(node.getValue());
        traverse(node.getRight(), values);
    }

    public boolean contains(T value){
        return containsTraverse(root, value);            // zapochva ot ROOT za da proverim cqloto tree
    }

    private boolean containsTraverse (TreeNode<T> node, T value){
        if(node == null){
            return false;
        }
        if(value.compareTo(node.getValue()) == 0){
            return true;
        }
        if(value.compareTo(node.getValue()) < 0) {
            return containsTraverse(node.getLeft(), value);
        }else{
            return containsTraverse(node.getRight(), value);
        }
    }

    public void remove(T value){
        if(!contains(value)){
            return;
        }
        TreeNode<T> nodeToRemove = findNode(root, value);
        TreeNode<T> ReplacementNode = findSmallestLarger(value, nodeToRemove);  // trugvame nadqsno ot korena
        if(ReplacementNode == null){
            if(nodeToRemove.getValue().compareTo(nodeToRemove.getParent().getValue()) < 0){
                nodeToRemove.getParent().setLeft(null);
            }else{
                nodeToRemove.getParent().setRight(null);
            }
            return;
        }

        while(ReplacementNode.getLeft() != null){
            ReplacementNode = ReplacementNode.getLeft();
        }
        nodeToRemove.setValue(ReplacementNode.getValue());

        ReplacementNode.getParent().setLeft(nodeToRemove.getRight());

        if(nodeToRemove.getRight() != null){
            ReplacementNode.getRight().setParent(ReplacementNode.getParent());
        }
    }

    private TreeNode<T> findSmallestLarger(T value, TreeNode<T> node) {
        if(node.getRight() == null){
            return null;
        }
        node = node.getRight(); // trugvame nadqsno

        while(node.getLeft() != null){
            node = node.getLeft();
        }
        return node;
    }

    private TreeNode<T> findNode(TreeNode<T> node, T value) {    // root, value(8)
        if(value.compareTo(node.getValue()) == 0){
            return node;
        }
        if(value.compareTo(node.getValue()) < 0){
            return findNode(node.getLeft(), value);
        }else{
            return findNode(node.getRight(), value);
        }
    }


    class TreeNode<T extends Comparable<T>>{
        T value;
        TreeNode<T> parent;             // tova e parenta
        //List<BinarySearchTree<T>> children;        // tova sa naslednicite ako ne e binary tree
        TreeNode<T> left;                          // tova sa dvata naslednika pri binary tree
        TreeNode<T> right;

        public TreeNode(T value){
            setValue(value);
            setLeft(null);
            setRight(null);
            setParent(null);
        }

        public T getValue(){
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setLeft(TreeNode<T> left) {
            this.left = left;
        }

        public void setRight(TreeNode<T> right) {
            this.right = right;
        }

        public TreeNode<T> getRight(){
            return right;
        }

        public TreeNode<T> getLeft(){
            return left;
        }

        public void setParent(TreeNode<T> parent) {
            this.parent = parent;
        }

        public TreeNode<T> getParent(){
            return parent;
        }
    }



    public static void main(String[] args){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();      // tuk si suzdavame durvo
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
//        System.out.println(tree.contains(5));
//        System.out.println(tree.contains(3));
//        System.out.println(tree.contains(1));
//        System.out.println(tree.contains(4));
//        System.out.println(tree.contains(-9));
        System.out.println(tree.getAllEllements());
        //tree.getAllEllements()
                //.forEach(System.out::println);
        tree.remove(5);
        System.out.println(tree.getAllEllements());
    }
}
