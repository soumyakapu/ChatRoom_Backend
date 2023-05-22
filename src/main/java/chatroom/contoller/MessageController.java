package chatroom.contoller;

import chatroom.model.Message;
import org.springframework.messaging.converter.SimpleMessageConverter;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.broker.SimpleBrokerMessageHandler;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.simp.SimpMessagingTemplate;


@Controller
public class MessageController {
    private SimpleBrokerMessageHandler simpleMessage;
    @MessageMapping("/message")
    @SendTo("/chatroom/public")
    public Message publicMessages(@Payload Message message){
        return  message;
    }
    @MessageMapping("/private_message")
    public Message privateMessage(@Payload Message message){
//        simpleMessage.
        return message;
    }
}
