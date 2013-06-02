package tests;

import org.junit.Assert;
import org.junit.Test;

import certificate.CertificationAuthorityImpl;
import certificate.ICertificationAuthority;

public class CertificationAuthorityImplTest {
	
	private ICertificationAuthority authorithy = new CertificationAuthorityImpl();
	
	@Test
	public void testGetPublicKeyExponent() {
		String response = this.authorithy.getPublicKeyExponent("111");
		Assert.assertEquals("Não consegui recuperar corretamente o expoente da chave pública", 
				"65537", response);
	}
	
	@Test
	public void testGetPrivateKeyExponent() {
		String response = this.authorithy.getPrivateKeyExponent("111");
		Assert.assertEquals("Não consegui recuperar corretamente o expoente da chave privada", 
				"1869717881378213230637874657703022047839720222364972003580328822663535781293680667377408631815167686728367898118285454879357305918354382218054218023196432236497714821593987825803398662618837", response);
	}
	
	@Test
	public void testGetModulo() {
		String response = this.authorithy.getModulo("111");
		Assert.assertEquals("Não conseguiu recuperar corretamente o módulo", 
				"1907556405060696491061450432646028861081179759533184460647975622318915025587184175754054976155121593293492260464152630093238509246603207417124726121580858185985938946945490481721756401423481", 
				response);
	}

}
