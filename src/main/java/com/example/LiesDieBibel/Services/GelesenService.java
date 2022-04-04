package com.example.LiesDieBibel.Services;

import com.example.LiesDieBibel.Model.Gelesen;
import com.example.LiesDieBibel.Repository.GelesenRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GelesenService {

  private final GelesenRepository gelesenRepository;

  public void saveGelesen(
      String bibelabschnitt,
      List<String> lieblingsverse,
      List<String> versTexte,
      List<String> labels,
      String leser,
      String kommentar) {

    Map<String, String> lieblingsVerseMitText = new HashMap<>();
    for (String vers : lieblingsverse) {
      for (String versText : versTexte) {
        lieblingsVerseMitText.put(vers, versText);
      }
    }

    Gelesen gelesen =
        Gelesen.builder()
            .text(bibelabschnitt)
            .lieblingsvers(lieblingsVerseMitText)
            .label(labels)
            .leser(leser)
            .kommentar(kommentar)
            .build();

    gelesenRepository.save(gelesen);
  }
}
