

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

## Announcement
- Overview of Deep Learning, **Dimension Reduction** , **Model Selection** , **XGBoot** topics will be under **Deep Learning Repo** 
- **Convolutional Neural Networks (CNN)** will be under **Artificial Intelligence Repo (AI)** 
- **Computer Vision** , **Self Autonomous Driving** with Tensorflow-Keras & Computer Vision & Deep Learning Repos will be also shared 
- **Kubernates** repo will be also shared 
- You can also check out Java Spring Framework series which will include **Spring Core,Spring MVC,Spring Boot** repo under
[Java Spring Framework Repo](https://github.com/ozanyldzgithuboffical/Spring)
- You can also check out Machine Learning series which will include **Machine Learning Basis,Prediction,Pre-Processing,Regression,Classification,Clustring & Reinforcement Learning** techniques.
[Machine Learning Repo](https://github.com/ozanyldzgithuboffical/OzanYldzML)
- You can also check out Natural Language Processing (NLP) series.
[Natural Language Processing (NLP)](https://github.com/ozanyldzgithuboffical/NLP-Natural-Language-Processing-)
- **Computer Vision with Deep Learning** repo will be also available later.
- **Spring Microservices with Spring Cloud** repo will be also available later. 
- **Computer Vision on Deep Learning Repo** is available now.
[Computer Vision on Deep Learning Repo](https://github.com/ozanyldzgithuboffical/ComputerVisiononDeepLearning)

## About the Repo
- It basically takes an input from the form.The training aim is to reach the correct controller's method.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate. Thanks.

**OZAN YILDIZ**
-Computer Engineer at HAVELSAN Ankara/Turkey 
**Linkedin**
[Ozan YILDIZ Linkedin](https://www.linkedin.com/in/ozan-yildiz-b8137a173/)

## License
[MIT](https://choosealicense.com/licenses/mit/)
