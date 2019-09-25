

# Spring MVC

- **Spring MVC** (Modal-View-Controller) is simply a Spring's technology to create web pages with the written reusable form components

## Project Configuration

- Create your dynamic web project 
- Define your own package names in src folder.Plus,you can also change your root package name from servlet.xml inside component-scan base-package name
- Put your **FormController.java** and **package-info.java** into src folder under the specified package
- Put **web.xml** and **spring-mvc-servlet.xml** into **WEB-INF** folder
- Put jsp page files under **WEB-INF/view** folder
- Create your server to run

## Some Useful Code Snippet Info

- Controller class extends Componentso we can simple call them bean classes.

```java

@Controller
public class FormController {
//to-do smth
}
```
- @RequestMapping annotation is used to handle requests.Return value is the name of the jsp file declared in view resolver in servlet.xml

```java
@RequestMapping("/")
	public String showDefaultForm() {
		return "main-menu";
	}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate. Thanks.

**OZAN YILDIZ**

## License
[MIT](https://choosealicense.com/licenses/mit/)
