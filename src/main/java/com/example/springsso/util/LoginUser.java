package com.example.springsso.util;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.Map;

public class LoginUser implements OAuth2User {

    private OAuth2User oAuth2User;
    private String name;
    private String email;
    private String picture;

    public LoginUser(OAuth2User oAuth2User) {
        this.oAuth2User = oAuth2User;
        this.name = oAuth2User.getName();
        this.email = oAuth2User.getAttribute("email");
        this.picture = oAuth2User.getAttribute("picture");
    }

    @Override
    public Map<String, Object> getAttributes() {
        return oAuth2User.getAttributes();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return oAuth2User.getAuthorities();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPicture() {
        return this.picture;
    }
}
