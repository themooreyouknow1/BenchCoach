package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model;

import jakarta.persistence.*;

@Entity
@Table(name = "2024_pitcher_stats")
public class Pitcher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pitcherId;

    private String player;
    private String team;
    private String pos;
    private int age;

    @Column(name = "G")
    private int gamesPlayed;
    @Column(name = "GS")
    private int gamesStarted;
    @Column(name = "CG")
    private int completeGames;
    @Column(name = "SHO")
    private int shutouts;
    @Column(name = "IP")
    private int inningsPitched;
    @Column(name = "H")
    private int hits;
    @Column(name = "ER")
    private int earnedRuns;
    @Column(name = "K")
    private int strikeouts;
    @Column(name = "BB")
    private int walks;
    @Column(name = "HR")
    private int homeRuns;
    @Column(name = "W")
    private int wins;
    @Column(name = "L")
    private int losses;
    @Column(name = "SV")
    private int saves;
    @Column(name = "BS")
    private int blownSaves;
    @Column(name = "HLD")
    private int holds;
    @Column(name = "ERA")
    private double era;
    @Column(name = "WHIP")
    private double whip;

    // Sleeper and Bust flags
    private boolean sleeper;
    private boolean bust;

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

    public int getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(int gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public int getCompleteGames() {
        return completeGames;
    }

    public void setCompleteGames(int completeGames) {
        this.completeGames = completeGames;
    }

    public int getShutouts() {
        return shutouts;
    }

    public void setShutouts(int shutouts) {
        this.shutouts = shutouts;
    }

    public int getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(int inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getBlownSaves() {
        return blownSaves;
    }

    public void setBlownSaves(int blownSaves) {
        this.blownSaves = blownSaves;
    }

    public int getHolds() {
        return holds;
    }

    public void setHolds(int holds) {
        this.holds = holds;
    }

    public double getEra() {
        return era;
    }

    public void setEra(double era) {
        this.era = era;
    }

    public double getWhip() {
        return whip;
    }

    public void setWhip(double whip) {
        this.whip = whip;
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

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
