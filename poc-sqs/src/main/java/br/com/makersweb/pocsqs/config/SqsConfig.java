package br.com.makersweb.pocsqs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsAsyncClient;

import java.net.URI;

/**
 * @author anderson
 */
@Configuration
public class SqsConfig {

    @Value("${spring.cloud.aws.endpoint}")
    private String awsEndpoint;

    @Bean
    public SqsAsyncClient sqsAsyncClient() {
        return SqsAsyncClient.builder()
                .endpointOverride(URI.create(awsEndpoint))
                .region(Region.SA_EAST_1)
                .build();
    }

}
