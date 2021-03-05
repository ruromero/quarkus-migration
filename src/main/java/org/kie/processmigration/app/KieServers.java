package org.kie.processmigration.app;

import java.util.List;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithParentName;

@ConfigMapping(prefix = "kieservers")
public interface KieServers {

    @WithParentName
    List<KieServer> kieservers();
}

