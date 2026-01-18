package bg.coincraft.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server - Service Registry for CoinCraft Trading Platform
 * <p>
 * Maintains a registry of all microservices in the platform.
 * Services register themselves on startup and send heartbeats every 30 seconds.
 * <p>
 * Dashboard: <a href="http://localhost:8761">...</a>
 * Health: <a href="http://localhost:8761/actuator/health">...</a>
 *
 * @author Georgi
 * @version 0.0.1-SNAPSHOT
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);

        System.out.println("""
                ╔════════════════════════════════════════════════════════╗
                ║   🚀 Eureka Server - CoinCraft Platform                ║
                ║                                                        ║
                ║   📊 Dashboard: http://localhost:8761                  ║
                ║   ❤️  Health:    /actuator/health                      ║
                ║   📈 Metrics:    /actuator/prometheus                  ║
                ║                                                        ║
                ║   Status: RUNNING ✅                                   ║
                ╚════════════════════════════════════════════════════════╝
                """);
    }
}
