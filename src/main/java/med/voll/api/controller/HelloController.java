package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* Indica que é um controller do tipo REST */
@RequestMapping("/hello") /* endpoint*/
public class HelloController {

    @GetMapping /* Indica que é uma Requisição do tipo GET */
    public String olaMundo() {
        return "Hello World! Spring";
    }

}
