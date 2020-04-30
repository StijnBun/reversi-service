package com.stijn.reversiservice.resource;

import com.stijn.reversiservice.GameService;
import com.stijn.reversiservice.business.model.Move;
import com.stijn.reversiservice.business.model.MoveHistory;
import com.stijn.reversiservice.opponent.OpponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReversiController {

    @Autowired
    private GameService gameService;

    @PostMapping("/usermove")
    public void processMoveFromUser(@RequestBody Move move){ gameService.processMoveFromUser(move);
    }

    @PostMapping("/opponentmove")
    public void processMoveFromOpponent(@RequestBody Move move){ gameService.processMoveFromOpponent(move);
    }

}
