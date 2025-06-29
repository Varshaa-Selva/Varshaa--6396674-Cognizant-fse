## Maven Commands Used
## 1. Build and Run All Tests

mvn clean test

-Cleans the target directory and runs all tests in the project.

## 2. Run with Debug Output (Verbose)

mvn clean test -X

-Shows detailed logs for troubleshooting build or test failures.

## 3. Run a Specific Test Class

mvn test -Dtest = MockingStubbingTest

mvn test -Dtest = VerifyingInteractionTest

-Executes only the specified test class. Useful when test class names don't match Maven’s default pattern.

## 4. Run All Tests with Test Summary

mvn clean test -Dsurefire.printSummary=true

-Prints a summary of all executed tests at the end of the build.

## Required Dependencies in pom.xml
xml
<dependencies>
    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Mockito -->
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>5.11.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.1.2</version>
            <configuration>
                <useFile>false</useFile>
                <redirectTestOutputToFile>false</redirectTestOutputToFile>
            </configuration>
        </plugin>
    </plugins>
</build>