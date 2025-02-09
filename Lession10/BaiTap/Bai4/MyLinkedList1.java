package BaiTap.Bai4;


public class MyLinkedList1 implements ILinkedList {
    protected Node firstNode;
    protected Node lastNode;
    protected int totalNode;

    public MyLinkedList1() {
        firstNode = null;
        lastNode = null;
        totalNode = 0;
    }

    @Override
    public void addFirstNode(Node node) {
        if (firstNode != null) {
            node.next = firstNode;
            firstNode = node;
        } else {
            firstNode = node;
            lastNode = node;
        }
        totalNode++;
    }

    @Override
    public void addLastNode(Node node) {
        if (lastNode != null) {
            lastNode.next = node;
        } else {
            firstNode = node;
        }
        lastNode = node;
        totalNode++;
    }

    @Override
    public int size() {
        return totalNode;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        totalNode = 0;
    }

    @Override
    public Node getFirstNode() {
        return firstNode;
    }

    @Override
    public Node getLastNode() {
        return lastNode;
    }

    @Override
    public void removeFirstNode(Node node) {
        if (firstNode != null) {
            firstNode = firstNode.next;
            if (firstNode == null) {
                lastNode = null;
            }
            totalNode--;
        }
    }
}
