package net.javaguides.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import net.javaguides.springboot.User;

@Controller
public class UserController {

	@GetMapping("/if-unless")
	public String users(Model model) {
		List<User> users = new ArrayList<>();
		users.add(new User("Ramesh", "ramesh@gmail.com", "ADMIN"));
		users.add(new User("Tom", "tom@gmail.com", "USER"));
		users.add(new User("John", "john@gmail.com", "USER"));
		model.addAttribute("users", users);
		return "if-unless";
	}

	@GetMapping("/switch-case")
	public String switchExample(Model model) {
		User user = new User("Ramesh", "ramesh@gmail.com", "ADMIN");
		model.addAttribute("user", user);
		return "switch-case";
	}
}
