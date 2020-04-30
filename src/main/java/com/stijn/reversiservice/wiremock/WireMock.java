package com.stijn.reversiservice.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class WireMock {

    public static void main(String[] args) {
        WireMockServer wiremockServer = new WireMockServer(options().port(8088).usingFilesUnderDirectory("src/main/resources"));
        wiremockServer.start();
    }
}
