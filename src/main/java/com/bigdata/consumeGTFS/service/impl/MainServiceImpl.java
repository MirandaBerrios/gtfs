package com.bigdata.consumeGTFS.service.impl;

import com.bigdata.consumeGTFS.client.Gtfs;
import com.bigdata.consumeGTFS.entity.Root;
import com.bigdata.consumeGTFS.service.MainService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;


@Service
@Log4j2
public class MainServiceImpl implements MainService {

    @Autowired
    Gtfs gtfs;

    public static ArrayList<String> listUrls = new ArrayList<>();

//    @Scheduled(cron = "${cron.launchtime}")
    @Scheduled(fixedDelay =  1000000)
    @Override
    public void analizeApip() throws IOException {
        try {

            ArrayList<String> urlStringList = new ArrayList<>();

            ObjectMapper om = new ObjectMapper();
            log.info("STARTING TO ANALYZE API GOB");
            ResponseEntity<Root> responsePure = gtfs.getAllGTFS();
            responsePure.getBody().getResult().getResources().forEach( item -> {
                urlStringList.add(item.getUrl());
            });

            System.err.println( "cantidad " +  urlStringList.size());
            System.err.println( om.writeValueAsString(urlStringList));
            listUrls = urlStringList;
            log.info("HAS BEEN GETTING {} urls", Integer.toString(urlStringList.size()));
            log.info("END SERVICE");

        }catch (Exception e){
            System.err.println("Error "+  e.toString());
        }

    }
}
