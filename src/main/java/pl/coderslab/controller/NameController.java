package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NameController {

    @GetMapping(value = "/hello/{firstName}/{lastName}")
    @ResponseBody
    private String hello(@PathVariable("firstName") String firstName,
                         @PathVariable("lastName") String lastName){
        return "Witaj "+ firstName + " " + lastName;
    }
}
