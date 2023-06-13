 
# Modern Java Archetype

[![License][license-image]][license-url]

> An opinionated archetype to create a "state of the art" java project

<!--
[![Build Status][ci-image]][ci-url]
[![Coverage][coverage-image]][coverage-url]
-->

## Features

This archetype create a Java project with the following pre-installed and pre-configured : 

* Maven project with wrapper to make it easier to start contributing
* Compiler set to JDK 17 - the latest LTS
* Test suite with JUnit 5, Mockito, Datafaker, AssertJ and Jacoco
* Ensuring Onion Architecture using ArchUnit
* Checking code at compile-time with ErrorProne and NullAway
* Logging with SLF4J and LOG4J2
* Fixed code style with EditorConfig
* Git ignore file already filled with usual not-to-commit files from Java, Maven and Intellij IDEA

* README template

## Installation

1. Clone the project
2. Run a `./mvnw clean install` to locally publish this archetype into your `.m2/repository` cache

## Usage example

```bash
cd new_project
mvn archetype:generate \
  -DarchetypeGroupId=fr.mbarberot \
  -DarchetypeArtifactId=modern-java-archetype \
  -DgroupId=com.acme \
  -DartifactId=basic-project \
  -DprojectName=Basic Project \
  -Dpackage=com.acme.basic
```

<!--
_For more examples and usage, please refer to the [Wiki][wiki]._
-->

## Development setup

1. Clone the project
2. Run `./mvnw clean verify`

## Release History

* 1.0.0-SNAPSHOT _(not yet released)_
    * Work in progress

## Meta

[Mathieu Barberot](https://github.com/mbarberot/) – [@mbarberot](https://twitter.com/mbarberot)

Distributed under the MIT license. See ``LICENSE`` for more information.

## Contributing

1. [Fork it](https://github.com/mbarberot/modern-java-archetype/fork)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img -->
<!--
[coverage-image]: https://img.shields.io/your-coverage/...
[coverage-url]: https://your-coverage.url
[ci-image]: https://img.shields.io/your-ci/...
[ci-url]: https://your-ci.url
[wiki]: https://github.com/yourname/yourproject/wiki
-->
[license-image]: https://img.shields.io/github/license/mbarberot/modern-java-archetype
[license-url]: https://opensource.org/license/mit
