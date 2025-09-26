package application;

import ports.UserRepository;

public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void createUser(String id, String name) {
        //implemente o metodo
    }


    public User getUser(String id) {
        //implemente o metodo
    }


    public List<User> listUsers() {
        //implemente o metodo
    }
}