package ma.fsumi.jpafsumi.web;
import ma.fsumi.jpafsumi.entities.User;
import ma.fsumi.jpafsumi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users/{username}")
    public User user(@PathVariable String username){
        return userService.findUserByUserName(username);
    }
}

