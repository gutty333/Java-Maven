package org.example;

public class MavenBuild {
    public static void main(String[] args) {

        /*
        Common Commands

        mvn validate = This is great for validating that your maven files are properly constructed. Think similar to terraform validate

        mvn clean = Will remove your target folder. So your previously compiled classes will be removed

        mvn compile = Includes (mvn validate)
            This will compile your source code, note only under your src/main are all the classes compiled
            This is important, it does not care about tests

        mvn test = Includes (mvn validate, mvn compile)
            This will do both compile and also run your tests
            So both the src/main  and src/test

        mvn package = Includes (mvn validate, mvn compile, mvn test)
            This will compile, also test, but now it will create a jar file for you of the project
            The jar will be found in the target folder

        mvn verify = Include (mvn validate, mvn compile, mvn package)
            The big difference here is that it will run all the previous but also now run integration tests

        mvn install = Includes (mvn validate, mvn compile, mvn test, mvn package)
            This will do all of the above, but now also puts your created jar file into your local maven repository
            Which is the .m2 directory
            .m2/repository/org/example/maven-dependencies/1.0-SNAPSHOT/maven-dependencies-1.0-SNAPSHOT.pom

            It will include your organization structure the groupID, artifact name, and the version

            .m2/repository/
            This path will also include all the dependencies you have downloaded. They are structured again based on their groupId



        Build Lifecycles
        ------------------------------------------------------------------------------------------------------------------------------------

        Default = responsible for building
        Clean = will delete the target directory, cleans/resets the project
        Site = for generating project documentation

        Default Stages
            - validate
            - compile
            - test
            - package
            - verify
            - install
            - deploy


        3 Types of Build Plugins

        Core
        Packaging
        Tools

        Core Plugins
            - Compile = Responsible for the JDK in use for compiling source code step
            - Installation = For handling the artifacts
            - Deployment = For pushing the artifacts and pushing to remote repository



        Packaging Plugins
            - JAR = produces JAR file that can be used by other projects
            - WAR
            - EAR
            - Shade
         */

        System.out.println("Hello, World!");
    }
}