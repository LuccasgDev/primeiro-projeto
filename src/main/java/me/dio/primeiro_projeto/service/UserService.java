package me.dio.primeiro_projeto.service;

import me.dio.primeiro_projeto.domian.model.UserModel;

public interface UserService {
    UserModel findUserById(Long id);
    UserModel create(UserModel userToCreate) throws IllegalAccessException;
}
