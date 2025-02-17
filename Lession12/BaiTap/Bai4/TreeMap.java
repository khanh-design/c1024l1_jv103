package BaiTap.Bai4;

import javax.swing.tree.TreeNode;

public class TreeMap<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeMap(E e) {
        element = e;
    }


}
