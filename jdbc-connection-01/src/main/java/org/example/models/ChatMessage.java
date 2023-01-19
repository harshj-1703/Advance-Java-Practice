package org.example.models;

public class ChatMessage {
    private static int msg_id;
    private int sender_id;
    private int receiver_id;
    private String msgContent;
    private String timeStamps;

    public static int getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(int msg_id) {
        this.msg_id = msg_id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public int getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(int receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(String timeStamps) {
        this.timeStamps = timeStamps;
    }

    public ChatMessage(int msg_id, int sender_id, int receiver_id, String msgContent, String timeStamps) {
        this.msg_id = msg_id;
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.msgContent = msgContent;
        this.timeStamps = timeStamps;
    }
}
