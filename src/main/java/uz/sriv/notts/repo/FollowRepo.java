package uz.sriv.notts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sriv.notts.entities.Follow;

public interface FollowRepo extends JpaRepository<Follow, Integer> {
}
