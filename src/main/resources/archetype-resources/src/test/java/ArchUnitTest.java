package $package;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "${package}")
public class ArchUnitTest {

    @ArchTest
    private final ArchRule generalArchitectureRule =
            onionArchitecture()
                    .domainModels("${package}.domain.model..")
                    .domainServices("${package}.domain.service..")
                    .applicationServices("${package}.application..")
                    .adapter("persistence", "${package}.adapter.persistence")
                    /* TODO : add your adapters here */
                    .allowEmptyShould(true) /* FIXME : remove this line when you have enough code to satisfy it */;
}
