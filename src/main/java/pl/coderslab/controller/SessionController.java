package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Controller
@SessionAttributes("loginStart")
public class SessionController {
    @GetMapping(value = "/getCookie", produces = "text/plain;charset=UTF-8")
    @ResponseBody
public String cookie(Model model, HttpSession session){
    LocalDateTime loginTime = (LocalDateTime) session.getAttribute("loginStart");
        if (loginTime == null) {
            model.addAttribute("loginStart", LocalDateTime.now());
            return "Wartość ustawiona!";
        }
        return "Wartość " + loginTime;
}
}
