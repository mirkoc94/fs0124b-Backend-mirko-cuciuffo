package it.epicode.GestionePrenotazioni.dao;

import it.epicode.GestionePrenotazioni.entities.User;
import it.epicode.GestionePrenotazioni.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class JpaUserDao implements UserDao {

    @Autowired
    UserRepository repo;

    @Override
    public void insert(User user) {
        log.info("JpaUserDao.insert()");
        repo.save(user);
    }

    @Override
    public void update(User user) {
        log.info("JpaUserDao.update()");
        repo.save(user);
    }

    @Override
    public void delete(Integer id) {
        log.info("JpaUserDao.delete()");
        repo.deleteById(id);
    }

    @Override
    public User getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<User> getByUserame(String username) {
        return repo.findByUsername(username);
    }

    @Override
    public List<User> getByEmail(String email) {
        return repo.findByEmail(email);
    }
}
