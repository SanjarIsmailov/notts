package uz.sriv.notts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sriv.notts.entities.Follow;

import java.util.UUID;

public interface FollowRepo extends JpaRepository<Follow, UUID> {
}
