package $package;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AppTest {

    @Test
    public void shouldReturnFizz() {
        // Arrange
        val app = new App();

        // Act
        val result = app.fizzbuzz(3);

        // Assert
        assertThat(result).isEqualTo("Fizz");
    }
}
