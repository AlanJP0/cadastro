package com.cadastro.cadastro.repository;

import com.cadastro.cadastro.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface UsuarioRepository extends JpaRepository <Usuario,Long> {
    ArrayList<Usuario> findAll();
    Usuario findById(long id);
    Usuario save(Usuario usuario);
    void deleteById(long id);
}
