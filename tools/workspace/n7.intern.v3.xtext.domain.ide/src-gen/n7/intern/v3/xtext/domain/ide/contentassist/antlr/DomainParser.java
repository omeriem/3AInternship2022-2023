/*
 * generated by Xtext 2.29.0
 */
package n7.intern.v3.xtext.domain.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import n7.intern.v3.xtext.domain.ide.contentassist.antlr.internal.InternalDomainParser;
import n7.intern.v3.xtext.domain.services.DomainGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DomainParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DomainGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DomainGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDomainFrameworkAccess().getAlternatives_6(), "rule__DomainFramework__Alternatives_6");
			builder.put(grammarAccess.getTypedParameterAccess().getAlternatives_3_1(), "rule__TypedParameter__Alternatives_3_1");
			builder.put(grammarAccess.getFunctionBlockAccess().getAlternatives_3_0_0(), "rule__FunctionBlock__Alternatives_3_0_0");
			builder.put(grammarAccess.getFunctionBlockAccess().getAlternatives_3_1(), "rule__FunctionBlock__Alternatives_3_1");
			builder.put(grammarAccess.getLanguageAccess().getAlternatives(), "rule__Language__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getDomainFrameworkAccess().getGroup(), "rule__DomainFramework__Group__0");
			builder.put(grammarAccess.getDomainFrameworkAccess().getGroup_0(), "rule__DomainFramework__Group_0__0");
			builder.put(grammarAccess.getTypedParameterAccess().getGroup(), "rule__TypedParameter__Group__0");
			builder.put(grammarAccess.getTypedParameterAccess().getGroup_0(), "rule__TypedParameter__Group_0__0");
			builder.put(grammarAccess.getTypedParameterAccess().getGroup_3(), "rule__TypedParameter__Group_3__0");
			builder.put(grammarAccess.getFunctionParameterAccess().getGroup(), "rule__FunctionParameter__Group__0");
			builder.put(grammarAccess.getFunctionParameterAccess().getGroup_0(), "rule__FunctionParameter__Group_0__0");
			builder.put(grammarAccess.getFunctionParameterAccess().getGroup_3(), "rule__FunctionParameter__Group_3__0");
			builder.put(grammarAccess.getAssignationMarkerAccess().getGroup(), "rule__AssignationMarker__Group__0");
			builder.put(grammarAccess.getFunctionMarkerAccess().getGroup(), "rule__FunctionMarker__Group__0");
			builder.put(grammarAccess.getFunctionBlockAccess().getGroup(), "rule__FunctionBlock__Group__0");
			builder.put(grammarAccess.getFunctionBlockAccess().getGroup_3(), "rule__FunctionBlock__Group_3__0");
			builder.put(grammarAccess.getFunctionBlockAccess().getGroup_3_0(), "rule__FunctionBlock__Group_3_0__0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getGroup_0(), "rule__FunctionDefinition__Group_0__0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getGroup_4(), "rule__FunctionDefinition__Group_4__0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getGroup_4_0(), "rule__FunctionDefinition__Group_4_0__0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getGroup_6(), "rule__FunctionDefinition__Group_6__0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getGroup_6_1(), "rule__FunctionDefinition__Group_6_1__0");
			builder.put(grammarAccess.getFunctionValueAccess().getGroup(), "rule__FunctionValue__Group__0");
			builder.put(grammarAccess.getSetupBlockAccess().getGroup(), "rule__SetupBlock__Group__0");
			builder.put(grammarAccess.getSetupAccess().getGroup(), "rule__Setup__Group__0");
			builder.put(grammarAccess.getDomainFrameworkAccess().getDescriptionAssignment_0_2(), "rule__DomainFramework__DescriptionAssignment_0_2");
			builder.put(grammarAccess.getDomainFrameworkAccess().getNameAssignment_2(), "rule__DomainFramework__NameAssignment_2");
			builder.put(grammarAccess.getDomainFrameworkAccess().getSetupsAssignment_4(), "rule__DomainFramework__SetupsAssignment_4");
			builder.put(grammarAccess.getDomainFrameworkAccess().getFunction_definitionsAssignment_5(), "rule__DomainFramework__Function_definitionsAssignment_5");
			builder.put(grammarAccess.getDomainFrameworkAccess().getParametersAssignment_6_0(), "rule__DomainFramework__ParametersAssignment_6_0");
			builder.put(grammarAccess.getDomainFrameworkAccess().getParametersAssignment_6_1(), "rule__DomainFramework__ParametersAssignment_6_1");
			builder.put(grammarAccess.getTypedParameterAccess().getDescriptionAssignment_0_2(), "rule__TypedParameter__DescriptionAssignment_0_2");
			builder.put(grammarAccess.getTypedParameterAccess().getTypeAssignment_1(), "rule__TypedParameter__TypeAssignment_1");
			builder.put(grammarAccess.getTypedParameterAccess().getNameAssignment_2(), "rule__TypedParameter__NameAssignment_2");
			builder.put(grammarAccess.getTypedParameterAccess().getDefault_valueAssignment_3_1_0(), "rule__TypedParameter__Default_valueAssignment_3_1_0");
			builder.put(grammarAccess.getTypedParameterAccess().getDefault_valueAssignment_3_1_1(), "rule__TypedParameter__Default_valueAssignment_3_1_1");
			builder.put(grammarAccess.getTypedParameterAccess().getDefault_valueAssignment_3_1_2(), "rule__TypedParameter__Default_valueAssignment_3_1_2");
			builder.put(grammarAccess.getTypedParameterAccess().getDefault_valueAssignment_3_1_3(), "rule__TypedParameter__Default_valueAssignment_3_1_3");
			builder.put(grammarAccess.getTypedParameterAccess().getDefault_valueAssignment_3_1_4(), "rule__TypedParameter__Default_valueAssignment_3_1_4");
			builder.put(grammarAccess.getTypedParameterAccess().getDefault_valueAssignment_3_1_5(), "rule__TypedParameter__Default_valueAssignment_3_1_5");
			builder.put(grammarAccess.getTypedParameterAccess().getDefault_valueAssignment_3_1_6(), "rule__TypedParameter__Default_valueAssignment_3_1_6");
			builder.put(grammarAccess.getTypedParameterAccess().getDefault_valueAssignment_3_1_7(), "rule__TypedParameter__Default_valueAssignment_3_1_7");
			builder.put(grammarAccess.getTypedParameterAccess().getDefault_valueAssignment_3_1_8(), "rule__TypedParameter__Default_valueAssignment_3_1_8");
			builder.put(grammarAccess.getTypedParameterAccess().getMarkersAssignment_5(), "rule__TypedParameter__MarkersAssignment_5");
			builder.put(grammarAccess.getFunctionParameterAccess().getDescriptionAssignment_0_2(), "rule__FunctionParameter__DescriptionAssignment_0_2");
			builder.put(grammarAccess.getFunctionParameterAccess().getFunction_typeAssignment_1(), "rule__FunctionParameter__Function_typeAssignment_1");
			builder.put(grammarAccess.getFunctionParameterAccess().getNameAssignment_2(), "rule__FunctionParameter__NameAssignment_2");
			builder.put(grammarAccess.getFunctionParameterAccess().getDefault_function_valueAssignment_3_1(), "rule__FunctionParameter__Default_function_valueAssignment_3_1");
			builder.put(grammarAccess.getFunctionParameterAccess().getMarkersAssignment_5(), "rule__FunctionParameter__MarkersAssignment_5");
			builder.put(grammarAccess.getAssignationMarkerAccess().getNameAssignment_2(), "rule__AssignationMarker__NameAssignment_2");
			builder.put(grammarAccess.getFunctionMarkerAccess().getNameAssignment_2(), "rule__FunctionMarker__NameAssignment_2");
			builder.put(grammarAccess.getFunctionMarkerAccess().getBlockAssignment_5(), "rule__FunctionMarker__BlockAssignment_5");
			builder.put(grammarAccess.getFunctionBlockAccess().getParametersAssignment_3_0_0_0(), "rule__FunctionBlock__ParametersAssignment_3_0_0_0");
			builder.put(grammarAccess.getFunctionBlockAccess().getParametersAssignment_3_0_0_1(), "rule__FunctionBlock__ParametersAssignment_3_0_0_1");
			builder.put(grammarAccess.getFunctionBlockAccess().getParametersAssignment_3_1_0(), "rule__FunctionBlock__ParametersAssignment_3_1_0");
			builder.put(grammarAccess.getFunctionBlockAccess().getParametersAssignment_3_1_1(), "rule__FunctionBlock__ParametersAssignment_3_1_1");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getDescriptionAssignment_0_2(), "rule__FunctionDefinition__DescriptionAssignment_0_2");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_2(), "rule__FunctionDefinition__NameAssignment_2");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getInputsAssignment_4_0_0(), "rule__FunctionDefinition__InputsAssignment_4_0_0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getInputsAssignment_4_1(), "rule__FunctionDefinition__InputsAssignment_4_1");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getOutputsAssignment_6_1_0(), "rule__FunctionDefinition__OutputsAssignment_6_1_0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getOutputsAssignment_6_2(), "rule__FunctionDefinition__OutputsAssignment_6_2");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getValuesAssignment_8(), "rule__FunctionDefinition__ValuesAssignment_8");
			builder.put(grammarAccess.getFunctionValueAccess().getNameAssignment_0(), "rule__FunctionValue__NameAssignment_0");
			builder.put(grammarAccess.getFunctionValueAccess().getInstructionsAssignment_2(), "rule__FunctionValue__InstructionsAssignment_2");
			builder.put(grammarAccess.getSetupBlockAccess().getLanguageAssignment_1(), "rule__SetupBlock__LanguageAssignment_1");
			builder.put(grammarAccess.getSetupBlockAccess().getInstructionsAssignment_3(), "rule__SetupBlock__InstructionsAssignment_3");
			builder.put(grammarAccess.getSetupAccess().getInstructionsAssignment_2(), "rule__Setup__InstructionsAssignment_2");
			builder.put(grammarAccess.getStringInstructionAccess().getContentAssignment(), "rule__StringInstruction__ContentAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DomainGrammarAccess grammarAccess;

	@Override
	protected InternalDomainParser createParser() {
		InternalDomainParser result = new InternalDomainParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DomainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
