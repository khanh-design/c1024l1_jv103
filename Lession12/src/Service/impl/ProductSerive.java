package src.Service.impl;

import src.Entity.Product;
import src.Repository.ProductRepository;
import src.Service.IProductManager;

import java.util.ArrayList;

public class ProductSerive implements IProductManager {
    private static ProductRepository productRepository = new ProductRepository();
    @Override
    public ArrayList<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void Add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void Remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public boolean Update(int id) {
        return productRepository.update(id);
    }

    @Override
    public ArrayList<Product> SearchFindName(String name) {
        return productRepository.SearchFindName(name);
    }

    @Override
    public ArrayList<Product> SearchFindId(int id) {
        return productRepository.SearchFindId(id);
    }

    @Override
    public void Sort(Double price) {
        productRepository.BubbleSort(price);
    }
}
