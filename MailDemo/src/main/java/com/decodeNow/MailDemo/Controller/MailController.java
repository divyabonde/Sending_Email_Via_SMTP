package com.decodeNow.MailDemo.Controller;

import com.decodeNow.MailDemo.Model.MailStructure;
import com.decodeNow.MailDemo.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure) {
        mailService.sendMail(mail, mailStructure);
        return  "Sucessfully sent the mail...!!!";
    }
}
