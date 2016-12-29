package xyz.x20a.windwalk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by crl on 16/12/29.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
