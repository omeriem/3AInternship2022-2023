/*
 * generated by Xtext 2.29.0
 */
package n7.intern.v3.xtext.idsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class IDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("n7/intern/v3/xtext/idsl/parser/antlr/internal/InternalIDsl.tokens");
	}
}