package com.stijn.reversiservice.business.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@Entity(name = "move")
@NoArgsConstructor
@AllArgsConstructor
public class Move {
    @Id
    private long id;

    private int width;
    private int height;
    private Player player;

}
