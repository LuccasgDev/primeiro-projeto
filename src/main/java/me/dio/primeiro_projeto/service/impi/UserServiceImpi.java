package me.dio.primeiro_projeto.service.impi;

import me.dio.primeiro_projeto.domian.model.UserModel;
import me.dio.primeiro_projeto.domian.repository.UserRepository;
import me.dio.primeiro_projeto.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpi implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserModel findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public UserModel create(UserModel userToCreate) throws IllegalAccessException {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalAccessException("THIS ACCOUNT NUMBER ALREADY EXISTS");
        }
        return userRepository.save(userToCreate);
    }
}
