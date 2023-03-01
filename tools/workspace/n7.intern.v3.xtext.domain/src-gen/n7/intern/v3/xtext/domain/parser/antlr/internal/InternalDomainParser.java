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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NINT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_CHAR", "RULE_LONG", "RULE_BYTE", "RULE_DOUBLE", "RULE_QUALIFIED_NAME", "RULE_DEFAULT_PARAMETER", "RULE_UNQUOTEDSTRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@description'", "'('", "')'", "'domain'", "'{'", "'}'", "'='", "'@assign'", "'@do'", "'this'", "','", "'def'", "':'", "'@'", "'setup'", "'python'", "'java'", "'c'", "'Interpolation'", "'string'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'boolean'"
    };
    public static final int RULE_NINT=7;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_CHAR=10;
    public static final int RULE_QUALIFIED_NAME=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_BYTE=12;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=13;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_DEFAULT_PARAMETER=15;
    public static final int T__48=48;
    public static final int RULE_UNQUOTEDSTRING=16;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=9;
    public static final int T__46=46;
    public static final int RULE_LONG=11;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDomainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomain.g"; }



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




    // $ANTLR start "entryRuleDomainFramework"
    // InternalDomain.g:65:1: entryRuleDomainFramework returns [EObject current=null] : iv_ruleDomainFramework= ruleDomainFramework EOF ;
    public final EObject entryRuleDomainFramework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainFramework = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalDomain.g:67:2: (iv_ruleDomainFramework= ruleDomainFramework EOF )
            // InternalDomain.g:68:2: iv_ruleDomainFramework= ruleDomainFramework EOF
            {
             newCompositeNode(grammarAccess.getDomainFrameworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainFramework=ruleDomainFramework();

            state._fsp--;

             current =iv_ruleDomainFramework; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDomainFramework"


    // $ANTLR start "ruleDomainFramework"
    // InternalDomain.g:77:1: ruleDomainFramework returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'domain' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_setups_7_0= ruleSetup ) ) ( (lv_function_definitions_8_0= ruleFunctionDefinition ) )* ( ( (lv_parameters_9_0= ruleTypedParameter ) ) | ( (lv_parameters_10_0= ruleFunctionParameter ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleDomainFramework() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        EObject lv_setups_7_0 = null;

        EObject lv_function_definitions_8_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_parameters_10_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalDomain.g:84:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'domain' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_setups_7_0= ruleSetup ) ) ( (lv_function_definitions_8_0= ruleFunctionDefinition ) )* ( ( (lv_parameters_9_0= ruleTypedParameter ) ) | ( (lv_parameters_10_0= ruleFunctionParameter ) ) )* otherlv_11= '}' ) )
            // InternalDomain.g:85:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'domain' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_setups_7_0= ruleSetup ) ) ( (lv_function_definitions_8_0= ruleFunctionDefinition ) )* ( ( (lv_parameters_9_0= ruleTypedParameter ) ) | ( (lv_parameters_10_0= ruleFunctionParameter ) ) )* otherlv_11= '}' )
            {
            // InternalDomain.g:85:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'domain' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_setups_7_0= ruleSetup ) ) ( (lv_function_definitions_8_0= ruleFunctionDefinition ) )* ( ( (lv_parameters_9_0= ruleTypedParameter ) ) | ( (lv_parameters_10_0= ruleFunctionParameter ) ) )* otherlv_11= '}' )
            // InternalDomain.g:86:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'domain' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_setups_7_0= ruleSetup ) ) ( (lv_function_definitions_8_0= ruleFunctionDefinition ) )* ( ( (lv_parameters_9_0= ruleTypedParameter ) ) | ( (lv_parameters_10_0= ruleFunctionParameter ) ) )* otherlv_11= '}'
            {
            // InternalDomain.g:86:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDomain.g:87:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getDomainFrameworkAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getDomainFrameworkAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalDomain.g:95:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalDomain.g:96:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalDomain.g:96:5: (lv_description_2_0= RULE_STRING )
                    // InternalDomain.g:97:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getDomainFrameworkAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDomainFrameworkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDomainFrameworkAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainFrameworkAccess().getDomainKeyword_1());
            		
            // InternalDomain.g:122:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalDomain.g:123:4: (lv_name_5_0= RULE_ID )
            {
            // InternalDomain.g:123:4: (lv_name_5_0= RULE_ID )
            // InternalDomain.g:124:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_5_0, grammarAccess.getDomainFrameworkAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainFrameworkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDomainFrameworkAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:144:3: ( (lv_setups_7_0= ruleSetup ) )
            // InternalDomain.g:145:4: (lv_setups_7_0= ruleSetup )
            {
            // InternalDomain.g:145:4: (lv_setups_7_0= ruleSetup )
            // InternalDomain.g:146:5: lv_setups_7_0= ruleSetup
            {

            					newCompositeNode(grammarAccess.getDomainFrameworkAccess().getSetupsSetupParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_setups_7_0=ruleSetup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainFrameworkRule());
            					}
            					add(
            						current,
            						"setups",
            						lv_setups_7_0,
            						"n7.intern.v3.xtext.domain.Domain.Setup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:163:3: ( (lv_function_definitions_8_0= ruleFunctionDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==22) ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==RULE_STRING) ) {
                            int LA2_5 = input.LA(4);

                            if ( (LA2_5==23) ) {
                                int LA2_6 = input.LA(5);

                                if ( (LA2_6==32) ) {
                                    alt2=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA2_0==32) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomain.g:164:4: (lv_function_definitions_8_0= ruleFunctionDefinition )
            	    {
            	    // InternalDomain.g:164:4: (lv_function_definitions_8_0= ruleFunctionDefinition )
            	    // InternalDomain.g:165:5: lv_function_definitions_8_0= ruleFunctionDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getDomainFrameworkAccess().getFunction_definitionsFunctionDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_function_definitions_8_0=ruleFunctionDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainFrameworkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"function_definitions",
            	    						lv_function_definitions_8_0,
            	    						"n7.intern.v3.xtext.domain.Domain.FunctionDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDomain.g:182:3: ( ( (lv_parameters_9_0= ruleTypedParameter ) ) | ( (lv_parameters_10_0= ruleFunctionParameter ) ) )*
            loop3:
            do {
                int alt3=3;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==22) ) {
                        int LA3_5 = input.LA(3);

                        if ( (LA3_5==RULE_STRING) ) {
                            int LA3_6 = input.LA(4);

                            if ( (LA3_6==23) ) {
                                int LA3_7 = input.LA(5);

                                if ( ((LA3_7>=40 && LA3_7<=48)) ) {
                                    alt3=1;
                                }
                                else if ( (LA3_7==RULE_ID) ) {
                                    alt3=2;
                                }


                            }


                        }


                    }


                    }
                    break;
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                    {
                    alt3=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalDomain.g:183:4: ( (lv_parameters_9_0= ruleTypedParameter ) )
            	    {
            	    // InternalDomain.g:183:4: ( (lv_parameters_9_0= ruleTypedParameter ) )
            	    // InternalDomain.g:184:5: (lv_parameters_9_0= ruleTypedParameter )
            	    {
            	    // InternalDomain.g:184:5: (lv_parameters_9_0= ruleTypedParameter )
            	    // InternalDomain.g:185:6: lv_parameters_9_0= ruleTypedParameter
            	    {

            	    						newCompositeNode(grammarAccess.getDomainFrameworkAccess().getParametersTypedParameterParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_parameters_9_0=ruleTypedParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDomainFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_9_0,
            	    							"n7.intern.v3.xtext.domain.Domain.TypedParameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:203:4: ( (lv_parameters_10_0= ruleFunctionParameter ) )
            	    {
            	    // InternalDomain.g:203:4: ( (lv_parameters_10_0= ruleFunctionParameter ) )
            	    // InternalDomain.g:204:5: (lv_parameters_10_0= ruleFunctionParameter )
            	    {
            	    // InternalDomain.g:204:5: (lv_parameters_10_0= ruleFunctionParameter )
            	    // InternalDomain.g:205:6: lv_parameters_10_0= ruleFunctionParameter
            	    {

            	    						newCompositeNode(grammarAccess.getDomainFrameworkAccess().getParametersFunctionParameterParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_parameters_10_0=ruleFunctionParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDomainFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_10_0,
            	    							"n7.intern.v3.xtext.domain.Domain.FunctionParameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_11=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDomainFrameworkAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDomainFramework"


    // $ANTLR start "entryRuleTypedParameter"
    // InternalDomain.g:234:1: entryRuleTypedParameter returns [EObject current=null] : iv_ruleTypedParameter= ruleTypedParameter EOF ;
    public final EObject entryRuleTypedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParameter = null;


        try {
            // InternalDomain.g:234:55: (iv_ruleTypedParameter= ruleTypedParameter EOF )
            // InternalDomain.g:235:2: iv_ruleTypedParameter= ruleTypedParameter EOF
            {
             newCompositeNode(grammarAccess.getTypedParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedParameter=ruleTypedParameter();

            state._fsp--;

             current =iv_ruleTypedParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedParameter"


    // $ANTLR start "ruleTypedParameter"
    // InternalDomain.g:241:1: ruleTypedParameter returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (lv_type_4_0= ruleType ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( ( (lv_default_value_7_0= RULE_STRING ) ) | ( (lv_default_value_8_0= RULE_INT ) ) | ( (lv_default_value_9_0= RULE_NINT ) ) | ( (lv_default_value_10_0= RULE_BOOLEAN ) ) | ( (lv_default_value_11_0= RULE_FLOAT ) ) | ( (lv_default_value_12_0= RULE_CHAR ) ) | ( (lv_default_value_13_0= RULE_LONG ) ) | ( (lv_default_value_14_0= RULE_BYTE ) ) | ( (lv_default_value_15_0= RULE_DOUBLE ) ) ) )? otherlv_16= '{' ( (lv_markers_17_0= ruleAssignationMarker ) )* otherlv_18= '}' ) ;
    public final EObject ruleTypedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_default_value_7_0=null;
        Token lv_default_value_8_0=null;
        Token lv_default_value_9_0=null;
        Token lv_default_value_10_0=null;
        Token lv_default_value_11_0=null;
        Token lv_default_value_12_0=null;
        Token lv_default_value_13_0=null;
        Token lv_default_value_14_0=null;
        Token lv_default_value_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_markers_17_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:247:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (lv_type_4_0= ruleType ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( ( (lv_default_value_7_0= RULE_STRING ) ) | ( (lv_default_value_8_0= RULE_INT ) ) | ( (lv_default_value_9_0= RULE_NINT ) ) | ( (lv_default_value_10_0= RULE_BOOLEAN ) ) | ( (lv_default_value_11_0= RULE_FLOAT ) ) | ( (lv_default_value_12_0= RULE_CHAR ) ) | ( (lv_default_value_13_0= RULE_LONG ) ) | ( (lv_default_value_14_0= RULE_BYTE ) ) | ( (lv_default_value_15_0= RULE_DOUBLE ) ) ) )? otherlv_16= '{' ( (lv_markers_17_0= ruleAssignationMarker ) )* otherlv_18= '}' ) )
            // InternalDomain.g:248:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (lv_type_4_0= ruleType ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( ( (lv_default_value_7_0= RULE_STRING ) ) | ( (lv_default_value_8_0= RULE_INT ) ) | ( (lv_default_value_9_0= RULE_NINT ) ) | ( (lv_default_value_10_0= RULE_BOOLEAN ) ) | ( (lv_default_value_11_0= RULE_FLOAT ) ) | ( (lv_default_value_12_0= RULE_CHAR ) ) | ( (lv_default_value_13_0= RULE_LONG ) ) | ( (lv_default_value_14_0= RULE_BYTE ) ) | ( (lv_default_value_15_0= RULE_DOUBLE ) ) ) )? otherlv_16= '{' ( (lv_markers_17_0= ruleAssignationMarker ) )* otherlv_18= '}' )
            {
            // InternalDomain.g:248:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (lv_type_4_0= ruleType ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( ( (lv_default_value_7_0= RULE_STRING ) ) | ( (lv_default_value_8_0= RULE_INT ) ) | ( (lv_default_value_9_0= RULE_NINT ) ) | ( (lv_default_value_10_0= RULE_BOOLEAN ) ) | ( (lv_default_value_11_0= RULE_FLOAT ) ) | ( (lv_default_value_12_0= RULE_CHAR ) ) | ( (lv_default_value_13_0= RULE_LONG ) ) | ( (lv_default_value_14_0= RULE_BYTE ) ) | ( (lv_default_value_15_0= RULE_DOUBLE ) ) ) )? otherlv_16= '{' ( (lv_markers_17_0= ruleAssignationMarker ) )* otherlv_18= '}' )
            // InternalDomain.g:249:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (lv_type_4_0= ruleType ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( ( (lv_default_value_7_0= RULE_STRING ) ) | ( (lv_default_value_8_0= RULE_INT ) ) | ( (lv_default_value_9_0= RULE_NINT ) ) | ( (lv_default_value_10_0= RULE_BOOLEAN ) ) | ( (lv_default_value_11_0= RULE_FLOAT ) ) | ( (lv_default_value_12_0= RULE_CHAR ) ) | ( (lv_default_value_13_0= RULE_LONG ) ) | ( (lv_default_value_14_0= RULE_BYTE ) ) | ( (lv_default_value_15_0= RULE_DOUBLE ) ) ) )? otherlv_16= '{' ( (lv_markers_17_0= ruleAssignationMarker ) )* otherlv_18= '}'
            {
            // InternalDomain.g:249:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomain.g:250:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypedParameterAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypedParameterAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalDomain.g:258:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalDomain.g:259:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalDomain.g:259:5: (lv_description_2_0= RULE_STRING )
                    // InternalDomain.g:260:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getTypedParameterAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypedParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypedParameterAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalDomain.g:281:3: ( (lv_type_4_0= ruleType ) )
            // InternalDomain.g:282:4: (lv_type_4_0= ruleType )
            {
            // InternalDomain.g:282:4: (lv_type_4_0= ruleType )
            // InternalDomain.g:283:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTypedParameterAccess().getTypeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"n7.intern.v3.xtext.domain.Domain.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:300:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalDomain.g:301:4: (lv_name_5_0= RULE_ID )
            {
            // InternalDomain.g:301:4: (lv_name_5_0= RULE_ID )
            // InternalDomain.g:302:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_5_0, grammarAccess.getTypedParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:318:3: (otherlv_6= '=' ( ( (lv_default_value_7_0= RULE_STRING ) ) | ( (lv_default_value_8_0= RULE_INT ) ) | ( (lv_default_value_9_0= RULE_NINT ) ) | ( (lv_default_value_10_0= RULE_BOOLEAN ) ) | ( (lv_default_value_11_0= RULE_FLOAT ) ) | ( (lv_default_value_12_0= RULE_CHAR ) ) | ( (lv_default_value_13_0= RULE_LONG ) ) | ( (lv_default_value_14_0= RULE_BYTE ) ) | ( (lv_default_value_15_0= RULE_DOUBLE ) ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomain.g:319:4: otherlv_6= '=' ( ( (lv_default_value_7_0= RULE_STRING ) ) | ( (lv_default_value_8_0= RULE_INT ) ) | ( (lv_default_value_9_0= RULE_NINT ) ) | ( (lv_default_value_10_0= RULE_BOOLEAN ) ) | ( (lv_default_value_11_0= RULE_FLOAT ) ) | ( (lv_default_value_12_0= RULE_CHAR ) ) | ( (lv_default_value_13_0= RULE_LONG ) ) | ( (lv_default_value_14_0= RULE_BYTE ) ) | ( (lv_default_value_15_0= RULE_DOUBLE ) ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getTypedParameterAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalDomain.g:323:4: ( ( (lv_default_value_7_0= RULE_STRING ) ) | ( (lv_default_value_8_0= RULE_INT ) ) | ( (lv_default_value_9_0= RULE_NINT ) ) | ( (lv_default_value_10_0= RULE_BOOLEAN ) ) | ( (lv_default_value_11_0= RULE_FLOAT ) ) | ( (lv_default_value_12_0= RULE_CHAR ) ) | ( (lv_default_value_13_0= RULE_LONG ) ) | ( (lv_default_value_14_0= RULE_BYTE ) ) | ( (lv_default_value_15_0= RULE_DOUBLE ) ) )
                    int alt5=9;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt5=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt5=2;
                        }
                        break;
                    case RULE_NINT:
                        {
                        alt5=3;
                        }
                        break;
                    case RULE_BOOLEAN:
                        {
                        alt5=4;
                        }
                        break;
                    case RULE_FLOAT:
                        {
                        alt5=5;
                        }
                        break;
                    case RULE_CHAR:
                        {
                        alt5=6;
                        }
                        break;
                    case RULE_LONG:
                        {
                        alt5=7;
                        }
                        break;
                    case RULE_BYTE:
                        {
                        alt5=8;
                        }
                        break;
                    case RULE_DOUBLE:
                        {
                        alt5=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // InternalDomain.g:324:5: ( (lv_default_value_7_0= RULE_STRING ) )
                            {
                            // InternalDomain.g:324:5: ( (lv_default_value_7_0= RULE_STRING ) )
                            // InternalDomain.g:325:6: (lv_default_value_7_0= RULE_STRING )
                            {
                            // InternalDomain.g:325:6: (lv_default_value_7_0= RULE_STRING )
                            // InternalDomain.g:326:7: lv_default_value_7_0= RULE_STRING
                            {
                            lv_default_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                            							newLeafNode(lv_default_value_7_0, grammarAccess.getTypedParameterAccess().getDefault_valueSTRINGTerminalRuleCall_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"default_value",
                            								lv_default_value_7_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDomain.g:343:5: ( (lv_default_value_8_0= RULE_INT ) )
                            {
                            // InternalDomain.g:343:5: ( (lv_default_value_8_0= RULE_INT ) )
                            // InternalDomain.g:344:6: (lv_default_value_8_0= RULE_INT )
                            {
                            // InternalDomain.g:344:6: (lv_default_value_8_0= RULE_INT )
                            // InternalDomain.g:345:7: lv_default_value_8_0= RULE_INT
                            {
                            lv_default_value_8_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                            							newLeafNode(lv_default_value_8_0, grammarAccess.getTypedParameterAccess().getDefault_valueINTTerminalRuleCall_3_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"default_value",
                            								lv_default_value_8_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalDomain.g:362:5: ( (lv_default_value_9_0= RULE_NINT ) )
                            {
                            // InternalDomain.g:362:5: ( (lv_default_value_9_0= RULE_NINT ) )
                            // InternalDomain.g:363:6: (lv_default_value_9_0= RULE_NINT )
                            {
                            // InternalDomain.g:363:6: (lv_default_value_9_0= RULE_NINT )
                            // InternalDomain.g:364:7: lv_default_value_9_0= RULE_NINT
                            {
                            lv_default_value_9_0=(Token)match(input,RULE_NINT,FOLLOW_8); 

                            							newLeafNode(lv_default_value_9_0, grammarAccess.getTypedParameterAccess().getDefault_valueNINTTerminalRuleCall_3_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"default_value",
                            								lv_default_value_9_0,
                            								"n7.intern.v3.xtext.domain.Domain.NINT");
                            						

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalDomain.g:381:5: ( (lv_default_value_10_0= RULE_BOOLEAN ) )
                            {
                            // InternalDomain.g:381:5: ( (lv_default_value_10_0= RULE_BOOLEAN ) )
                            // InternalDomain.g:382:6: (lv_default_value_10_0= RULE_BOOLEAN )
                            {
                            // InternalDomain.g:382:6: (lv_default_value_10_0= RULE_BOOLEAN )
                            // InternalDomain.g:383:7: lv_default_value_10_0= RULE_BOOLEAN
                            {
                            lv_default_value_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_8); 

                            							newLeafNode(lv_default_value_10_0, grammarAccess.getTypedParameterAccess().getDefault_valueBOOLEANTerminalRuleCall_3_1_3_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"default_value",
                            								lv_default_value_10_0,
                            								"n7.intern.v3.xtext.domain.Domain.BOOLEAN");
                            						

                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalDomain.g:400:5: ( (lv_default_value_11_0= RULE_FLOAT ) )
                            {
                            // InternalDomain.g:400:5: ( (lv_default_value_11_0= RULE_FLOAT ) )
                            // InternalDomain.g:401:6: (lv_default_value_11_0= RULE_FLOAT )
                            {
                            // InternalDomain.g:401:6: (lv_default_value_11_0= RULE_FLOAT )
                            // InternalDomain.g:402:7: lv_default_value_11_0= RULE_FLOAT
                            {
                            lv_default_value_11_0=(Token)match(input,RULE_FLOAT,FOLLOW_8); 

                            							newLeafNode(lv_default_value_11_0, grammarAccess.getTypedParameterAccess().getDefault_valueFLOATTerminalRuleCall_3_1_4_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"default_value",
                            								lv_default_value_11_0,
                            								"n7.intern.v3.xtext.domain.Domain.FLOAT");
                            						

                            }


                            }


                            }
                            break;
                        case 6 :
                            // InternalDomain.g:419:5: ( (lv_default_value_12_0= RULE_CHAR ) )
                            {
                            // InternalDomain.g:419:5: ( (lv_default_value_12_0= RULE_CHAR ) )
                            // InternalDomain.g:420:6: (lv_default_value_12_0= RULE_CHAR )
                            {
                            // InternalDomain.g:420:6: (lv_default_value_12_0= RULE_CHAR )
                            // InternalDomain.g:421:7: lv_default_value_12_0= RULE_CHAR
                            {
                            lv_default_value_12_0=(Token)match(input,RULE_CHAR,FOLLOW_8); 

                            							newLeafNode(lv_default_value_12_0, grammarAccess.getTypedParameterAccess().getDefault_valueCHARTerminalRuleCall_3_1_5_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"default_value",
                            								lv_default_value_12_0,
                            								"n7.intern.v3.xtext.domain.Domain.CHAR");
                            						

                            }


                            }


                            }
                            break;
                        case 7 :
                            // InternalDomain.g:438:5: ( (lv_default_value_13_0= RULE_LONG ) )
                            {
                            // InternalDomain.g:438:5: ( (lv_default_value_13_0= RULE_LONG ) )
                            // InternalDomain.g:439:6: (lv_default_value_13_0= RULE_LONG )
                            {
                            // InternalDomain.g:439:6: (lv_default_value_13_0= RULE_LONG )
                            // InternalDomain.g:440:7: lv_default_value_13_0= RULE_LONG
                            {
                            lv_default_value_13_0=(Token)match(input,RULE_LONG,FOLLOW_8); 

                            							newLeafNode(lv_default_value_13_0, grammarAccess.getTypedParameterAccess().getDefault_valueLONGTerminalRuleCall_3_1_6_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"default_value",
                            								lv_default_value_13_0,
                            								"n7.intern.v3.xtext.domain.Domain.LONG");
                            						

                            }


                            }


                            }
                            break;
                        case 8 :
                            // InternalDomain.g:457:5: ( (lv_default_value_14_0= RULE_BYTE ) )
                            {
                            // InternalDomain.g:457:5: ( (lv_default_value_14_0= RULE_BYTE ) )
                            // InternalDomain.g:458:6: (lv_default_value_14_0= RULE_BYTE )
                            {
                            // InternalDomain.g:458:6: (lv_default_value_14_0= RULE_BYTE )
                            // InternalDomain.g:459:7: lv_default_value_14_0= RULE_BYTE
                            {
                            lv_default_value_14_0=(Token)match(input,RULE_BYTE,FOLLOW_8); 

                            							newLeafNode(lv_default_value_14_0, grammarAccess.getTypedParameterAccess().getDefault_valueBYTETerminalRuleCall_3_1_7_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"default_value",
                            								lv_default_value_14_0,
                            								"n7.intern.v3.xtext.domain.Domain.BYTE");
                            						

                            }


                            }


                            }
                            break;
                        case 9 :
                            // InternalDomain.g:476:5: ( (lv_default_value_15_0= RULE_DOUBLE ) )
                            {
                            // InternalDomain.g:476:5: ( (lv_default_value_15_0= RULE_DOUBLE ) )
                            // InternalDomain.g:477:6: (lv_default_value_15_0= RULE_DOUBLE )
                            {
                            // InternalDomain.g:477:6: (lv_default_value_15_0= RULE_DOUBLE )
                            // InternalDomain.g:478:7: lv_default_value_15_0= RULE_DOUBLE
                            {
                            lv_default_value_15_0=(Token)match(input,RULE_DOUBLE,FOLLOW_8); 

                            							newLeafNode(lv_default_value_15_0, grammarAccess.getTypedParameterAccess().getDefault_valueDOUBLETerminalRuleCall_3_1_8_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"default_value",
                            								lv_default_value_15_0,
                            								"n7.intern.v3.xtext.domain.Domain.DOUBLE");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_16, grammarAccess.getTypedParameterAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDomain.g:500:3: ( (lv_markers_17_0= ruleAssignationMarker ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDomain.g:501:4: (lv_markers_17_0= ruleAssignationMarker )
            	    {
            	    // InternalDomain.g:501:4: (lv_markers_17_0= ruleAssignationMarker )
            	    // InternalDomain.g:502:5: lv_markers_17_0= ruleAssignationMarker
            	    {

            	    					newCompositeNode(grammarAccess.getTypedParameterAccess().getMarkersAssignationMarkerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_markers_17_0=ruleAssignationMarker();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypedParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"markers",
            	    						lv_markers_17_0,
            	    						"n7.intern.v3.xtext.domain.Domain.AssignationMarker");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_18=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getTypedParameterAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedParameter"


    // $ANTLR start "entryRuleFunctionParameter"
    // InternalDomain.g:527:1: entryRuleFunctionParameter returns [EObject current=null] : iv_ruleFunctionParameter= ruleFunctionParameter EOF ;
    public final EObject entryRuleFunctionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameter = null;


        try {
            // InternalDomain.g:527:58: (iv_ruleFunctionParameter= ruleFunctionParameter EOF )
            // InternalDomain.g:528:2: iv_ruleFunctionParameter= ruleFunctionParameter EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionParameter=ruleFunctionParameter();

            state._fsp--;

             current =iv_ruleFunctionParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionParameter"


    // $ANTLR start "ruleFunctionParameter"
    // InternalDomain.g:534:1: ruleFunctionParameter returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (otherlv_4= RULE_ID ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_default_function_value_7_0= RULE_QUALIFIED_NAME ) ) )? otherlv_8= '{' ( (lv_markers_9_0= ruleFunctionMarker ) )* otherlv_10= '}' ) ;
    public final EObject ruleFunctionParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_default_function_value_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_markers_9_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:540:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (otherlv_4= RULE_ID ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_default_function_value_7_0= RULE_QUALIFIED_NAME ) ) )? otherlv_8= '{' ( (lv_markers_9_0= ruleFunctionMarker ) )* otherlv_10= '}' ) )
            // InternalDomain.g:541:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (otherlv_4= RULE_ID ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_default_function_value_7_0= RULE_QUALIFIED_NAME ) ) )? otherlv_8= '{' ( (lv_markers_9_0= ruleFunctionMarker ) )* otherlv_10= '}' )
            {
            // InternalDomain.g:541:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (otherlv_4= RULE_ID ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_default_function_value_7_0= RULE_QUALIFIED_NAME ) ) )? otherlv_8= '{' ( (lv_markers_9_0= ruleFunctionMarker ) )* otherlv_10= '}' )
            // InternalDomain.g:542:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? ( (otherlv_4= RULE_ID ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_default_function_value_7_0= RULE_QUALIFIED_NAME ) ) )? otherlv_8= '{' ( (lv_markers_9_0= ruleFunctionMarker ) )* otherlv_10= '}'
            {
            // InternalDomain.g:542:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDomain.g:543:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getFunctionParameterAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionParameterAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalDomain.g:551:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalDomain.g:552:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalDomain.g:552:5: (lv_description_2_0= RULE_STRING )
                    // InternalDomain.g:553:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getFunctionParameterAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionParameterAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalDomain.g:574:3: ( (otherlv_4= RULE_ID ) )
            // InternalDomain.g:575:4: (otherlv_4= RULE_ID )
            {
            // InternalDomain.g:575:4: (otherlv_4= RULE_ID )
            // InternalDomain.g:576:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionParameterRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_4, grammarAccess.getFunctionParameterAccess().getFunction_typeFunctionDefinitionCrossReference_1_0());
            				

            }


            }

            // InternalDomain.g:587:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalDomain.g:588:4: (lv_name_5_0= RULE_ID )
            {
            // InternalDomain.g:588:4: (lv_name_5_0= RULE_ID )
            // InternalDomain.g:589:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_5_0, grammarAccess.getFunctionParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:605:3: (otherlv_6= '=' ( (lv_default_function_value_7_0= RULE_QUALIFIED_NAME ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomain.g:606:4: otherlv_6= '=' ( (lv_default_function_value_7_0= RULE_QUALIFIED_NAME ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getFunctionParameterAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalDomain.g:610:4: ( (lv_default_function_value_7_0= RULE_QUALIFIED_NAME ) )
                    // InternalDomain.g:611:5: (lv_default_function_value_7_0= RULE_QUALIFIED_NAME )
                    {
                    // InternalDomain.g:611:5: (lv_default_function_value_7_0= RULE_QUALIFIED_NAME )
                    // InternalDomain.g:612:6: lv_default_function_value_7_0= RULE_QUALIFIED_NAME
                    {
                    lv_default_function_value_7_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_8); 

                    						newLeafNode(lv_default_function_value_7_0, grammarAccess.getFunctionParameterAccess().getDefault_function_valueQUALIFIED_NAMETerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default_function_value",
                    							lv_default_function_value_7_0,
                    							"n7.intern.v3.xtext.domain.Domain.QUALIFIED_NAME");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionParameterAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDomain.g:633:3: ( (lv_markers_9_0= ruleFunctionMarker ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDomain.g:634:4: (lv_markers_9_0= ruleFunctionMarker )
            	    {
            	    // InternalDomain.g:634:4: (lv_markers_9_0= ruleFunctionMarker )
            	    // InternalDomain.g:635:5: lv_markers_9_0= ruleFunctionMarker
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionParameterAccess().getMarkersFunctionMarkerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_markers_9_0=ruleFunctionMarker();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"markers",
            	    						lv_markers_9_0,
            	    						"n7.intern.v3.xtext.domain.Domain.FunctionMarker");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFunctionParameterAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionParameter"


    // $ANTLR start "entryRuleAssignationMarker"
    // InternalDomain.g:660:1: entryRuleAssignationMarker returns [EObject current=null] : iv_ruleAssignationMarker= ruleAssignationMarker EOF ;
    public final EObject entryRuleAssignationMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignationMarker = null;


        try {
            // InternalDomain.g:660:58: (iv_ruleAssignationMarker= ruleAssignationMarker EOF )
            // InternalDomain.g:661:2: iv_ruleAssignationMarker= ruleAssignationMarker EOF
            {
             newCompositeNode(grammarAccess.getAssignationMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignationMarker=ruleAssignationMarker();

            state._fsp--;

             current =iv_ruleAssignationMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignationMarker"


    // $ANTLR start "ruleAssignationMarker"
    // InternalDomain.g:667:1: ruleAssignationMarker returns [EObject current=null] : (otherlv_0= '@assign' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')' ) ;
    public final EObject ruleAssignationMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:673:2: ( (otherlv_0= '@assign' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')' ) )
            // InternalDomain.g:674:2: (otherlv_0= '@assign' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')' )
            {
            // InternalDomain.g:674:2: (otherlv_0= '@assign' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')' )
            // InternalDomain.g:675:3: otherlv_0= '@assign' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignationMarkerAccess().getAssignKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignationMarkerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDomain.g:683:3: ( (lv_name_2_0= ruleMarkerID ) )
            // InternalDomain.g:684:4: (lv_name_2_0= ruleMarkerID )
            {
            // InternalDomain.g:684:4: (lv_name_2_0= ruleMarkerID )
            // InternalDomain.g:685:5: lv_name_2_0= ruleMarkerID
            {

            					newCompositeNode(grammarAccess.getAssignationMarkerAccess().getNameMarkerIDEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleMarkerID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignationMarkerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v3.xtext.domain.Domain.MarkerID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignationMarkerAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignationMarker"


    // $ANTLR start "entryRuleFunctionMarker"
    // InternalDomain.g:710:1: entryRuleFunctionMarker returns [EObject current=null] : iv_ruleFunctionMarker= ruleFunctionMarker EOF ;
    public final EObject entryRuleFunctionMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionMarker = null;


        try {
            // InternalDomain.g:710:55: (iv_ruleFunctionMarker= ruleFunctionMarker EOF )
            // InternalDomain.g:711:2: iv_ruleFunctionMarker= ruleFunctionMarker EOF
            {
             newCompositeNode(grammarAccess.getFunctionMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionMarker=ruleFunctionMarker();

            state._fsp--;

             current =iv_ruleFunctionMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionMarker"


    // $ANTLR start "ruleFunctionMarker"
    // InternalDomain.g:717:1: ruleFunctionMarker returns [EObject current=null] : (otherlv_0= '@do' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleFunctionBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleFunctionMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_name_2_0 = null;

        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:723:2: ( (otherlv_0= '@do' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleFunctionBlock ) ) otherlv_6= '}' ) )
            // InternalDomain.g:724:2: (otherlv_0= '@do' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleFunctionBlock ) ) otherlv_6= '}' )
            {
            // InternalDomain.g:724:2: (otherlv_0= '@do' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleFunctionBlock ) ) otherlv_6= '}' )
            // InternalDomain.g:725:3: otherlv_0= '@do' otherlv_1= '(' ( (lv_name_2_0= ruleMarkerID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleFunctionBlock ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionMarkerAccess().getDoKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionMarkerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDomain.g:733:3: ( (lv_name_2_0= ruleMarkerID ) )
            // InternalDomain.g:734:4: (lv_name_2_0= ruleMarkerID )
            {
            // InternalDomain.g:734:4: (lv_name_2_0= ruleMarkerID )
            // InternalDomain.g:735:5: lv_name_2_0= ruleMarkerID
            {

            					newCompositeNode(grammarAccess.getFunctionMarkerAccess().getNameMarkerIDEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleMarkerID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionMarkerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v3.xtext.domain.Domain.MarkerID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionMarkerAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionMarkerAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDomain.g:760:3: ( (lv_block_5_0= ruleFunctionBlock ) )
            // InternalDomain.g:761:4: (lv_block_5_0= ruleFunctionBlock )
            {
            // InternalDomain.g:761:4: (lv_block_5_0= ruleFunctionBlock )
            // InternalDomain.g:762:5: lv_block_5_0= ruleFunctionBlock
            {

            					newCompositeNode(grammarAccess.getFunctionMarkerAccess().getBlockFunctionBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_block_5_0=ruleFunctionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionMarkerRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_5_0,
            						"n7.intern.v3.xtext.domain.Domain.FunctionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionMarkerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionMarker"


    // $ANTLR start "entryRuleFunctionBlock"
    // InternalDomain.g:787:1: entryRuleFunctionBlock returns [EObject current=null] : iv_ruleFunctionBlock= ruleFunctionBlock EOF ;
    public final EObject entryRuleFunctionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBlock = null;


        try {
            // InternalDomain.g:787:54: (iv_ruleFunctionBlock= ruleFunctionBlock EOF )
            // InternalDomain.g:788:2: iv_ruleFunctionBlock= ruleFunctionBlock EOF
            {
             newCompositeNode(grammarAccess.getFunctionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBlock=ruleFunctionBlock();

            state._fsp--;

             current =iv_ruleFunctionBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionBlock"


    // $ANTLR start "ruleFunctionBlock"
    // InternalDomain.g:794:1: ruleFunctionBlock returns [EObject current=null] : ( () otherlv_1= 'this' otherlv_2= '(' ( ( ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) ) otherlv_5= ',' )* ( ( (lv_parameters_6_0= RULE_ID ) ) | ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) ) ) )? otherlv_8= ')' ) ;
    public final EObject ruleFunctionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_parameters_3_0=null;
        Token lv_parameters_4_0=null;
        Token otherlv_5=null;
        Token lv_parameters_6_0=null;
        Token lv_parameters_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDomain.g:800:2: ( ( () otherlv_1= 'this' otherlv_2= '(' ( ( ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) ) otherlv_5= ',' )* ( ( (lv_parameters_6_0= RULE_ID ) ) | ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) ) ) )? otherlv_8= ')' ) )
            // InternalDomain.g:801:2: ( () otherlv_1= 'this' otherlv_2= '(' ( ( ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) ) otherlv_5= ',' )* ( ( (lv_parameters_6_0= RULE_ID ) ) | ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) ) ) )? otherlv_8= ')' )
            {
            // InternalDomain.g:801:2: ( () otherlv_1= 'this' otherlv_2= '(' ( ( ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) ) otherlv_5= ',' )* ( ( (lv_parameters_6_0= RULE_ID ) ) | ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) ) ) )? otherlv_8= ')' )
            // InternalDomain.g:802:3: () otherlv_1= 'this' otherlv_2= '(' ( ( ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) ) otherlv_5= ',' )* ( ( (lv_parameters_6_0= RULE_ID ) ) | ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) ) ) )? otherlv_8= ')'
            {
            // InternalDomain.g:802:3: ()
            // InternalDomain.g:803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionBlockAccess().getFunctionBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionBlockAccess().getThisKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionBlockAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDomain.g:817:3: ( ( ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) ) otherlv_5= ',' )* ( ( (lv_parameters_6_0= RULE_ID ) ) | ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==RULE_DEFAULT_PARAMETER) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomain.g:818:4: ( ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) ) otherlv_5= ',' )* ( ( (lv_parameters_6_0= RULE_ID ) ) | ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) ) )
                    {
                    // InternalDomain.g:818:4: ( ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) ) otherlv_5= ',' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1==31) ) {
                                alt12=1;
                            }


                        }
                        else if ( (LA12_0==RULE_DEFAULT_PARAMETER) ) {
                            int LA12_2 = input.LA(2);

                            if ( (LA12_2==31) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDomain.g:819:5: ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) ) otherlv_5= ','
                    	    {
                    	    // InternalDomain.g:819:5: ( ( (lv_parameters_3_0= RULE_ID ) ) | ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) ) )
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==RULE_ID) ) {
                    	        alt11=1;
                    	    }
                    	    else if ( (LA11_0==RULE_DEFAULT_PARAMETER) ) {
                    	        alt11=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 11, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // InternalDomain.g:820:6: ( (lv_parameters_3_0= RULE_ID ) )
                    	            {
                    	            // InternalDomain.g:820:6: ( (lv_parameters_3_0= RULE_ID ) )
                    	            // InternalDomain.g:821:7: (lv_parameters_3_0= RULE_ID )
                    	            {
                    	            // InternalDomain.g:821:7: (lv_parameters_3_0= RULE_ID )
                    	            // InternalDomain.g:822:8: lv_parameters_3_0= RULE_ID
                    	            {
                    	            lv_parameters_3_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	            								newLeafNode(lv_parameters_3_0, grammarAccess.getFunctionBlockAccess().getParametersIDTerminalRuleCall_3_0_0_0_0());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getFunctionBlockRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"parameters",
                    	            									lv_parameters_3_0,
                    	            									"org.eclipse.xtext.common.Terminals.ID");
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDomain.g:839:6: ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) )
                    	            {
                    	            // InternalDomain.g:839:6: ( (lv_parameters_4_0= RULE_DEFAULT_PARAMETER ) )
                    	            // InternalDomain.g:840:7: (lv_parameters_4_0= RULE_DEFAULT_PARAMETER )
                    	            {
                    	            // InternalDomain.g:840:7: (lv_parameters_4_0= RULE_DEFAULT_PARAMETER )
                    	            // InternalDomain.g:841:8: lv_parameters_4_0= RULE_DEFAULT_PARAMETER
                    	            {
                    	            lv_parameters_4_0=(Token)match(input,RULE_DEFAULT_PARAMETER,FOLLOW_22); 

                    	            								newLeafNode(lv_parameters_4_0, grammarAccess.getFunctionBlockAccess().getParametersDEFAULT_PARAMETERTerminalRuleCall_3_0_0_1_0());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getFunctionBlockRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"parameters",
                    	            									lv_parameters_4_0,
                    	            									"n7.intern.v3.xtext.domain.Domain.DEFAULT_PARAMETER");
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_5=(Token)match(input,31,FOLLOW_23); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFunctionBlockAccess().getCommaKeyword_3_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalDomain.g:863:4: ( ( (lv_parameters_6_0= RULE_ID ) ) | ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_DEFAULT_PARAMETER) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalDomain.g:864:5: ( (lv_parameters_6_0= RULE_ID ) )
                            {
                            // InternalDomain.g:864:5: ( (lv_parameters_6_0= RULE_ID ) )
                            // InternalDomain.g:865:6: (lv_parameters_6_0= RULE_ID )
                            {
                            // InternalDomain.g:865:6: (lv_parameters_6_0= RULE_ID )
                            // InternalDomain.g:866:7: lv_parameters_6_0= RULE_ID
                            {
                            lv_parameters_6_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                            							newLeafNode(lv_parameters_6_0, grammarAccess.getFunctionBlockAccess().getParametersIDTerminalRuleCall_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFunctionBlockRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"parameters",
                            								lv_parameters_6_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDomain.g:883:5: ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) )
                            {
                            // InternalDomain.g:883:5: ( (lv_parameters_7_0= RULE_DEFAULT_PARAMETER ) )
                            // InternalDomain.g:884:6: (lv_parameters_7_0= RULE_DEFAULT_PARAMETER )
                            {
                            // InternalDomain.g:884:6: (lv_parameters_7_0= RULE_DEFAULT_PARAMETER )
                            // InternalDomain.g:885:7: lv_parameters_7_0= RULE_DEFAULT_PARAMETER
                            {
                            lv_parameters_7_0=(Token)match(input,RULE_DEFAULT_PARAMETER,FOLLOW_5); 

                            							newLeafNode(lv_parameters_7_0, grammarAccess.getFunctionBlockAccess().getParametersDEFAULT_PARAMETERTerminalRuleCall_3_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFunctionBlockRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"parameters",
                            								lv_parameters_7_0,
                            								"n7.intern.v3.xtext.domain.Domain.DEFAULT_PARAMETER");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionBlockAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionBlock"


    // $ANTLR start "entryRuleFunctionDefinition"
    // InternalDomain.g:911:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalDomain.g:911:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalDomain.g:912:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // InternalDomain.g:918:1: ruleFunctionDefinition returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'def' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ',' )* ( (lv_inputs_9_0= ruleType ) ) )? otherlv_10= ')' (otherlv_11= ':' ( ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ',' )* ( (lv_outputs_14_0= ruleType ) ) )? otherlv_15= '{' ( (lv_values_16_0= ruleFunctionValue ) )+ otherlv_17= '}' ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_inputs_7_0 = null;

        Enumerator lv_inputs_9_0 = null;

        Enumerator lv_outputs_12_0 = null;

        Enumerator lv_outputs_14_0 = null;

        EObject lv_values_16_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:924:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'def' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ',' )* ( (lv_inputs_9_0= ruleType ) ) )? otherlv_10= ')' (otherlv_11= ':' ( ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ',' )* ( (lv_outputs_14_0= ruleType ) ) )? otherlv_15= '{' ( (lv_values_16_0= ruleFunctionValue ) )+ otherlv_17= '}' ) )
            // InternalDomain.g:925:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'def' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ',' )* ( (lv_inputs_9_0= ruleType ) ) )? otherlv_10= ')' (otherlv_11= ':' ( ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ',' )* ( (lv_outputs_14_0= ruleType ) ) )? otherlv_15= '{' ( (lv_values_16_0= ruleFunctionValue ) )+ otherlv_17= '}' )
            {
            // InternalDomain.g:925:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'def' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ',' )* ( (lv_inputs_9_0= ruleType ) ) )? otherlv_10= ')' (otherlv_11= ':' ( ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ',' )* ( (lv_outputs_14_0= ruleType ) ) )? otherlv_15= '{' ( (lv_values_16_0= ruleFunctionValue ) )+ otherlv_17= '}' )
            // InternalDomain.g:926:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'def' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ',' )* ( (lv_inputs_9_0= ruleType ) ) )? otherlv_10= ')' (otherlv_11= ':' ( ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ',' )* ( (lv_outputs_14_0= ruleType ) ) )? otherlv_15= '{' ( (lv_values_16_0= ruleFunctionValue ) )+ otherlv_17= '}'
            {
            // InternalDomain.g:926:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomain.g:927:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getFunctionDefinitionAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalDomain.g:935:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalDomain.g:936:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalDomain.g:936:5: (lv_description_2_0= RULE_STRING )
                    // InternalDomain.g:937:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getFunctionDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionDefinitionAccess().getDefKeyword_1());
            		
            // InternalDomain.g:962:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalDomain.g:963:4: (lv_name_5_0= RULE_ID )
            {
            // InternalDomain.g:963:4: (lv_name_5_0= RULE_ID )
            // InternalDomain.g:964:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_5_0, grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalDomain.g:984:3: ( ( ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ',' )* ( (lv_inputs_9_0= ruleType ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=40 && LA17_0<=48)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDomain.g:985:4: ( ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ',' )* ( (lv_inputs_9_0= ruleType ) )
                    {
                    // InternalDomain.g:985:4: ( ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ',' )*
                    loop16:
                    do {
                        int alt16=2;
                        alt16 = dfa16.predict(input);
                        switch (alt16) {
                    	case 1 :
                    	    // InternalDomain.g:986:5: ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ','
                    	    {
                    	    // InternalDomain.g:986:5: ( (lv_inputs_7_0= ruleType ) )
                    	    // InternalDomain.g:987:6: (lv_inputs_7_0= ruleType )
                    	    {
                    	    // InternalDomain.g:987:6: (lv_inputs_7_0= ruleType )
                    	    // InternalDomain.g:988:7: lv_inputs_7_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getInputsTypeEnumRuleCall_4_0_0_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_inputs_7_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_7_0,
                    	    								"n7.intern.v3.xtext.domain.Domain.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,31,FOLLOW_12); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_4_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // InternalDomain.g:1010:4: ( (lv_inputs_9_0= ruleType ) )
                    // InternalDomain.g:1011:5: (lv_inputs_9_0= ruleType )
                    {
                    // InternalDomain.g:1011:5: (lv_inputs_9_0= ruleType )
                    // InternalDomain.g:1012:6: lv_inputs_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getInputsTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_inputs_9_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_9_0,
                    							"n7.intern.v3.xtext.domain.Domain.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_5());
            		
            // InternalDomain.g:1034:3: (otherlv_11= ':' ( ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ',' )* ( (lv_outputs_14_0= ruleType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDomain.g:1035:4: otherlv_11= ':' ( ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ',' )* ( (lv_outputs_14_0= ruleType ) )
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getFunctionDefinitionAccess().getColonKeyword_6_0());
                    			
                    // InternalDomain.g:1039:4: ( ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ',' )*
                    loop18:
                    do {
                        int alt18=2;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // InternalDomain.g:1040:5: ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ','
                    	    {
                    	    // InternalDomain.g:1040:5: ( (lv_outputs_12_0= ruleType ) )
                    	    // InternalDomain.g:1041:6: (lv_outputs_12_0= ruleType )
                    	    {
                    	    // InternalDomain.g:1041:6: (lv_outputs_12_0= ruleType )
                    	    // InternalDomain.g:1042:7: lv_outputs_12_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOutputsTypeEnumRuleCall_6_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_outputs_12_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_12_0,
                    	    								"n7.intern.v3.xtext.domain.Domain.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_13=(Token)match(input,31,FOLLOW_12); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_6_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // InternalDomain.g:1064:4: ( (lv_outputs_14_0= ruleType ) )
                    // InternalDomain.g:1065:5: (lv_outputs_14_0= ruleType )
                    {
                    // InternalDomain.g:1065:5: (lv_outputs_14_0= ruleType )
                    // InternalDomain.g:1066:6: lv_outputs_14_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOutputsTypeEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_outputs_14_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_14_0,
                    							"n7.intern.v3.xtext.domain.Domain.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDomain.g:1088:3: ( (lv_values_16_0= ruleFunctionValue ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDomain.g:1089:4: (lv_values_16_0= ruleFunctionValue )
            	    {
            	    // InternalDomain.g:1089:4: (lv_values_16_0= ruleFunctionValue )
            	    // InternalDomain.g:1090:5: lv_values_16_0= ruleFunctionValue
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getValuesFunctionValueParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_values_16_0=ruleFunctionValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_16_0,
            	    						"n7.intern.v3.xtext.domain.Domain.FunctionValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_17=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleFunctionValue"
    // InternalDomain.g:1115:1: entryRuleFunctionValue returns [EObject current=null] : iv_ruleFunctionValue= ruleFunctionValue EOF ;
    public final EObject entryRuleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionValue = null;


        try {
            // InternalDomain.g:1115:54: (iv_ruleFunctionValue= ruleFunctionValue EOF )
            // InternalDomain.g:1116:2: iv_ruleFunctionValue= ruleFunctionValue EOF
            {
             newCompositeNode(grammarAccess.getFunctionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionValue=ruleFunctionValue();

            state._fsp--;

             current =iv_ruleFunctionValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionValue"


    // $ANTLR start "ruleFunctionValue"
    // InternalDomain.g:1122:1: ruleFunctionValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}' ) ;
    public final EObject ruleFunctionValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instructions_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:1128:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}' ) )
            // InternalDomain.g:1129:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}' )
            {
            // InternalDomain.g:1129:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}' )
            // InternalDomain.g:1130:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}'
            {
            // InternalDomain.g:1130:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDomain.g:1131:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDomain.g:1131:4: (lv_name_0_0= RULE_ID )
            // InternalDomain.g:1132:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunctionValueAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomain.g:1152:3: ( (lv_instructions_2_0= ruleSetupBlock ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDomain.g:1153:4: (lv_instructions_2_0= ruleSetupBlock )
            	    {
            	    // InternalDomain.g:1153:4: (lv_instructions_2_0= ruleSetupBlock )
            	    // InternalDomain.g:1154:5: lv_instructions_2_0= ruleSetupBlock
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionValueAccess().getInstructionsSetupBlockParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_instructions_2_0=ruleSetupBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_2_0,
            	    						"n7.intern.v3.xtext.domain.Domain.SetupBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionValueAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionValue"


    // $ANTLR start "entryRuleSetupBlock"
    // InternalDomain.g:1179:1: entryRuleSetupBlock returns [EObject current=null] : iv_ruleSetupBlock= ruleSetupBlock EOF ;
    public final EObject entryRuleSetupBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetupBlock = null;


        try {
            // InternalDomain.g:1179:51: (iv_ruleSetupBlock= ruleSetupBlock EOF )
            // InternalDomain.g:1180:2: iv_ruleSetupBlock= ruleSetupBlock EOF
            {
             newCompositeNode(grammarAccess.getSetupBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetupBlock=ruleSetupBlock();

            state._fsp--;

             current =iv_ruleSetupBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetupBlock"


    // $ANTLR start "ruleSetupBlock"
    // InternalDomain.g:1186:1: ruleSetupBlock returns [EObject current=null] : (otherlv_0= '@' ( (lv_language_1_0= ruleLanguage ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleStringInstruction ) ) otherlv_4= '}' ) ;
    public final EObject ruleSetupBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_language_1_0 = null;

        EObject lv_instructions_3_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:1192:2: ( (otherlv_0= '@' ( (lv_language_1_0= ruleLanguage ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleStringInstruction ) ) otherlv_4= '}' ) )
            // InternalDomain.g:1193:2: (otherlv_0= '@' ( (lv_language_1_0= ruleLanguage ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleStringInstruction ) ) otherlv_4= '}' )
            {
            // InternalDomain.g:1193:2: (otherlv_0= '@' ( (lv_language_1_0= ruleLanguage ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleStringInstruction ) ) otherlv_4= '}' )
            // InternalDomain.g:1194:3: otherlv_0= '@' ( (lv_language_1_0= ruleLanguage ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleStringInstruction ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSetupBlockAccess().getCommercialAtKeyword_0());
            		
            // InternalDomain.g:1198:3: ( (lv_language_1_0= ruleLanguage ) )
            // InternalDomain.g:1199:4: (lv_language_1_0= ruleLanguage )
            {
            // InternalDomain.g:1199:4: (lv_language_1_0= ruleLanguage )
            // InternalDomain.g:1200:5: lv_language_1_0= ruleLanguage
            {

            					newCompositeNode(grammarAccess.getSetupBlockAccess().getLanguageLanguageEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_language_1_0=ruleLanguage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetupBlockRule());
            					}
            					set(
            						current,
            						"language",
            						lv_language_1_0,
            						"n7.intern.v3.xtext.domain.Domain.Language");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getSetupBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomain.g:1221:3: ( (lv_instructions_3_0= ruleStringInstruction ) )
            // InternalDomain.g:1222:4: (lv_instructions_3_0= ruleStringInstruction )
            {
            // InternalDomain.g:1222:4: (lv_instructions_3_0= ruleStringInstruction )
            // InternalDomain.g:1223:5: lv_instructions_3_0= ruleStringInstruction
            {

            					newCompositeNode(grammarAccess.getSetupBlockAccess().getInstructionsStringInstructionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_instructions_3_0=ruleStringInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetupBlockRule());
            					}
            					add(
            						current,
            						"instructions",
            						lv_instructions_3_0,
            						"n7.intern.v3.xtext.domain.Domain.StringInstruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSetupBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetupBlock"


    // $ANTLR start "entryRuleSetup"
    // InternalDomain.g:1248:1: entryRuleSetup returns [EObject current=null] : iv_ruleSetup= ruleSetup EOF ;
    public final EObject entryRuleSetup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetup = null;


        try {
            // InternalDomain.g:1248:46: (iv_ruleSetup= ruleSetup EOF )
            // InternalDomain.g:1249:2: iv_ruleSetup= ruleSetup EOF
            {
             newCompositeNode(grammarAccess.getSetupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetup=ruleSetup();

            state._fsp--;

             current =iv_ruleSetup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetup"


    // $ANTLR start "ruleSetup"
    // InternalDomain.g:1255:1: ruleSetup returns [EObject current=null] : (otherlv_0= 'setup' otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}' ) ;
    public final EObject ruleSetup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instructions_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:1261:2: ( (otherlv_0= 'setup' otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}' ) )
            // InternalDomain.g:1262:2: (otherlv_0= 'setup' otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}' )
            {
            // InternalDomain.g:1262:2: (otherlv_0= 'setup' otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}' )
            // InternalDomain.g:1263:3: otherlv_0= 'setup' otherlv_1= '{' ( (lv_instructions_2_0= ruleSetupBlock ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSetupAccess().getSetupKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getSetupAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomain.g:1271:3: ( (lv_instructions_2_0= ruleSetupBlock ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDomain.g:1272:4: (lv_instructions_2_0= ruleSetupBlock )
            	    {
            	    // InternalDomain.g:1272:4: (lv_instructions_2_0= ruleSetupBlock )
            	    // InternalDomain.g:1273:5: lv_instructions_2_0= ruleSetupBlock
            	    {

            	    					newCompositeNode(grammarAccess.getSetupAccess().getInstructionsSetupBlockParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_instructions_2_0=ruleSetupBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSetupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_2_0,
            	    						"n7.intern.v3.xtext.domain.Domain.SetupBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSetupAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetup"


    // $ANTLR start "entryRuleStringInstruction"
    // InternalDomain.g:1298:1: entryRuleStringInstruction returns [EObject current=null] : iv_ruleStringInstruction= ruleStringInstruction EOF ;
    public final EObject entryRuleStringInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringInstruction = null;


        try {
            // InternalDomain.g:1298:58: (iv_ruleStringInstruction= ruleStringInstruction EOF )
            // InternalDomain.g:1299:2: iv_ruleStringInstruction= ruleStringInstruction EOF
            {
             newCompositeNode(grammarAccess.getStringInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringInstruction=ruleStringInstruction();

            state._fsp--;

             current =iv_ruleStringInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringInstruction"


    // $ANTLR start "ruleStringInstruction"
    // InternalDomain.g:1305:1: ruleStringInstruction returns [EObject current=null] : ( (lv_content_0_0= RULE_UNQUOTEDSTRING ) ) ;
    public final EObject ruleStringInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;


        	enterRule();

        try {
            // InternalDomain.g:1311:2: ( ( (lv_content_0_0= RULE_UNQUOTEDSTRING ) ) )
            // InternalDomain.g:1312:2: ( (lv_content_0_0= RULE_UNQUOTEDSTRING ) )
            {
            // InternalDomain.g:1312:2: ( (lv_content_0_0= RULE_UNQUOTEDSTRING ) )
            // InternalDomain.g:1313:3: (lv_content_0_0= RULE_UNQUOTEDSTRING )
            {
            // InternalDomain.g:1313:3: (lv_content_0_0= RULE_UNQUOTEDSTRING )
            // InternalDomain.g:1314:4: lv_content_0_0= RULE_UNQUOTEDSTRING
            {
            lv_content_0_0=(Token)match(input,RULE_UNQUOTEDSTRING,FOLLOW_2); 

            				newLeafNode(lv_content_0_0, grammarAccess.getStringInstructionAccess().getContentUNQUOTEDSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringInstructionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"content",
            					lv_content_0_0,
            					"n7.intern.v3.xtext.domain.Domain.UNQUOTEDSTRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringInstruction"


    // $ANTLR start "ruleLanguage"
    // InternalDomain.g:1333:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'python' ) | (enumLiteral_1= 'java' ) | (enumLiteral_2= 'c' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDomain.g:1339:2: ( ( (enumLiteral_0= 'python' ) | (enumLiteral_1= 'java' ) | (enumLiteral_2= 'c' ) ) )
            // InternalDomain.g:1340:2: ( (enumLiteral_0= 'python' ) | (enumLiteral_1= 'java' ) | (enumLiteral_2= 'c' ) )
            {
            // InternalDomain.g:1340:2: ( (enumLiteral_0= 'python' ) | (enumLiteral_1= 'java' ) | (enumLiteral_2= 'c' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt23=1;
                }
                break;
            case 37:
                {
                alt23=2;
                }
                break;
            case 38:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDomain.g:1341:3: (enumLiteral_0= 'python' )
                    {
                    // InternalDomain.g:1341:3: (enumLiteral_0= 'python' )
                    // InternalDomain.g:1342:4: enumLiteral_0= 'python'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getPythonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getPythonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:1349:3: (enumLiteral_1= 'java' )
                    {
                    // InternalDomain.g:1349:3: (enumLiteral_1= 'java' )
                    // InternalDomain.g:1350:4: enumLiteral_1= 'java'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getJavaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getJavaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:1357:3: (enumLiteral_2= 'c' )
                    {
                    // InternalDomain.g:1357:3: (enumLiteral_2= 'c' )
                    // InternalDomain.g:1358:4: enumLiteral_2= 'c'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "ruleMarkerID"
    // InternalDomain.g:1368:1: ruleMarkerID returns [Enumerator current=null] : (enumLiteral_0= 'Interpolation' ) ;
    public final Enumerator ruleMarkerID() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDomain.g:1374:2: ( (enumLiteral_0= 'Interpolation' ) )
            // InternalDomain.g:1375:2: (enumLiteral_0= 'Interpolation' )
            {
            // InternalDomain.g:1375:2: (enumLiteral_0= 'Interpolation' )
            // InternalDomain.g:1376:3: enumLiteral_0= 'Interpolation'
            {
            enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

            			current = grammarAccess.getMarkerIDAccess().getINTERPOLATIONEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getMarkerIDAccess().getINTERPOLATIONEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkerID"


    // $ANTLR start "ruleType"
    // InternalDomain.g:1385:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalDomain.g:1391:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) ) )
            // InternalDomain.g:1392:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) )
            {
            // InternalDomain.g:1392:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) )
            int alt24=9;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt24=1;
                }
                break;
            case 41:
                {
                alt24=2;
                }
                break;
            case 42:
                {
                alt24=3;
                }
                break;
            case 43:
                {
                alt24=4;
                }
                break;
            case 44:
                {
                alt24=5;
                }
                break;
            case 45:
                {
                alt24=6;
                }
                break;
            case 46:
                {
                alt24=7;
                }
                break;
            case 47:
                {
                alt24=8;
                }
                break;
            case 48:
                {
                alt24=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDomain.g:1393:3: (enumLiteral_0= 'string' )
                    {
                    // InternalDomain.g:1393:3: (enumLiteral_0= 'string' )
                    // InternalDomain.g:1394:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:1401:3: (enumLiteral_1= 'byte' )
                    {
                    // InternalDomain.g:1401:3: (enumLiteral_1= 'byte' )
                    // InternalDomain.g:1402:4: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getByteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getByteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:1409:3: (enumLiteral_2= 'short' )
                    {
                    // InternalDomain.g:1409:3: (enumLiteral_2= 'short' )
                    // InternalDomain.g:1410:4: enumLiteral_2= 'short'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getShortEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomain.g:1417:3: (enumLiteral_3= 'int' )
                    {
                    // InternalDomain.g:1417:3: (enumLiteral_3= 'int' )
                    // InternalDomain.g:1418:4: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomain.g:1425:3: (enumLiteral_4= 'long' )
                    {
                    // InternalDomain.g:1425:3: (enumLiteral_4= 'long' )
                    // InternalDomain.g:1426:4: enumLiteral_4= 'long'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDomain.g:1433:3: (enumLiteral_5= 'float' )
                    {
                    // InternalDomain.g:1433:3: (enumLiteral_5= 'float' )
                    // InternalDomain.g:1434:4: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDomain.g:1441:3: (enumLiteral_6= 'double' )
                    {
                    // InternalDomain.g:1441:3: (enumLiteral_6= 'double' )
                    // InternalDomain.g:1442:4: enumLiteral_6= 'double'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDomain.g:1449:3: (enumLiteral_7= 'char' )
                    {
                    // InternalDomain.g:1449:3: (enumLiteral_7= 'char' )
                    // InternalDomain.g:1450:4: enumLiteral_7= 'char'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDomain.g:1457:3: (enumLiteral_8= 'boolean' )
                    {
                    // InternalDomain.g:1457:3: (enumLiteral_8= 'boolean' )
                    // InternalDomain.g:1458:4: enumLiteral_8= 'boolean'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\50\11\27\2\uffff";
    static final String dfa_3s = "\1\60\11\37\2\uffff";
    static final String dfa_4s = "\12\uffff\1\1\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 985:4: ( ( (lv_inputs_7_0= ruleType ) ) otherlv_8= ',' )*";
        }
    }
    static final String dfa_7s = "\1\50\11\31\2\uffff";
    static final String[] dfa_8s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\13\5\uffff\1\12",
            "\1\13\5\uffff\1\12",
            "\1\13\5\uffff\1\12",
            "\1\13\5\uffff\1\12",
            "\1\13\5\uffff\1\12",
            "\1\13\5\uffff\1\12",
            "\1\13\5\uffff\1\12",
            "\1\13\5\uffff\1\12",
            "\1\13\5\uffff\1\12",
            "",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "()* loopback of 1039:4: ( ( (lv_outputs_12_0= ruleType ) ) otherlv_13= ',' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001FF0104200020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001FF0004200020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001FF0000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003FD0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000808020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001FF0000A00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010000L});

}