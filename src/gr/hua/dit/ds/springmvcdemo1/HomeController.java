package gr.hua.dit.ds.springmvcdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
