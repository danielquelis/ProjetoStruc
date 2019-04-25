package br.com.senac.inicializacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import br.com.senac.dominio.Perfil;
import br.com.senac.dominio.Usuario;
import br.com.senac.repositorio.PerfilRepositorio;
import br.com.senac.repositorio.UsuarioRepositorio;

public class Init implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	@Autowired
	PerfilRepositorio perfilRepositorio;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Usuario padrao = new Usuario();
		padrao.setNome("admin");
		padrao.setSobrenome("");
		padrao.setEmail("admin@senac.com");
		padrao.setSenha("1234");
		
		List<Usuario> users_admin = new ArrayList<>();
		users_admin.add(padrao);
		
		Perfil administrador = new Perfil();
		administrador.setNome("Administrador");
		administrador.setUsuarios(users_admin);
		
		usuarioRepositorio.save(padrao);
		perfilRepositorio.save(administrador);
		
	}

}
