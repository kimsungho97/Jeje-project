package Jeje_project.Jeje_project.User_repository;

import Jeje_project.Jeje_project.Dog_domain.MyDog;
import Jeje_project.Jeje_project.User_domain.Dog_Owner;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Dog_Owner_Repository {

    Dog_Owner save_dog_owner(Dog_Owner dog_owner);
    List<MyDog> mydog_all(Long do_id);
    List<MyDog> search_mydog(Long do_id, String name);

}
