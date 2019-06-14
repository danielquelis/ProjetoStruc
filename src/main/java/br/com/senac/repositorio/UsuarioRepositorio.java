package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.dominio.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	Usuario findByNome(String nome);
	
	Usuario findByEmail(String email);
	
	Usuario findByEmailAndSenha(String email, String senha);
	
	Usuario findFurado(String email, String senha);

}
