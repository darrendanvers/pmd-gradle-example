# Gradle PMD Example

Provides a simple example of how to use PMD during a Gradle build. Full documentation is available
on the [Gradle](https://docs.gradle.org/current/dsl/org.gradle.api.plugins.quality.Pmd.html) site.

## Building and Running

On the command line, type in `./gradlew build` to execute the build. 

To run the program, type in:

    cd build/libs
    java -jar pmd-gradle-example-1.0.0.jar

The program doesn't do much.

## PMD Configuration and Output

The following lines in [build.gradle](./build.gradle) configure the PMD plugin:

        ...
        
        plugins {  
            id 'pmd'           // Add the PMD plugin.
        }
        
        ...

        // Configure PMD.
        pmd {
            toolVersion = "6.23.0"                             // The version of PMD to use.
            ruleSetFiles = files("config/pmd/pmd.xml")         // The location of the configuration file.
            ruleSets = []                                      // Ignore the default rules. The ones this config
                                                               // uses are set with the ruleSetFiles property.                                                      
        }

The configuration file for PMD is in  [./config/pmd/pmd.xml](./config/pmd/pmd.xml).

Reports will be produced in the `./build/reports/pmd` directory.