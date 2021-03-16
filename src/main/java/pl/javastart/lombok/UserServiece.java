package pl.javastart.lombok;

import org.springframework.stereotype.Service;

@Service
public class UserServiece {

    public User createUser() {
        User user = new User();
        user.setFirstName("Marcin");
        user.setLastName("Kowalski");
        user.setAge(55);

        User user2 = new User(null, "Marcin", "Kowalski", 55);

        //tworzenie obiektu za pomocą buildera
        User user3 = User.builder()
                .firstName("Rafał")
                .lastName("Kowalski")
                .age(50)
                .build();

        return user;
    }
}
