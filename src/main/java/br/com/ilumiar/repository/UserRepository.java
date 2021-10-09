package br.com.ilumiar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilumiar.domain.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
