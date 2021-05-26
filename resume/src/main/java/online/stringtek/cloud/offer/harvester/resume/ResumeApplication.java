package online.stringtek.cloud.offer.harvester.resume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EntityScan(basePackages = {"online.stringtek.cloud.offer.harvester.common.pojo"})
@ComponentScan(basePackages = {"online.stringtek.cloud.offer.harvester"})
@EnableDiscoveryClient
@SpringBootApplication
public class ResumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeApplication.class, args);
    }

}
