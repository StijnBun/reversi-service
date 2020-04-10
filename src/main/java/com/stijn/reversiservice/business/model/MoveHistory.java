package com.stijn.reversiservice.business.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MoveHistory {

private List<Move> moveHistory;

}
