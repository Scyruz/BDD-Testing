package mx.tec.lab;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import org.springframework.boot.test.context.SpringBootTest;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")

public class TestBddApplicationTests {


}
