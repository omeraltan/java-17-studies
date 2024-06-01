package org.basics.solid;

/**
 *  (Single Responsibility Principle)
 *  Her class kendi işini yapıyor.
 *  User            : Sadece kullanıcı bilgilerini tutar.
 *  UserRepository  : Kullanıcıları veritabanına kaydetmekle sorumludur.
 *  UserService     : Kullanıcı kayıt işlemlerini yönetir.
 */

class User {
    private String name;
    private String email;

    // Getters and setters
}

class UserRepository {
    public void save(User user) {
        // Save user to database
    }
}

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        // Perform user registration logic
        userRepository.save(user);
    }
}
