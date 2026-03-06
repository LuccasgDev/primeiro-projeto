package me.dio.primeiro_projeto.domian.repository;

import me.dio.primeiro_projeto.domian.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {}
