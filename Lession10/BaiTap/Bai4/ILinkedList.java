package BaiTap.Bai4;

public interface ILinkedList {
    void addFirstNode(Node node);
    void addLastNode(Node node);
    int size();
    void clear();
    Node getFirstNode();
    Node getLastNode();
    void removeFirstNode(Node node);;
}
