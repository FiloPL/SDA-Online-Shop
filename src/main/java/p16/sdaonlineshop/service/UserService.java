package p16.sdaonlineshop.service;

import org.springframework.stereotype.Service;
import p16.sdaonlineshop.model.User;
import p16.sdaonlineshop.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public User addNewUser(String name, String lastName, String email, String password){
        User newUser = new User(name, lastName, email, password);
        return userRepository.save(newUser);
    }
}
