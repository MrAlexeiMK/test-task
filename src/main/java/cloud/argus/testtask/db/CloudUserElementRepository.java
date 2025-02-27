package cloud.argus.testtask.db;

import cloud.argus.jooq.generated.tables.records.ElementRecord;

import java.util.List;

/**
 * Interface for finding all accessible elements by cloud user email.
 */
public interface CloudUserElementRepository {
    /**
     * Find all accessible jOOQ {@link ElementRecord}'s by a given cloud user email.
     * @param email The cloud user email.
     * @return The list containing elements accessible for the given cloud user email.
     */
    List<ElementRecord> findAllAccessibleElementsForCloudUserByEmail(String email);
}
