package com.fastcampus.todo.controller;

import com.fastcampus.todo.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaTemplate<String, UserDto> kafkaTemplate; // 카프카에 대해서 요청하고 받는 템플릿
    // private final RestTemplate restTemplate;

    @GetMapping("/api/user/produce")
    public void produceUser() {
        kafkaTemplate.send("user", new UserDto("martin3", "martin3@fastcampus.com", "seoul", "songpa", "11111"));
//        User user = restTemplate.getForObject("http://localhost:8070/api/user/1", User.class);
    }
}
