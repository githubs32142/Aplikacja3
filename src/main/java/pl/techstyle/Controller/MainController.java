package pl.techstyle.Controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@GetMapping("/")
	public ModelAndView getMain() {
		ModelAndView m = new ModelAndView();
		m.setViewName("index");
		return m;
	}
	@GetMapping("/someData")
	public ModelAndView someData(@RequestParam (value="name", required=true) String s) {
		ModelAndView m = new ModelAndView();
		m.addObject("name",s);
		m.setViewName("other");
		return m;
	}

}
