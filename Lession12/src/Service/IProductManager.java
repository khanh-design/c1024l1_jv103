package src.Service;

import src.Entity.Product;

import java.util.ArrayList;

public interface IProductManager<E extends Product> {
    ArrayList<Product> getAll();
    void Add(E e);
    void Remove(int id);
    boolean Update(int id);
    ArrayList<E> SearchFindName(String name);
    ArrayList<E> SearchFindId(int id);
    void Sort(Double price);
}
