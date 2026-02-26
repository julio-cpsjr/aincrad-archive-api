package br.com.aincrad.users.repository;

import br.com.aincrad.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
