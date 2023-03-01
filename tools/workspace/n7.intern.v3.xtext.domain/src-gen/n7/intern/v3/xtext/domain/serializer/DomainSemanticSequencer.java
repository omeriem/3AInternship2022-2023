/*
 * generated by Xtext 2.29.0
 */
package n7.intern.v3.xtext.domain.serializer;

import Domain.AssignationMarker;
import Domain.DomainFramework;
import Domain.DomainPackage;
import Domain.FunctionBlock;
import Domain.FunctionDefinition;
import Domain.FunctionMarker;
import Domain.FunctionValue;
import Domain.Setup;
import Domain.SetupBlock;
import Domain.StringInstruction;
import com.google.inject.Inject;
import java.util.Set;
import n7.intern.v3.xtext.domain.services.DomainGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DomainSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DomainGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DomainPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomainPackage.ASSIGNATION_MARKER:
				sequence_AssignationMarker(context, (AssignationMarker) semanticObject); 
				return; 
			case DomainPackage.DOMAIN_FRAMEWORK:
				sequence_DomainFramework(context, (DomainFramework) semanticObject); 
				return; 
			case DomainPackage.FUNCTION_BLOCK:
				sequence_FunctionBlock(context, (FunctionBlock) semanticObject); 
				return; 
			case DomainPackage.FUNCTION_DEFINITION:
				sequence_FunctionDefinition(context, (FunctionDefinition) semanticObject); 
				return; 
			case DomainPackage.FUNCTION_MARKER:
				sequence_FunctionMarker(context, (FunctionMarker) semanticObject); 
				return; 
			case DomainPackage.FUNCTION_VALUE:
				sequence_FunctionValue(context, (FunctionValue) semanticObject); 
				return; 
			case DomainPackage.PARAMETER:
				if (rule == grammarAccess.getFunctionParameterRule()) {
					sequence_FunctionParameter(context, (Domain.Parameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypedParameterRule()) {
					sequence_TypedParameter(context, (Domain.Parameter) semanticObject); 
					return; 
				}
				else break;
			case DomainPackage.SETUP:
				sequence_Setup(context, (Setup) semanticObject); 
				return; 
			case DomainPackage.SETUP_BLOCK:
				sequence_SetupBlock(context, (SetupBlock) semanticObject); 
				return; 
			case DomainPackage.STRING_INSTRUCTION:
				sequence_StringInstruction(context, (StringInstruction) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AssignationMarker returns AssignationMarker
	 *
	 * Constraint:
	 *     name=MarkerID
	 * </pre>
	 */
	protected void sequence_AssignationMarker(ISerializationContext context, AssignationMarker semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainPackage.Literals.MARKER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainPackage.Literals.MARKER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignationMarkerAccess().getNameMarkerIDEnumRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DomainFramework returns DomainFramework
	 *
	 * Constraint:
	 *     (
	 *         description=STRING? 
	 *         name=ID 
	 *         setups+=Setup 
	 *         function_definitions+=FunctionDefinition* 
	 *         (parameters+=TypedParameter | parameters+=FunctionParameter)*
	 *     )
	 * </pre>
	 */
	protected void sequence_DomainFramework(ISerializationContext context, DomainFramework semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FunctionBlock returns FunctionBlock
	 *
	 * Constraint:
	 *     (parameters+=ID? (parameters+=DEFAULT_PARAMETER? parameters+=ID?)* (parameters+=ID | parameters+=DEFAULT_PARAMETER))?
	 * </pre>
	 */
	protected void sequence_FunctionBlock(ISerializationContext context, FunctionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FunctionDefinition returns FunctionDefinition
	 *
	 * Constraint:
	 *     (description=STRING? name=ID (inputs+=Type* inputs+=Type)? (outputs+=Type* outputs+=Type)? values+=FunctionValue+)
	 * </pre>
	 */
	protected void sequence_FunctionDefinition(ISerializationContext context, FunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FunctionMarker returns FunctionMarker
	 *
	 * Constraint:
	 *     (name=MarkerID block=FunctionBlock)
	 * </pre>
	 */
	protected void sequence_FunctionMarker(ISerializationContext context, FunctionMarker semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainPackage.Literals.MARKER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainPackage.Literals.MARKER__NAME));
			if (transientValues.isValueTransient(semanticObject, DomainPackage.Literals.FUNCTION_MARKER__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainPackage.Literals.FUNCTION_MARKER__BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionMarkerAccess().getNameMarkerIDEnumRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionMarkerAccess().getBlockFunctionBlockParserRuleCall_5_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FunctionParameter returns Parameter
	 *
	 * Constraint:
	 *     (description=STRING? function_type=[FunctionDefinition|ID] name=ID default_function_value=QUALIFIED_NAME? markers+=FunctionMarker*)
	 * </pre>
	 */
	protected void sequence_FunctionParameter(ISerializationContext context, Domain.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FunctionValue returns FunctionValue
	 *
	 * Constraint:
	 *     (name=ID instructions+=SetupBlock+)
	 * </pre>
	 */
	protected void sequence_FunctionValue(ISerializationContext context, FunctionValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SetupBlock returns SetupBlock
	 *
	 * Constraint:
	 *     (language=Language instructions+=StringInstruction)
	 * </pre>
	 */
	protected void sequence_SetupBlock(ISerializationContext context, SetupBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Setup returns Setup
	 *
	 * Constraint:
	 *     instructions+=SetupBlock+
	 * </pre>
	 */
	protected void sequence_Setup(ISerializationContext context, Setup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StringInstruction returns StringInstruction
	 *
	 * Constraint:
	 *     content=UNQUOTEDSTRING
	 * </pre>
	 */
	protected void sequence_StringInstruction(ISerializationContext context, StringInstruction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainPackage.Literals.STRING_INSTRUCTION__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainPackage.Literals.STRING_INSTRUCTION__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringInstructionAccess().getContentUNQUOTEDSTRINGTerminalRuleCall_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TypedParameter returns Parameter
	 *
	 * Constraint:
	 *     (
	 *         description=STRING? 
	 *         type=Type 
	 *         name=ID 
	 *         (
	 *             default_value=STRING | 
	 *             default_value=INT | 
	 *             default_value=NINT | 
	 *             default_value=BOOLEAN | 
	 *             default_value=FLOAT | 
	 *             default_value=CHAR | 
	 *             default_value=LONG | 
	 *             default_value=BYTE | 
	 *             default_value=DOUBLE
	 *         )? 
	 *         markers+=AssignationMarker*
	 *     )
	 * </pre>
	 */
	protected void sequence_TypedParameter(ISerializationContext context, Domain.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
