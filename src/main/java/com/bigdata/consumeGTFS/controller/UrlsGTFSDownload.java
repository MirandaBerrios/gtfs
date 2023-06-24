package com.bigdata.consumeGTFS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static com.bigdata.consumeGTFS.service.impl.MainServiceImpl.listUrls;

@RestController
public class UrlsGTFSDownload {

    @GetMapping("download/GTFS")
    ResponseEntity<ArrayList<String>> downloadGTFS(){
        return ResponseEntity.ok(listUrls);
    }

}
