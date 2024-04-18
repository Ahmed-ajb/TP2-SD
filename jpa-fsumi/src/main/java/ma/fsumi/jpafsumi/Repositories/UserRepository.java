package ma.fsumi.jpafsumi.Repositories;
import ma.fsumi.jpafsumi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
