package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Apache Maven

        General Project Structure
        root
            - pom.xml
            - src
                - main
                    - java (package)
                    - resources (folder)
                - test
                    - java (package)
                    - resources (folder)


        ------------------------------------------------------------------------------------------------------------------------------------

        Project Object Model (POM) = Focused on building software.

        Includes information such as the following sections

        Project Information
        - groupId
        - artifactId
        - Version
        - Properties
        - Dependencies
        - Build
        - Report

        ------------------------------------------------------------------------------------------------------------------------------------

        Properties
        - Helps reduce duplication. Think of it like a config properties where you define your
        - Help keeps items in sync and for versioning control for dependencies, by allowing you to reference it

        <properties>
            <jackson.version>2.18.3</jackson.version>
            <lombok.version>1.18.3</lombok.version>
        </properties>

        We can then easily reference the properties we created through interpolation, for example
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>${jackson.version}</version>
        </dependency>



        ------------------------------------------------------------------------------------------------------------------------------------

        Dependencies

        These are the libraries we want to work with
        Dependencies can be found in the Maven Repository
        Here is a sample dependency

        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>${jackson.version}</version>
        </dependency>

        Note by default if no scope is defined, it will be "compile" scope

        The groupId is the organizational structure. Think of the folder/package structure for the library
        The artifactId is the name of the dependency


        ------------------------------------------------------------------------------------------------------------------------------------

        Build

        When we run the command
        mvn clean package

        The above will build the jar file for your project
        This will be found in the new target folder the naming of the .jar file will match the artifactId and Version you provided in the pom.xml
        This is considered your project artifact

         */

        System.out.println("Hello, World!");

        int age = 50;
        System.out.println("The age is now " + age);
        showResults();
    }


    private static void showResults() {
        List<String> results = new ArrayList<>(List.of("test", "test2", "test3"));

        for (String current: results) {
            System.out.println(current);
        }
    }
}