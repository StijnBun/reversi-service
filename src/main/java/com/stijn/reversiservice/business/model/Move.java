package com.stijn.reversiservice.business.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Move {

private int width;
private int height;
private Player player;

}
