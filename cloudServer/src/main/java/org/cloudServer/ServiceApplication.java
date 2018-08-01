package org.cloudServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ServiceApplication.class, args);
        System.out.println( "Server Start!!" );
    }
}
