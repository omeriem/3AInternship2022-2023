/*
 * generated by Xtext 2.29.0
 */
grammar InternalDomain;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package n7.intern.v3.xtext.domain.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package n7.intern.v3.xtext.domain.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import n7.intern.v3.xtext.domain.services.DomainGrammarAccess;

}

@parser::members {

 	private DomainGrammarAccess grammarAccess;

    public InternalDomainParser(TokenStream input, DomainGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DomainFramework";
   	}

   	@Override
   	protected DomainGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDomainFramework
entryRuleDomainFramework returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}:
	{ newCompositeNode(grammarAccess.getDomainFrameworkRule()); }
	iv_ruleDomainFramework=ruleDomainFramework
	{ $current=$iv_ruleDomainFramework.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule DomainFramework
ruleDomainFramework returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='@description'
			{
				newLeafNode(otherlv_0, grammarAccess.getDomainFrameworkAccess().getDescriptionKeyword_0_0());
			}
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getDomainFrameworkAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					lv_description_2_0=RULE_STRING
					{
						newLeafNode(lv_description_2_0, grammarAccess.getDomainFrameworkAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDomainFrameworkRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getDomainFrameworkAccess().getRightParenthesisKeyword_0_3());
			}
		)?
		otherlv_4='domain'
		{
			newLeafNode(otherlv_4, grammarAccess.getDomainFrameworkAccess().getDomainKeyword_1());
		}
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getDomainFrameworkAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDomainFrameworkRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getDomainFrameworkAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainFrameworkAccess().getSetupsSetupParserRuleCall_4_0());
				}
				lv_setups_7_0=ruleSetup
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainFrameworkRule());
					}
					add(
						$current,
						"setups",
						lv_setups_7_0,
						"n7.intern.v3.xtext.domain.Domain.Setup");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainFrameworkAccess().getFunction_definitionsFunctionDefinitionParserRuleCall_5_0());
				}
				lv_function_definitions_8_0=ruleFunctionDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainFrameworkRule());
					}
					add(
						$current,
						"function_definitions",
						lv_function_definitions_8_0,
						"n7.intern.v3.xtext.domain.Domain.FunctionDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDomainFrameworkAccess().getParametersTypedParameterParserRuleCall_6_0_0());
					}
					lv_parameters_9_0=ruleTypedParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDomainFrameworkRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_9_0,
							"n7.intern.v3.xtext.domain.Domain.TypedParameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDomainFrameworkAccess().getParametersFunctionParameterParserRuleCall_6_1_0());
					}
					lv_parameters_10_0=ruleFunctionParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDomainFrameworkRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_10_0,
							"n7.intern.v3.xtext.domain.Domain.FunctionParameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getDomainFrameworkAccess().getRightCurlyBracketKeyword_7());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleTypedParameter
entryRuleTypedParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypedParameterRule()); }
	iv_ruleTypedParameter=ruleTypedParameter
	{ $current=$iv_ruleTypedParameter.current; }
	EOF;

// Rule TypedParameter
ruleTypedParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='@description'
			{
				newLeafNode(otherlv_0, grammarAccess.getTypedParameterAccess().getDescriptionKeyword_0_0());
			}
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getTypedParameterAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					lv_description_2_0=RULE_STRING
					{
						newLeafNode(lv_description_2_0, grammarAccess.getTypedParameterAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypedParameterRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getTypedParameterAccess().getRightParenthesisKeyword_0_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getTypedParameterAccess().getTypeTypeEnumRuleCall_1_0());
				}
				lv_type_4_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypedParameterRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"n7.intern.v3.xtext.domain.Domain.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getTypedParameterAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypedParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_6='='
			{
				newLeafNode(otherlv_6, grammarAccess.getTypedParameterAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					(
						lv_default_value_7_0=RULE_STRING
						{
							newLeafNode(lv_default_value_7_0, grammarAccess.getTypedParameterAccess().getDefault_valueSTRINGTerminalRuleCall_3_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTypedParameterRule());
							}
							setWithLastConsumed(
								$current,
								"default_value",
								lv_default_value_7_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
				    |
				(
					(
						lv_default_value_8_0=RULE_INT
						{
							newLeafNode(lv_default_value_8_0, grammarAccess.getTypedParameterAccess().getDefault_valueINTTerminalRuleCall_3_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTypedParameterRule());
							}
							setWithLastConsumed(
								$current,
								"default_value",
								lv_default_value_8_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
				    |
				(
					(
						lv_default_value_9_0=RULE_NINT
						{
							newLeafNode(lv_default_value_9_0, grammarAccess.getTypedParameterAccess().getDefault_valueNINTTerminalRuleCall_3_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTypedParameterRule());
							}
							setWithLastConsumed(
								$current,
								"default_value",
								lv_default_value_9_0,
								"n7.intern.v3.xtext.domain.Domain.NINT");
						}
					)
				)
				    |
				(
					(
						lv_default_value_10_0=RULE_BOOLEAN
						{
							newLeafNode(lv_default_value_10_0, grammarAccess.getTypedParameterAccess().getDefault_valueBOOLEANTerminalRuleCall_3_1_3_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTypedParameterRule());
							}
							setWithLastConsumed(
								$current,
								"default_value",
								lv_default_value_10_0,
								"n7.intern.v3.xtext.domain.Domain.BOOLEAN");
						}
					)
				)
				    |
				(
					(
						lv_default_value_11_0=RULE_FLOAT
						{
							newLeafNode(lv_default_value_11_0, grammarAccess.getTypedParameterAccess().getDefault_valueFLOATTerminalRuleCall_3_1_4_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTypedParameterRule());
							}
							setWithLastConsumed(
								$current,
								"default_value",
								lv_default_value_11_0,
								"n7.intern.v3.xtext.domain.Domain.FLOAT");
						}
					)
				)
				    |
				(
					(
						lv_default_value_12_0=RULE_CHAR
						{
							newLeafNode(lv_default_value_12_0, grammarAccess.getTypedParameterAccess().getDefault_valueCHARTerminalRuleCall_3_1_5_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTypedParameterRule());
							}
							setWithLastConsumed(
								$current,
								"default_value",
								lv_default_value_12_0,
								"n7.intern.v3.xtext.domain.Domain.CHAR");
						}
					)
				)
				    |
				(
					(
						lv_default_value_13_0=RULE_LONG
						{
							newLeafNode(lv_default_value_13_0, grammarAccess.getTypedParameterAccess().getDefault_valueLONGTerminalRuleCall_3_1_6_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTypedParameterRule());
							}
							setWithLastConsumed(
								$current,
								"default_value",
								lv_default_value_13_0,
								"n7.intern.v3.xtext.domain.Domain.LONG");
						}
					)
				)
				    |
				(
					(
						lv_default_value_14_0=RULE_BYTE
						{
							newLeafNode(lv_default_value_14_0, grammarAccess.getTypedParameterAccess().getDefault_valueBYTETerminalRuleCall_3_1_7_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTypedParameterRule());
							}
							setWithLastConsumed(
								$current,
								"default_value",
								lv_default_value_14_0,
								"n7.intern.v3.xtext.domain.Domain.BYTE");
						}
					)
				)
				    |
				(
					(
						lv_default_value_15_0=RULE_DOUBLE
						{
							newLeafNode(lv_default_value_15_0, grammarAccess.getTypedParameterAccess().getDefault_valueDOUBLETerminalRuleCall_3_1_8_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTypedParameterRule());
							}
							setWithLastConsumed(
								$current,
								"default_value",
								lv_default_value_15_0,
								"n7.intern.v3.xtext.domain.Domain.DOUBLE");
						}
					)
				)
			)
		)?
		otherlv_16='{'
		{
			newLeafNode(otherlv_16, grammarAccess.getTypedParameterAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypedParameterAccess().getMarkersAssignationMarkerParserRuleCall_5_0());
				}
				lv_markers_17_0=ruleAssignationMarker
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypedParameterRule());
					}
					add(
						$current,
						"markers",
						lv_markers_17_0,
						"n7.intern.v3.xtext.domain.Domain.AssignationMarker");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getTypedParameterAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleFunctionParameter
entryRuleFunctionParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionParameterRule()); }
	iv_ruleFunctionParameter=ruleFunctionParameter
	{ $current=$iv_ruleFunctionParameter.current; }
	EOF;

// Rule FunctionParameter
ruleFunctionParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='@description'
			{
				newLeafNode(otherlv_0, grammarAccess.getFunctionParameterAccess().getDescriptionKeyword_0_0());
			}
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getFunctionParameterAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					lv_description_2_0=RULE_STRING
					{
						newLeafNode(lv_description_2_0, grammarAccess.getFunctionParameterAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFunctionParameterRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getFunctionParameterAccess().getRightParenthesisKeyword_0_3());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionParameterRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getFunctionParameterAccess().getFunction_typeFunctionDefinitionCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getFunctionParameterAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_6='='
			{
				newLeafNode(otherlv_6, grammarAccess.getFunctionParameterAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					lv_default_function_value_7_0=RULE_QUALIFIED_NAME
					{
						newLeafNode(lv_default_function_value_7_0, grammarAccess.getFunctionParameterAccess().getDefault_function_valueQUALIFIED_NAMETerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFunctionParameterRule());
						}
						setWithLastConsumed(
							$current,
							"default_function_value",
							lv_default_function_value_7_0,
							"n7.intern.v3.xtext.domain.Domain.QUALIFIED_NAME");
					}
				)
			)
		)?
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getFunctionParameterAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionParameterAccess().getMarkersFunctionMarkerParserRuleCall_5_0());
				}
				lv_markers_9_0=ruleFunctionMarker
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionParameterRule());
					}
					add(
						$current,
						"markers",
						lv_markers_9_0,
						"n7.intern.v3.xtext.domain.Domain.FunctionMarker");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getFunctionParameterAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAssignationMarker
entryRuleAssignationMarker returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignationMarkerRule()); }
	iv_ruleAssignationMarker=ruleAssignationMarker
	{ $current=$iv_ruleAssignationMarker.current; }
	EOF;

// Rule AssignationMarker
ruleAssignationMarker returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@assign'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssignationMarkerAccess().getAssignKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getAssignationMarkerAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignationMarkerAccess().getNameMarkerIDEnumRuleCall_2_0());
				}
				lv_name_2_0=ruleMarkerID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignationMarkerRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"n7.intern.v3.xtext.domain.Domain.MarkerID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getAssignationMarkerAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleFunctionMarker
entryRuleFunctionMarker returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionMarkerRule()); }
	iv_ruleFunctionMarker=ruleFunctionMarker
	{ $current=$iv_ruleFunctionMarker.current; }
	EOF;

// Rule FunctionMarker
ruleFunctionMarker returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@do'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionMarkerAccess().getDoKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getFunctionMarkerAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionMarkerAccess().getNameMarkerIDEnumRuleCall_2_0());
				}
				lv_name_2_0=ruleMarkerID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionMarkerRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"n7.intern.v3.xtext.domain.Domain.MarkerID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getFunctionMarkerAccess().getRightParenthesisKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getFunctionMarkerAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionMarkerAccess().getBlockFunctionBlockParserRuleCall_5_0());
				}
				lv_block_5_0=ruleFunctionBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionMarkerRule());
					}
					set(
						$current,
						"block",
						lv_block_5_0,
						"n7.intern.v3.xtext.domain.Domain.FunctionBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getFunctionMarkerAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleFunctionBlock
entryRuleFunctionBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionBlockRule()); }
	iv_ruleFunctionBlock=ruleFunctionBlock
	{ $current=$iv_ruleFunctionBlock.current; }
	EOF;

// Rule FunctionBlock
ruleFunctionBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFunctionBlockAccess().getFunctionBlockAction_0(),
					$current);
			}
		)
		otherlv_1='this'
		{
			newLeafNode(otherlv_1, grammarAccess.getFunctionBlockAccess().getThisKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionBlockAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					(
						(
							lv_parameters_3_0=RULE_ID
							{
								newLeafNode(lv_parameters_3_0, grammarAccess.getFunctionBlockAccess().getParametersIDTerminalRuleCall_3_0_0_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getFunctionBlockRule());
								}
								addWithLastConsumed(
									$current,
									"parameters",
									lv_parameters_3_0,
									"org.eclipse.xtext.common.Terminals.ID");
							}
						)
					)
					    |
					(
						(
							lv_parameters_4_0=RULE_DEFAULT_PARAMETER
							{
								newLeafNode(lv_parameters_4_0, grammarAccess.getFunctionBlockAccess().getParametersDEFAULT_PARAMETERTerminalRuleCall_3_0_0_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getFunctionBlockRule());
								}
								addWithLastConsumed(
									$current,
									"parameters",
									lv_parameters_4_0,
									"n7.intern.v3.xtext.domain.Domain.DEFAULT_PARAMETER");
							}
						)
					)
				)
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getFunctionBlockAccess().getCommaKeyword_3_0_1());
				}
			)*
			(
				(
					(
						lv_parameters_6_0=RULE_ID
						{
							newLeafNode(lv_parameters_6_0, grammarAccess.getFunctionBlockAccess().getParametersIDTerminalRuleCall_3_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFunctionBlockRule());
							}
							addWithLastConsumed(
								$current,
								"parameters",
								lv_parameters_6_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				    |
				(
					(
						lv_parameters_7_0=RULE_DEFAULT_PARAMETER
						{
							newLeafNode(lv_parameters_7_0, grammarAccess.getFunctionBlockAccess().getParametersDEFAULT_PARAMETERTerminalRuleCall_3_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFunctionBlockRule());
							}
							addWithLastConsumed(
								$current,
								"parameters",
								lv_parameters_7_0,
								"n7.intern.v3.xtext.domain.Domain.DEFAULT_PARAMETER");
						}
					)
				)
			)
		)?
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getFunctionBlockAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleFunctionDefinition
entryRuleFunctionDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionDefinitionRule()); }
	iv_ruleFunctionDefinition=ruleFunctionDefinition
	{ $current=$iv_ruleFunctionDefinition.current; }
	EOF;

// Rule FunctionDefinition
ruleFunctionDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='@description'
			{
				newLeafNode(otherlv_0, grammarAccess.getFunctionDefinitionAccess().getDescriptionKeyword_0_0());
			}
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					lv_description_2_0=RULE_STRING
					{
						newLeafNode(lv_description_2_0, grammarAccess.getFunctionDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFunctionDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_0_3());
			}
		)?
		otherlv_4='def'
		{
			newLeafNode(otherlv_4, grammarAccess.getFunctionDefinitionAccess().getDefKeyword_1());
		}
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_6='('
		{
			newLeafNode(otherlv_6, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getInputsTypeEnumRuleCall_4_0_0_0());
						}
						lv_inputs_7_0=ruleType
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
							}
							add(
								$current,
								"inputs",
								lv_inputs_7_0,
								"n7.intern.v3.xtext.domain.Domain.Type");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_4_0_1());
				}
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getInputsTypeEnumRuleCall_4_1_0());
					}
					lv_inputs_9_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
						}
						add(
							$current,
							"inputs",
							lv_inputs_9_0,
							"n7.intern.v3.xtext.domain.Domain.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_10=')'
		{
			newLeafNode(otherlv_10, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_5());
		}
		(
			otherlv_11=':'
			{
				newLeafNode(otherlv_11, grammarAccess.getFunctionDefinitionAccess().getColonKeyword_6_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOutputsTypeEnumRuleCall_6_1_0_0());
						}
						lv_outputs_12_0=ruleType
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
							}
							add(
								$current,
								"outputs",
								lv_outputs_12_0,
								"n7.intern.v3.xtext.domain.Domain.Type");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_6_1_1());
				}
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOutputsTypeEnumRuleCall_6_2_0());
					}
					lv_outputs_14_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
						}
						add(
							$current,
							"outputs",
							lv_outputs_14_0,
							"n7.intern.v3.xtext.domain.Domain.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_15='{'
		{
			newLeafNode(otherlv_15, grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getValuesFunctionValueParserRuleCall_8_0());
				}
				lv_values_16_0=ruleFunctionValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
					}
					add(
						$current,
						"values",
						lv_values_16_0,
						"n7.intern.v3.xtext.domain.Domain.FunctionValue");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleFunctionValue
entryRuleFunctionValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionValueRule()); }
	iv_ruleFunctionValue=ruleFunctionValue
	{ $current=$iv_ruleFunctionValue.current; }
	EOF;

// Rule FunctionValue
ruleFunctionValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFunctionValueAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionValueRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getFunctionValueAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionValueAccess().getInstructionsSetupBlockParserRuleCall_2_0());
				}
				lv_instructions_2_0=ruleSetupBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionValueRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_2_0,
						"n7.intern.v3.xtext.domain.Domain.SetupBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getFunctionValueAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleSetupBlock
entryRuleSetupBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSetupBlockRule()); }
	iv_ruleSetupBlock=ruleSetupBlock
	{ $current=$iv_ruleSetupBlock.current; }
	EOF;

// Rule SetupBlock
ruleSetupBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getSetupBlockAccess().getCommercialAtKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSetupBlockAccess().getLanguageLanguageEnumRuleCall_1_0());
				}
				lv_language_1_0=ruleLanguage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSetupBlockRule());
					}
					set(
						$current,
						"language",
						lv_language_1_0,
						"n7.intern.v3.xtext.domain.Domain.Language");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSetupBlockAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSetupBlockAccess().getInstructionsStringInstructionParserRuleCall_3_0());
				}
				lv_instructions_3_0=ruleStringInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSetupBlockRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_3_0,
						"n7.intern.v3.xtext.domain.Domain.StringInstruction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getSetupBlockAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleSetup
entryRuleSetup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSetupRule()); }
	iv_ruleSetup=ruleSetup
	{ $current=$iv_ruleSetup.current; }
	EOF;

// Rule Setup
ruleSetup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='setup'
		{
			newLeafNode(otherlv_0, grammarAccess.getSetupAccess().getSetupKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSetupAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSetupAccess().getInstructionsSetupBlockParserRuleCall_2_0());
				}
				lv_instructions_2_0=ruleSetupBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSetupRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_2_0,
						"n7.intern.v3.xtext.domain.Domain.SetupBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getSetupAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleStringInstruction
entryRuleStringInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringInstructionRule()); }
	iv_ruleStringInstruction=ruleStringInstruction
	{ $current=$iv_ruleStringInstruction.current; }
	EOF;

// Rule StringInstruction
ruleStringInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_content_0_0=RULE_UNQUOTEDSTRING
			{
				newLeafNode(lv_content_0_0, grammarAccess.getStringInstructionAccess().getContentUNQUOTEDSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringInstructionRule());
				}
				setWithLastConsumed(
					$current,
					"content",
					lv_content_0_0,
					"n7.intern.v3.xtext.domain.Domain.UNQUOTEDSTRING");
			}
		)
	)
;

// Rule Language
ruleLanguage returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='python'
			{
				$current = grammarAccess.getLanguageAccess().getPythonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getPythonEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='java'
			{
				$current = grammarAccess.getLanguageAccess().getJavaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getJavaEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='c'
			{
				$current = grammarAccess.getLanguageAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getCEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule MarkerID
ruleMarkerID returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='Interpolation'
		{
			$current = grammarAccess.getMarkerIDAccess().getINTERPOLATIONEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getMarkerIDAccess().getINTERPOLATIONEnumLiteralDeclaration());
		}
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='string'
			{
				$current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='byte'
			{
				$current = grammarAccess.getTypeAccess().getByteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getByteEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='short'
			{
				$current = grammarAccess.getTypeAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getShortEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='int'
			{
				$current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='long'
			{
				$current = grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='float'
			{
				$current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='double'
			{
				$current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='char'
			{
				$current = grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='boolean'
			{
				$current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_8());
			}
		)
	)
;

RULE_DEFAULT_PARAMETER : '$' RULE_INT;

RULE_UNQUOTEDSTRING : '>' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'>'|'<'|'\\')|~(('\\'|'<')))* '<';

RULE_QUALIFIED_NAME : RULE_ID '.' RULE_ID;

RULE_BOOLEAN : ('true'|'false');

RULE_NINT : '-' RULE_INT;

RULE_LONG : (RULE_NINT|RULE_INT) ('l'|'L');

RULE_FLOAT : (RULE_NINT|RULE_INT) ('.' RULE_INT)? ('f'|'F');

RULE_DOUBLE : (RULE_NINT|RULE_INT) ('.' RULE_INT)? ('d'|'D');

RULE_CHAR : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\''))) '\'';

RULE_BYTE : '0x' (('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9')|('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9')|('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9')|('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9'));

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;