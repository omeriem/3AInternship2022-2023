package n7.intern.v3.xtext.idsl.parser.antlr.internal;

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
import n7.intern.v3.xtext.idsl.services.IDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NINT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_CHAR", "RULE_LONG", "RULE_BYTE", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@description'", "'('", "')'", "'configuration'", "'{'", "'}'", "'thing'", "'connexion'", "'='", "';'", "'stream'", "'of'", "'<'", "'>'", "'output'", "'holder'", "'['", "','", "']'", "'preprocessor'", "':'", "'processor'", "'synchronizer'", "'let'", "'a'", "'pre'", "'using'", "'process'", "'synchronize'", "'@domain'", "'string'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'boolean'"
    };
    public static final int RULE_NINT=7;
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_CHAR=10;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_BYTE=12;
    public static final int RULE_SL_COMMENT=15;
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
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__48=48;
    public static final int T__49=49;
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


        public InternalIDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIDsl.g"; }



     	private IDslGrammarAccess grammarAccess;

        public InternalIDslParser(TokenStream input, IDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IotFramework";
       	}

       	@Override
       	protected IDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIotFramework"
    // InternalIDsl.g:65:1: entryRuleIotFramework returns [EObject current=null] : iv_ruleIotFramework= ruleIotFramework EOF ;
    public final EObject entryRuleIotFramework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIotFramework = null;


        try {
            // InternalIDsl.g:65:53: (iv_ruleIotFramework= ruleIotFramework EOF )
            // InternalIDsl.g:66:2: iv_ruleIotFramework= ruleIotFramework EOF
            {
             newCompositeNode(grammarAccess.getIotFrameworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIotFramework=ruleIotFramework();

            state._fsp--;

             current =iv_ruleIotFramework; 
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
    // $ANTLR end "entryRuleIotFramework"


    // $ANTLR start "ruleIotFramework"
    // InternalIDsl.g:72:1: ruleIotFramework returns [EObject current=null] : ( ( ( (lv_dataflowdescriptors_0_0= ruleThingBlock ) ) | ( (lv_dataflowdescriptors_1_0= ruleOutputBlock ) ) | ( (lv_dataflowdescriptors_2_0= ruleHolderBlock ) ) | ( (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock ) ) | ( (lv_interfacerdescriptors_4_0= rulePreProcessorBlock ) ) | ( (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock ) ) )* (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' )? otherlv_10= 'configuration' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '{' ( ( (lv_dataflows_13_0= ruleDefinitionInstruction ) ) | ( (lv_interfacers_14_0= ruleSynchronizerAssignation ) ) | ( (lv_interfacers_15_0= rulePreProcessorAssignation ) ) | ( (lv_interfacers_16_0= ruleProcessorAssignation ) ) | ( (lv_interfacers_17_0= ruleOutputAssignation ) ) )+ otherlv_18= '}' ) ;
    public final EObject ruleIotFramework() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_18=null;
        EObject lv_dataflowdescriptors_0_0 = null;

        EObject lv_dataflowdescriptors_1_0 = null;

        EObject lv_dataflowdescriptors_2_0 = null;

        EObject lv_interfacerdescriptors_3_0 = null;

        EObject lv_interfacerdescriptors_4_0 = null;

        EObject lv_interfacerdescriptors_5_0 = null;

        EObject lv_dataflows_13_0 = null;

        EObject lv_interfacers_14_0 = null;

        EObject lv_interfacers_15_0 = null;

        EObject lv_interfacers_16_0 = null;

        EObject lv_interfacers_17_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:78:2: ( ( ( ( (lv_dataflowdescriptors_0_0= ruleThingBlock ) ) | ( (lv_dataflowdescriptors_1_0= ruleOutputBlock ) ) | ( (lv_dataflowdescriptors_2_0= ruleHolderBlock ) ) | ( (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock ) ) | ( (lv_interfacerdescriptors_4_0= rulePreProcessorBlock ) ) | ( (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock ) ) )* (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' )? otherlv_10= 'configuration' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '{' ( ( (lv_dataflows_13_0= ruleDefinitionInstruction ) ) | ( (lv_interfacers_14_0= ruleSynchronizerAssignation ) ) | ( (lv_interfacers_15_0= rulePreProcessorAssignation ) ) | ( (lv_interfacers_16_0= ruleProcessorAssignation ) ) | ( (lv_interfacers_17_0= ruleOutputAssignation ) ) )+ otherlv_18= '}' ) )
            // InternalIDsl.g:79:2: ( ( ( (lv_dataflowdescriptors_0_0= ruleThingBlock ) ) | ( (lv_dataflowdescriptors_1_0= ruleOutputBlock ) ) | ( (lv_dataflowdescriptors_2_0= ruleHolderBlock ) ) | ( (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock ) ) | ( (lv_interfacerdescriptors_4_0= rulePreProcessorBlock ) ) | ( (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock ) ) )* (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' )? otherlv_10= 'configuration' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '{' ( ( (lv_dataflows_13_0= ruleDefinitionInstruction ) ) | ( (lv_interfacers_14_0= ruleSynchronizerAssignation ) ) | ( (lv_interfacers_15_0= rulePreProcessorAssignation ) ) | ( (lv_interfacers_16_0= ruleProcessorAssignation ) ) | ( (lv_interfacers_17_0= ruleOutputAssignation ) ) )+ otherlv_18= '}' )
            {
            // InternalIDsl.g:79:2: ( ( ( (lv_dataflowdescriptors_0_0= ruleThingBlock ) ) | ( (lv_dataflowdescriptors_1_0= ruleOutputBlock ) ) | ( (lv_dataflowdescriptors_2_0= ruleHolderBlock ) ) | ( (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock ) ) | ( (lv_interfacerdescriptors_4_0= rulePreProcessorBlock ) ) | ( (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock ) ) )* (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' )? otherlv_10= 'configuration' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '{' ( ( (lv_dataflows_13_0= ruleDefinitionInstruction ) ) | ( (lv_interfacers_14_0= ruleSynchronizerAssignation ) ) | ( (lv_interfacers_15_0= rulePreProcessorAssignation ) ) | ( (lv_interfacers_16_0= ruleProcessorAssignation ) ) | ( (lv_interfacers_17_0= ruleOutputAssignation ) ) )+ otherlv_18= '}' )
            // InternalIDsl.g:80:3: ( ( (lv_dataflowdescriptors_0_0= ruleThingBlock ) ) | ( (lv_dataflowdescriptors_1_0= ruleOutputBlock ) ) | ( (lv_dataflowdescriptors_2_0= ruleHolderBlock ) ) | ( (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock ) ) | ( (lv_interfacerdescriptors_4_0= rulePreProcessorBlock ) ) | ( (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock ) ) )* (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' )? otherlv_10= 'configuration' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '{' ( ( (lv_dataflows_13_0= ruleDefinitionInstruction ) ) | ( (lv_interfacers_14_0= ruleSynchronizerAssignation ) ) | ( (lv_interfacers_15_0= rulePreProcessorAssignation ) ) | ( (lv_interfacers_16_0= ruleProcessorAssignation ) ) | ( (lv_interfacers_17_0= ruleOutputAssignation ) ) )+ otherlv_18= '}'
            {
            // InternalIDsl.g:80:3: ( ( (lv_dataflowdescriptors_0_0= ruleThingBlock ) ) | ( (lv_dataflowdescriptors_1_0= ruleOutputBlock ) ) | ( (lv_dataflowdescriptors_2_0= ruleHolderBlock ) ) | ( (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock ) ) | ( (lv_interfacerdescriptors_4_0= rulePreProcessorBlock ) ) | ( (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock ) ) )*
            loop1:
            do {
                int alt1=7;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalIDsl.g:81:4: ( (lv_dataflowdescriptors_0_0= ruleThingBlock ) )
            	    {
            	    // InternalIDsl.g:81:4: ( (lv_dataflowdescriptors_0_0= ruleThingBlock ) )
            	    // InternalIDsl.g:82:5: (lv_dataflowdescriptors_0_0= ruleThingBlock )
            	    {
            	    // InternalIDsl.g:82:5: (lv_dataflowdescriptors_0_0= ruleThingBlock )
            	    // InternalIDsl.g:83:6: lv_dataflowdescriptors_0_0= ruleThingBlock
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getDataflowdescriptorsThingBlockParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_dataflowdescriptors_0_0=ruleThingBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataflowdescriptors",
            	    							lv_dataflowdescriptors_0_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.ThingBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDsl.g:101:4: ( (lv_dataflowdescriptors_1_0= ruleOutputBlock ) )
            	    {
            	    // InternalIDsl.g:101:4: ( (lv_dataflowdescriptors_1_0= ruleOutputBlock ) )
            	    // InternalIDsl.g:102:5: (lv_dataflowdescriptors_1_0= ruleOutputBlock )
            	    {
            	    // InternalIDsl.g:102:5: (lv_dataflowdescriptors_1_0= ruleOutputBlock )
            	    // InternalIDsl.g:103:6: lv_dataflowdescriptors_1_0= ruleOutputBlock
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getDataflowdescriptorsOutputBlockParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_dataflowdescriptors_1_0=ruleOutputBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataflowdescriptors",
            	    							lv_dataflowdescriptors_1_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.OutputBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIDsl.g:121:4: ( (lv_dataflowdescriptors_2_0= ruleHolderBlock ) )
            	    {
            	    // InternalIDsl.g:121:4: ( (lv_dataflowdescriptors_2_0= ruleHolderBlock ) )
            	    // InternalIDsl.g:122:5: (lv_dataflowdescriptors_2_0= ruleHolderBlock )
            	    {
            	    // InternalIDsl.g:122:5: (lv_dataflowdescriptors_2_0= ruleHolderBlock )
            	    // InternalIDsl.g:123:6: lv_dataflowdescriptors_2_0= ruleHolderBlock
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getDataflowdescriptorsHolderBlockParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_dataflowdescriptors_2_0=ruleHolderBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataflowdescriptors",
            	    							lv_dataflowdescriptors_2_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.HolderBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIDsl.g:141:4: ( (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock ) )
            	    {
            	    // InternalIDsl.g:141:4: ( (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock ) )
            	    // InternalIDsl.g:142:5: (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock )
            	    {
            	    // InternalIDsl.g:142:5: (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock )
            	    // InternalIDsl.g:143:6: lv_interfacerdescriptors_3_0= ruleSynchronizerBlock
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getInterfacerdescriptorsSynchronizerBlockParserRuleCall_0_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_interfacerdescriptors_3_0=ruleSynchronizerBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interfacerdescriptors",
            	    							lv_interfacerdescriptors_3_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.SynchronizerBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIDsl.g:161:4: ( (lv_interfacerdescriptors_4_0= rulePreProcessorBlock ) )
            	    {
            	    // InternalIDsl.g:161:4: ( (lv_interfacerdescriptors_4_0= rulePreProcessorBlock ) )
            	    // InternalIDsl.g:162:5: (lv_interfacerdescriptors_4_0= rulePreProcessorBlock )
            	    {
            	    // InternalIDsl.g:162:5: (lv_interfacerdescriptors_4_0= rulePreProcessorBlock )
            	    // InternalIDsl.g:163:6: lv_interfacerdescriptors_4_0= rulePreProcessorBlock
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getInterfacerdescriptorsPreProcessorBlockParserRuleCall_0_4_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_interfacerdescriptors_4_0=rulePreProcessorBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interfacerdescriptors",
            	    							lv_interfacerdescriptors_4_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.PreProcessorBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIDsl.g:181:4: ( (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock ) )
            	    {
            	    // InternalIDsl.g:181:4: ( (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock ) )
            	    // InternalIDsl.g:182:5: (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock )
            	    {
            	    // InternalIDsl.g:182:5: (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock )
            	    // InternalIDsl.g:183:6: lv_interfacerdescriptors_5_0= ruleDataProcessorBlock
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getInterfacerdescriptorsDataProcessorBlockParserRuleCall_0_5_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_interfacerdescriptors_5_0=ruleDataProcessorBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interfacerdescriptors",
            	    							lv_interfacerdescriptors_5_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.DataProcessorBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalIDsl.g:201:3: (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalIDsl.g:202:4: otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getIotFrameworkAccess().getDescriptionKeyword_1_0());
                    			
                    otherlv_7=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getIotFrameworkAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalIDsl.g:210:4: ( (lv_description_8_0= RULE_STRING ) )
                    // InternalIDsl.g:211:5: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalIDsl.g:211:5: (lv_description_8_0= RULE_STRING )
                    // InternalIDsl.g:212:6: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_8_0, grammarAccess.getIotFrameworkAccess().getDescriptionSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIotFrameworkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getIotFrameworkAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getIotFrameworkAccess().getConfigurationKeyword_2());
            		
            // InternalIDsl.g:237:3: ( (lv_name_11_0= RULE_ID ) )
            // InternalIDsl.g:238:4: (lv_name_11_0= RULE_ID )
            {
            // InternalIDsl.g:238:4: (lv_name_11_0= RULE_ID )
            // InternalIDsl.g:239:5: lv_name_11_0= RULE_ID
            {
            lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_11_0, grammarAccess.getIotFrameworkAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIotFrameworkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getIotFrameworkAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalIDsl.g:259:3: ( ( (lv_dataflows_13_0= ruleDefinitionInstruction ) ) | ( (lv_interfacers_14_0= ruleSynchronizerAssignation ) ) | ( (lv_interfacers_15_0= rulePreProcessorAssignation ) ) | ( (lv_interfacers_16_0= ruleProcessorAssignation ) ) | ( (lv_interfacers_17_0= ruleOutputAssignation ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=6;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalIDsl.g:260:4: ( (lv_dataflows_13_0= ruleDefinitionInstruction ) )
            	    {
            	    // InternalIDsl.g:260:4: ( (lv_dataflows_13_0= ruleDefinitionInstruction ) )
            	    // InternalIDsl.g:261:5: (lv_dataflows_13_0= ruleDefinitionInstruction )
            	    {
            	    // InternalIDsl.g:261:5: (lv_dataflows_13_0= ruleDefinitionInstruction )
            	    // InternalIDsl.g:262:6: lv_dataflows_13_0= ruleDefinitionInstruction
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getDataflowsDefinitionInstructionParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_dataflows_13_0=ruleDefinitionInstruction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataflows",
            	    							lv_dataflows_13_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.DefinitionInstruction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDsl.g:280:4: ( (lv_interfacers_14_0= ruleSynchronizerAssignation ) )
            	    {
            	    // InternalIDsl.g:280:4: ( (lv_interfacers_14_0= ruleSynchronizerAssignation ) )
            	    // InternalIDsl.g:281:5: (lv_interfacers_14_0= ruleSynchronizerAssignation )
            	    {
            	    // InternalIDsl.g:281:5: (lv_interfacers_14_0= ruleSynchronizerAssignation )
            	    // InternalIDsl.g:282:6: lv_interfacers_14_0= ruleSynchronizerAssignation
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getInterfacersSynchronizerAssignationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_interfacers_14_0=ruleSynchronizerAssignation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interfacers",
            	    							lv_interfacers_14_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.SynchronizerAssignation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIDsl.g:300:4: ( (lv_interfacers_15_0= rulePreProcessorAssignation ) )
            	    {
            	    // InternalIDsl.g:300:4: ( (lv_interfacers_15_0= rulePreProcessorAssignation ) )
            	    // InternalIDsl.g:301:5: (lv_interfacers_15_0= rulePreProcessorAssignation )
            	    {
            	    // InternalIDsl.g:301:5: (lv_interfacers_15_0= rulePreProcessorAssignation )
            	    // InternalIDsl.g:302:6: lv_interfacers_15_0= rulePreProcessorAssignation
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getInterfacersPreProcessorAssignationParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_interfacers_15_0=rulePreProcessorAssignation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interfacers",
            	    							lv_interfacers_15_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.PreProcessorAssignation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIDsl.g:320:4: ( (lv_interfacers_16_0= ruleProcessorAssignation ) )
            	    {
            	    // InternalIDsl.g:320:4: ( (lv_interfacers_16_0= ruleProcessorAssignation ) )
            	    // InternalIDsl.g:321:5: (lv_interfacers_16_0= ruleProcessorAssignation )
            	    {
            	    // InternalIDsl.g:321:5: (lv_interfacers_16_0= ruleProcessorAssignation )
            	    // InternalIDsl.g:322:6: lv_interfacers_16_0= ruleProcessorAssignation
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getInterfacersProcessorAssignationParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_interfacers_16_0=ruleProcessorAssignation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interfacers",
            	    							lv_interfacers_16_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.ProcessorAssignation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIDsl.g:340:4: ( (lv_interfacers_17_0= ruleOutputAssignation ) )
            	    {
            	    // InternalIDsl.g:340:4: ( (lv_interfacers_17_0= ruleOutputAssignation ) )
            	    // InternalIDsl.g:341:5: (lv_interfacers_17_0= ruleOutputAssignation )
            	    {
            	    // InternalIDsl.g:341:5: (lv_interfacers_17_0= ruleOutputAssignation )
            	    // InternalIDsl.g:342:6: lv_interfacers_17_0= ruleOutputAssignation
            	    {

            	    						newCompositeNode(grammarAccess.getIotFrameworkAccess().getInterfacersOutputAssignationParserRuleCall_5_4_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_interfacers_17_0=ruleOutputAssignation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIotFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interfacers",
            	    							lv_interfacers_17_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.OutputAssignation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_18=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getIotFrameworkAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleIotFramework"


    // $ANTLR start "entryRuleThingBlock"
    // InternalIDsl.g:368:1: entryRuleThingBlock returns [EObject current=null] : iv_ruleThingBlock= ruleThingBlock EOF ;
    public final EObject entryRuleThingBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThingBlock = null;


        try {
            // InternalIDsl.g:368:51: (iv_ruleThingBlock= ruleThingBlock EOF )
            // InternalIDsl.g:369:2: iv_ruleThingBlock= ruleThingBlock EOF
            {
             newCompositeNode(grammarAccess.getThingBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThingBlock=ruleThingBlock();

            state._fsp--;

             current =iv_ruleThingBlock; 
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
    // $ANTLR end "entryRuleThingBlock"


    // $ANTLR start "ruleThingBlock"
    // InternalIDsl.g:375:1: ruleThingBlock returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'thing' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_connexions_7_0= ruleConnexionBlock ) ) | ( (lv_parameters_8_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_9_0= ruleStreamDefinition ) ) )+ otherlv_10= '}' ) ;
    public final EObject ruleThingBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_connexions_7_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_streamdescriptors_9_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:381:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'thing' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_connexions_7_0= ruleConnexionBlock ) ) | ( (lv_parameters_8_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_9_0= ruleStreamDefinition ) ) )+ otherlv_10= '}' ) )
            // InternalIDsl.g:382:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'thing' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_connexions_7_0= ruleConnexionBlock ) ) | ( (lv_parameters_8_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_9_0= ruleStreamDefinition ) ) )+ otherlv_10= '}' )
            {
            // InternalIDsl.g:382:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'thing' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_connexions_7_0= ruleConnexionBlock ) ) | ( (lv_parameters_8_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_9_0= ruleStreamDefinition ) ) )+ otherlv_10= '}' )
            // InternalIDsl.g:383:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'thing' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_connexions_7_0= ruleConnexionBlock ) ) | ( (lv_parameters_8_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_9_0= ruleStreamDefinition ) ) )+ otherlv_10= '}'
            {
            // InternalIDsl.g:383:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIDsl.g:384:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getThingBlockAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getThingBlockAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalIDsl.g:392:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalIDsl.g:393:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalIDsl.g:393:5: (lv_description_2_0= RULE_STRING )
                    // InternalIDsl.g:394:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getThingBlockAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThingBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getThingBlockAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getThingBlockAccess().getThingKeyword_1());
            		
            // InternalIDsl.g:419:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalIDsl.g:420:4: (lv_name_5_0= RULE_ID )
            {
            // InternalIDsl.g:420:4: (lv_name_5_0= RULE_ID )
            // InternalIDsl.g:421:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_5_0, grammarAccess.getThingBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThingBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getThingBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIDsl.g:441:3: ( ( (lv_connexions_7_0= ruleConnexionBlock ) ) | ( (lv_parameters_8_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_9_0= ruleStreamDefinition ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==19) ) {
                        int LA5_6 = input.LA(3);

                        if ( (LA5_6==RULE_STRING) ) {
                            int LA5_7 = input.LA(4);

                            if ( (LA5_7==20) ) {
                                int LA5_8 = input.LA(5);

                                if ( (LA5_8==25) ) {
                                    alt5=1;
                                }
                                else if ( (LA5_8==28) ) {
                                    alt5=3;
                                }


                            }


                        }


                    }


                    }
                    break;
                case 25:
                    {
                    alt5=1;
                    }
                    break;
                case 47:
                    {
                    alt5=2;
                    }
                    break;
                case 28:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalIDsl.g:442:4: ( (lv_connexions_7_0= ruleConnexionBlock ) )
            	    {
            	    // InternalIDsl.g:442:4: ( (lv_connexions_7_0= ruleConnexionBlock ) )
            	    // InternalIDsl.g:443:5: (lv_connexions_7_0= ruleConnexionBlock )
            	    {
            	    // InternalIDsl.g:443:5: (lv_connexions_7_0= ruleConnexionBlock )
            	    // InternalIDsl.g:444:6: lv_connexions_7_0= ruleConnexionBlock
            	    {

            	    						newCompositeNode(grammarAccess.getThingBlockAccess().getConnexionsConnexionBlockParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_connexions_7_0=ruleConnexionBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThingBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connexions",
            	    							lv_connexions_7_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.ConnexionBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDsl.g:462:4: ( (lv_parameters_8_0= ruleDomainParameterBlock ) )
            	    {
            	    // InternalIDsl.g:462:4: ( (lv_parameters_8_0= ruleDomainParameterBlock ) )
            	    // InternalIDsl.g:463:5: (lv_parameters_8_0= ruleDomainParameterBlock )
            	    {
            	    // InternalIDsl.g:463:5: (lv_parameters_8_0= ruleDomainParameterBlock )
            	    // InternalIDsl.g:464:6: lv_parameters_8_0= ruleDomainParameterBlock
            	    {

            	    						newCompositeNode(grammarAccess.getThingBlockAccess().getParametersDomainParameterBlockParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_parameters_8_0=ruleDomainParameterBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThingBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_8_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.DomainParameterBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIDsl.g:482:4: ( (lv_streamdescriptors_9_0= ruleStreamDefinition ) )
            	    {
            	    // InternalIDsl.g:482:4: ( (lv_streamdescriptors_9_0= ruleStreamDefinition ) )
            	    // InternalIDsl.g:483:5: (lv_streamdescriptors_9_0= ruleStreamDefinition )
            	    {
            	    // InternalIDsl.g:483:5: (lv_streamdescriptors_9_0= ruleStreamDefinition )
            	    // InternalIDsl.g:484:6: lv_streamdescriptors_9_0= ruleStreamDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getThingBlockAccess().getStreamdescriptorsStreamDefinitionParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_streamdescriptors_9_0=ruleStreamDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThingBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"streamdescriptors",
            	    							lv_streamdescriptors_9_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.StreamDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getThingBlockAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleThingBlock"


    // $ANTLR start "entryRuleConnexionBlock"
    // InternalIDsl.g:510:1: entryRuleConnexionBlock returns [EObject current=null] : iv_ruleConnexionBlock= ruleConnexionBlock EOF ;
    public final EObject entryRuleConnexionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnexionBlock = null;


        try {
            // InternalIDsl.g:510:55: (iv_ruleConnexionBlock= ruleConnexionBlock EOF )
            // InternalIDsl.g:511:2: iv_ruleConnexionBlock= ruleConnexionBlock EOF
            {
             newCompositeNode(grammarAccess.getConnexionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnexionBlock=ruleConnexionBlock();

            state._fsp--;

             current =iv_ruleConnexionBlock; 
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
    // $ANTLR end "entryRuleConnexionBlock"


    // $ANTLR start "ruleConnexionBlock"
    // InternalIDsl.g:517:1: ruleConnexionBlock returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'connexion' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}' ) ;
    public final EObject ruleConnexionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:523:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'connexion' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}' ) )
            // InternalIDsl.g:524:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'connexion' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}' )
            {
            // InternalIDsl.g:524:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'connexion' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}' )
            // InternalIDsl.g:525:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'connexion' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}'
            {
            // InternalIDsl.g:525:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIDsl.g:526:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getConnexionBlockAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getConnexionBlockAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalIDsl.g:534:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalIDsl.g:535:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalIDsl.g:535:5: (lv_description_2_0= RULE_STRING )
                    // InternalIDsl.g:536:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getConnexionBlockAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnexionBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnexionBlockAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getConnexionBlockAccess().getConnexionKeyword_1());
            		
            // InternalIDsl.g:561:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalIDsl.g:562:4: (lv_name_5_0= RULE_ID )
            {
            // InternalIDsl.g:562:4: (lv_name_5_0= RULE_ID )
            // InternalIDsl.g:563:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_5_0, grammarAccess.getConnexionBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnexionBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getConnexionBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIDsl.g:583:3: ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==47) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIDsl.g:584:4: (lv_parameters_7_0= ruleDomainParameterBlock )
            	    {
            	    // InternalIDsl.g:584:4: (lv_parameters_7_0= ruleDomainParameterBlock )
            	    // InternalIDsl.g:585:5: lv_parameters_7_0= ruleDomainParameterBlock
            	    {

            	    					newCompositeNode(grammarAccess.getConnexionBlockAccess().getParametersDomainParameterBlockParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_parameters_7_0=ruleDomainParameterBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConnexionBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_7_0,
            	    						"n7.intern.v3.xtext.idsl.IDsl.DomainParameterBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConnexionBlockAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleConnexionBlock"


    // $ANTLR start "entryRuleParameterExpression"
    // InternalIDsl.g:610:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // InternalIDsl.g:610:60: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // InternalIDsl.g:611:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
             newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;

             current =iv_ruleParameterExpression; 
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
    // $ANTLR end "entryRuleParameterExpression"


    // $ANTLR start "ruleParameterExpression"
    // InternalIDsl.g:617:1: ruleParameterExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_content_2_0= RULE_STRING ) ) | ( (lv_content_3_0= RULE_INT ) ) | ( (lv_content_4_0= RULE_NINT ) ) | ( (lv_content_5_0= RULE_BOOLEAN ) ) | ( (lv_content_6_0= RULE_FLOAT ) ) | ( (lv_content_7_0= RULE_CHAR ) ) | ( (lv_content_8_0= RULE_LONG ) ) | ( (lv_content_9_0= RULE_BYTE ) ) | ( (lv_content_10_0= RULE_DOUBLE ) ) ) otherlv_11= ';' ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token lv_content_3_0=null;
        Token lv_content_4_0=null;
        Token lv_content_5_0=null;
        Token lv_content_6_0=null;
        Token lv_content_7_0=null;
        Token lv_content_8_0=null;
        Token lv_content_9_0=null;
        Token lv_content_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalIDsl.g:623:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_content_2_0= RULE_STRING ) ) | ( (lv_content_3_0= RULE_INT ) ) | ( (lv_content_4_0= RULE_NINT ) ) | ( (lv_content_5_0= RULE_BOOLEAN ) ) | ( (lv_content_6_0= RULE_FLOAT ) ) | ( (lv_content_7_0= RULE_CHAR ) ) | ( (lv_content_8_0= RULE_LONG ) ) | ( (lv_content_9_0= RULE_BYTE ) ) | ( (lv_content_10_0= RULE_DOUBLE ) ) ) otherlv_11= ';' ) )
            // InternalIDsl.g:624:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_content_2_0= RULE_STRING ) ) | ( (lv_content_3_0= RULE_INT ) ) | ( (lv_content_4_0= RULE_NINT ) ) | ( (lv_content_5_0= RULE_BOOLEAN ) ) | ( (lv_content_6_0= RULE_FLOAT ) ) | ( (lv_content_7_0= RULE_CHAR ) ) | ( (lv_content_8_0= RULE_LONG ) ) | ( (lv_content_9_0= RULE_BYTE ) ) | ( (lv_content_10_0= RULE_DOUBLE ) ) ) otherlv_11= ';' )
            {
            // InternalIDsl.g:624:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_content_2_0= RULE_STRING ) ) | ( (lv_content_3_0= RULE_INT ) ) | ( (lv_content_4_0= RULE_NINT ) ) | ( (lv_content_5_0= RULE_BOOLEAN ) ) | ( (lv_content_6_0= RULE_FLOAT ) ) | ( (lv_content_7_0= RULE_CHAR ) ) | ( (lv_content_8_0= RULE_LONG ) ) | ( (lv_content_9_0= RULE_BYTE ) ) | ( (lv_content_10_0= RULE_DOUBLE ) ) ) otherlv_11= ';' )
            // InternalIDsl.g:625:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_content_2_0= RULE_STRING ) ) | ( (lv_content_3_0= RULE_INT ) ) | ( (lv_content_4_0= RULE_NINT ) ) | ( (lv_content_5_0= RULE_BOOLEAN ) ) | ( (lv_content_6_0= RULE_FLOAT ) ) | ( (lv_content_7_0= RULE_CHAR ) ) | ( (lv_content_8_0= RULE_LONG ) ) | ( (lv_content_9_0= RULE_BYTE ) ) | ( (lv_content_10_0= RULE_DOUBLE ) ) ) otherlv_11= ';'
            {
            // InternalIDsl.g:625:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIDsl.g:626:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIDsl.g:626:4: (lv_name_0_0= RULE_ID )
            // InternalIDsl.g:627:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterExpressionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterExpressionAccess().getEqualsSignKeyword_1());
            		
            // InternalIDsl.g:647:3: ( ( (lv_content_2_0= RULE_STRING ) ) | ( (lv_content_3_0= RULE_INT ) ) | ( (lv_content_4_0= RULE_NINT ) ) | ( (lv_content_5_0= RULE_BOOLEAN ) ) | ( (lv_content_6_0= RULE_FLOAT ) ) | ( (lv_content_7_0= RULE_CHAR ) ) | ( (lv_content_8_0= RULE_LONG ) ) | ( (lv_content_9_0= RULE_BYTE ) ) | ( (lv_content_10_0= RULE_DOUBLE ) ) )
            int alt8=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_NINT:
                {
                alt8=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt8=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt8=5;
                }
                break;
            case RULE_CHAR:
                {
                alt8=6;
                }
                break;
            case RULE_LONG:
                {
                alt8=7;
                }
                break;
            case RULE_BYTE:
                {
                alt8=8;
                }
                break;
            case RULE_DOUBLE:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalIDsl.g:648:4: ( (lv_content_2_0= RULE_STRING ) )
                    {
                    // InternalIDsl.g:648:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalIDsl.g:649:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalIDsl.g:649:5: (lv_content_2_0= RULE_STRING )
                    // InternalIDsl.g:650:6: lv_content_2_0= RULE_STRING
                    {
                    lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_content_2_0, grammarAccess.getParameterExpressionAccess().getContentSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDsl.g:667:4: ( (lv_content_3_0= RULE_INT ) )
                    {
                    // InternalIDsl.g:667:4: ( (lv_content_3_0= RULE_INT ) )
                    // InternalIDsl.g:668:5: (lv_content_3_0= RULE_INT )
                    {
                    // InternalIDsl.g:668:5: (lv_content_3_0= RULE_INT )
                    // InternalIDsl.g:669:6: lv_content_3_0= RULE_INT
                    {
                    lv_content_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_content_3_0, grammarAccess.getParameterExpressionAccess().getContentINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIDsl.g:686:4: ( (lv_content_4_0= RULE_NINT ) )
                    {
                    // InternalIDsl.g:686:4: ( (lv_content_4_0= RULE_NINT ) )
                    // InternalIDsl.g:687:5: (lv_content_4_0= RULE_NINT )
                    {
                    // InternalIDsl.g:687:5: (lv_content_4_0= RULE_NINT )
                    // InternalIDsl.g:688:6: lv_content_4_0= RULE_NINT
                    {
                    lv_content_4_0=(Token)match(input,RULE_NINT,FOLLOW_20); 

                    						newLeafNode(lv_content_4_0, grammarAccess.getParameterExpressionAccess().getContentNINTTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_4_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.NINT");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalIDsl.g:705:4: ( (lv_content_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalIDsl.g:705:4: ( (lv_content_5_0= RULE_BOOLEAN ) )
                    // InternalIDsl.g:706:5: (lv_content_5_0= RULE_BOOLEAN )
                    {
                    // InternalIDsl.g:706:5: (lv_content_5_0= RULE_BOOLEAN )
                    // InternalIDsl.g:707:6: lv_content_5_0= RULE_BOOLEAN
                    {
                    lv_content_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_20); 

                    						newLeafNode(lv_content_5_0, grammarAccess.getParameterExpressionAccess().getContentBOOLEANTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_5_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalIDsl.g:724:4: ( (lv_content_6_0= RULE_FLOAT ) )
                    {
                    // InternalIDsl.g:724:4: ( (lv_content_6_0= RULE_FLOAT ) )
                    // InternalIDsl.g:725:5: (lv_content_6_0= RULE_FLOAT )
                    {
                    // InternalIDsl.g:725:5: (lv_content_6_0= RULE_FLOAT )
                    // InternalIDsl.g:726:6: lv_content_6_0= RULE_FLOAT
                    {
                    lv_content_6_0=(Token)match(input,RULE_FLOAT,FOLLOW_20); 

                    						newLeafNode(lv_content_6_0, grammarAccess.getParameterExpressionAccess().getContentFLOATTerminalRuleCall_2_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_6_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.FLOAT");
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalIDsl.g:743:4: ( (lv_content_7_0= RULE_CHAR ) )
                    {
                    // InternalIDsl.g:743:4: ( (lv_content_7_0= RULE_CHAR ) )
                    // InternalIDsl.g:744:5: (lv_content_7_0= RULE_CHAR )
                    {
                    // InternalIDsl.g:744:5: (lv_content_7_0= RULE_CHAR )
                    // InternalIDsl.g:745:6: lv_content_7_0= RULE_CHAR
                    {
                    lv_content_7_0=(Token)match(input,RULE_CHAR,FOLLOW_20); 

                    						newLeafNode(lv_content_7_0, grammarAccess.getParameterExpressionAccess().getContentCHARTerminalRuleCall_2_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_7_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.CHAR");
                    					

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalIDsl.g:762:4: ( (lv_content_8_0= RULE_LONG ) )
                    {
                    // InternalIDsl.g:762:4: ( (lv_content_8_0= RULE_LONG ) )
                    // InternalIDsl.g:763:5: (lv_content_8_0= RULE_LONG )
                    {
                    // InternalIDsl.g:763:5: (lv_content_8_0= RULE_LONG )
                    // InternalIDsl.g:764:6: lv_content_8_0= RULE_LONG
                    {
                    lv_content_8_0=(Token)match(input,RULE_LONG,FOLLOW_20); 

                    						newLeafNode(lv_content_8_0, grammarAccess.getParameterExpressionAccess().getContentLONGTerminalRuleCall_2_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_8_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.LONG");
                    					

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalIDsl.g:781:4: ( (lv_content_9_0= RULE_BYTE ) )
                    {
                    // InternalIDsl.g:781:4: ( (lv_content_9_0= RULE_BYTE ) )
                    // InternalIDsl.g:782:5: (lv_content_9_0= RULE_BYTE )
                    {
                    // InternalIDsl.g:782:5: (lv_content_9_0= RULE_BYTE )
                    // InternalIDsl.g:783:6: lv_content_9_0= RULE_BYTE
                    {
                    lv_content_9_0=(Token)match(input,RULE_BYTE,FOLLOW_20); 

                    						newLeafNode(lv_content_9_0, grammarAccess.getParameterExpressionAccess().getContentBYTETerminalRuleCall_2_7_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_9_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.BYTE");
                    					

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalIDsl.g:800:4: ( (lv_content_10_0= RULE_DOUBLE ) )
                    {
                    // InternalIDsl.g:800:4: ( (lv_content_10_0= RULE_DOUBLE ) )
                    // InternalIDsl.g:801:5: (lv_content_10_0= RULE_DOUBLE )
                    {
                    // InternalIDsl.g:801:5: (lv_content_10_0= RULE_DOUBLE )
                    // InternalIDsl.g:802:6: lv_content_10_0= RULE_DOUBLE
                    {
                    lv_content_10_0=(Token)match(input,RULE_DOUBLE,FOLLOW_20); 

                    						newLeafNode(lv_content_10_0, grammarAccess.getParameterExpressionAccess().getContentDOUBLETerminalRuleCall_2_8_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_10_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getParameterExpressionAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleParameterExpression"


    // $ANTLR start "entryRuleStreamDefinition"
    // InternalIDsl.g:827:1: entryRuleStreamDefinition returns [EObject current=null] : iv_ruleStreamDefinition= ruleStreamDefinition EOF ;
    public final EObject entryRuleStreamDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDefinition = null;


        try {
            // InternalIDsl.g:827:57: (iv_ruleStreamDefinition= ruleStreamDefinition EOF )
            // InternalIDsl.g:828:2: iv_ruleStreamDefinition= ruleStreamDefinition EOF
            {
             newCompositeNode(grammarAccess.getStreamDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStreamDefinition=ruleStreamDefinition();

            state._fsp--;

             current =iv_ruleStreamDefinition; 
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
    // $ANTLR end "entryRuleStreamDefinition"


    // $ANTLR start "ruleStreamDefinition"
    // InternalIDsl.g:834:1: ruleStreamDefinition returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'stream' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'of' ( (lv_type_7_0= ruleType ) ) otherlv_8= '<' ( (lv_samplingRate_9_0= RULE_INT ) ) otherlv_10= '>' otherlv_11= ';' ) ;
    public final EObject ruleStreamDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_samplingRate_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:840:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'stream' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'of' ( (lv_type_7_0= ruleType ) ) otherlv_8= '<' ( (lv_samplingRate_9_0= RULE_INT ) ) otherlv_10= '>' otherlv_11= ';' ) )
            // InternalIDsl.g:841:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'stream' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'of' ( (lv_type_7_0= ruleType ) ) otherlv_8= '<' ( (lv_samplingRate_9_0= RULE_INT ) ) otherlv_10= '>' otherlv_11= ';' )
            {
            // InternalIDsl.g:841:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'stream' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'of' ( (lv_type_7_0= ruleType ) ) otherlv_8= '<' ( (lv_samplingRate_9_0= RULE_INT ) ) otherlv_10= '>' otherlv_11= ';' )
            // InternalIDsl.g:842:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'stream' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'of' ( (lv_type_7_0= ruleType ) ) otherlv_8= '<' ( (lv_samplingRate_9_0= RULE_INT ) ) otherlv_10= '>' otherlv_11= ';'
            {
            // InternalIDsl.g:842:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIDsl.g:843:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getStreamDefinitionAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getStreamDefinitionAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalIDsl.g:851:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalIDsl.g:852:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalIDsl.g:852:5: (lv_description_2_0= RULE_STRING )
                    // InternalIDsl.g:853:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getStreamDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStreamDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getStreamDefinitionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getStreamDefinitionAccess().getStreamKeyword_1());
            		
            // InternalIDsl.g:878:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalIDsl.g:879:4: (lv_name_5_0= RULE_ID )
            {
            // InternalIDsl.g:879:4: (lv_name_5_0= RULE_ID )
            // InternalIDsl.g:880:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_5_0, grammarAccess.getStreamDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getStreamDefinitionAccess().getOfKeyword_3());
            		
            // InternalIDsl.g:900:3: ( (lv_type_7_0= ruleType ) )
            // InternalIDsl.g:901:4: (lv_type_7_0= ruleType )
            {
            // InternalIDsl.g:901:4: (lv_type_7_0= ruleType )
            // InternalIDsl.g:902:5: lv_type_7_0= ruleType
            {

            					newCompositeNode(grammarAccess.getStreamDefinitionAccess().getTypeTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_type_7_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStreamDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"n7.intern.v3.xtext.idsl.IDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getStreamDefinitionAccess().getLessThanSignKeyword_5());
            		
            // InternalIDsl.g:923:3: ( (lv_samplingRate_9_0= RULE_INT ) )
            // InternalIDsl.g:924:4: (lv_samplingRate_9_0= RULE_INT )
            {
            // InternalIDsl.g:924:4: (lv_samplingRate_9_0= RULE_INT )
            // InternalIDsl.g:925:5: lv_samplingRate_9_0= RULE_INT
            {
            lv_samplingRate_9_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_samplingRate_9_0, grammarAccess.getStreamDefinitionAccess().getSamplingRateINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"samplingRate",
            						lv_samplingRate_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getStreamDefinitionAccess().getGreaterThanSignKeyword_7());
            		
            otherlv_11=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getStreamDefinitionAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleStreamDefinition"


    // $ANTLR start "entryRuleOutputBlock"
    // InternalIDsl.g:953:1: entryRuleOutputBlock returns [EObject current=null] : iv_ruleOutputBlock= ruleOutputBlock EOF ;
    public final EObject entryRuleOutputBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBlock = null;


        try {
            // InternalIDsl.g:953:52: (iv_ruleOutputBlock= ruleOutputBlock EOF )
            // InternalIDsl.g:954:2: iv_ruleOutputBlock= ruleOutputBlock EOF
            {
             newCompositeNode(grammarAccess.getOutputBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputBlock=ruleOutputBlock();

            state._fsp--;

             current =iv_ruleOutputBlock; 
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
    // $ANTLR end "entryRuleOutputBlock"


    // $ANTLR start "ruleOutputBlock"
    // InternalIDsl.g:960:1: ruleOutputBlock returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'output' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}' ) ;
    public final EObject ruleOutputBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:966:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'output' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}' ) )
            // InternalIDsl.g:967:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'output' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}' )
            {
            // InternalIDsl.g:967:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'output' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}' )
            // InternalIDsl.g:968:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'output' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+ otherlv_8= '}'
            {
            // InternalIDsl.g:968:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIDsl.g:969:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getOutputBlockAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputBlockAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalIDsl.g:977:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalIDsl.g:978:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalIDsl.g:978:5: (lv_description_2_0= RULE_STRING )
                    // InternalIDsl.g:979:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getOutputBlockAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputBlockAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputBlockAccess().getOutputKeyword_1());
            		
            // InternalIDsl.g:1004:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalIDsl.g:1005:4: (lv_name_5_0= RULE_ID )
            {
            // InternalIDsl.g:1005:4: (lv_name_5_0= RULE_ID )
            // InternalIDsl.g:1006:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_5_0, grammarAccess.getOutputBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getOutputBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIDsl.g:1026:3: ( (lv_parameters_7_0= ruleDomainParameterBlock ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIDsl.g:1027:4: (lv_parameters_7_0= ruleDomainParameterBlock )
            	    {
            	    // InternalIDsl.g:1027:4: (lv_parameters_7_0= ruleDomainParameterBlock )
            	    // InternalIDsl.g:1028:5: lv_parameters_7_0= ruleDomainParameterBlock
            	    {

            	    					newCompositeNode(grammarAccess.getOutputBlockAccess().getParametersDomainParameterBlockParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_parameters_7_0=ruleDomainParameterBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOutputBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_7_0,
            	    						"n7.intern.v3.xtext.idsl.IDsl.DomainParameterBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOutputBlockAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleOutputBlock"


    // $ANTLR start "entryRuleHolderBlock"
    // InternalIDsl.g:1053:1: entryRuleHolderBlock returns [EObject current=null] : iv_ruleHolderBlock= ruleHolderBlock EOF ;
    public final EObject entryRuleHolderBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHolderBlock = null;


        try {
            // InternalIDsl.g:1053:52: (iv_ruleHolderBlock= ruleHolderBlock EOF )
            // InternalIDsl.g:1054:2: iv_ruleHolderBlock= ruleHolderBlock EOF
            {
             newCompositeNode(grammarAccess.getHolderBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHolderBlock=ruleHolderBlock();

            state._fsp--;

             current =iv_ruleHolderBlock; 
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
    // $ANTLR end "entryRuleHolderBlock"


    // $ANTLR start "ruleHolderBlock"
    // InternalIDsl.g:1060:1: ruleHolderBlock returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'holder' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_parameters_7_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_8_0= ruleStreamDefinition ) ) )+ otherlv_9= '}' ) ;
    public final EObject ruleHolderBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_parameters_7_0 = null;

        EObject lv_streamdescriptors_8_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:1066:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'holder' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_parameters_7_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_8_0= ruleStreamDefinition ) ) )+ otherlv_9= '}' ) )
            // InternalIDsl.g:1067:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'holder' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_parameters_7_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_8_0= ruleStreamDefinition ) ) )+ otherlv_9= '}' )
            {
            // InternalIDsl.g:1067:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'holder' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_parameters_7_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_8_0= ruleStreamDefinition ) ) )+ otherlv_9= '}' )
            // InternalIDsl.g:1068:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'holder' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_parameters_7_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_8_0= ruleStreamDefinition ) ) )+ otherlv_9= '}'
            {
            // InternalIDsl.g:1068:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIDsl.g:1069:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getHolderBlockAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getHolderBlockAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalIDsl.g:1077:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalIDsl.g:1078:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalIDsl.g:1078:5: (lv_description_2_0= RULE_STRING )
                    // InternalIDsl.g:1079:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getHolderBlockAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHolderBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getHolderBlockAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getHolderBlockAccess().getHolderKeyword_1());
            		
            // InternalIDsl.g:1104:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalIDsl.g:1105:4: (lv_name_5_0= RULE_ID )
            {
            // InternalIDsl.g:1105:4: (lv_name_5_0= RULE_ID )
            // InternalIDsl.g:1106:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_5_0, grammarAccess.getHolderBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHolderBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getHolderBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIDsl.g:1126:3: ( ( (lv_parameters_7_0= ruleDomainParameterBlock ) ) | ( (lv_streamdescriptors_8_0= ruleStreamDefinition ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==47) ) {
                    alt13=1;
                }
                else if ( (LA13_0==18||LA13_0==28) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIDsl.g:1127:4: ( (lv_parameters_7_0= ruleDomainParameterBlock ) )
            	    {
            	    // InternalIDsl.g:1127:4: ( (lv_parameters_7_0= ruleDomainParameterBlock ) )
            	    // InternalIDsl.g:1128:5: (lv_parameters_7_0= ruleDomainParameterBlock )
            	    {
            	    // InternalIDsl.g:1128:5: (lv_parameters_7_0= ruleDomainParameterBlock )
            	    // InternalIDsl.g:1129:6: lv_parameters_7_0= ruleDomainParameterBlock
            	    {

            	    						newCompositeNode(grammarAccess.getHolderBlockAccess().getParametersDomainParameterBlockParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_parameters_7_0=ruleDomainParameterBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHolderBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_7_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.DomainParameterBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDsl.g:1147:4: ( (lv_streamdescriptors_8_0= ruleStreamDefinition ) )
            	    {
            	    // InternalIDsl.g:1147:4: ( (lv_streamdescriptors_8_0= ruleStreamDefinition ) )
            	    // InternalIDsl.g:1148:5: (lv_streamdescriptors_8_0= ruleStreamDefinition )
            	    {
            	    // InternalIDsl.g:1148:5: (lv_streamdescriptors_8_0= ruleStreamDefinition )
            	    // InternalIDsl.g:1149:6: lv_streamdescriptors_8_0= ruleStreamDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getHolderBlockAccess().getStreamdescriptorsStreamDefinitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_streamdescriptors_8_0=ruleStreamDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHolderBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"streamdescriptors",
            	    							lv_streamdescriptors_8_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.StreamDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getHolderBlockAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleHolderBlock"


    // $ANTLR start "entryRuleAnonymousStreamDefinition"
    // InternalIDsl.g:1175:1: entryRuleAnonymousStreamDefinition returns [EObject current=null] : iv_ruleAnonymousStreamDefinition= ruleAnonymousStreamDefinition EOF ;
    public final EObject entryRuleAnonymousStreamDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousStreamDefinition = null;


        try {
            // InternalIDsl.g:1175:66: (iv_ruleAnonymousStreamDefinition= ruleAnonymousStreamDefinition EOF )
            // InternalIDsl.g:1176:2: iv_ruleAnonymousStreamDefinition= ruleAnonymousStreamDefinition EOF
            {
             newCompositeNode(grammarAccess.getAnonymousStreamDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousStreamDefinition=ruleAnonymousStreamDefinition();

            state._fsp--;

             current =iv_ruleAnonymousStreamDefinition; 
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
    // $ANTLR end "entryRuleAnonymousStreamDefinition"


    // $ANTLR start "ruleAnonymousStreamDefinition"
    // InternalIDsl.g:1182:1: ruleAnonymousStreamDefinition returns [EObject current=null] : (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAnonymousStreamDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:1188:2: ( (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalIDsl.g:1189:2: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalIDsl.g:1189:2: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleType ) ) )
            // InternalIDsl.g:1190:3: otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAnonymousStreamDefinitionAccess().getStreamKeyword_0());
            		
            // InternalIDsl.g:1194:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIDsl.g:1195:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIDsl.g:1195:4: (lv_name_1_0= RULE_ID )
            // InternalIDsl.g:1196:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnonymousStreamDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnonymousStreamDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getAnonymousStreamDefinitionAccess().getOfKeyword_2());
            		
            // InternalIDsl.g:1216:3: ( (lv_type_3_0= ruleType ) )
            // InternalIDsl.g:1217:4: (lv_type_3_0= ruleType )
            {
            // InternalIDsl.g:1217:4: (lv_type_3_0= ruleType )
            // InternalIDsl.g:1218:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAnonymousStreamDefinitionAccess().getTypeTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnonymousStreamDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"n7.intern.v3.xtext.idsl.IDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleAnonymousStreamDefinition"


    // $ANTLR start "entryRuleAnomynousHolder"
    // InternalIDsl.g:1239:1: entryRuleAnomynousHolder returns [EObject current=null] : iv_ruleAnomynousHolder= ruleAnomynousHolder EOF ;
    public final EObject entryRuleAnomynousHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnomynousHolder = null;


        try {
            // InternalIDsl.g:1239:56: (iv_ruleAnomynousHolder= ruleAnomynousHolder EOF )
            // InternalIDsl.g:1240:2: iv_ruleAnomynousHolder= ruleAnomynousHolder EOF
            {
             newCompositeNode(grammarAccess.getAnomynousHolderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnomynousHolder=ruleAnomynousHolder();

            state._fsp--;

             current =iv_ruleAnomynousHolder; 
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
    // $ANTLR end "entryRuleAnomynousHolder"


    // $ANTLR start "ruleAnomynousHolder"
    // InternalIDsl.g:1246:1: ruleAnomynousHolder returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition ) ) otherlv_2= ',' )* ( (lv_streamdescriptors_3_0= ruleAnonymousStreamDefinition ) ) otherlv_4= ']' ) ;
    public final EObject ruleAnomynousHolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_streamdescriptors_1_0 = null;

        EObject lv_streamdescriptors_3_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:1252:2: ( (otherlv_0= '[' ( ( (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition ) ) otherlv_2= ',' )* ( (lv_streamdescriptors_3_0= ruleAnonymousStreamDefinition ) ) otherlv_4= ']' ) )
            // InternalIDsl.g:1253:2: (otherlv_0= '[' ( ( (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition ) ) otherlv_2= ',' )* ( (lv_streamdescriptors_3_0= ruleAnonymousStreamDefinition ) ) otherlv_4= ']' )
            {
            // InternalIDsl.g:1253:2: (otherlv_0= '[' ( ( (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition ) ) otherlv_2= ',' )* ( (lv_streamdescriptors_3_0= ruleAnonymousStreamDefinition ) ) otherlv_4= ']' )
            // InternalIDsl.g:1254:3: otherlv_0= '[' ( ( (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition ) ) otherlv_2= ',' )* ( (lv_streamdescriptors_3_0= ruleAnonymousStreamDefinition ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAnomynousHolderAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalIDsl.g:1258:3: ( ( (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition ) ) otherlv_2= ',' )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalIDsl.g:1259:4: ( (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition ) ) otherlv_2= ','
            	    {
            	    // InternalIDsl.g:1259:4: ( (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition ) )
            	    // InternalIDsl.g:1260:5: (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition )
            	    {
            	    // InternalIDsl.g:1260:5: (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition )
            	    // InternalIDsl.g:1261:6: lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getAnomynousHolderAccess().getStreamdescriptorsAnonymousStreamDefinitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_streamdescriptors_1_0=ruleAnonymousStreamDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAnomynousHolderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"streamdescriptors",
            	    							lv_streamdescriptors_1_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.AnonymousStreamDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAnomynousHolderAccess().getCommaKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalIDsl.g:1283:3: ( (lv_streamdescriptors_3_0= ruleAnonymousStreamDefinition ) )
            // InternalIDsl.g:1284:4: (lv_streamdescriptors_3_0= ruleAnonymousStreamDefinition )
            {
            // InternalIDsl.g:1284:4: (lv_streamdescriptors_3_0= ruleAnonymousStreamDefinition )
            // InternalIDsl.g:1285:5: lv_streamdescriptors_3_0= ruleAnonymousStreamDefinition
            {

            					newCompositeNode(grammarAccess.getAnomynousHolderAccess().getStreamdescriptorsAnonymousStreamDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_streamdescriptors_3_0=ruleAnonymousStreamDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnomynousHolderRule());
            					}
            					add(
            						current,
            						"streamdescriptors",
            						lv_streamdescriptors_3_0,
            						"n7.intern.v3.xtext.idsl.IDsl.AnonymousStreamDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAnomynousHolderAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAnomynousHolder"


    // $ANTLR start "entryRulePreProcessorBlock"
    // InternalIDsl.g:1310:1: entryRulePreProcessorBlock returns [EObject current=null] : iv_rulePreProcessorBlock= rulePreProcessorBlock EOF ;
    public final EObject entryRulePreProcessorBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreProcessorBlock = null;


        try {
            // InternalIDsl.g:1310:58: (iv_rulePreProcessorBlock= rulePreProcessorBlock EOF )
            // InternalIDsl.g:1311:2: iv_rulePreProcessorBlock= rulePreProcessorBlock EOF
            {
             newCompositeNode(grammarAccess.getPreProcessorBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreProcessorBlock=rulePreProcessorBlock();

            state._fsp--;

             current =iv_rulePreProcessorBlock; 
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
    // $ANTLR end "entryRulePreProcessorBlock"


    // $ANTLR start "rulePreProcessorBlock"
    // InternalIDsl.g:1317:1: rulePreProcessorBlock returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'preprocessor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' ) ;
    public final EObject rulePreProcessorBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_anomynousinputdataflowdescriptors_11_0 = null;

        EObject lv_anomynousinputdataflowdescriptors_13_0 = null;

        EObject lv_anomynousoutputdataflowdescriptors_20_0 = null;

        EObject lv_anomynousoutputdataflowdescriptors_22_0 = null;

        EObject lv_parameters_24_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:1323:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'preprocessor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' ) )
            // InternalIDsl.g:1324:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'preprocessor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' )
            {
            // InternalIDsl.g:1324:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'preprocessor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' )
            // InternalIDsl.g:1325:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'preprocessor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}'
            {
            // InternalIDsl.g:1325:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIDsl.g:1326:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getPreProcessorBlockAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getPreProcessorBlockAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalIDsl.g:1334:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalIDsl.g:1335:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalIDsl.g:1335:5: (lv_description_2_0= RULE_STRING )
                    // InternalIDsl.g:1336:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getPreProcessorBlockAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreProcessorBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getPreProcessorBlockAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPreProcessorBlockAccess().getPreprocessorKeyword_1());
            		
            // InternalIDsl.g:1361:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalIDsl.g:1362:4: (lv_name_5_0= RULE_ID )
            {
            // InternalIDsl.g:1362:4: (lv_name_5_0= RULE_ID )
            // InternalIDsl.g:1363:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPreProcessorBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreProcessorBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getPreProcessorBlockAccess().getLeftParenthesisKeyword_3());
            		
            // InternalIDsl.g:1383:3: ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==35) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==RULE_ID) ) {
                        alt17=1;
                    }
                    else if ( (LA17_3==34) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1==20) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==34) ) {
                alt17=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalIDsl.g:1384:4: ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalIDsl.g:1384:4: ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) )
                    // InternalIDsl.g:1385:5: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalIDsl.g:1385:5: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1==35) ) {
                                int LA16_2 = input.LA(3);

                                if ( (LA16_2==RULE_ID) ) {
                                    alt16=1;
                                }


                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalIDsl.g:1386:6: ( (otherlv_7= RULE_ID ) ) otherlv_8= ','
                    	    {
                    	    // InternalIDsl.g:1386:6: ( (otherlv_7= RULE_ID ) )
                    	    // InternalIDsl.g:1387:7: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalIDsl.g:1387:7: (otherlv_7= RULE_ID )
                    	    // InternalIDsl.g:1388:8: otherlv_7= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getPreProcessorBlockRule());
                    	    								}
                    	    							
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    								newLeafNode(otherlv_7, grammarAccess.getPreProcessorBlockAccess().getInputdataflowdescriptorsDataFlowDescriptorCrossReference_4_0_0_0_0());
                    	    							

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,35,FOLLOW_8); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getPreProcessorBlockAccess().getCommaKeyword_4_0_0_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    // InternalIDsl.g:1404:5: ( (otherlv_9= RULE_ID ) )
                    // InternalIDsl.g:1405:6: (otherlv_9= RULE_ID )
                    {
                    // InternalIDsl.g:1405:6: (otherlv_9= RULE_ID )
                    // InternalIDsl.g:1406:7: otherlv_9= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreProcessorBlockRule());
                    							}
                    						
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(otherlv_9, grammarAccess.getPreProcessorBlockAccess().getInputdataflowdescriptorsDataFlowDescriptorCrossReference_4_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDsl.g:1419:4: ( (otherlv_10= RULE_ID ) )
                    {
                    // InternalIDsl.g:1419:4: ( (otherlv_10= RULE_ID ) )
                    // InternalIDsl.g:1420:5: (otherlv_10= RULE_ID )
                    {
                    // InternalIDsl.g:1420:5: (otherlv_10= RULE_ID )
                    // InternalIDsl.g:1421:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreProcessorBlockRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_10, grammarAccess.getPreProcessorBlockAccess().getInputdataflowdescriptorsDataFlowDescriptorCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIDsl.g:1433:4: ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) )
                    {
                    // InternalIDsl.g:1433:4: ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) )
                    // InternalIDsl.g:1434:5: (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder )
                    {
                    // InternalIDsl.g:1434:5: (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder )
                    // InternalIDsl.g:1435:6: lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder
                    {

                    						newCompositeNode(grammarAccess.getPreProcessorBlockAccess().getAnomynousinputdataflowdescriptorsAnomynousHolderParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_anomynousinputdataflowdescriptors_11_0=ruleAnomynousHolder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPreProcessorBlockRule());
                    						}
                    						add(
                    							current,
                    							"anomynousinputdataflowdescriptors",
                    							lv_anomynousinputdataflowdescriptors_11_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIDsl.g:1453:3: (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIDsl.g:1454:4: otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) )
            	    {
            	    otherlv_12=(Token)match(input,35,FOLLOW_32); 

            	    				newLeafNode(otherlv_12, grammarAccess.getPreProcessorBlockAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalIDsl.g:1458:4: ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) )
            	    // InternalIDsl.g:1459:5: (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder )
            	    {
            	    // InternalIDsl.g:1459:5: (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder )
            	    // InternalIDsl.g:1460:6: lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder
            	    {

            	    						newCompositeNode(grammarAccess.getPreProcessorBlockAccess().getAnomynousinputdataflowdescriptorsAnomynousHolderParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_anomynousinputdataflowdescriptors_13_0=ruleAnomynousHolder();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPreProcessorBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"anomynousinputdataflowdescriptors",
            	    							lv_anomynousinputdataflowdescriptors_13_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_14=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getPreProcessorBlockAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_15, grammarAccess.getPreProcessorBlockAccess().getColonKeyword_7());
            		
            // InternalIDsl.g:1486:3: ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==35) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==34) ) {
                        alt20=2;
                    }
                    else if ( (LA20_3==RULE_ID) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA20_1==22) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==34) ) {
                alt20=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalIDsl.g:1487:4: ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) )
                    {
                    // InternalIDsl.g:1487:4: ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) )
                    // InternalIDsl.g:1488:5: ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) )
                    {
                    // InternalIDsl.g:1488:5: ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==35) ) {
                                int LA19_2 = input.LA(3);

                                if ( (LA19_2==RULE_ID) ) {
                                    alt19=1;
                                }


                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalIDsl.g:1489:6: ( (otherlv_16= RULE_ID ) ) otherlv_17= ','
                    	    {
                    	    // InternalIDsl.g:1489:6: ( (otherlv_16= RULE_ID ) )
                    	    // InternalIDsl.g:1490:7: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalIDsl.g:1490:7: (otherlv_16= RULE_ID )
                    	    // InternalIDsl.g:1491:8: otherlv_16= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getPreProcessorBlockRule());
                    	    								}
                    	    							
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    								newLeafNode(otherlv_16, grammarAccess.getPreProcessorBlockAccess().getOutputdataflowdescriptorsDataFlowDescriptorCrossReference_8_0_0_0_0());
                    	    							

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,35,FOLLOW_8); 

                    	    						newLeafNode(otherlv_17, grammarAccess.getPreProcessorBlockAccess().getCommaKeyword_8_0_0_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    // InternalIDsl.g:1507:5: ( (otherlv_18= RULE_ID ) )
                    // InternalIDsl.g:1508:6: (otherlv_18= RULE_ID )
                    {
                    // InternalIDsl.g:1508:6: (otherlv_18= RULE_ID )
                    // InternalIDsl.g:1509:7: otherlv_18= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreProcessorBlockRule());
                    							}
                    						
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_35); 

                    							newLeafNode(otherlv_18, grammarAccess.getPreProcessorBlockAccess().getOutputdataflowdescriptorsDataFlowDescriptorCrossReference_8_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDsl.g:1522:4: ( (otherlv_19= RULE_ID ) )
                    {
                    // InternalIDsl.g:1522:4: ( (otherlv_19= RULE_ID ) )
                    // InternalIDsl.g:1523:5: (otherlv_19= RULE_ID )
                    {
                    // InternalIDsl.g:1523:5: (otherlv_19= RULE_ID )
                    // InternalIDsl.g:1524:6: otherlv_19= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreProcessorBlockRule());
                    						}
                    					
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_19, grammarAccess.getPreProcessorBlockAccess().getOutputdataflowdescriptorsDataFlowDescriptorCrossReference_8_1_0());
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIDsl.g:1536:4: ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) )
                    {
                    // InternalIDsl.g:1536:4: ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) )
                    // InternalIDsl.g:1537:5: (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder )
                    {
                    // InternalIDsl.g:1537:5: (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder )
                    // InternalIDsl.g:1538:6: lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder
                    {

                    						newCompositeNode(grammarAccess.getPreProcessorBlockAccess().getAnomynousoutputdataflowdescriptorsAnomynousHolderParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_anomynousoutputdataflowdescriptors_20_0=ruleAnomynousHolder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPreProcessorBlockRule());
                    						}
                    						add(
                    							current,
                    							"anomynousoutputdataflowdescriptors",
                    							lv_anomynousoutputdataflowdescriptors_20_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIDsl.g:1556:3: (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIDsl.g:1557:4: otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) )
            	    {
            	    otherlv_21=(Token)match(input,35,FOLLOW_32); 

            	    				newLeafNode(otherlv_21, grammarAccess.getPreProcessorBlockAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIDsl.g:1561:4: ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) )
            	    // InternalIDsl.g:1562:5: (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder )
            	    {
            	    // InternalIDsl.g:1562:5: (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder )
            	    // InternalIDsl.g:1563:6: lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder
            	    {

            	    						newCompositeNode(grammarAccess.getPreProcessorBlockAccess().getAnomynousoutputdataflowdescriptorsAnomynousHolderParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_anomynousoutputdataflowdescriptors_22_0=ruleAnomynousHolder();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPreProcessorBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"anomynousoutputdataflowdescriptors",
            	    							lv_anomynousoutputdataflowdescriptors_22_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_23=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_23, grammarAccess.getPreProcessorBlockAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalIDsl.g:1585:3: ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIDsl.g:1586:4: (lv_parameters_24_0= ruleDomainParameterBlock )
            	    {
            	    // InternalIDsl.g:1586:4: (lv_parameters_24_0= ruleDomainParameterBlock )
            	    // InternalIDsl.g:1587:5: lv_parameters_24_0= ruleDomainParameterBlock
            	    {

            	    					newCompositeNode(grammarAccess.getPreProcessorBlockAccess().getParametersDomainParameterBlockParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_parameters_24_0=ruleDomainParameterBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPreProcessorBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_24_0,
            	    						"n7.intern.v3.xtext.idsl.IDsl.DomainParameterBlock");
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

            otherlv_25=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getPreProcessorBlockAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "rulePreProcessorBlock"


    // $ANTLR start "entryRuleDataProcessorBlock"
    // InternalIDsl.g:1612:1: entryRuleDataProcessorBlock returns [EObject current=null] : iv_ruleDataProcessorBlock= ruleDataProcessorBlock EOF ;
    public final EObject entryRuleDataProcessorBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataProcessorBlock = null;


        try {
            // InternalIDsl.g:1612:59: (iv_ruleDataProcessorBlock= ruleDataProcessorBlock EOF )
            // InternalIDsl.g:1613:2: iv_ruleDataProcessorBlock= ruleDataProcessorBlock EOF
            {
             newCompositeNode(grammarAccess.getDataProcessorBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataProcessorBlock=ruleDataProcessorBlock();

            state._fsp--;

             current =iv_ruleDataProcessorBlock; 
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
    // $ANTLR end "entryRuleDataProcessorBlock"


    // $ANTLR start "ruleDataProcessorBlock"
    // InternalIDsl.g:1619:1: ruleDataProcessorBlock returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'processor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' ) ;
    public final EObject ruleDataProcessorBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_anomynousinputdataflowdescriptors_11_0 = null;

        EObject lv_anomynousinputdataflowdescriptors_13_0 = null;

        EObject lv_anomynousoutputdataflowdescriptors_20_0 = null;

        EObject lv_anomynousoutputdataflowdescriptors_22_0 = null;

        EObject lv_parameters_24_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:1625:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'processor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' ) )
            // InternalIDsl.g:1626:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'processor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' )
            {
            // InternalIDsl.g:1626:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'processor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' )
            // InternalIDsl.g:1627:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'processor' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}'
            {
            // InternalIDsl.g:1627:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIDsl.g:1628:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataProcessorBlockAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getDataProcessorBlockAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalIDsl.g:1636:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalIDsl.g:1637:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalIDsl.g:1637:5: (lv_description_2_0= RULE_STRING )
                    // InternalIDsl.g:1638:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getDataProcessorBlockAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataProcessorBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataProcessorBlockAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getDataProcessorBlockAccess().getProcessorKeyword_1());
            		
            // InternalIDsl.g:1663:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalIDsl.g:1664:4: (lv_name_5_0= RULE_ID )
            {
            // InternalIDsl.g:1664:4: (lv_name_5_0= RULE_ID )
            // InternalIDsl.g:1665:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_5_0, grammarAccess.getDataProcessorBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataProcessorBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getDataProcessorBlockAccess().getLeftParenthesisKeyword_3());
            		
            // InternalIDsl.g:1685:3: ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==35) ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3==RULE_ID) ) {
                        alt25=1;
                    }
                    else if ( (LA25_3==34) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA25_1==20) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0==34) ) {
                alt25=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalIDsl.g:1686:4: ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalIDsl.g:1686:4: ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) )
                    // InternalIDsl.g:1687:5: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalIDsl.g:1687:5: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1==35) ) {
                                int LA24_2 = input.LA(3);

                                if ( (LA24_2==RULE_ID) ) {
                                    alt24=1;
                                }


                            }


                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalIDsl.g:1688:6: ( (otherlv_7= RULE_ID ) ) otherlv_8= ','
                    	    {
                    	    // InternalIDsl.g:1688:6: ( (otherlv_7= RULE_ID ) )
                    	    // InternalIDsl.g:1689:7: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalIDsl.g:1689:7: (otherlv_7= RULE_ID )
                    	    // InternalIDsl.g:1690:8: otherlv_7= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getDataProcessorBlockRule());
                    	    								}
                    	    							
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    								newLeafNode(otherlv_7, grammarAccess.getDataProcessorBlockAccess().getInputdataflowdescriptorsDataFlowDescriptorCrossReference_4_0_0_0_0());
                    	    							

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,35,FOLLOW_8); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getDataProcessorBlockAccess().getCommaKeyword_4_0_0_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    // InternalIDsl.g:1706:5: ( (otherlv_9= RULE_ID ) )
                    // InternalIDsl.g:1707:6: (otherlv_9= RULE_ID )
                    {
                    // InternalIDsl.g:1707:6: (otherlv_9= RULE_ID )
                    // InternalIDsl.g:1708:7: otherlv_9= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDataProcessorBlockRule());
                    							}
                    						
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(otherlv_9, grammarAccess.getDataProcessorBlockAccess().getInputdataflowdescriptorsDataFlowDescriptorCrossReference_4_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDsl.g:1721:4: ( (otherlv_10= RULE_ID ) )
                    {
                    // InternalIDsl.g:1721:4: ( (otherlv_10= RULE_ID ) )
                    // InternalIDsl.g:1722:5: (otherlv_10= RULE_ID )
                    {
                    // InternalIDsl.g:1722:5: (otherlv_10= RULE_ID )
                    // InternalIDsl.g:1723:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataProcessorBlockRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_10, grammarAccess.getDataProcessorBlockAccess().getInputdataflowdescriptorsDataFlowDescriptorCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIDsl.g:1735:4: ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) )
                    {
                    // InternalIDsl.g:1735:4: ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) )
                    // InternalIDsl.g:1736:5: (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder )
                    {
                    // InternalIDsl.g:1736:5: (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder )
                    // InternalIDsl.g:1737:6: lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder
                    {

                    						newCompositeNode(grammarAccess.getDataProcessorBlockAccess().getAnomynousinputdataflowdescriptorsAnomynousHolderParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_anomynousinputdataflowdescriptors_11_0=ruleAnomynousHolder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataProcessorBlockRule());
                    						}
                    						add(
                    							current,
                    							"anomynousinputdataflowdescriptors",
                    							lv_anomynousinputdataflowdescriptors_11_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIDsl.g:1755:3: (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalIDsl.g:1756:4: otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) )
            	    {
            	    otherlv_12=(Token)match(input,35,FOLLOW_32); 

            	    				newLeafNode(otherlv_12, grammarAccess.getDataProcessorBlockAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalIDsl.g:1760:4: ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) )
            	    // InternalIDsl.g:1761:5: (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder )
            	    {
            	    // InternalIDsl.g:1761:5: (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder )
            	    // InternalIDsl.g:1762:6: lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder
            	    {

            	    						newCompositeNode(grammarAccess.getDataProcessorBlockAccess().getAnomynousinputdataflowdescriptorsAnomynousHolderParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_anomynousinputdataflowdescriptors_13_0=ruleAnomynousHolder();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataProcessorBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"anomynousinputdataflowdescriptors",
            	    							lv_anomynousinputdataflowdescriptors_13_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_14=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getDataProcessorBlockAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_15, grammarAccess.getDataProcessorBlockAccess().getColonKeyword_7());
            		
            // InternalIDsl.g:1788:3: ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==35) ) {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==RULE_ID) ) {
                        alt28=1;
                    }
                    else if ( (LA28_3==34) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_1==22) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==34) ) {
                alt28=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalIDsl.g:1789:4: ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) )
                    {
                    // InternalIDsl.g:1789:4: ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) )
                    // InternalIDsl.g:1790:5: ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) )
                    {
                    // InternalIDsl.g:1790:5: ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1==35) ) {
                                int LA27_2 = input.LA(3);

                                if ( (LA27_2==RULE_ID) ) {
                                    alt27=1;
                                }


                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalIDsl.g:1791:6: ( (otherlv_16= RULE_ID ) ) otherlv_17= ','
                    	    {
                    	    // InternalIDsl.g:1791:6: ( (otherlv_16= RULE_ID ) )
                    	    // InternalIDsl.g:1792:7: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalIDsl.g:1792:7: (otherlv_16= RULE_ID )
                    	    // InternalIDsl.g:1793:8: otherlv_16= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getDataProcessorBlockRule());
                    	    								}
                    	    							
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    								newLeafNode(otherlv_16, grammarAccess.getDataProcessorBlockAccess().getOutputdataflowdescriptorsDataFlowDescriptorCrossReference_8_0_0_0_0());
                    	    							

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,35,FOLLOW_8); 

                    	    						newLeafNode(otherlv_17, grammarAccess.getDataProcessorBlockAccess().getCommaKeyword_8_0_0_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    // InternalIDsl.g:1809:5: ( (otherlv_18= RULE_ID ) )
                    // InternalIDsl.g:1810:6: (otherlv_18= RULE_ID )
                    {
                    // InternalIDsl.g:1810:6: (otherlv_18= RULE_ID )
                    // InternalIDsl.g:1811:7: otherlv_18= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDataProcessorBlockRule());
                    							}
                    						
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_35); 

                    							newLeafNode(otherlv_18, grammarAccess.getDataProcessorBlockAccess().getOutputdataflowdescriptorsDataFlowDescriptorCrossReference_8_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDsl.g:1824:4: ( (otherlv_19= RULE_ID ) )
                    {
                    // InternalIDsl.g:1824:4: ( (otherlv_19= RULE_ID ) )
                    // InternalIDsl.g:1825:5: (otherlv_19= RULE_ID )
                    {
                    // InternalIDsl.g:1825:5: (otherlv_19= RULE_ID )
                    // InternalIDsl.g:1826:6: otherlv_19= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataProcessorBlockRule());
                    						}
                    					
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_19, grammarAccess.getDataProcessorBlockAccess().getOutputdataflowdescriptorsDataFlowDescriptorCrossReference_8_1_0());
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIDsl.g:1838:4: ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) )
                    {
                    // InternalIDsl.g:1838:4: ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) )
                    // InternalIDsl.g:1839:5: (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder )
                    {
                    // InternalIDsl.g:1839:5: (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder )
                    // InternalIDsl.g:1840:6: lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder
                    {

                    						newCompositeNode(grammarAccess.getDataProcessorBlockAccess().getAnomynousoutputdataflowdescriptorsAnomynousHolderParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_anomynousoutputdataflowdescriptors_20_0=ruleAnomynousHolder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataProcessorBlockRule());
                    						}
                    						add(
                    							current,
                    							"anomynousoutputdataflowdescriptors",
                    							lv_anomynousoutputdataflowdescriptors_20_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIDsl.g:1858:3: (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==35) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalIDsl.g:1859:4: otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) )
            	    {
            	    otherlv_21=(Token)match(input,35,FOLLOW_32); 

            	    				newLeafNode(otherlv_21, grammarAccess.getDataProcessorBlockAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIDsl.g:1863:4: ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) )
            	    // InternalIDsl.g:1864:5: (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder )
            	    {
            	    // InternalIDsl.g:1864:5: (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder )
            	    // InternalIDsl.g:1865:6: lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder
            	    {

            	    						newCompositeNode(grammarAccess.getDataProcessorBlockAccess().getAnomynousoutputdataflowdescriptorsAnomynousHolderParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_anomynousoutputdataflowdescriptors_22_0=ruleAnomynousHolder();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataProcessorBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"anomynousoutputdataflowdescriptors",
            	    							lv_anomynousoutputdataflowdescriptors_22_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_23=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_23, grammarAccess.getDataProcessorBlockAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalIDsl.g:1887:3: ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalIDsl.g:1888:4: (lv_parameters_24_0= ruleDomainParameterBlock )
            	    {
            	    // InternalIDsl.g:1888:4: (lv_parameters_24_0= ruleDomainParameterBlock )
            	    // InternalIDsl.g:1889:5: lv_parameters_24_0= ruleDomainParameterBlock
            	    {

            	    					newCompositeNode(grammarAccess.getDataProcessorBlockAccess().getParametersDomainParameterBlockParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_parameters_24_0=ruleDomainParameterBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataProcessorBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_24_0,
            	    						"n7.intern.v3.xtext.idsl.IDsl.DomainParameterBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_25=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getDataProcessorBlockAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleDataProcessorBlock"


    // $ANTLR start "entryRuleSynchronizerBlock"
    // InternalIDsl.g:1914:1: entryRuleSynchronizerBlock returns [EObject current=null] : iv_ruleSynchronizerBlock= ruleSynchronizerBlock EOF ;
    public final EObject entryRuleSynchronizerBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronizerBlock = null;


        try {
            // InternalIDsl.g:1914:58: (iv_ruleSynchronizerBlock= ruleSynchronizerBlock EOF )
            // InternalIDsl.g:1915:2: iv_ruleSynchronizerBlock= ruleSynchronizerBlock EOF
            {
             newCompositeNode(grammarAccess.getSynchronizerBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSynchronizerBlock=ruleSynchronizerBlock();

            state._fsp--;

             current =iv_ruleSynchronizerBlock; 
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
    // $ANTLR end "entryRuleSynchronizerBlock"


    // $ANTLR start "ruleSynchronizerBlock"
    // InternalIDsl.g:1921:1: ruleSynchronizerBlock returns [EObject current=null] : ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'synchronizer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' ) ;
    public final EObject ruleSynchronizerBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_anomynousinputdataflowdescriptors_11_0 = null;

        EObject lv_anomynousinputdataflowdescriptors_13_0 = null;

        EObject lv_anomynousoutputdataflowdescriptors_20_0 = null;

        EObject lv_anomynousoutputdataflowdescriptors_22_0 = null;

        EObject lv_parameters_24_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:1927:2: ( ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'synchronizer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' ) )
            // InternalIDsl.g:1928:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'synchronizer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' )
            {
            // InternalIDsl.g:1928:2: ( (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'synchronizer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}' )
            // InternalIDsl.g:1929:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'synchronizer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) ) (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )* otherlv_14= ')' otherlv_15= ':' ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) ) (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )* otherlv_23= '{' ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+ otherlv_25= '}'
            {
            // InternalIDsl.g:1929:3: (otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIDsl.g:1930:4: otherlv_0= '@description' otherlv_1= '(' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getSynchronizerBlockAccess().getDescriptionKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSynchronizerBlockAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalIDsl.g:1938:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalIDsl.g:1939:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalIDsl.g:1939:5: (lv_description_2_0= RULE_STRING )
                    // InternalIDsl.g:1940:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getSynchronizerBlockAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSynchronizerBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getSynchronizerBlockAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,40,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSynchronizerBlockAccess().getSynchronizerKeyword_1());
            		
            // InternalIDsl.g:1965:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalIDsl.g:1966:4: (lv_name_5_0= RULE_ID )
            {
            // InternalIDsl.g:1966:4: (lv_name_5_0= RULE_ID )
            // InternalIDsl.g:1967:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_5_0, grammarAccess.getSynchronizerBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSynchronizerBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getSynchronizerBlockAccess().getLeftParenthesisKeyword_3());
            		
            // InternalIDsl.g:1987:3: ( ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) ) | ( (otherlv_10= RULE_ID ) ) | ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) ) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==35) ) {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3==34) ) {
                        alt33=2;
                    }
                    else if ( (LA33_3==RULE_ID) ) {
                        alt33=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA33_1==20) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==34) ) {
                alt33=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalIDsl.g:1988:4: ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalIDsl.g:1988:4: ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) ) )
                    // InternalIDsl.g:1989:5: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+ ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalIDsl.g:1989:5: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID) ) {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1==35) ) {
                                int LA32_2 = input.LA(3);

                                if ( (LA32_2==RULE_ID) ) {
                                    alt32=1;
                                }


                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalIDsl.g:1990:6: ( (otherlv_7= RULE_ID ) ) otherlv_8= ','
                    	    {
                    	    // InternalIDsl.g:1990:6: ( (otherlv_7= RULE_ID ) )
                    	    // InternalIDsl.g:1991:7: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalIDsl.g:1991:7: (otherlv_7= RULE_ID )
                    	    // InternalIDsl.g:1992:8: otherlv_7= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getSynchronizerBlockRule());
                    	    								}
                    	    							
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    								newLeafNode(otherlv_7, grammarAccess.getSynchronizerBlockAccess().getInputdataflowdescriptorsDataFlowDescriptorCrossReference_4_0_0_0_0());
                    	    							

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,35,FOLLOW_8); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getSynchronizerBlockAccess().getCommaKeyword_4_0_0_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    // InternalIDsl.g:2008:5: ( (otherlv_9= RULE_ID ) )
                    // InternalIDsl.g:2009:6: (otherlv_9= RULE_ID )
                    {
                    // InternalIDsl.g:2009:6: (otherlv_9= RULE_ID )
                    // InternalIDsl.g:2010:7: otherlv_9= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSynchronizerBlockRule());
                    							}
                    						
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(otherlv_9, grammarAccess.getSynchronizerBlockAccess().getInputdataflowdescriptorsDataFlowDescriptorCrossReference_4_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDsl.g:2023:4: ( (otherlv_10= RULE_ID ) )
                    {
                    // InternalIDsl.g:2023:4: ( (otherlv_10= RULE_ID ) )
                    // InternalIDsl.g:2024:5: (otherlv_10= RULE_ID )
                    {
                    // InternalIDsl.g:2024:5: (otherlv_10= RULE_ID )
                    // InternalIDsl.g:2025:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSynchronizerBlockRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_10, grammarAccess.getSynchronizerBlockAccess().getInputdataflowdescriptorsDataFlowDescriptorCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIDsl.g:2037:4: ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) )
                    {
                    // InternalIDsl.g:2037:4: ( (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder ) )
                    // InternalIDsl.g:2038:5: (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder )
                    {
                    // InternalIDsl.g:2038:5: (lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder )
                    // InternalIDsl.g:2039:6: lv_anomynousinputdataflowdescriptors_11_0= ruleAnomynousHolder
                    {

                    						newCompositeNode(grammarAccess.getSynchronizerBlockAccess().getAnomynousinputdataflowdescriptorsAnomynousHolderParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_anomynousinputdataflowdescriptors_11_0=ruleAnomynousHolder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSynchronizerBlockRule());
                    						}
                    						add(
                    							current,
                    							"anomynousinputdataflowdescriptors",
                    							lv_anomynousinputdataflowdescriptors_11_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIDsl.g:2057:3: (otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==35) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalIDsl.g:2058:4: otherlv_12= ',' ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) )
            	    {
            	    otherlv_12=(Token)match(input,35,FOLLOW_32); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSynchronizerBlockAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalIDsl.g:2062:4: ( (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder ) )
            	    // InternalIDsl.g:2063:5: (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder )
            	    {
            	    // InternalIDsl.g:2063:5: (lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder )
            	    // InternalIDsl.g:2064:6: lv_anomynousinputdataflowdescriptors_13_0= ruleAnomynousHolder
            	    {

            	    						newCompositeNode(grammarAccess.getSynchronizerBlockAccess().getAnomynousinputdataflowdescriptorsAnomynousHolderParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_anomynousinputdataflowdescriptors_13_0=ruleAnomynousHolder();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSynchronizerBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"anomynousinputdataflowdescriptors",
            	    							lv_anomynousinputdataflowdescriptors_13_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_14=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getSynchronizerBlockAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_15, grammarAccess.getSynchronizerBlockAccess().getColonKeyword_7());
            		
            // InternalIDsl.g:2090:3: ( ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) ) | ( (otherlv_19= RULE_ID ) ) | ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) ) )
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==35) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==RULE_ID) ) {
                        alt36=1;
                    }
                    else if ( (LA36_3==34) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA36_1==22) ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA36_0==34) ) {
                alt36=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalIDsl.g:2091:4: ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) )
                    {
                    // InternalIDsl.g:2091:4: ( ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) ) )
                    // InternalIDsl.g:2092:5: ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+ ( (otherlv_18= RULE_ID ) )
                    {
                    // InternalIDsl.g:2092:5: ( ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==35) ) {
                                int LA35_2 = input.LA(3);

                                if ( (LA35_2==RULE_ID) ) {
                                    alt35=1;
                                }


                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalIDsl.g:2093:6: ( (otherlv_16= RULE_ID ) ) otherlv_17= ','
                    	    {
                    	    // InternalIDsl.g:2093:6: ( (otherlv_16= RULE_ID ) )
                    	    // InternalIDsl.g:2094:7: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalIDsl.g:2094:7: (otherlv_16= RULE_ID )
                    	    // InternalIDsl.g:2095:8: otherlv_16= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getSynchronizerBlockRule());
                    	    								}
                    	    							
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    								newLeafNode(otherlv_16, grammarAccess.getSynchronizerBlockAccess().getOutputdataflowdescriptorsDataFlowDescriptorCrossReference_8_0_0_0_0());
                    	    							

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,35,FOLLOW_8); 

                    	    						newLeafNode(otherlv_17, grammarAccess.getSynchronizerBlockAccess().getCommaKeyword_8_0_0_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    // InternalIDsl.g:2111:5: ( (otherlv_18= RULE_ID ) )
                    // InternalIDsl.g:2112:6: (otherlv_18= RULE_ID )
                    {
                    // InternalIDsl.g:2112:6: (otherlv_18= RULE_ID )
                    // InternalIDsl.g:2113:7: otherlv_18= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSynchronizerBlockRule());
                    							}
                    						
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_35); 

                    							newLeafNode(otherlv_18, grammarAccess.getSynchronizerBlockAccess().getOutputdataflowdescriptorsDataFlowDescriptorCrossReference_8_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDsl.g:2126:4: ( (otherlv_19= RULE_ID ) )
                    {
                    // InternalIDsl.g:2126:4: ( (otherlv_19= RULE_ID ) )
                    // InternalIDsl.g:2127:5: (otherlv_19= RULE_ID )
                    {
                    // InternalIDsl.g:2127:5: (otherlv_19= RULE_ID )
                    // InternalIDsl.g:2128:6: otherlv_19= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSynchronizerBlockRule());
                    						}
                    					
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_19, grammarAccess.getSynchronizerBlockAccess().getOutputdataflowdescriptorsDataFlowDescriptorCrossReference_8_1_0());
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIDsl.g:2140:4: ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) )
                    {
                    // InternalIDsl.g:2140:4: ( (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder ) )
                    // InternalIDsl.g:2141:5: (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder )
                    {
                    // InternalIDsl.g:2141:5: (lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder )
                    // InternalIDsl.g:2142:6: lv_anomynousoutputdataflowdescriptors_20_0= ruleAnomynousHolder
                    {

                    						newCompositeNode(grammarAccess.getSynchronizerBlockAccess().getAnomynousoutputdataflowdescriptorsAnomynousHolderParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_anomynousoutputdataflowdescriptors_20_0=ruleAnomynousHolder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSynchronizerBlockRule());
                    						}
                    						add(
                    							current,
                    							"anomynousoutputdataflowdescriptors",
                    							lv_anomynousoutputdataflowdescriptors_20_0,
                    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIDsl.g:2160:3: (otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==35) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalIDsl.g:2161:4: otherlv_21= ',' ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) )
            	    {
            	    otherlv_21=(Token)match(input,35,FOLLOW_32); 

            	    				newLeafNode(otherlv_21, grammarAccess.getSynchronizerBlockAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIDsl.g:2165:4: ( (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder ) )
            	    // InternalIDsl.g:2166:5: (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder )
            	    {
            	    // InternalIDsl.g:2166:5: (lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder )
            	    // InternalIDsl.g:2167:6: lv_anomynousoutputdataflowdescriptors_22_0= ruleAnomynousHolder
            	    {

            	    						newCompositeNode(grammarAccess.getSynchronizerBlockAccess().getAnomynousoutputdataflowdescriptorsAnomynousHolderParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_anomynousoutputdataflowdescriptors_22_0=ruleAnomynousHolder();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSynchronizerBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"anomynousoutputdataflowdescriptors",
            	    							lv_anomynousoutputdataflowdescriptors_22_0,
            	    							"n7.intern.v3.xtext.idsl.IDsl.AnomynousHolder");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_23=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_23, grammarAccess.getSynchronizerBlockAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalIDsl.g:2189:3: ( (lv_parameters_24_0= ruleDomainParameterBlock ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalIDsl.g:2190:4: (lv_parameters_24_0= ruleDomainParameterBlock )
            	    {
            	    // InternalIDsl.g:2190:4: (lv_parameters_24_0= ruleDomainParameterBlock )
            	    // InternalIDsl.g:2191:5: lv_parameters_24_0= ruleDomainParameterBlock
            	    {

            	    					newCompositeNode(grammarAccess.getSynchronizerBlockAccess().getParametersDomainParameterBlockParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_parameters_24_0=ruleDomainParameterBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSynchronizerBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_24_0,
            	    						"n7.intern.v3.xtext.idsl.IDsl.DomainParameterBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_25=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getSynchronizerBlockAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleSynchronizerBlock"


    // $ANTLR start "entryRuleDefinitionInstruction"
    // InternalIDsl.g:2216:1: entryRuleDefinitionInstruction returns [EObject current=null] : iv_ruleDefinitionInstruction= ruleDefinitionInstruction EOF ;
    public final EObject entryRuleDefinitionInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionInstruction = null;


        try {
            // InternalIDsl.g:2216:62: (iv_ruleDefinitionInstruction= ruleDefinitionInstruction EOF )
            // InternalIDsl.g:2217:2: iv_ruleDefinitionInstruction= ruleDefinitionInstruction EOF
            {
             newCompositeNode(grammarAccess.getDefinitionInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionInstruction=ruleDefinitionInstruction();

            state._fsp--;

             current =iv_ruleDefinitionInstruction; 
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
    // $ANTLR end "entryRuleDefinitionInstruction"


    // $ANTLR start "ruleDefinitionInstruction"
    // InternalIDsl.g:2223:1: ruleDefinitionInstruction returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'a' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDefinitionInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIDsl.g:2229:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'a' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalIDsl.g:2230:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'a' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalIDsl.g:2230:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'a' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalIDsl.g:2231:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'a' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionInstructionAccess().getLetKeyword_0());
            		
            // InternalIDsl.g:2235:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIDsl.g:2236:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIDsl.g:2236:4: (lv_name_1_0= RULE_ID )
            // InternalIDsl.g:2237:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefinitionInstructionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIDsl.g:2253:3: (otherlv_2= 'a' ( (otherlv_3= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalIDsl.g:2254:4: otherlv_2= 'a' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefinitionInstructionAccess().getAKeyword_2_0());
                    			
                    // InternalIDsl.g:2258:4: ( (otherlv_3= RULE_ID ) )
                    // InternalIDsl.g:2259:5: (otherlv_3= RULE_ID )
                    {
                    // InternalIDsl.g:2259:5: (otherlv_3= RULE_ID )
                    // InternalIDsl.g:2260:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionInstructionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_3, grammarAccess.getDefinitionInstructionAccess().getDataflowdescriptorDataFlowDescriptorCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDefinitionInstructionAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDefinitionInstruction"


    // $ANTLR start "entryRulePreProcessorAssignation"
    // InternalIDsl.g:2280:1: entryRulePreProcessorAssignation returns [EObject current=null] : iv_rulePreProcessorAssignation= rulePreProcessorAssignation EOF ;
    public final EObject entryRulePreProcessorAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreProcessorAssignation = null;


        try {
            // InternalIDsl.g:2280:64: (iv_rulePreProcessorAssignation= rulePreProcessorAssignation EOF )
            // InternalIDsl.g:2281:2: iv_rulePreProcessorAssignation= rulePreProcessorAssignation EOF
            {
             newCompositeNode(grammarAccess.getPreProcessorAssignationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreProcessorAssignation=rulePreProcessorAssignation();

            state._fsp--;

             current =iv_rulePreProcessorAssignation; 
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
    // $ANTLR end "entryRulePreProcessorAssignation"


    // $ANTLR start "rulePreProcessorAssignation"
    // InternalIDsl.g:2287:1: rulePreProcessorAssignation returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'pre' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) ;
    public final EObject rulePreProcessorAssignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalIDsl.g:2293:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'pre' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) )
            // InternalIDsl.g:2294:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'pre' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
            {
            // InternalIDsl.g:2294:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'pre' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
            // InternalIDsl.g:2295:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'pre' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
            {
            // InternalIDsl.g:2295:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==35) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalIDsl.g:2296:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= ','
            	    {
            	    // InternalIDsl.g:2296:4: ( (otherlv_0= RULE_ID ) )
            	    // InternalIDsl.g:2297:5: (otherlv_0= RULE_ID )
            	    {
            	    // InternalIDsl.g:2297:5: (otherlv_0= RULE_ID )
            	    // InternalIDsl.g:2298:6: otherlv_0= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPreProcessorAssignationRule());
            	    						}
            	    					
            	    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_0, grammarAccess.getPreProcessorAssignationAccess().getOutputsDataFlowCrossReference_0_0_0());
            	    					

            	    }


            	    }

            	    otherlv_1=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPreProcessorAssignationAccess().getCommaKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalIDsl.g:2314:3: ( (otherlv_2= RULE_ID ) )
            // InternalIDsl.g:2315:4: (otherlv_2= RULE_ID )
            {
            // InternalIDsl.g:2315:4: (otherlv_2= RULE_ID )
            // InternalIDsl.g:2316:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreProcessorAssignationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getPreProcessorAssignationAccess().getOutputsDataFlowCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getPreProcessorAssignationAccess().getEqualsSignKeyword_2());
            		
            otherlv_4=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPreProcessorAssignationAccess().getPreKeyword_3());
            		
            // InternalIDsl.g:2335:3: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    int LA41_1 = input.LA(2);

                    if ( (LA41_1==35) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalIDsl.g:2336:4: ( (otherlv_5= RULE_ID ) ) otherlv_6= ','
            	    {
            	    // InternalIDsl.g:2336:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalIDsl.g:2337:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalIDsl.g:2337:5: (otherlv_5= RULE_ID )
            	    // InternalIDsl.g:2338:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPreProcessorAssignationRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_5, grammarAccess.getPreProcessorAssignationAccess().getInputsDataFlowCrossReference_4_0_0());
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getPreProcessorAssignationAccess().getCommaKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalIDsl.g:2354:3: ( (otherlv_7= RULE_ID ) )
            // InternalIDsl.g:2355:4: (otherlv_7= RULE_ID )
            {
            // InternalIDsl.g:2355:4: (otherlv_7= RULE_ID )
            // InternalIDsl.g:2356:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreProcessorAssignationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_7, grammarAccess.getPreProcessorAssignationAccess().getInputsDataFlowCrossReference_5_0());
            				

            }


            }

            otherlv_8=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getPreProcessorAssignationAccess().getUsingKeyword_6());
            		
            // InternalIDsl.g:2371:3: ( (otherlv_9= RULE_ID ) )
            // InternalIDsl.g:2372:4: (otherlv_9= RULE_ID )
            {
            // InternalIDsl.g:2372:4: (otherlv_9= RULE_ID )
            // InternalIDsl.g:2373:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreProcessorAssignationRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_9, grammarAccess.getPreProcessorAssignationAccess().getInterfacerdescriptorPreProcessorDescriptorCrossReference_7_0());
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPreProcessorAssignationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "rulePreProcessorAssignation"


    // $ANTLR start "entryRuleProcessorAssignation"
    // InternalIDsl.g:2392:1: entryRuleProcessorAssignation returns [EObject current=null] : iv_ruleProcessorAssignation= ruleProcessorAssignation EOF ;
    public final EObject entryRuleProcessorAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorAssignation = null;


        try {
            // InternalIDsl.g:2392:61: (iv_ruleProcessorAssignation= ruleProcessorAssignation EOF )
            // InternalIDsl.g:2393:2: iv_ruleProcessorAssignation= ruleProcessorAssignation EOF
            {
             newCompositeNode(grammarAccess.getProcessorAssignationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessorAssignation=ruleProcessorAssignation();

            state._fsp--;

             current =iv_ruleProcessorAssignation; 
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
    // $ANTLR end "entryRuleProcessorAssignation"


    // $ANTLR start "ruleProcessorAssignation"
    // InternalIDsl.g:2399:1: ruleProcessorAssignation returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'process' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) ;
    public final EObject ruleProcessorAssignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalIDsl.g:2405:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'process' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) )
            // InternalIDsl.g:2406:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'process' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
            {
            // InternalIDsl.g:2406:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'process' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
            // InternalIDsl.g:2407:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'process' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
            {
            // InternalIDsl.g:2407:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==35) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalIDsl.g:2408:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= ','
            	    {
            	    // InternalIDsl.g:2408:4: ( (otherlv_0= RULE_ID ) )
            	    // InternalIDsl.g:2409:5: (otherlv_0= RULE_ID )
            	    {
            	    // InternalIDsl.g:2409:5: (otherlv_0= RULE_ID )
            	    // InternalIDsl.g:2410:6: otherlv_0= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getProcessorAssignationRule());
            	    						}
            	    					
            	    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_0, grammarAccess.getProcessorAssignationAccess().getOutputsDataFlowCrossReference_0_0_0());
            	    					

            	    }


            	    }

            	    otherlv_1=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getProcessorAssignationAccess().getCommaKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalIDsl.g:2426:3: ( (otherlv_2= RULE_ID ) )
            // InternalIDsl.g:2427:4: (otherlv_2= RULE_ID )
            {
            // InternalIDsl.g:2427:4: (otherlv_2= RULE_ID )
            // InternalIDsl.g:2428:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessorAssignationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getProcessorAssignationAccess().getOutputsDataFlowCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessorAssignationAccess().getEqualsSignKeyword_2());
            		
            otherlv_4=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessorAssignationAccess().getProcessKeyword_3());
            		
            // InternalIDsl.g:2447:3: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    int LA43_1 = input.LA(2);

                    if ( (LA43_1==35) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // InternalIDsl.g:2448:4: ( (otherlv_5= RULE_ID ) ) otherlv_6= ','
            	    {
            	    // InternalIDsl.g:2448:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalIDsl.g:2449:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalIDsl.g:2449:5: (otherlv_5= RULE_ID )
            	    // InternalIDsl.g:2450:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getProcessorAssignationRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_5, grammarAccess.getProcessorAssignationAccess().getInputsDataFlowCrossReference_4_0_0());
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getProcessorAssignationAccess().getCommaKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalIDsl.g:2466:3: ( (otherlv_7= RULE_ID ) )
            // InternalIDsl.g:2467:4: (otherlv_7= RULE_ID )
            {
            // InternalIDsl.g:2467:4: (otherlv_7= RULE_ID )
            // InternalIDsl.g:2468:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessorAssignationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_7, grammarAccess.getProcessorAssignationAccess().getInputsDataFlowCrossReference_5_0());
            				

            }


            }

            otherlv_8=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getProcessorAssignationAccess().getUsingKeyword_6());
            		
            // InternalIDsl.g:2483:3: ( (otherlv_9= RULE_ID ) )
            // InternalIDsl.g:2484:4: (otherlv_9= RULE_ID )
            {
            // InternalIDsl.g:2484:4: (otherlv_9= RULE_ID )
            // InternalIDsl.g:2485:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessorAssignationRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_9, grammarAccess.getProcessorAssignationAccess().getInterfacerdescriptorDataProcessorDescriptorCrossReference_7_0());
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getProcessorAssignationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleProcessorAssignation"


    // $ANTLR start "entryRuleSynchronizerAssignation"
    // InternalIDsl.g:2504:1: entryRuleSynchronizerAssignation returns [EObject current=null] : iv_ruleSynchronizerAssignation= ruleSynchronizerAssignation EOF ;
    public final EObject entryRuleSynchronizerAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronizerAssignation = null;


        try {
            // InternalIDsl.g:2504:64: (iv_ruleSynchronizerAssignation= ruleSynchronizerAssignation EOF )
            // InternalIDsl.g:2505:2: iv_ruleSynchronizerAssignation= ruleSynchronizerAssignation EOF
            {
             newCompositeNode(grammarAccess.getSynchronizerAssignationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSynchronizerAssignation=ruleSynchronizerAssignation();

            state._fsp--;

             current =iv_ruleSynchronizerAssignation; 
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
    // $ANTLR end "entryRuleSynchronizerAssignation"


    // $ANTLR start "ruleSynchronizerAssignation"
    // InternalIDsl.g:2511:1: ruleSynchronizerAssignation returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'synchronize' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) ;
    public final EObject ruleSynchronizerAssignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalIDsl.g:2517:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'synchronize' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) )
            // InternalIDsl.g:2518:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'synchronize' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
            {
            // InternalIDsl.g:2518:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'synchronize' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
            // InternalIDsl.g:2519:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'synchronize' ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) otherlv_8= 'using' ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
            {
            // InternalIDsl.g:2519:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==35) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalIDsl.g:2520:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= ','
            	    {
            	    // InternalIDsl.g:2520:4: ( (otherlv_0= RULE_ID ) )
            	    // InternalIDsl.g:2521:5: (otherlv_0= RULE_ID )
            	    {
            	    // InternalIDsl.g:2521:5: (otherlv_0= RULE_ID )
            	    // InternalIDsl.g:2522:6: otherlv_0= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSynchronizerAssignationRule());
            	    						}
            	    					
            	    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_0, grammarAccess.getSynchronizerAssignationAccess().getOutputsDataFlowCrossReference_0_0_0());
            	    					

            	    }


            	    }

            	    otherlv_1=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSynchronizerAssignationAccess().getCommaKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalIDsl.g:2538:3: ( (otherlv_2= RULE_ID ) )
            // InternalIDsl.g:2539:4: (otherlv_2= RULE_ID )
            {
            // InternalIDsl.g:2539:4: (otherlv_2= RULE_ID )
            // InternalIDsl.g:2540:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSynchronizerAssignationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getSynchronizerAssignationAccess().getOutputsDataFlowCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getSynchronizerAssignationAccess().getEqualsSignKeyword_2());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSynchronizerAssignationAccess().getSynchronizeKeyword_3());
            		
            // InternalIDsl.g:2559:3: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==35) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalIDsl.g:2560:4: ( (otherlv_5= RULE_ID ) ) otherlv_6= ','
            	    {
            	    // InternalIDsl.g:2560:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalIDsl.g:2561:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalIDsl.g:2561:5: (otherlv_5= RULE_ID )
            	    // InternalIDsl.g:2562:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSynchronizerAssignationRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_5, grammarAccess.getSynchronizerAssignationAccess().getInputsDataFlowCrossReference_4_0_0());
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSynchronizerAssignationAccess().getCommaKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalIDsl.g:2578:3: ( (otherlv_7= RULE_ID ) )
            // InternalIDsl.g:2579:4: (otherlv_7= RULE_ID )
            {
            // InternalIDsl.g:2579:4: (otherlv_7= RULE_ID )
            // InternalIDsl.g:2580:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSynchronizerAssignationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_7, grammarAccess.getSynchronizerAssignationAccess().getInputsDataFlowCrossReference_5_0());
            				

            }


            }

            otherlv_8=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getSynchronizerAssignationAccess().getUsingKeyword_6());
            		
            // InternalIDsl.g:2595:3: ( (otherlv_9= RULE_ID ) )
            // InternalIDsl.g:2596:4: (otherlv_9= RULE_ID )
            {
            // InternalIDsl.g:2596:4: (otherlv_9= RULE_ID )
            // InternalIDsl.g:2597:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSynchronizerAssignationRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_9, grammarAccess.getSynchronizerAssignationAccess().getInterfacerdescriptorSynchronizerDescriptorCrossReference_7_0());
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSynchronizerAssignationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleSynchronizerAssignation"


    // $ANTLR start "entryRuleOutputAssignation"
    // InternalIDsl.g:2616:1: entryRuleOutputAssignation returns [EObject current=null] : iv_ruleOutputAssignation= ruleOutputAssignation EOF ;
    public final EObject entryRuleOutputAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputAssignation = null;


        try {
            // InternalIDsl.g:2616:58: (iv_ruleOutputAssignation= ruleOutputAssignation EOF )
            // InternalIDsl.g:2617:2: iv_ruleOutputAssignation= ruleOutputAssignation EOF
            {
             newCompositeNode(grammarAccess.getOutputAssignationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputAssignation=ruleOutputAssignation();

            state._fsp--;

             current =iv_ruleOutputAssignation; 
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
    // $ANTLR end "entryRuleOutputAssignation"


    // $ANTLR start "ruleOutputAssignation"
    // InternalIDsl.g:2623:1: ruleOutputAssignation returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' )* ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ;
    public final EObject ruleOutputAssignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalIDsl.g:2629:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' )* ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            // InternalIDsl.g:2630:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' )* ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            {
            // InternalIDsl.g:2630:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' )* ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            // InternalIDsl.g:2631:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' )* ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
            {
            // InternalIDsl.g:2631:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ',' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1==35) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalIDsl.g:2632:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= ','
            	    {
            	    // InternalIDsl.g:2632:4: ( (otherlv_0= RULE_ID ) )
            	    // InternalIDsl.g:2633:5: (otherlv_0= RULE_ID )
            	    {
            	    // InternalIDsl.g:2633:5: (otherlv_0= RULE_ID )
            	    // InternalIDsl.g:2634:6: otherlv_0= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputAssignationRule());
            	    						}
            	    					
            	    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_0, grammarAccess.getOutputAssignationAccess().getOutputsDataFlowCrossReference_0_0_0());
            	    					

            	    }


            	    }

            	    otherlv_1=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutputAssignationAccess().getCommaKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalIDsl.g:2650:3: ( (otherlv_2= RULE_ID ) )
            // InternalIDsl.g:2651:4: (otherlv_2= RULE_ID )
            {
            // InternalIDsl.g:2651:4: (otherlv_2= RULE_ID )
            // InternalIDsl.g:2652:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputAssignationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getOutputAssignationAccess().getOutputsDataFlowCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputAssignationAccess().getEqualsSignKeyword_2());
            		
            // InternalIDsl.g:2667:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==35) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalIDsl.g:2668:4: ( (otherlv_4= RULE_ID ) ) otherlv_5= ','
            	    {
            	    // InternalIDsl.g:2668:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalIDsl.g:2669:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalIDsl.g:2669:5: (otherlv_4= RULE_ID )
            	    // InternalIDsl.g:2670:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputAssignationRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_4, grammarAccess.getOutputAssignationAccess().getInputsDataFlowCrossReference_3_0_0());
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getOutputAssignationAccess().getCommaKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalIDsl.g:2686:3: ( (otherlv_6= RULE_ID ) )
            // InternalIDsl.g:2687:4: (otherlv_6= RULE_ID )
            {
            // InternalIDsl.g:2687:4: (otherlv_6= RULE_ID )
            // InternalIDsl.g:2688:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputAssignationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_6, grammarAccess.getOutputAssignationAccess().getInputsDataFlowCrossReference_4_0());
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOutputAssignationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleOutputAssignation"


    // $ANTLR start "entryRuleDomainParameterBlock"
    // InternalIDsl.g:2707:1: entryRuleDomainParameterBlock returns [EObject current=null] : iv_ruleDomainParameterBlock= ruleDomainParameterBlock EOF ;
    public final EObject entryRuleDomainParameterBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainParameterBlock = null;


        try {
            // InternalIDsl.g:2707:61: (iv_ruleDomainParameterBlock= ruleDomainParameterBlock EOF )
            // InternalIDsl.g:2708:2: iv_ruleDomainParameterBlock= ruleDomainParameterBlock EOF
            {
             newCompositeNode(grammarAccess.getDomainParameterBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainParameterBlock=ruleDomainParameterBlock();

            state._fsp--;

             current =iv_ruleDomainParameterBlock; 
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
    // $ANTLR end "entryRuleDomainParameterBlock"


    // $ANTLR start "ruleDomainParameterBlock"
    // InternalIDsl.g:2714:1: ruleDomainParameterBlock returns [EObject current=null] : (otherlv_0= '@domain' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterExpression ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleDomainParameterBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalIDsl.g:2720:2: ( (otherlv_0= '@domain' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterExpression ) )+ otherlv_6= '}' )? ) )
            // InternalIDsl.g:2721:2: (otherlv_0= '@domain' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterExpression ) )+ otherlv_6= '}' )? )
            {
            // InternalIDsl.g:2721:2: (otherlv_0= '@domain' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterExpression ) )+ otherlv_6= '}' )? )
            // InternalIDsl.g:2722:3: otherlv_0= '@domain' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterExpression ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainParameterBlockAccess().getDomainKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainParameterBlockAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIDsl.g:2730:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIDsl.g:2731:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIDsl.g:2731:4: (lv_name_2_0= RULE_ID )
            // InternalIDsl.g:2732:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDomainParameterBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainParameterBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainParameterBlockAccess().getRightParenthesisKeyword_3());
            		
            // InternalIDsl.g:2752:3: (otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterExpression ) )+ otherlv_6= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==22) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalIDsl.g:2753:4: otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterExpression ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getDomainParameterBlockAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalIDsl.g:2757:4: ( (lv_parameters_5_0= ruleParameterExpression ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_ID) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalIDsl.g:2758:5: (lv_parameters_5_0= ruleParameterExpression )
                    	    {
                    	    // InternalIDsl.g:2758:5: (lv_parameters_5_0= ruleParameterExpression )
                    	    // InternalIDsl.g:2759:6: lv_parameters_5_0= ruleParameterExpression
                    	    {

                    	    						newCompositeNode(grammarAccess.getDomainParameterBlockAccess().getParametersParameterExpressionParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_44);
                    	    lv_parameters_5_0=ruleParameterExpression();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDomainParameterBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_5_0,
                    	    							"n7.intern.v3.xtext.idsl.IDsl.ParameterExpression");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getDomainParameterBlockAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleDomainParameterBlock"


    // $ANTLR start "ruleType"
    // InternalIDsl.g:2785:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) ) ;
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
            // InternalIDsl.g:2791:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) ) )
            // InternalIDsl.g:2792:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) )
            {
            // InternalIDsl.g:2792:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) )
            int alt50=9;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt50=1;
                }
                break;
            case 49:
                {
                alt50=2;
                }
                break;
            case 50:
                {
                alt50=3;
                }
                break;
            case 51:
                {
                alt50=4;
                }
                break;
            case 52:
                {
                alt50=5;
                }
                break;
            case 53:
                {
                alt50=6;
                }
                break;
            case 54:
                {
                alt50=7;
                }
                break;
            case 55:
                {
                alt50=8;
                }
                break;
            case 56:
                {
                alt50=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalIDsl.g:2793:3: (enumLiteral_0= 'string' )
                    {
                    // InternalIDsl.g:2793:3: (enumLiteral_0= 'string' )
                    // InternalIDsl.g:2794:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDsl.g:2801:3: (enumLiteral_1= 'byte' )
                    {
                    // InternalIDsl.g:2801:3: (enumLiteral_1= 'byte' )
                    // InternalIDsl.g:2802:4: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getByteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getByteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIDsl.g:2809:3: (enumLiteral_2= 'short' )
                    {
                    // InternalIDsl.g:2809:3: (enumLiteral_2= 'short' )
                    // InternalIDsl.g:2810:4: enumLiteral_2= 'short'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getShortEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIDsl.g:2817:3: (enumLiteral_3= 'int' )
                    {
                    // InternalIDsl.g:2817:3: (enumLiteral_3= 'int' )
                    // InternalIDsl.g:2818:4: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalIDsl.g:2825:3: (enumLiteral_4= 'long' )
                    {
                    // InternalIDsl.g:2825:3: (enumLiteral_4= 'long' )
                    // InternalIDsl.g:2826:4: enumLiteral_4= 'long'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalIDsl.g:2833:3: (enumLiteral_5= 'float' )
                    {
                    // InternalIDsl.g:2833:3: (enumLiteral_5= 'float' )
                    // InternalIDsl.g:2834:4: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalIDsl.g:2841:3: (enumLiteral_6= 'double' )
                    {
                    // InternalIDsl.g:2841:3: (enumLiteral_6= 'double' )
                    // InternalIDsl.g:2842:4: enumLiteral_6= 'double'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalIDsl.g:2849:3: (enumLiteral_7= 'char' )
                    {
                    // InternalIDsl.g:2849:3: (enumLiteral_7= 'char' )
                    // InternalIDsl.g:2850:4: enumLiteral_7= 'char'
                    {
                    enumLiteral_7=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalIDsl.g:2857:3: (enumLiteral_8= 'boolean' )
                    {
                    // InternalIDsl.g:2857:3: (enumLiteral_8= 'boolean' )
                    // InternalIDsl.g:2858:4: enumLiteral_8= 'boolean'
                    {
                    enumLiteral_8=(Token)match(input,56,FOLLOW_2); 

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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\22\1\23\7\uffff\1\4\1\24\1\25";
    static final String dfa_3s = "\1\50\1\23\7\uffff\1\4\1\24\1\50";
    static final String dfa_4s = "\2\uffff\1\7\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\2\uffff\1\3\7\uffff\1\4\1\5\3\uffff\1\7\1\uffff\1\10\1\6",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\2\2\uffff\1\3\7\uffff\1\4\1\5\3\uffff\1\7\1\uffff\1\10\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 80:3: ( ( (lv_dataflowdescriptors_0_0= ruleThingBlock ) ) | ( (lv_dataflowdescriptors_1_0= ruleOutputBlock ) ) | ( (lv_dataflowdescriptors_2_0= ruleHolderBlock ) ) | ( (lv_interfacerdescriptors_3_0= ruleSynchronizerBlock ) ) | ( (lv_interfacerdescriptors_4_0= rulePreProcessorBlock ) ) | ( (lv_interfacerdescriptors_5_0= ruleDataProcessorBlock ) ) )*";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\5\2\uffff\1\32\2\5\4\uffff";
    static final String dfa_9s = "\1\51\2\uffff\1\43\1\5\1\56\4\uffff";
    static final String dfa_10s = "\1\uffff\1\6\1\1\3\uffff\1\5\1\2\1\3\1\4";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\3\21\uffff\1\1\21\uffff\1\2",
            "",
            "",
            "\1\5\10\uffff\1\4",
            "\1\3",
            "\1\6\45\uffff\1\10\1\uffff\1\11\1\7",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 259:3: ( ( (lv_dataflows_13_0= ruleDefinitionInstruction ) ) | ( (lv_interfacers_14_0= ruleSynchronizerAssignation ) ) | ( (lv_interfacers_15_0= rulePreProcessorAssignation ) ) | ( (lv_interfacers_16_0= ruleProcessorAssignation ) ) | ( (lv_interfacers_17_0= ruleOutputAssignation ) ) )+";
        }
    }
    static final String dfa_13s = "\17\uffff";
    static final String dfa_14s = "\1\34\1\5\1\35\1\60\11\43\2\uffff";
    static final String dfa_15s = "\1\34\1\5\1\35\1\70\11\44\2\uffff";
    static final String dfa_16s = "\15\uffff\1\1\1\2";
    static final String dfa_17s = "\17\uffff}>";
    static final String[] dfa_18s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 1258:3: ( ( (lv_streamdescriptors_1_0= ruleAnonymousStreamDefinition ) ) otherlv_2= ',' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001A301240000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000800020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800012040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800012840000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003FD0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01FF000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000800020L});

}