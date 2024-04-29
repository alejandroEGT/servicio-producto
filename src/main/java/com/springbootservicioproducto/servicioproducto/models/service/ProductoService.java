package com.springbootservicioproducto.servicioproducto.models.service;

import com.springbootservicioproducto.servicioproducto.models.entity.Producto;

import java.util.List;

public interface ProductoService {
    public List<Producto> findAll();
    public Producto findById(long id);
}
