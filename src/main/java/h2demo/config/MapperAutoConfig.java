package h2demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@MapperScan(basePackages = "h2demo.mapper")
@PropertySource("classpath:application.properties")
public class MapperAutoConfig {
}
