package com.myshoppingcart.persistence;

import com.myshoppingcart.exception.ProductNotFoundException;
import com.myshoppingcart.model.Compra;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.*;

@Repository
public class CompraDBRepository implements ICompraRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Compra insertCompra(Compra nuevaCompra) throws Exception {
        return null;
    }
}
