package com.kajal.urlshortener.controller;

import com.kajal.urlshortener.service.UrlService;
import org.springframework.web.bind.annotation.
RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class UrlController {
    private final UrlService urlService;
    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/shorten")
public String shorten(@RequestBody String originalUrl) {

    return urlService.shortenUrl(originalUrl);

}
}