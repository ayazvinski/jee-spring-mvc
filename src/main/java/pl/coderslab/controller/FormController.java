package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
public class FormController {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    @GetMapping("/form")
    public String hello() {
        return "/form.jsp";
    }

    @PostMapping(value = "/form",  produces = "text/plain;charset=UTF-8")
    @ResponseBody
    private String getParams (@RequestParam("paramName") String paramName,
                              @RequestParam("paramDate") String paramDate){
        LocalDate formattedDate = LocalDate.parse(paramDate,DATE_TIME_FORMATTER);
        return "ParamName: " + paramName + ". ParamDate: " + formattedDate;
    }
}
