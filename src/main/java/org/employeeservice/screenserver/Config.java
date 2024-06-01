package org.employeeservice.screenserver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
//@ComponentScan(basePackages = "screensaver")
public class Config {

    @Bean
    @Scope(value = "prototype")
    public Color color () {
        Random random = new Random();
        return new Color(random.nextInt(250), random.nextInt(250), random.nextInt(250));

    }
    @Bean
    public ColorFrame frame(){
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        while (true) {
            context.getBean(ColorFrame.class).showRandomPlace();
            Thread.sleep(100);
        }
    }


}
