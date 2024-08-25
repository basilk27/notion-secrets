package com.mbsystems.notionsecrets.controller;

import com.mbsystems.notionsecrets.config.NotionConfigProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/notion")
@RequiredArgsConstructor
public class NotionController {

    private final NotionConfigProperties notionConfigProperties;

    @GetMapping
    public Map<String, String> printAllProps() {
        return Map.of("apiUrl", this.notionConfigProperties.apiUrl(),
                "apiVersion", this.notionConfigProperties.apiVersion(),
                "authToken", this.notionConfigProperties.authToken(),
                "databaseId", this.notionConfigProperties.databaseId());
    }
}
