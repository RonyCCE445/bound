package io.github.ronycce445.bound.repository;
import io.github.ronycce445.bound.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}