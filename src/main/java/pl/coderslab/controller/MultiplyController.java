package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MultiplyController {

    @GetMapping(value = "/multiply", produces = "text/plain;charset=UTF-8")
    public String multiply(Model model, @RequestParam(value = "size",defaultValue = "10") int size){
        model.addAttribute("rows", size);
        model.addAttribute("colm", size);
        return "table";
    }
}
