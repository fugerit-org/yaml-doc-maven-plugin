# yaml-doc-maven-plugin

Simple maven plugin for [yaml-doc-tool](https://github.com/fugerit-org/yaml-doc-tool) project.

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