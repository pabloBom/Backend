package br.com.ilumiar.service;

import java.util.List;

import br.com.ilumiar.domain.City;
import br.com.ilumiar.domain.User;


public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<City> findAllCities();
}
