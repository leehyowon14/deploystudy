package likelion.deploystudy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {
    @GetMapping("/test")
    public String test() {
        return "성공입니다!";
    }
}
