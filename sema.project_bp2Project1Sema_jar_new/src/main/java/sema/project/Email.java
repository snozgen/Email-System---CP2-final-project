/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sema.project;

/**
 *
 * @author semao
 */
class Email {
    private String id;
    private String sender;
    private String subject;
    private String dateReceived;

    // Constructor, getter ve setter metodları
    public Email(String id, String sender, String subject, String dateReceived) {
        this.id = id;
        this.sender = sender;
        this.subject = subject;
        this.dateReceived = dateReceived;
    }

    public String getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getDateReceived() {
        return dateReceived;
    }
}
