package org.daming.service.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    // private RestTemplate restTemplate;
    private HelloFeignClient helloFeignClient;

    @HystrixCommand(fallbackMethod = "hiServiceFallback")
    public String hiService(String name) {
        // return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
        return this.helloFeignClient.hi(name);
    }

    public String hiServiceFallback(String name) {
        return "error:\t" + name;
    }


    public HelloService(HelloFeignClient helloFeignClient) {
        super();
        this.helloFeignClient = helloFeignClient;
    }
}
