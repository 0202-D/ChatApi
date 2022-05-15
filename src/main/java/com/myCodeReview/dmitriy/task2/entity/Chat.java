package com.myCodeReview.dmitriy.task2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
public class Chat implements Comparable<Chat> {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToMany(cascade = {
            CascadeType.MERGE
    }, fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinTable(name = "CHAT_USER",
            joinColumns = @JoinColumn(name = "CHAT_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ID")
    )
    private Set<User> users = new HashSet<>();


    private Date created_at;

    public Chat() {
    }

    public Chat(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                ", created_at=" + created_at +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(id, chat.id) &&
                Objects.equals(name, chat.name) &&
                Objects.equals(users, chat.users) &&
                Objects.equals(created_at, chat.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, users, created_at);
    }

    @Override
    public int compareTo(Chat o) {
        return (int) (this.getCreated_at().getTime() - o.getCreated_at().getTime());
    }
}
