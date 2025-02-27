package cloud.argus.testtask.db;

import cloud.argus.jooq.generated.tables.records.ElementRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Fallback;
import org.springframework.stereotype.Repository;

import java.util.List;

import static cloud.argus.testtask.StructuredLog.CLOUD_USER_EMAIL;

@Repository
@Fallback
public class CloudUserElementRepositoryStub implements CloudUserElementRepository {
    private static final Logger logger = LoggerFactory.getLogger(CloudUserElementRepositoryStub.class);

    @Override
    public List<ElementRecord> findAllAccessibleElementsForCloudUserByEmail(final String email) {
        logger.atDebug()
              .addKeyValue(CLOUD_USER_EMAIL, email)
              .log("Pretend to find all accessible elements by cloud user email.");
        return List.of();
    }
}
