package br.com.mappy.mappyapi.security.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.mappy.mappyapi.model.Usuario;

public class NossaUserDetails  implements UserDetails{
    
    private Usuario usuario1;

    public NossaUserDetails(Usuario usuario) {
        this.usuario1 = usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.usuario1.getPassword();
    }

    @Override
    public String getUsername() {
        return this.usuario1.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
       return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
    
}
