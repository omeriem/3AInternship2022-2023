/*
 * generated by Xtext 2.29.0
 */
package n7.intern.v3.xtext.idsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import n7.intern.v3.xtext.idsl.IDslRuntimeModule;
import n7.intern.v3.xtext.idsl.IDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class IDslIdeSetup extends IDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new IDslRuntimeModule(), new IDslIdeModule()));
	}
	
}