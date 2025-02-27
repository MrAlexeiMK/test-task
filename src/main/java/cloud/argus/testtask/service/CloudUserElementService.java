package cloud.argus.testtask.service;

import cloud.argus.testtask.PublicApiElement;
import cloud.argus.testtask.db.CloudUserElementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudUserElementService {
    private final CloudUserElementRepository cloudUserElementRepository;

    public CloudUserElementService(final CloudUserElementRepository cloudUserElementRepository) {
        this.cloudUserElementRepository = cloudUserElementRepository;
    }

    public List<PublicApiElement> getCloudUserAccessibleElements(final String email) {
        final var cloudUserElements = cloudUserElementRepository.findAllAccessibleElementsForCloudUserByEmail(email);
        return cloudUserElements.stream()
                                .map(record -> new PublicApiElement(record.getId(),
                                                                    record.getAddress()))
                                .toList();
    }
}
