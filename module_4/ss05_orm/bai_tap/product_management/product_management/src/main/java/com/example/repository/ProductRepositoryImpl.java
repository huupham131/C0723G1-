package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    public static final String SELECT_BY_NAME = "select * from product p where p.name like :name";
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getAll() {
        List<Product> products;
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p", Product.class);
        products = query.getResultList();
        return products;
    }

    @Transactional
    @Override
    public void createNew(Product product) {
        entityManager.persist(product);
    }

    @Transactional
    @Override
    public void update(int id, Product product) {
        Product product1 = getProduct(id);
        if(product1 != null){
            product1.setName(product.getName());
//            product1.setPrice(product.getPrice());
            product1.setDescription(product.getDescription());
            product1.setManufacturer(product.getManufacturer());
            entityManager.merge(product1);
        }
    }

    @Override
    public void delete(int id) {
        Product product = getProduct(id);
        if(product != null){
            entityManager.remove(product);
        }
    }

    @Override
    public Product getProduct(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products = new ArrayList<>();
        Query query = entityManager.createNativeQuery(SELECT_BY_NAME, Product.class);
        query.setParameter("name","%" + name +"%");
        products = query.getResultList();
        return products;
    }
}
