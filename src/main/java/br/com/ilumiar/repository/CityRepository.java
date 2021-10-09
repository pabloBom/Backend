package br.com.ilumiar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilumiar.domain.City;


public interface CityRepository extends JpaRepository<City, Long> {
}
