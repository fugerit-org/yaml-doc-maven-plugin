package test.org.fugerit.java.yaml.doc.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.fugerit.java.yaml.doc.maven.MojoGenerate;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestMojoGenerate {

	@Test
	public void testMojoeGenerate001() {
		MojoGenerate generate = new MojoGenerate();
		boolean ok = false;
		try {
			generate.execute();
		} catch (MojoExecutionException e) {
			log.info( "mojo generate exception ok : {}", e.getMessage() );
			ok = true;
			Assert.assertTrue(ok);
		}
	}
	
}
