package org.example;

import java.util.ArrayList;
import java.util.List;

public class MavenBasic {
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

        Best practice is to order your dependencies by scope


        groupId = is the organizational structure. Think of the folder/package structure for the library
        artifactId = is the name of the dependency


        ------------------------------------------------------------------------------------------------------------------------------------

        Build

        When we run the command
        mvn clean package

        The above will build the jar file for your project
        This will be found in the new target folder the naming of the .jar file will match the artifactId and Version you provided in the pom.xml
        This is considered your project artifact


        Here you can control your source and target version for building

        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>${maven.compiler.version}</version>
                    <configuration>
                        <source>${maven.compiler.source}</source>
                        <target>${maven.compiler.target}</target>
                    </configuration>
                </plugin>
            </plugins>
        </build>

        ------------------------------------------------------------------------------------------------------------------------------------

        Reporting

        This will provide information about your tests as well as test coverage


        ------------------------------------------------------------------------------------------------------------------------------------

        Parent Pom and Maven Reactor

        Think of it as a multi tier project, where the parent pom will provide the versions for your dependencies
        Then the child projects will reference the same versions
        Basically working with modules, each module can represent a small service/application of the whole project. Its own little project

        Each module will have its own project structure and pom.xml
        Basically think of it as breaking down a project into small modules, each with its own pom.xml
        But there will be a parent pom.xml that will control general versions. Shared dependencies so don't repeat yourself

        You specify modules with the <module> element in the Parent

        <modules>
            <module>backend-service</module>
            <module>maven-basic</module>
            <module>maven-build</module>
        </modules>


        Maven Reactor, is the feature responsible for building the multiple modules/projects
        It knows their dependencies and the order in which to build which module first

        General Structure

        root
            - pom.xml (Parent POM)
            - lambda-importer (module 1)
                - scr
                    - main
                        - java (package)
                        - resources
                    - test
                        - java (folder)
                        - resources
                - pom.xml
            - backend-service (module 2)
                - scr
                    - main
                        - java (package)
                        - resources
                    - test
                        - java (folder)
                        - resources
                - pom.xml
            - client-logic (module 3)
                - scr
                    - main
                        - java (package)
                        - resources
                    - test
                        - java (folder)
                        - resources
                - pom.xml


        Now when you build your artifact with mvn clean package, you will notice multiple modules being built
        Also important to note that your root pom.xml in the project configuration level should have packaging set to pom

        <groupId>org.example</groupId>
        <artifactId>Java-Maven-Practice</artifactId>
        <version>1.0-SNAPSHOT</version>
        <packaging>pom</packaging>



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