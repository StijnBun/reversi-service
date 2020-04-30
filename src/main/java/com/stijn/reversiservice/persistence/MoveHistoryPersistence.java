package com.stijn.reversiservice.persistence;

import com.stijn.reversiservice.business.model.MoveHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveHistoryPersistence extends JpaRepository<MoveHistory, Long> {
}
