package pl.pjatk.prehackathonserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.prehackathonserver.model.EcoBuddy;
import pl.pjatk.prehackathonserver.service.EcoBuddyService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EcoBuddyController {
    private final EcoBuddyService ecoBuddyService;

    public ResponseEntity<EcoBuddy> addEcoBuddy(EcoBuddy ecoBuddy){
        return ResponseEntity.ok(ecoBuddyService.save(ecoBuddy));
    }

    public ResponseEntity<List<EcoBuddy>> findAll(){
        return ResponseEntity.ok(ecoBuddyService.findAll());
    }
}
