package com.springbootservicioproducto.servicioproducto.models.dao;

import com.springbootservicioproducto.servicioproducto.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDAO extends CrudRepository<Producto, Long> {

}
