package com.example.LiesDieBibel.Repository;

import com.example.LiesDieBibel.Model.Leser;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeserRepository extends JpaRepository<Leser, UUID> {

  List<Leser> findByName(String name);
}
