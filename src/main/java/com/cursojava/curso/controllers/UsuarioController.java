package com.cursojava.curso.controllers;

import com.cursojava.curso.controllers.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(33L);
        usuario.setNombre("Saul");
        usuario.setApellido("Osorio");
        usuario.setEmail("saul_osorio_a@hotmail.com");
        usuario.setTelefono("1234567");
        return usuario;

    }

    @RequestMapping(value="usuario")
    public List<Usuario> getUsuario(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Saul");
        usuario.setApellido("Osorio");
        usuario.setEmail("saul_osorio_a@hotmail.com");
        usuario.setTelefono("1234567");

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Fernando");
        usuario2.setApellido("Beltran");
        usuario2.setEmail("ferbeltrana@hotmail.com");
        usuario2.setTelefono("33211");

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Raul");
        usuario3.setApellido("Gonzalez");
        usuario3.setEmail("ragonzalez@hotmail.com");
        usuario3.setTelefono("98765");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;

    }

    @RequestMapping(value="usuario123")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Saul");
        usuario.setApellido("Osorio");
        usuario.setEmail("saul_osorio_a@hotmail.com");
        usuario.setTelefono("1234567");
        return usuario;

    }

    @RequestMapping(value="usuario456")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Saul");
        usuario.setApellido("Osorio");
        usuario.setEmail("saul_osorio_a@hotmail.com");
        usuario.setTelefono("1234567");
        return usuario;

    }

    @RequestMapping(value="usuario789")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Saul");
        usuario.setApellido("Osorio");
        usuario.setEmail("saul_osorio_a@hotmail.com");
        usuario.setTelefono("1234567");
        return usuario;

    }

    @RequestMapping(value="comida")
    public List<String> comida(){
        return List.of("esta es la lista del super", "Kiwi", "Pera", "Limon");

    }

}
