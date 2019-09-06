package pcfdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PCFController {
	
	@GetMapping(value = "greet/{name}")
	  public String elements(@PathVariable String name) {
		return "Hello " + name; 
		}
	  }


