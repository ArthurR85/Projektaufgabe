package com.example.projektaufgabe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Daten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text; // Feld, das dem Schlüssel "text" im JSON entspricht

    // Standardkonstruktor (automatisch erstellt)

    // Getter und Setter für das Feld "text"
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // Getter und Setter für die ID (falls benötigt)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
