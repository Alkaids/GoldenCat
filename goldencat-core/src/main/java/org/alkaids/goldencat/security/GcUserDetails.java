package org.alkaids.goldencat.security;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by gravel on 2018/6/11.
 */
@Data
public class GcUserDetails implements UserDetails {
    private String id;
    private String username;
    private String screenName;
    private String password;
    private String mail;
    private String userIcon;
    private boolean enabled;
    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public GcUserDetails(String id, String username, String password, String mail,String userIcon, boolean enabled, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.userIcon =userIcon;
        this.enabled = enabled;
        this.authorities = authorities;
    }

    @Override
    public String getPassword() {
        return password;
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
}