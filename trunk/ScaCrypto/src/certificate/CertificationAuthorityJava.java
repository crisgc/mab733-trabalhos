/*
 * PPGI UFRJ 2013
 */
package certificate;

import java.util.HashMap;
import java.util.Map;


/**
 * Implementação em Java de uma autoridade certificadora
 * @author Cristiano Castro
 *
 */
public class CertificationAuthorityJava implements ICertificationAuthority {
	
	private Map<String, PersonEntry> dataBase = new HashMap<>();
	
	public CertificationAuthorityJava() {
		this.init();
	}
	
	/**
	 * Inicializa os dados de um banco de dados
	 */
	public void init() {
		PersonEntry ron = new PersonEntry();
		ron.setName("Ron Rivest");
		ron.setPrivateKeyExponent("1869717881378213230637874657703022047839720222364972003580328822663535781293680667377408631815167686728367898118285454879357305918354382218054218023196432236497714821593987825803398662618837");
		ron.setPublicKeyExponent("65537");
		ron.setModulus("1907556405060696491061450432646028861081179759533184460647975622318915025587184175754054976155121593293492260464152630093238509246603207417124726121580858185985938946945490481721756401423481");
		
		this.dataBase.put("111", ron);
	}

	/**
	 * Captura a parte do expoente.
	 * 
	 * @param id o identificador da chave
	 * @return a parte de expoente da chave privada da pessoa identificada, ou 
	 * <code>null</code> se a pessoa não estiver no banco de dados
	 */
	@Override
	public String getPrivateKeyExponent(String id) {
		String result = null;
		if (this.dataBase.containsKey(id)) {
			result = this.dataBase.get(id).getPrivateKeyExponent();
		}
		return result;
	}

	/**
	 * Retorna a parte modulo das chaves pública e privadas
	 * 
	 * @param id a identificação da entidade a ter a parte módulo retornada
	 * @return A identificação do módulo da chave ou <code>null</code> caso 
	 */
	@Override
	public String getModulo(String id) {
		String result = null;
		if (this.dataBase.containsKey(id)) {
			result = this.dataBase.get(id).getModulus();
		}
		return result;
	}
	
	/**
	 * Entrada correspondente a uma identificação no banco de dados
	 * @author Cristiano Castro
	 *
	 */
	protected class PersonEntry {
		
		private String name;
		
		private String privateKeyExponent;
		
		private String publicKeyExponent;
		
		private String modulus;

		public String getPrivateKeyExponent() {
			return privateKeyExponent;
		}

		public void setPrivateKeyExponent(String privateKeyExponent) {
			this.privateKeyExponent = privateKeyExponent;
		}

		public String getPublicKeyExponent() {
			return publicKeyExponent;
		}

		public void setPublicKeyExponent(String publicKeyExponent) {
			this.publicKeyExponent = publicKeyExponent;
		}

		public String getModulus() {
			return modulus;
		}

		public void setModulus(String modulus) {
			this.modulus = modulus;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		/**
		 * 
		 */
		public PersonEntry() {
		}
		
	}

	@Override
	/**
	 * Retorna um expoente de um public key. Se não houver public key 
	 * correspondente ao id passado a resposta é <code>null</code>.
	 */
	public String getPublicKeyExponent(String id) {
		String result = null;
		if (this.dataBase.containsKey(id)) {
			result = this.dataBase.get(id).getPublicKeyExponent();
		}	
		return result;
	}


}
