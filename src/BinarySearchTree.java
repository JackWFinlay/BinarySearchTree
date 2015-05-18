/**
 * Created by jack on 19/05/15.
 */
public class BinarySearchTree {



    protected BinarySearchTree parent,left,right;
    protected String name;
    protected int mark;

    public BinarySearchTree(){
        left = null;
        right = null;
        name = null;
        mark = 0;

    }

    public BinarySearchTree(String name, int mark){
        this.left = null;
        this.right = null;

        this.name = name;
        this.mark = mark;

    }

    public BinarySearchTree getParent() {
        return parent;
    }

    public void setParent(BinarySearchTree parent) {
        this.parent = parent;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
        left.setParent(this);
    }

    public BinarySearchTree getRight() {
        return right;
    }

    public void setRight(BinarySearchTree right) {
        this.right = right;
        right.setParent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }



}
