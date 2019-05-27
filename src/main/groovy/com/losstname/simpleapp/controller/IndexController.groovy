package com.losstname.simpleapp.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-05-27.
 */

@Controller
class IndexController {

    @GetMapping(["","/"])
    String index(Model model){
        model.addAttribute("greet", "Welcome to spring boot")
        return "index"
    }
}
