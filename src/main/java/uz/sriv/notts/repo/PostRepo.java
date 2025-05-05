package uz.sriv.notts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sriv.notts.entities.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {
}
