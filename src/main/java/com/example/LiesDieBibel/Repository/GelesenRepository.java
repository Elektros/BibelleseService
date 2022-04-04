package com.example.LiesDieBibel.Repository;

import com.example.LiesDieBibel.Model.Gelesen;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GelesenRepository extends JpaRepository<Gelesen, UUID> {}
