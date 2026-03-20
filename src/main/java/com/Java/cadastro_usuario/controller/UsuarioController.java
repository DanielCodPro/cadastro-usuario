package com.Java.cadastro_usuario.controller;

import com.Java.cadastro_usuario.Infrastructure.entitys.Usuario;
import com.Java.cadastro_usuario.business.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/usuario")
    @RequiredArgsConstructor

   public class UsuarioController{

         private final UsuarioService usuarioService;

         @PostMapping
        public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
             usuarioService.salvarUsuario(usuario);
             return ResponseEntity.ok().build();
         }
         @GetMapping
    public ResponseEntity<Usuario> buscarPorEmail(@RequestParam String email){
             return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
         }
         @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email){
             usuarioService.deletarUsuarioPorEmail(email);
             return ResponseEntity.ok().build();

         }
         @PutMapping
        public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id, @RequestBody Usuario usuario){
             usuarioService.atualizarUsuarioPorId(id,usuario);
             return ResponseEntity.ok().build();

         }
         }


