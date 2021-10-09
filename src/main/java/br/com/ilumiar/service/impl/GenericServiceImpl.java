package br.com.ilumiar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ilumiar.domain.City;
import br.com.ilumiar.domain.User;
import br.com.ilumiar.repository.CityRepository;
import br.com.ilumiar.repository.UserRepository;
import br.com.ilumiar.service.GenericService;


@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<City> findAllCities() {
        return cityRepository.findAll();
    }
}
