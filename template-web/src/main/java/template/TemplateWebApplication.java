package template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching//开启注解方式的缓存管理
@EnableScheduling
@Slf4j
public class TemplateWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateWebApplication.class, args);
	}

	@Bean
    public MessageConverter messageConverter(){
        Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
        converter.setCreateMessageIds(true);//设置消息ID
        return converter;
    }

}
