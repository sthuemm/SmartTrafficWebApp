package de.htwg.smarttraffic.controller;

import de.htwg.smarttraffic.model.Event;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebsocketController {

    @MessageMapping("/incident")
    @SendTo("/incident/event")
    public Event trainBarrierDown(Event event){

        return event;
    }

}
