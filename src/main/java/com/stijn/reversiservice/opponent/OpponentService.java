package com.stijn.reversiservice.opponent;

import com.stijn.reversiservice.business.model.Move;
import com.stijn.reversiservice.business.model.MoveHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpponentService {

    @Autowired
    private OpponentClient opponentClient;

    public void CallOpponentWith(MoveHistory moveHistory){
    opponentClient.callOpponent(moveHistory);
    }
}
