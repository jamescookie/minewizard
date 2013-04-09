package org.litecoin.miner

import com.yammer.dropwizard.config.Configuration
import com.fasterxml.jackson.annotation.JsonProperty;

class MinerConfiguration extends Configuration {

	@JsonProperty
    String host = "http://eu-pool-d.give-me-ltc.com:80/"

	@JsonProperty
    String credentials =  "tellyteam.akuma:WKW66w0Lnq34e2b"

}
