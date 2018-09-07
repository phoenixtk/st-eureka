package com.st.discovery.stdiscoveryconsumer.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Configuration
public class ConsumerController {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping(value = "/router/{id}")
    @ResponseBody
    public String router(@PathVariable Integer id){
        RestTemplate temp = getRestTemplate();
        return temp.getForObject("http://st-discovery-client/search/" + id, String.class);
    }

}
