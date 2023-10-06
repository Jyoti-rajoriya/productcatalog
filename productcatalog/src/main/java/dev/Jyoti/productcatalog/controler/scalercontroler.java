package dev.Jyoti.productcatalog.controler;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class scalercontroler
{
    @GetMapping("/hi")
    public String hiEveryone(){
        return "Hi Scalers Students Helllloooo";
    }
}
