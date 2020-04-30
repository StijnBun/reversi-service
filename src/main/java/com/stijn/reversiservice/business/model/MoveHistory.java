package com.stijn.reversiservice.business.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "movehistory")
@NoArgsConstructor
@AllArgsConstructor
public class MoveHistory implements Serializable {


    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "movelist")
    @OneToMany(mappedBy = "id")
    private List<Move> moveHistory;


}
