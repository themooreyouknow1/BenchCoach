package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model;

import jakarta.persistence.*;

@Entity
@Table(name = "batter_projections")
public class BatterProjection {

    @Id
    @Column(unique = true, nullable = false)
    private String player;
    @Column(name = "Team")
    private String team;
    @Column(name = "Positions")
    private String pos;

    @Column(name = "AB")
    private int atBats;
    @Column(name = "R")
    private int runs;
    @Column(name = "HR")
    private int homeRuns;
    @Column(name = "RBI")
    private int rbis;
    @Column(name = "SB")
    private int stolenBases;
    @Column(name = "AVG")
    private double avg;
    @Column(name = "OBP")
    private double obp;
    @Column(name = "H")
    private int hits;
    @Column(name = "2B")
    private int doubles;
    @Column(name = "3B")
    private int triples;
    @Column(name = "BB")
    private int walks;
    @Column(name = "SO")
    private int strikeouts;
    @Column(name = "SLG")
    private double slg;
    @Column(name = "OPS")
    private double ops;


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

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getRbis() {
        return rbis;
    }

    public void setRbis(int rbis) {
        this.rbis = rbis;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getObp() {
        return obp;
    }

    public void setObp(double obp) {
        this.obp = obp;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public double getSlg() {
        return slg;
    }

    public void setSlg(double slg) {
        this.slg = slg;
    }

    public double getOps() {
        return ops;
    }

    public void setOps(double ops) {
        this.ops = ops;
    }
}
