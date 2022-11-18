package dio.estudoSpringDataJpa;

import dio.estudoSpringDataJpa.model.User;
import dio.estudoSpringDataJpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Pedro");
        user.setUsername("PedroC0sta");
        user.setPassword("123456");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
