# yaml-doc-maven-plugin

Simple maven plugin for [yaml-doc-tool](https://github.com/fugerit-org/yaml-doc-tool) project.

[![Keep a Changelog v1.1.0 badge](https://img.shields.io/badge/changelog-Keep%20a%20Changelog%20v1.1.0-%23E05735)](CHANGELOG.md) 
[![Maven Central](https://img.shields.io/maven-central/v/org.fugerit.java/yaml-doc-maven-plugin.svg)](https://mvnrepository.com/artifact/org.fugerit.java/yaml-doc-maven-plugin)
[![license](https://img.shields.io/badge/License-Apache%20License%202.0-teal.svg)](https://opensource.org/licenses/Apache-2.0)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_yaml-doc-maven-plugin&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=fugerit-org_yaml-doc-maven-plugin)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_yaml-doc-maven-plugin&metric=coverage)](https://sonarcloud.io/summary/new_code?id=fugerit-org_yaml-doc-maven-plugin)

Accepted config params are :  
* configPath
* idCatalog

Here a sample configuration  :

```
			<plugin>
				<groupId>org.fugerit.java</groupId>
				<artifactId>yaml-doc-maven-plugin</artifactId>
				<version>${yaml-doc-version}</version>	
				<configuration>
					<configPath>src/config/yaml-doc-config.xml</configPath>
					<idCatalog>openapi</idCatalog>		
				</configuration>							
				<executions>
					<execution>
						<id>openapi</id>
						<goals>
							<goal>generate</goal>
						</goals>
					</execution>		
				</executions>
			</plugin>	
```