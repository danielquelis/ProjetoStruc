package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.dominio.Perfil;

public interface PerfilRepositorio extends JpaRepository<Perfil, Integer>{

}
