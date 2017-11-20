package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Anuncios;


@Repository("anuncioRepository")
public interface AnunciosRepository extends JpaRepository<Anuncios, Serializable>{
	
public abstract Anuncios findById(Integer anuncioId);
	

}
