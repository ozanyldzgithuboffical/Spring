package ozan.yldz.spring.mvc;
/*
Controller class extends Component class so component
scan can see all the controller classes.We can call them also bean. 
* 
*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/")
	public String showDefaultForm() {
		return "main-menu";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "view-form";
	}
}
