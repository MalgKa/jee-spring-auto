package pl.coderslab.beans;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
    //konstruktor z lomboka
@RequiredArgsConstructor
public class PersonService {
    //   1 sposób bez lomboka
//    private PersonRepository personRepo;
//
//    public PersonService(PersonRepository personRepo) {
//        this.personRepo = personRepo;
//    }
//2 sposób z lombokiem
    private final PersonRepository personRepo;
}
