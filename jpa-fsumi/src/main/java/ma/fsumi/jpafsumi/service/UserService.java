package ma.fsumi.jpafsumi.service;
import ma.fsumi.jpafsumi.entities.Role;
import ma.fsumi.jpafsumi.entities.User;
public interface UserService {

    User  addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String username);

    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username , String roleName);
    User authenticate(String username , String password);
}
