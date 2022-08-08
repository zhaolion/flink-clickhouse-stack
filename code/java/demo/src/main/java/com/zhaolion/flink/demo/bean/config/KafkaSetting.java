package com.zhaolion.flink.demo.bean.config;

import java.util.List;

public class KafkaSetting {
    public List<String> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<String> brokers) {
        this.brokers = brokers;
    }

    private List<String> brokers;
}
