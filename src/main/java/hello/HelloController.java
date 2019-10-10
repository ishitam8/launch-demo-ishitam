package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        System.out.println("New line changed code added");
        return "Hello from Spring boot!";
    }
	
	@RequestMapping("/logout")
    public String logout() {
        //System.out.println("New line changed code added");
        return "Logout API invoked from deployment! Change logout text!";
    }
    
	@RequestMapping("/login")
    public String login() {
        //System.out.println("New line changed code added");
        return "Login API invoked from deployment";
    }
}
