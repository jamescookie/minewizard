package org.litecoin.miner

import com.yammer.dropwizard.config.Configuration
import com.fasterxml.jackson.annotation.JsonProperty;

class MinerConfiguration extends Configuration {

	@JsonProperty
    String host = ""

	@JsonProperty
    String credentials = ""
}
