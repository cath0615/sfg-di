package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 2/20/21.
 */
@Configuration
//after spring boot does a component scan to find this configuration class, @Configuration
//tells spring this is a configuration class and defines a different bean.
public class GreetingServiceConfig {

    //make it a spring managed component, we ususally do this with third party library
    //instead of doing it on class that we own(we use stereotype annotation instead)
    @Bean
    //we delete the @service in constructorGreetingService class and we use this method 
    //to execute to build it.
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
