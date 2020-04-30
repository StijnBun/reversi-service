package com.stijn.reversiservice;

import com.stijn.reversiservice.business.model.Move;
import com.stijn.reversiservice.business.model.MoveHistory;
import com.stijn.reversiservice.opponent.OpponentService;
import com.stijn.reversiservice.persistence.MoveHistoryPersistence;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private OpponentService opponentService;
    private MoveHistoryPersistence persistence;
    private Long gameId;

    public GameService(OpponentService opponentService, MoveHistoryPersistence persistence) {
        this.opponentService = opponentService;
        this.persistence = persistence;
        this.gameId = persistence.save(MoveHistory.builder().build()).getId();
    }


    public void processMoveFromUser(Move move) {
        System.out.println(move.toString());
        MoveHistory moveHistory = persistence.findById(gameId).get();
        moveHistory.getMoveHistory().add(move);
        persistence.findById(gameId).get().setMoveHistory(moveHistory.getMoveHistory());
        System.out.println(moveHistory.toString());
        opponentService.CallOpponentWith(moveHistory);
    }

    public void processMoveFromOpponent(Move move) {

        // persist move

        // somehow return move to user FE YAHAYY FOR WEBSOCKETS

    }


}
