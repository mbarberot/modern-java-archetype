package $package;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AppTest {

    @Test
    public void shouldReturnFizz() {
        // Arrange
        App app = new App();

        // Act
        String result = app.fizzbuzz(3);

        // Assert
        assertThat(result).isEqualTo("Fizz");
    }
}
