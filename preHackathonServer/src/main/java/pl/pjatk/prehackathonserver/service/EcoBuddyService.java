package pl.pjatk.prehackathonserver.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pjatk.prehackathonserver.model.EcoBuddy;
import pl.pjatk.prehackathonserver.repository.EcoBuddyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EcoBuddyService {
    private final EcoBuddyRepository ecoBuddyRepository;

    public EcoBuddy save(EcoBuddy ecoBuddy){
        return ecoBuddyRepository.save(ecoBuddy);
    }

    public List<EcoBuddy> findAll() {
        return ecoBuddyRepository.findAll();
    }
}
