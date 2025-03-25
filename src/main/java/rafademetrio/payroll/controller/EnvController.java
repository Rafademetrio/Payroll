package rafademetrio.payroll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EnvController {

    @GetMapping("/env")
    public Map<String,String> getEnv(){
        return System.getenv();
    }
}
