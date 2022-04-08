package com.github.mc1arke.sonarqube.plugin.almclient.bitbucket;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HttpClientBuilderFactoryTest {

    @Test
    void verifyNotSameInstanceReturnedByFactory() {
        HttpClientBuilderFactory underTest = new HttpClientBuilderFactory();
        OkHttpClient.Builder builder1 = underTest.createClientBuilder();
        OkHttpClient.Builder builder2 = underTest.createClientBuilder();

        assertThat(builder1).isNotSameAs(builder2);
    }
}