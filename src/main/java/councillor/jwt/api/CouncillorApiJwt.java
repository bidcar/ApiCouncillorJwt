package councillor.jwt.api;

import councillor.jwt.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CouncillorApiJwt {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
      //ejecuciones iniciales

    }

    public static void main(String[] args) {
        SpringApplication.run(CouncillorApiJwt.class, args);
    }

}
