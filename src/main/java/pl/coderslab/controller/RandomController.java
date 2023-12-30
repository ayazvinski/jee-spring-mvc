package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping(value = "/show-random", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String showRandom(){
        int randomNumber = new Random().nextInt(100) + 1;
        return "Wylosowano liczbę: " + randomNumber;
    }

    @GetMapping(value = "/random/{min}/{max}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String showRandomMax(@PathVariable("max") int max,
                                @PathVariable("min") int min){
        int randomNumber  = new Random().nextInt(max - min + 1) + min;
        return "Użytkownik podał wartość " + min + " oraz " + max +". Wylosowano liczbę: " + randomNumber;
    }

}
