package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * The PlayerTarget class represents a player that a fantasy baseball manager targets during a draft.
 * It includes the player's name, the expected draft round for the player, and any additional notes the manager may have.
 * This class is annotated with JPA annotations to map it to a database table and is used to track targeted players
 * during the draft process.
 */

@Entity
public class PlayerTarget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String playerName;
    private Integer expectedDraftRound;
    private String notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getExpectedDraftRound() {
        return expectedDraftRound;
    }

    public void setExpectedDraftRound(Integer expectedDraftRound) {
        this.expectedDraftRound = expectedDraftRound;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}