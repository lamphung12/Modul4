package com.example.demo5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  ///@Controller: là annotation để đánh dấu lớp GreetingController là một controller (đối tượng sẽ xử lý các request)
public class GreetingController {
    @GetMapping("/greeting")
    /////@GetMapping: là annotation để đánh dấu phương thức greeting() là một phương thức dùng để xử lý request khi
    // có một request GET được gửi đến đường dẫn "/greeting".
    public String greeting(Model model){
       String  name = "lam";
        model.addAttribute("name",name);
        return "index";
    }
}
