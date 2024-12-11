package com.example.AccioNews.service;

import com.example.AccioNews.response.NewsResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    // its inbulit class in spring
    // calling the third party api so its using the RestTemplate()
     RestTemplate restTemplate = new RestTemplate();// resttemple used to call the code level

    public NewsResponse getNews(String apiKey){
       String url="https://newsapi.org/v2/top-headlines?country=us&apiKey="+apiKey;
      NewsResponse response= restTemplate.getForObject(url, NewsResponse.class); // api is calling
      return response;
      //web client
        //feign client used in  the indrusty
    }
}
