/**
 * Created by jack on 19/05/15.
 */
public class BinarySearchTree<E extends Comparable<E>> {

    BinaryTree<E> root;
    int size;

    public BinarySearchTree(){
        root = new BinaryTree<E>();
        size = 0;
    }

    public void add(E value, int mark) {
        BinaryTree<E> addLoc = locate(root, value);
        if (value.compareTo((E) addLoc.getName()) == 0) {
            return;
        }

        BinaryTree<E> newNode = new BinaryTree<E>((String) value, mark);

        if (root.isEmpty()) {
            root = newNode;
        } else {
            if (value.compareTo((E) addLoc.getName()) > 0) {
                addLoc.setRight(newNode);
            } else {
                addLoc.setLeft(newNode);
            }
        }
    }

    public E remove(E value) {
        return (E) "";
    }

    public boolean contains(E value) {
        if (root.isEmpty()) {
            return false;
        }
        BinaryTree<E> loc = locate(root, value);
        return value.equals(loc.getName());
    }

    public E get(E value) {
        if (root.isEmpty()) {
            return null;
        }

        BinaryTree<E> loc = locate(root, value);
        if (!value.equals(loc.getName())) {
            return null;
        } else {
            return (E) loc.getName();
        }
    }

    protected BinaryTree<E> locate(BinaryTree<E> root, E val) {
        E rootVal = (E) root.getName();
        BinaryTree<E> child;

        if (rootVal.equals(val)) {
            return root;
        }
        if (val.compareTo(rootVal) < 0) {
            child = root.getLeft();
        } else {
            child = root.getRight();
        }
        if (child.isEmpty()) return root;
        else return locate(child, val);
    }

}
