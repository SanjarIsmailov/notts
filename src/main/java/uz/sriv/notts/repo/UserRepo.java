package uz.sriv.notts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sriv.notts.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
}
