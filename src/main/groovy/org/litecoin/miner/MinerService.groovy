package org.litecoin.miner
import com.yammer.dropwizard.Service
import com.yammer.dropwizard.client.JerseyClientBuilder
import com.yammer.dropwizard.config.Bootstrap
import com.yammer.dropwizard.config.Environment
import org.eclipse.jetty.servlets.CrossOriginFilter

class MinerService extends Service<MinerConfiguration> {

    public static void main(String[] args) throws Exception {
        new MinerService().run(args)
    }

    @Override
    void initialize(Bootstrap<MinerConfiguration> bootstrap) {
        bootstrap.setName("miner")
    }

    @Override
    void run(MinerConfiguration configuration, Environment environment) {
        new org.litecoinpool.miner.Miner(configuration.host, configuration.credentials, 5000, 3000, 1, 1.0 )
        environment.addResource(new EchoResource())
    }
}