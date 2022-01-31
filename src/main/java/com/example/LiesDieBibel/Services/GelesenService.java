package com.example.LiesDieBibel.Services;

import com.example.LiesDieBibel.Model.Gelesen;
import com.example.LiesDieBibel.Model.Leser;
import com.example.LiesDieBibel.Repository.GelesenRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GelesenService {

  private final GelesenRepository gelesenRepository;
  private final LeserService leserService;

  public void saveGelesen(String bibelabschnitt, String lieblingsvers, List<String> labels, String leser) {
    Leser lesender = leserService.findeLeser(leser);

    if (lesender == null) {
      lesender = leserService.saveLeser(leser);
    }

    Gelesen gelesen = Gelesen
        .builder()
        .bibelabschnitt(bibelabschnitt)
        .lieblingsvers(lieblingsvers)
        .labels(labels)
        .leser(lesender)
        .build();

    gelesenRepository.save(gelesen);
  }
}
