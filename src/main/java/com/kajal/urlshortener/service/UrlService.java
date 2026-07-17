package com.kajal.urlshortener.service;

import com.kajal.urlshortener.repository.UrlRepository;
import org.springframework.stereotype.Service;
import com.kajal.urlshortener.entity.Url;

import java.util.UUID;

@Service
public class UrlService {

    private final UrlRepository urlRepository;
    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public String shortenUrl(String originalUrl) {

    String shortCode = UUID.randomUUID().toString().substring(0, 6);

    Url url = new Url();

    url.setOriginalUrl(originalUrl);
    url.setShortCode(shortCode);

    urlRepository.save(url);

    return shortCode;
    }
}