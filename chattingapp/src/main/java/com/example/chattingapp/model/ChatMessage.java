package com.example.chattingapp.model;

public class ChatMessage {
private String content;
private String sender;
private MessageType type;

public enum MessageType {
    CHAT, LEAVE, JOIN
}

public String getContent() {
    return content;
}

public void setContent(String content) {
    this.content = content;
}

public String getSender() {
    return sender;
}

public void setSender(String sender) {
    this.sender = sender;
}

public MessageType getType() {
    return type;
}

public void setType(MessageType type) {
    this.type = type;
}
public ChatMessage() {
	// TODO Auto-generated constructor stub
}


public ChatMessage(String content, String sender, MessageType type) {
	super();
	this.content = content;
	this.sender = sender;
	this.type = type;
}

@Override
public String toString() {
	return "ChatMessage [content=" + content + ", sender=" + sender + ", type=" + type + "]";
}


}
