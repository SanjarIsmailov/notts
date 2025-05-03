package uz.sriv.notts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sriv.notts.entities.User;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
}
