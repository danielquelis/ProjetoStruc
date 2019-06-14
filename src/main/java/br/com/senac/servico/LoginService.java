package br.com.senac.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.dominio.Usuario;
import br.com.senac.repositorio.UsuarioRepositorio;

@Service
public class LoginService {
	
	@Autowired
	private UsuarioRepositorio repoUsuario;

	public boolean login(Usuario usuario) {
		Usuario usuarioLogado = repoUsuario.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		if (usuarioLogado == null) {
			return false;
		}
		return true;
	}
	
	public boolean login-furado(Usuario usuario) {
		Usuario usuarioLogado = repoUsuario.findFurado(usuario.getEmail(), usuario.getSenha());
		if (usuarioLogado == null) {
			return false;
		}
		return true;
	}
	
}
