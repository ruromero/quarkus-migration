package org.kie.processmigration.app;

import javax.inject.Inject;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

@QuarkusTest
class KieServerConfigTest {

    @Inject
    KieServersMap serversMap;

    @Inject
    KieServers servers;


    @Test
    void testConfig() {
        assertThat(servers, notNullValue());
        assertThat(serversMap, notNullValue());
    }

}
