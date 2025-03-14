package com.myshoppingcart.persistence;

import com.myshoppingcart.exception.ProductNotFoundException;
import com.myshoppingcart.model.Producto;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoDBRepository implements IProductoRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Producto getProduct(int id) throws Exception {
        return null;
    }

    @Override
    public List<Producto> getProducts() throws Exception {
        return List.of();
    }

    @Override
    public List<Producto> getUserProducts(int uid) throws Exception {
        return List.of();
    }

    @Override
    public Producto insertarProducto(Producto prod) throws Exception {
        return null;
    }

    @Override
    public Producto actualizarProducto(Producto prod) throws Exception {
        return null;
    }

    @Override
    public boolean borrarProducto(Producto prod) throws Exception {
        return false;
    }
}

