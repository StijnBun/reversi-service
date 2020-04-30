package com.stijn.reversiservice.opponent;

import com.stijn.reversiservice.business.model.MoveHistory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "${opponent.client.name}", url = "${opponent.client.url}")
public interface OpponentClient {

    @RequestMapping(value = "/move")
    public boolean callOpponent(@RequestBody MoveHistory moveHistory);


}
