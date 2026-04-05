package com.client.main;

import lombok.Getter;

@Getter
public class Client {
    
    @Getter
    private static final Client instance = new Client();
    
    private final String name = "Vinz Client";
    private final String version = "1.0";

    public void startup() {
        System.out.println("[" + name + "] Starting up...");
        // Inisialisasi Module Manager, Event Bus, dsb. di sini
    }

    public void shutdown() {
        System.out.println("[" + name + "] Shutting down...");
    }
}
