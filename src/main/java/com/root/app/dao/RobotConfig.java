package com.root.app.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // == xml과 동일
public class RobotConfig {

    // 변수
    
    // 메서드
    // <bean></bean>
    @Bean
    Robot getRobot() {
		return new Robot();
	}
    
    @Bean(name = "arms") // <bean name = "arms"></bean>
    Arms getArms() {
    	return new Arms();
    }
	
}
