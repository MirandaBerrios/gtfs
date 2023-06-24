package com.bigdata.consumeGTFS.client;

import com.bigdata.consumeGTFS.entity.Root;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="gobClient", value = "gobClient", url = "${url.gob.api}"  )
public interface Gtfs {
    @RequestMapping(value = "/package_show?id=33245", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
    ResponseEntity< Root > getAllGTFS();

}
