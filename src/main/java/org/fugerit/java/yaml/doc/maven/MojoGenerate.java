package org.fugerit.java.yaml.doc.maven;

import java.util.Properties;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.fugerit.java.yaml.doc.YamlDocMain;

import lombok.Setter;

@Mojo( name = "generate")
public class MojoGenerate extends AbstractMojo {
	
    @Parameter(property = "configPath", required = true )
    @Setter private String configPath;
    
    @Parameter(property = "idCatalog", required = true )
    @Setter private String idCatalog;
    
    public void execute() throws MojoExecutionException {
        try {
        	Properties props = new Properties();
        	props.setProperty( YamlDocMain.ARG_MODE , YamlDocMain.ARG_MODE_CONFIG );
        	props.setProperty( YamlDocMain.ARG_CONFIG_PATH , this.configPath );
        	props.setProperty( YamlDocMain.ARG_ID_CATALOG , this.idCatalog );
        	this.getLog().info( "props : "+props );
        	YamlDocMain.worker( props );
        } catch (Exception e) {
        	throw new MojoExecutionException( "Error generating code : "+e, e );
        }
    }

}