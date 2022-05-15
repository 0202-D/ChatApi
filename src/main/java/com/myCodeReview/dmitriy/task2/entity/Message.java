package com.myCodeReview.dmitriy.task2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Message implements Comparable<Message> {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "CHAT_ID", referencedColumnName = "id")
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    @JsonIgnore
    private User author;

    private String text;

    private Date created_at;

    public Message() {
    }


    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", chat=" + chat +
                ", author=" + author +
                ", text='" + text + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id) &&
                Objects.equals(chat, message.chat) &&
                Objects.equals(author, message.author) &&
                Objects.equals(text, message.text) &&
                Objects.equals(created_at, message.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chat, author, text, created_at);
    }

    @Override
    public int compareTo(Message o) {
        return (int) (this.getCreated_at().getTime() - o.getCreated_at().getTime());
    }
}
