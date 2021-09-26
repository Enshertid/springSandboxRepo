package com.example.sandboxspringapp;

import com.example.sandboxspringapp.training.ClassWithCustomLogic;
import com.example.sandboxspringapp.training.TimedHandlerBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public TimedHandlerBeanPostProcessor timedHandlerBeanPostProcessor() { return new TimedHandlerBeanPostProcessor(); }

    @Bean
    public ClassWithCustomLogic classWithCustomLogic() { return new ClassWithCustomLogic(); }
}
