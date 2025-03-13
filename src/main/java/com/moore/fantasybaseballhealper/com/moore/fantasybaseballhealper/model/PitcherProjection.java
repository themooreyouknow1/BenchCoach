package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pitcher_projections")
public class PitcherProjection {

    @Id
    @Column(unique = true, nullable = false)
    private String player;
    @Column(name = "Team")
    private String team;
    @Column(name = "Positions")
    private String pos;
    @Column(name = "IP")
    private Integer inningsPitched;
    @Column(name = "K")
    private Integer strikeouts;
    @Column(name = "W")
    private Integer wins;
    @Column(name = "SV")
    private Integer saves;
    @Column(name = "ERA")
    private Double era;
    @Column(name = "WHIP")
    private Double whip;



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
