package uz.sriv.notts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sriv.notts.entities.Like;

import java.util.UUID;

public interface LikeRepo extends JpaRepository<Like, UUID> {
}
