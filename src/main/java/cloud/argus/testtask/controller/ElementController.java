package cloud.argus.testtask.controller;

import cloud.argus.testtask.PublicApiElement;
import cloud.argus.testtask.service.ElementService;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/v1", produces = APPLICATION_JSON_VALUE)
public class ElementController {
    private final ElementService elementService;

    public ElementController(final ElementService elementService) {
        this.elementService = elementService;
    }

    @GetMapping(path = "/elements")
    public List<PublicApiElement> getAllCloudUserAccessibleElements(
        @RequestParam @NotBlank @Email final String email
    ) {
        return elementService.getCloudUserAccessibleElements(email);
    }
}
