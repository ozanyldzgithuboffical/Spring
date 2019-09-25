package ozan.yldz.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 Controller class extends Component class so component
 scan can see all the controller classes.We can call them also bean. 
 * 
 */
@Controller
public class HomeController {

	//This any request is accepted and default main-menu.jsp page is opened.
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
