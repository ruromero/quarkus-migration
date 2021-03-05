package org.kie.processmigration.app;

import java.util.Map;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithParentName;

@ConfigMapping(prefix = "kieserverMap")
public interface KieServersMap {

    @WithParentName
    Map<String, KieServer> kieservers();
}

