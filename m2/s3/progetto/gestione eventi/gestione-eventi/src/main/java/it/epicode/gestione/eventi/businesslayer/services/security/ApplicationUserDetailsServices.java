package it.epicode.gestione.eventi.businesslayer.services.security;

import it.epicode.gestione.eventi.datalayer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserDetailsServices implements UserDetailsService {
    @Autowired
    UserRepository users;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = users.findOneByUsername(username).orElseThrow();
        var applicationUser = SecurityUserDetails.build(user);
        return applicationUser;
    }
}
