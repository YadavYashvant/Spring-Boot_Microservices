@RestController
//@CrossOrigin('*')
public class MyController {

    @GetMapping("/greet")
    public String testController() {
          return "Hi, welcome I am Yashvant Yadav!";
    }
}