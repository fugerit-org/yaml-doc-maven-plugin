package org.fugerit.java.yaml.doc.maven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.fugerit.java.core.lang.helpers.StringUtils;
import org.fugerit.java.core.util.collection.ListMapStringKey;
import org.fugerit.java.yaml.doc.YamlDocMain;
import org.fugerit.java.yaml.doc.config.OpenapiConfig;
import org.fugerit.java.yaml.doc.config.YamlDocConfig;

@Mojo( name = "generate")
public class MojoGenerate extends AbstractMojo {
	
    @Parameter(property = "configPath", required = true )
    private String configPath;
    
    @Parameter(property = "idCatalog", required = true )
    private String idCatalog;
    
    
    private void addIfNotEmpty( Properties props, String key, String value ) {
    	if ( StringUtils.isNotEmpty( value ) ) {
    		props.setProperty( key , value );
    	}
    }
    
    public void execute() throws MojoExecutionException {
        try {
        	FileInputStream fis = new FileInputStream( new File( this.configPath ) );
        	try {
        		YamlDocConfig config = new YamlDocConfig();
        		config = (YamlDocConfig)YamlDocConfig.load( fis , config );
        		this.getLog().info( "keys : "+config.getIdSet() );
        		ListMapStringKey<OpenapiConfig> catalog = config.getListMap( this.idCatalog );
        		for ( OpenapiConfig current : catalog ) {
        			Properties props = new Properties();
                	this.addIfNotEmpty(props, YamlDocMain.ARG_INPUT_YAML, current.getInputYaml() );
                	this.addIfNotEmpty(props, YamlDocMain.ARG_OUTPUT_FILE, current.getOutputFile() );
                	this.addIfNotEmpty(props, YamlDocMain.ARG_LANGUAGE, current.getLanguage() );
                	this.addIfNotEmpty(props, YamlDocMain.ARG_LABEL_OVVERRIDE, current.getLabelsOverride() );
                	getLog().info( "using parameters -> "+props );
                	YamlDocMain.worker( props );
        		}
        	} catch (Exception e) {
        		e.printStackTrace();
        		throw new MojoExecutionException( "Error generating code : "+e, e );	
        	} finally {
        		fis.close();
			}
        	
        } catch (Exception e) {
        	throw new MojoExecutionException( "Error generating code : "+e, e );
        }
    }

}