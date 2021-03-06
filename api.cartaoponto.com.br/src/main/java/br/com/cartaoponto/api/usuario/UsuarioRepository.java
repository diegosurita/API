package br.com.cartaoponto.api.usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	public List<UsuarioEntity> findById(int id);
}
