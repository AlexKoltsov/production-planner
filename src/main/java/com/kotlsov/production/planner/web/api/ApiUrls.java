package com.kotlsov.production.planner.web.api;

public interface ApiUrls {

    String API_VERSION = "v1";
    String API_VERSION_PATH = "/" + API_VERSION;
    String API_ROOT_PATH = "/api" + API_VERSION_PATH;

    interface Public {
        String BASE = API_ROOT_PATH + "/public";
    }

    interface Item {
        String BASE = API_ROOT_PATH + "/item";
    }
}
