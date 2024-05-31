package it.epicode.gestione.eventi.businesslayer.services;

import it.epicode.gestione.eventi.details.UserDetailsImpl;
import it.epicode.gestione.eventi.datalayer.entities.UserEntity;
import it.epicode.gestione.eventi.datalayer.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username);
        if (user != null) {
            return UserDetailsImpl.build(user);
        } else {
            throw new UsernameNotFoundException("User Not Found with username: " + username);
        }
    }
}
