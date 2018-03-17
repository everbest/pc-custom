package pcCustom;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sjj on 2018/3/17.
 */

@Controller
@EnableAutoConfiguration
public class HelloTest {
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello pc-custome";
    }
    public static void main(String args[]) {
        SpringApplication.run(HelloTest.class);
    }

}
