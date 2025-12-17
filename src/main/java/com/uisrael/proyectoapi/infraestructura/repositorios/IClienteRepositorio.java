package com.uisrael.proyectoapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.proyectoapi.infraestructura.persistencia.jpa.ClienteJpa;

public interface IClienteRepositorio extends JpaRepository<ClienteJpa, Integer>{

}
