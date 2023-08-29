# yaml-doc-maven-plugin

Simple maven plugin for [yaml-doc-tool](https://github.com/fugerit-org/yaml-doc-tool) project.

[![Maven Central](https://img.shields.io/maven-central/v/org.fugerit.java/yaml-doc-maven-plugin.svg)](https://mvnrepository.com/artifact/org.fugerit.java/yaml-doc-maven-plugin) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_yaml-doc-maven-plugin&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=fugerit-org_yaml-doc-maven-plugin)

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