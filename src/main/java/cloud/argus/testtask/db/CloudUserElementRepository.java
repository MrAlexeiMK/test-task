package cloud.argus.testtask.db;

import cloud.argus.jooq.generated.tables.records.ElementRecord;

import java.util.List;

public interface CloudUserElementRepository {
    List<ElementRecord> findAllAccessibleElementsForCloudUserByEmail(String email);
}
