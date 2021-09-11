package com.example.springsso.service;

import com.example.springsso.util.LoginUser;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class AuthenticationService extends DefaultOAuth2UserService {

    @Override
    public LoginUser loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User user = super.loadUser(userRequest);

        return new LoginUser(user);
    }

}
