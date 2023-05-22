package chatroom.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
    private String senderMessage;
    private  String reciverMessage;
    private String message;
    private String date;
    private Status status;
}
