/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chat.chat.controller;

import com.chat.chat.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Joel Norman
 */
@Controller
public class ChatController {
    @MessageMapping("/envio")
    @SendTo("/tema/mensajes")
    public Message envio(Message mje) {
        System.out.println("{\n name:"+mje.name()+",\nmessage:"+mje.message()+"\n}");
        return new Message(mje.name(), mje.message());
    }
}
