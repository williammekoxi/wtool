package com.hui.wtools

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
public class EncodingController {
    @RequestMapping("/encoding")
    public String encoding() {
        return "encoding"
    }

}
