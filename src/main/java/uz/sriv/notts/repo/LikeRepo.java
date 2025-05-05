package uz.sriv.notts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sriv.notts.entities.Like;

public interface LikeRepo extends JpaRepository<Like, Integer> {
}
