package ma.fsumi.jpafsumi;
import ma.fsumi.jpafsumi.entities.Role;
import ma.fsumi.jpafsumi.entities.User;
import ma.fsumi.jpafsumi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;
@SpringBootApplication
public class JpaFsumiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaFsumiApplication.class, args);
	}

	@Autowired
	private UserService userService ;
	@Override
	public void run(String... args) throws Exception {
		User u = new User();
		u.setUsername("ahmed");
		u.setPassword("123456");
		userService.addNewUser(u);

		User u2 = new User();
		u2.setUsername("admin");
		u2.setPassword("123456");
		userService.addNewUser(u2);

		Stream.of("STUDENT" , "USER" , "ADMIN").forEach(r->{
			Role role1 = new Role();
			role1.setRoleName(r);
			userService.addNewRole(role1);
		});

		userService.addRoleToUser("ahmed" ,"STUDENT");
		userService.addRoleToUser("ahmed" ,"USER");
		userService.addRoleToUser("admin" ,"ADMIN");
		userService.addRoleToUser("admin" ,"USER");

		try {
			User user = userService.authenticate("admin","123456" );
			System.out.println(user.getUserId());
			System.out.println(user.getUsername());
			user.getRoles().forEach(r ->{
				System.out.println("Role => " +r.toString());
			});
		}catch (Exception exception){
			exception.printStackTrace();
		}
		}
	}

