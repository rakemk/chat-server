package com.rake.chatserver.model;

import java.time.LocalDateTime;

public class Message {

    private String senderName;
    private String receiverName;
    private String message;
    private LocalDateTime date; // Use LocalDateTime for better date handling
    private Status status;

    // Default constructor
    public Message() {
    }

    // Parameterized constructor
    public Message(String senderName, String receiverName, String message, LocalDateTime date, Status status) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.message = message;
        this.date = date;
        this.status = status;
    }

    // Getter and Setter for senderName
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    // Getter and Setter for receiverName
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    // Getter and Setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Getter and Setter for date
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    // Getter and Setter for status
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Message{" +
                "senderName='" + senderName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", status=" + status +
                '}';
    }
}
