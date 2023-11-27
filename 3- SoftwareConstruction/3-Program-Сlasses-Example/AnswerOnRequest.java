package com.example.blazkolab9.model;

import jakarta.persistence.*;

@Entity
public class AnswerOnRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private float measuredAirLevel;

    private String answerTime;

    private String answerStatus;

    @ManyToOne
    @JoinColumn (name = "requestairquality_id")
    private RequestAirLevel requestAirLevel;

    @ManyToOne
    @JoinColumn (name = "safeEcoBot_id")
    private SafeEcoBot safeEcoBot;

    public AnswerOnRequest() {
    }

    public AnswerOnRequest(float measuredAirLevel, String answerTime, String answerStatus, RequestAirLevel requestAirLevel, SafeEcoBot safeEcoBot) {
        this.measuredAirLevel = measuredAirLevel;
        this.answerTime = answerTime;
        this.answerStatus = answerStatus;
        this.requestAirLevel = requestAirLevel;
        this.safeEcoBot = safeEcoBot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getMeasuredAirLevel() {
        return measuredAirLevel;
    }

    public void setMeasuredAirLevel(float measuredAirLevel) {
        this.measuredAirLevel = measuredAirLevel;
    }

    public String getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    public String getAnswerStatus() {
        return answerStatus;
    }

    public void setAnswerStatus(String answerStatus) {
        this.answerStatus = answerStatus;
    }

    public RequestAirLevel getRequestAirLevel() {
        return requestAirLevel;
    }

    public void setRequestAirLevel(RequestAirLevel requestAirLevel) {
        this.requestAirLevel = requestAirLevel;
    }

    public SafeEcoBot getSafeEcoBot() {
        return safeEcoBot;
    }

    public void setSafeEcoBot(SafeEcoBot safeEcoBot) {
        this.safeEcoBot = safeEcoBot;
    }

    @Override
    public String toString() {
        return "AnswerOnRequest{" +
                "id=" + id +
                ", measuredAirLevel=" + measuredAirLevel +
                ", answerTime='" + answerTime + '\'' +
                ", answerStatus='" + answerStatus + '\'' +
                ", requestAirLevel=" + requestAirLevel +
                ", safeEcoBot=" + safeEcoBot +
                '}';
    }
}
