package src.Repository;

import src.Entity.Product;

import java.util.ArrayList;

public class ProductRepository {
    private static final ArrayList<Product> products = new ArrayList<Product>();
    public ArrayList<Product> getAll() {
        return products;
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(int id) {
        ArrayList<Product> products1 = getAll();
        for (Product product : products1) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }

    public boolean update(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Product> SearchFindName(String name) {
        ArrayList<Product> result = new ArrayList<Product>();
        ArrayList<Product> products1 = getAll();
        for (Product product : products1) {
            if (product.getName().contains(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public ArrayList<Product> SearchFindId(int id) {
        ArrayList<Product> result = new ArrayList<Product>();
        ArrayList<Product> products1 = getAll();
        for (Product product : products1) {
            if (product.getId() == id) {
                result.add(product);
            }
        }
        return result;
    }

    public Product BubbleSort(Double price) {
        ArrayList<Product> products1 = getAll();
        for (int i = 0; i < products1.size() - 1; i++) {
            for (int j = 0; j < products1.size() - i - 1; j++) {
                if (products1.get(j).getPrice() > products1.get(j + 1).getPrice()) {
                    Product temp = products1.get(j);
                    products1.set(j, products1.get(j + 1));
                    products1.set(j + 1, temp);
                }
            }
        }
        if (products1.isEmpty()) {
            return null;
        }
        return products1.get(0);
    }
}
