package com.SamuilOlegovich.blog.models;

import javax.persistence.*;


@Entity                          // класс который будет создавать таблицу если ее еще нет со всеми ее полями и т д
public class Post {

    @Id                                                     // эта анотация должна быть именно из библиотеки - javax.persistence
    @GeneratedValue(strategy = GenerationType.AUTO)       // позволяет каждый раз генирировать уникальное значение в этом поле
    private Long id;
    private String title;
    private String anons;
    @Column(columnDefinition = "TEXT")                      // для записи большого текста (длинного)
    private String full_text;
    private int views;



    public Post() { }

    public Post(String title, String anons, String full_text) {
        this.full_text = full_text;
        this.title = title;
        this.anons = anons;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
