package ma.fsumi.jpafsumi.Repositories;
import ma.fsumi.jpafsumi.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}


