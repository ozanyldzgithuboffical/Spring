package ozan.yldz.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/*
Controller class extends Component class so component
scan can see all the controller classes.We can call them also bean. 
* 
*/
@Controller
public class FormController {
	
	//Main Page
	@RequestMapping("/")
	public String showDefaultForm() {
		return "main-menu";
	}
	
	//Return to the form page
	@RequestMapping("showForm")
	public String showForm() {
		return "form";
	}

	//processes the form submit and return to view-form page
	@RequestMapping("/studentForm")
	public String studentForm(HttpServletRequest request,Model model) {
		//request is gathered
		String studentName=request.getParameter("studentName");
	
		studentName=studentName.toUpperCase();
		//message data
		String result="Hi "+studentName;
		//I add the data into model in key value pair format
		model.addAttribute("message",result);
		
		//go to form.jsp
		return "view-form";
	}
}
