package com.example.sweater_2.domain;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Please write text")
    @Length(max = 2048,message ="Penis pjbrei svoi, i text small please" )
    private String text;
    private String filename;
    @Length(max = 2048,message ="Penis pjbrei svoi, i text small please" )
    private String tag;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Message() {
    }

    public Message(String text, String tag,User user) {
        this.text = text;
        this.tag = tag;
        this.user = user;
    }
    public String getAuthorName() {
        return user != null ? user.getUsername() : "<none>";
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}