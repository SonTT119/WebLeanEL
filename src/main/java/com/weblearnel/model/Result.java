package com.weblearnel.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long resultId;

    @Column(name = "us_id")
    private long userId;

    @Column(name = "exam_id")
    private long examId;

    @Column(name = "word_id")
    private long wordId;

    @Column(name = "score")
    private int Score;

    @Column(name = "datetime", columnDefinition = "DATETIME")
    private LocalDateTime resultDatetime;

    @Column(name = "rs_flag")
    private int resultFlag;

    @Column(name = "rs_type")
    private int resultType;

    @ManyToOne
    private Word word;

    @ManyToOne
    private Exam exam;

}
