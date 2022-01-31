package com.example.LiesDieBibel.Controller;

import com.example.LiesDieBibel.Services.GelesenService;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor(onConstructor_ = {@Autowired})
@RestController
public class GelesenController {

  private final GelesenService gelesenService;

  @PostMapping("/gelesen")
  public void saveGelesen(
      @RequestParam String bibelabschnitt,
      @RequestParam String lieblingsvers,
      @RequestParam List<String> labels,
      @RequestParam String leser) {
    gelesenService.saveGelesen(bibelabschnitt, lieblingsvers, labels, leser);
  }

}
