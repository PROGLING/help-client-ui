package com.progling.help_client_ui.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String home() {
        return "home";  // resources/templates/home.html (Thymeleaf 기준)
    }
}
