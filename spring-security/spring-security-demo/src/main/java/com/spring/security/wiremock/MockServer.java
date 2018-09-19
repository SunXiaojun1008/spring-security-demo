package com.spring.security.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class MockServer {

    public static void main (String[] args){
        configureFor(8062);
        removeAllMappings();

        stubFor(get(urlPathEqualTo("/user/1")).willReturn(aResponse().withBody("{\"id\":1}").withStatus(200)));
    }
}
