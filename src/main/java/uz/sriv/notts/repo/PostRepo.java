package uz.sriv.notts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sriv.notts.entities.Post;

import java.util.UUID;

public interface PostRepo extends JpaRepository<Post, UUID> {
}
