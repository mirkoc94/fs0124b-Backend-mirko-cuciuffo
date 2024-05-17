package it.epicode.GestionePrenotazioni.dao;


import it.epicode.GestionePrenotazioni.entities.User;

import java.util.List;

public interface UserDao {
    public void insert(User user); // Create

    public void update(User user); // Update

    public void delete(Integer id); // Delete

    public User getById(Integer id); // Read

    public List<User> getByUserame(String username);
    public List<User> getByEmail(String email);
}
