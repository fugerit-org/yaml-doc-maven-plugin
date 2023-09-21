package test.org.fugerit.java.yaml.doc.maven;

import java.io.File;

import org.apache.maven.plugin.MojoExecutionException;
import org.fugerit.java.core.function.SafeFunction;
import org.fugerit.java.yaml.doc.maven.MojoGenerate;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestMojoGenerate {

	@Test
	public void testMojoeGenerate001() {
		SafeFunction.apply( () -> {
			MojoGenerate generate = new MojoGenerate();
			generate.setConfigPath( "src/test/resources/yaml-doc-config.xml" );
			generate.setIdCatalog( "sample" );
			generate.execute();
			File pdf = new File( "target/sample.pdf" );
			log.info( "output {}", pdf );
			Assert.assertTrue( pdf.exists() );
		} );
	}

	@Test
	public void testMojoeGenerate001Fail() {
		MojoGenerate generate = new MojoGenerate();
		Assert.assertThrows( MojoExecutionException.class , () -> generate.execute() );
	}
	
}
