package br.fatec.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.modelo.Empresa;

public class UC01CadastrarEmpresa {
	public static Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa = new Empresa();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	/*
	 * verifica a validação dos dados com sucesso
	 */
	@Test
	public void CT01UC01FBvalida_os_dados_com_sucesso() {
		try {
			empresa.setCnpj("78666151000170");
			empresa.setNomeDaEmpresa("Open informatica Ltda");
			empresa.setNomeFantasia("Open informatica");
			empresa.setEndereco("Av. Aguia de Haia 1783");
			empresa.setTelefone("12121212");
		} catch (Exception e) {
			fail("dados invalidos");
		}
	}
	/*
	 * verifica a validação dos dados para cnpj invalido
	 */
	@Test(expected=IllegalArgumentException.class)
	public void CT02UC01A3cnpj_invalido() {
			empresa.setCnpj("");
	}
	
}


