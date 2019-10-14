package ozan.yldz.spring.mvc;
/*
Controller class extends Component class so component
scan can see all the controller classes.We can call them also bean. 
* 
*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {
	
	@RequestMapping("/mainmenu")
	public String showDefaultForm() {
		return "main-menu";
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Customer customer=new Customer();
		//Add the model instance to send the form as modelattribute of the form
		model.addAttribute("customer",customer);
		return "form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("customer") Customer customer) {
		return "view-form";
	}
}
