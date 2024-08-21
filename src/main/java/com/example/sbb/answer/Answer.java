package com.example.sbb.answer;

import java.time.LocalDateTime;

import com.example.sbb.question.Question;
import com.example.sbb.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "Text")
    private String content; //답변의 내용

    @ManyToOne
    private SiteUser author;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
}
