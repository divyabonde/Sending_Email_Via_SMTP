package com.decodeNow.MailDemo.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailStructure {
    private String subject;
    private String message;

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
