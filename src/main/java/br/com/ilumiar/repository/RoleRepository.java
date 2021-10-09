package br.com.ilumiar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilumiar.domain.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
}
