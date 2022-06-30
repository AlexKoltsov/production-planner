package com.kotlsov.production.planner;

public interface ApiUrl {

    String API_VERSION = "v1";
    String API_VERSION_PATH = "/" + API_VERSION;
    String API_ROOT_PATH = "/api" + API_VERSION_PATH;

    interface Public {
        String BASE = API_ROOT_PATH + "/public";
    }
}
