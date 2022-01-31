package com.example.LiesDieBibel.Services;

import com.example.LiesDieBibel.Model.Leser;
import com.example.LiesDieBibel.Repository.LeserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LeserService {

  private final LeserRepository leserRepository;

  public Leser saveLeser(String leser) {
    Leser lesender = Leser.builder().name(leser).build();
    leserRepository.save(lesender);
    return lesender;
  }

  public Leser findeLeser(String leser) {
    return leserRepository.findByName(leser).get(0);
  }
}
