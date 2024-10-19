package br.com.makersweb.pocsqs.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

/**
 * @author anderson
 */
@Component
public class MyConsumer {

    @SqsListener("${spring.sqs.queue-name}")
    public void listen(MyMessage message) {
        System.out.println("Message received: " + message.content());
    }

}
