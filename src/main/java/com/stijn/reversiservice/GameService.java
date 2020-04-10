package com.stijn.reversiservice;

import com.stijn.reversiservice.business.model.Move;
import com.stijn.reversiservice.business.model.MoveHistory;
import com.stijn.reversiservice.business.model.Player;
import com.stijn.reversiservice.opponent.Opponent;
import com.stijn.reversiservice.opponent.OpponentService;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@AllArgsConstructor
public class GameService {

private OpponentService opponentService;

public void processMoveFromUser(Move move){

    // persist move

    opponentService.CallOpponentWith(move);
}

public void processMoveFromOpponent(Move move){

    // persist move

    // somehow return move to user FE YAHAYY FOR WEBSOCKETS

}




}
