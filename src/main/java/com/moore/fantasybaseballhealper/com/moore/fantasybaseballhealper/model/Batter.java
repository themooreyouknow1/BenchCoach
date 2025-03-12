package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model;

import jakarta.persistence.*;

@Entity
@Table(name = "2024_batter_stats")
public class Batter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer batterId;

    private String player;
    private String team;
    private String pos;
    private Integer age;

    @Column(name = "G")
    private Integer gamesPlayed;

    @Column(name = "AB")
    private int atBats;
    @Column(name = "R")
    private int runs;
    @Column(name = "H")
    private int hits;
    @Column(name = "2B")
    private int doubles;
    @Column(name = "3B")
    private int triples;
    @Column(name = "HR")
    private int homeRuns;
    @Column(name = "RBI")
    private int rbis;
    @Column(name = "SB")
    private int stolenBases;
    @Column(name = "CS")
    private int caughtStealing;
    @Column(name = "BB")
    private int walks;
    @Column(name = "SO")
    private int strikeouts;
    @Column(name = "SH")
    private int sacrificeHits;
    @Column(name = "SF")
    private int sacrificeFlies;
    @Column(name = "HBP")
    private int hitByPitch;

    private double avg;
    private double obp;
    private double slg;
    private double ops;

    private boolean sleeper;
    private boolean bust;

    public Integer getBatterId() {
        return batterId;
    }

    public void setBatterId(Integer batterId) {
        this.batterId = batterId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
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

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
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

    public int getSacrificeHits() {
        return sacrificeHits;
    }

    public void setSacrificeHits(int sacrificeHits) {
        this.sacrificeHits = sacrificeHits;
    }

    public int getSacrificeFlies() {
        return sacrificeFlies;
    }

    public void setSacrificeFlies(int sacrificeFlies) {
        this.sacrificeFlies = sacrificeFlies;
    }

    public int getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(int hitByPitch) {
        this.hitByPitch = hitByPitch;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public boolean isSleeper() {
        return sleeper;
    }

    public void setSleeper(boolean sleeper) {
        this.sleeper = sleeper;
    }

    public boolean isBust() {
        return bust;
    }

    public void setBust(boolean bust) {
        this.bust = bust;
    }

}
