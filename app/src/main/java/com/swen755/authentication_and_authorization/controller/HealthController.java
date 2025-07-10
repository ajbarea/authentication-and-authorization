package com.swen755.authentication_and_authorization.controller;

import com.swen755.authentication_and_authorization.dto.RegisterRequest;
import com.swen755.authentication_and_authorization.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {


    @GetMapping({"/", "/health"})
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok(Map.of("status", "UP"));
    }
}
