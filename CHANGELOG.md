# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.5.0] - 2023-09-21

### Added

- [workflow deploy on branch deploy](.github/workflows/deploy_maven_package.yml)
- [workflow maven build](.github/workflows/build_maven_package.yml)
- keep a changelog and coverage badge

### Changed

- [workflow sonar cloud](.github/workflows/sonarcloud-maven.yml)
- fj-bom version set to 1.4.0
- yaml-doc-tool version to 0.5.0

0.4.2 (2023-08-29)
------------------
* Changed yaml-doc-tool version to 0.4.2

0.4.0 (2023-08-29)
------------------
* Changed yaml-doc-tool version to 0.4.0
* Updated fj-bom to 1.2.5
* Added sonar cloud analysis
* Added maven repo central and sonar cloud quality gate badges

0.3.2 (2022-12-01)
------------------
* Changed yaml-doc-tool version to 0.3.2
* Removed version vulnerability in pom dependencies

0.3.1 (2022-12-01)
------------------
* Changed yaml-doc-tool version to 0.3.1
* Corrected [yaml-doc-config sample](src/test/resources/yaml-doc-config.xml)

0.3.0 (2022-11-27)
------------------
* Changed parent pom version (fj-bom) to 0.2.3
* Updated documentation
* Updated to yaml-doc-tool 0.3.0