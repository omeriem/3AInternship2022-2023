/*
 * generated by Xtext 2.29.0
 */
package n7.intern.v3.xtext.domain;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DomainStandaloneSetup extends DomainStandaloneSetupGenerated {

	public static void doSetup() {
		new DomainStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
