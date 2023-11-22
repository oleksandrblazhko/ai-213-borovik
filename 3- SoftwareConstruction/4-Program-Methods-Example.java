package com.example.blazkolab9.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SafeEcoBot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private float measuredAirLevel;
    private float analyzeAir;
    private String provideRecommendation;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> user;

    public String checkAir(String requestor, String location) {
        String result = "";
        int airQualityIndex = 7;
        float temperature = 24;

        if (location.length() > 20 || !requestor.matches("^[a-zA-Z\\s]+$") || requestor.isBlank()) {
            result = "Помилка авторизації";
        } else {
            result = "The city of Ohio today has excellent air quality. " +
                    "Index of Air Quality today is " + airQualityIndex +
                    " Temperature in the city is " + temperature + " C";
        }
        return result;
    }



    public SafeEcoBot() {
    }

    public SafeEcoBot(float measuredAirLevel, float analyzeAir, String provideRecommendation, List<User> user) {
        this.measuredAirLevel = measuredAirLevel;
        this.analyzeAir = analyzeAir;
        this.provideRecommendation = provideRecommendation;
        this.user = user;
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

    public float getAnalyzeAir() {
        return analyzeAir;
    }

    public void setAnalyzeAir(float analyzeAir) {
        this.analyzeAir = analyzeAir;
    }

    public String getProvideRecommendation() {
        return provideRecommendation;
    }

    public void setProvideRecommendation(String provideRecommendation) {
        this.provideRecommendation = provideRecommendation;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "SafeEcoBot{" +
                "id=" + id +
                ", measuredAirLevel=" + measuredAirLevel +
                ", analyzeAir=" + analyzeAir +
                ", provideRecommendation='" + provideRecommendation + '\'' +
                ", user=" + user +
                '}';
    }
}
