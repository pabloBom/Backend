package br.com.ilumiar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ilumiar.domain.City;
import br.com.ilumiar.domain.User;
import br.com.ilumiar.service.GenericService;


@RestController
@RequestMapping("/jwttest")
public class ResourceController {
    @Autowired
    private GenericService userService;

    @RequestMapping(value ="/cities")
    //@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<City> getUser(){
        return userService.findAllCities();
    }

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    //@PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers(){
        return userService.findAllUsers();
    }

}
