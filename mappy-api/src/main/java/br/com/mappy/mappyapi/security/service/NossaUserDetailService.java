package br.com.mappy.mappyapi.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.mappy.mappyapi.model.Usuario;
import br.com.mappy.mappyapi.repository.UsuarioRepository;

public class NossaUserDetailService  implements UserDetailsService{
    @Autowired
    UsuarioRepository usuarioRepository;

     @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuarioCredenciais = usuarioRepository.findByUsername(username);
        if(usuarioCredenciais == null)
            throw new UsernameNotFoundException(username);

        return new NossaUserDetails(usuarioCredenciais);
    }   
}
