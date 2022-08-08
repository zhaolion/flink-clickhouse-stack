package com.zhaolion.flink.demo.bean.config;

import com.google.gson.Gson;

public class AppConfig {
    private String name;

    public KafkaSetting getKafka() {
        return kafka;
    }

    public void setKafka(KafkaSetting kafka) {
        this.kafka = kafka;
    }

    private KafkaSetting kafka;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return  new Gson().toJson(this);
    }
}

