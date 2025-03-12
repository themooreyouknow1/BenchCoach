package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "2025_pitcher_projections")
public class PitcherProjection {

    @Id
    private Integer pitcherId; // Use pitcher_id as primary key

    private String player;
    private String team;
    private String pos;
    private Integer inningsPitched;
    private Integer strikeouts;
    private Integer wins;
    private Integer saves;
    private Double era;
    private Double whip;

    // Getters and Setters

    public Integer getPitcherId() {
        return pitcherId;
    }

    public void setPitcherId(Integer pitcherId) {
        this.pitcherId = pitcherId;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(Integer inningsPitched) {
        this.inningsPitched = (inningsPitched != null) ? inningsPitched : 0;
    }

    public Integer getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(Integer strikeouts) {
        this.strikeouts = (strikeouts != null) ? strikeouts : 0;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = (wins != null) ? wins : 0;
    }

    public Integer getSaves() {
        return saves;
    }

    public void setSaves(Integer saves) {
        this.saves = (saves != null) ? saves : 0;
    }

    public Double getEra() {
        return era;
    }

    public void setEra(Double era) {
        this.era = (era != null) ? era : 0.0;
    }

    public Double getWhip() {
        return whip;
    }

    public void setWhip(Double whip) {
        this.whip = (whip != null) ? whip : 0.0;
    }
}
