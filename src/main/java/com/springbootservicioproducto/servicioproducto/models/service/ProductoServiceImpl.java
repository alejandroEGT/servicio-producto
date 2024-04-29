package com.springbootservicioproducto.servicioproducto.models.service;

import com.springbootservicioproducto.servicioproducto.models.dao.ProductoDAO;
import com.springbootservicioproducto.servicioproducto.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoDAO productoDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(long id) {
        return productoDAO.findById(id).orElse(null);
    }
}
