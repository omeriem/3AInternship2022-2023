package n7.intern.v2.xtext.parser.antlr.internal;

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
import n7.intern.v2.xtext.services.IDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<IoTFramework>'", "'<description>'", "'</description>'", "'</IoTFramework>'", "'<Component>'", "'<samplingRate>'", "'</samplingRate>'", "'</Component>'", "'<Output>'", "'</Output>'", "'-'", "'<data>'", "'</data>'", "'<DataProvider>'", "'</DataProvider>'", "'<DataProcessor>'", "'<dataProviders>'", "','", "'</dataProviders>'", "'<outputs>'", "'</outputs>'", "'</DataProcessor>'", "'<dataComponent>'", "'<type>'", "'</type>'", "'</dataComponent>'", "'<Connection>'", "'</Connection>'", "'<parameter>'", "'<content>'", "'</content>'", "'</parameter>'", "'String'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'boolean'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIDSL.g"; }



     	private IDSLGrammarAccess grammarAccess;

        public InternalIDSLParser(TokenStream input, IDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IoTFramework";
       	}

       	@Override
       	protected IDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIoTFramework"
    // InternalIDSL.g:65:1: entryRuleIoTFramework returns [EObject current=null] : iv_ruleIoTFramework= ruleIoTFramework EOF ;
    public final EObject entryRuleIoTFramework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIoTFramework = null;


        try {
            // InternalIDSL.g:65:53: (iv_ruleIoTFramework= ruleIoTFramework EOF )
            // InternalIDSL.g:66:2: iv_ruleIoTFramework= ruleIoTFramework EOF
            {
             newCompositeNode(grammarAccess.getIoTFrameworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIoTFramework=ruleIoTFramework();

            state._fsp--;

             current =iv_ruleIoTFramework; 
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
    // $ANTLR end "entryRuleIoTFramework"


    // $ANTLR start "ruleIoTFramework"
    // InternalIDSL.g:72:1: ruleIoTFramework returns [EObject current=null] : ( () otherlv_1= '<IoTFramework>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '</IoTFramework>' ) ;
    public final EObject ruleIoTFramework() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_components_6_0 = null;

        EObject lv_components_7_0 = null;

        EObject lv_outputs_8_0 = null;

        EObject lv_outputs_9_0 = null;



        	enterRule();

        try {
            // InternalIDSL.g:78:2: ( ( () otherlv_1= '<IoTFramework>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '</IoTFramework>' ) )
            // InternalIDSL.g:79:2: ( () otherlv_1= '<IoTFramework>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '</IoTFramework>' )
            {
            // InternalIDSL.g:79:2: ( () otherlv_1= '<IoTFramework>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '</IoTFramework>' )
            // InternalIDSL.g:80:3: () otherlv_1= '<IoTFramework>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '</IoTFramework>'
            {
            // InternalIDSL.g:80:3: ()
            // InternalIDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIoTFrameworkAccess().getIoTFrameworkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIoTFrameworkAccess().getIoTFrameworkKeyword_1());
            		
            // InternalIDSL.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIDSL.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalIDSL.g:92:4: (lv_name_2_0= ruleEString )
            // InternalIDSL.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIoTFrameworkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIoTFrameworkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v2.xtext.IDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDSL.g:110:3: (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalIDSL.g:111:4: otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getIoTFrameworkAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalIDSL.g:115:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalIDSL.g:116:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalIDSL.g:116:5: (lv_description_4_0= ruleEString )
                    // InternalIDSL.g:117:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIoTFrameworkAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIoTFrameworkRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"n7.intern.v2.xtext.IDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getIoTFrameworkAccess().getDescriptionKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalIDSL.g:139:3: ( ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15||LA3_0==24||LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIDSL.g:140:4: ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )*
                    {
                    // InternalIDSL.g:140:4: ( (lv_components_6_0= ruleComponent ) )
                    // InternalIDSL.g:141:5: (lv_components_6_0= ruleComponent )
                    {
                    // InternalIDSL.g:141:5: (lv_components_6_0= ruleComponent )
                    // InternalIDSL.g:142:6: lv_components_6_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getIoTFrameworkAccess().getComponentsComponentParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_components_6_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIoTFrameworkRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_6_0,
                    							"n7.intern.v2.xtext.IDSL.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:159:4: ( (lv_components_7_0= ruleComponent ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15||LA2_0==24||LA2_0==26) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalIDSL.g:160:5: (lv_components_7_0= ruleComponent )
                    	    {
                    	    // InternalIDSL.g:160:5: (lv_components_7_0= ruleComponent )
                    	    // InternalIDSL.g:161:6: lv_components_7_0= ruleComponent
                    	    {

                    	    						newCompositeNode(grammarAccess.getIoTFrameworkAccess().getComponentsComponentParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_components_7_0=ruleComponent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIoTFrameworkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"components",
                    	    							lv_components_7_0,
                    	    							"n7.intern.v2.xtext.IDSL.Component");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalIDSL.g:179:3: ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIDSL.g:180:4: ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )*
                    {
                    // InternalIDSL.g:180:4: ( (lv_outputs_8_0= ruleOutput ) )
                    // InternalIDSL.g:181:5: (lv_outputs_8_0= ruleOutput )
                    {
                    // InternalIDSL.g:181:5: (lv_outputs_8_0= ruleOutput )
                    // InternalIDSL.g:182:6: lv_outputs_8_0= ruleOutput
                    {

                    						newCompositeNode(grammarAccess.getIoTFrameworkAccess().getOutputsOutputParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_outputs_8_0=ruleOutput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIoTFrameworkRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_8_0,
                    							"n7.intern.v2.xtext.IDSL.Output");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:199:4: ( (lv_outputs_9_0= ruleOutput ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalIDSL.g:200:5: (lv_outputs_9_0= ruleOutput )
                    	    {
                    	    // InternalIDSL.g:200:5: (lv_outputs_9_0= ruleOutput )
                    	    // InternalIDSL.g:201:6: lv_outputs_9_0= ruleOutput
                    	    {

                    	    						newCompositeNode(grammarAccess.getIoTFrameworkAccess().getOutputsOutputParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_outputs_9_0=ruleOutput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIoTFrameworkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outputs",
                    	    							lv_outputs_9_0,
                    	    							"n7.intern.v2.xtext.IDSL.Output");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIoTFrameworkAccess().getIoTFrameworkKeyword_6());
            		

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
    // $ANTLR end "ruleIoTFramework"


    // $ANTLR start "entryRuleComponent"
    // InternalIDSL.g:227:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalIDSL.g:227:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalIDSL.g:228:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalIDSL.g:234:1: ruleComponent returns [EObject current=null] : (this_Component_Impl_0= ruleComponent_Impl | this_DataProvider_1= ruleDataProvider | this_DataProcessor_2= ruleDataProcessor ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Component_Impl_0 = null;

        EObject this_DataProvider_1 = null;

        EObject this_DataProcessor_2 = null;



        	enterRule();

        try {
            // InternalIDSL.g:240:2: ( (this_Component_Impl_0= ruleComponent_Impl | this_DataProvider_1= ruleDataProvider | this_DataProcessor_2= ruleDataProcessor ) )
            // InternalIDSL.g:241:2: (this_Component_Impl_0= ruleComponent_Impl | this_DataProvider_1= ruleDataProvider | this_DataProcessor_2= ruleDataProcessor )
            {
            // InternalIDSL.g:241:2: (this_Component_Impl_0= ruleComponent_Impl | this_DataProvider_1= ruleDataProvider | this_DataProcessor_2= ruleDataProcessor )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalIDSL.g:242:3: this_Component_Impl_0= ruleComponent_Impl
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getComponent_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_Impl_0=ruleComponent_Impl();

                    state._fsp--;


                    			current = this_Component_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIDSL.g:251:3: this_DataProvider_1= ruleDataProvider
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getDataProviderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataProvider_1=ruleDataProvider();

                    state._fsp--;


                    			current = this_DataProvider_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIDSL.g:260:3: this_DataProcessor_2= ruleDataProcessor
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getDataProcessorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataProcessor_2=ruleDataProcessor();

                    state._fsp--;


                    			current = this_DataProcessor_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalIDSL.g:272:1: entryRuleComponent_Impl returns [EObject current=null] : iv_ruleComponent_Impl= ruleComponent_Impl EOF ;
    public final EObject entryRuleComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent_Impl = null;


        try {
            // InternalIDSL.g:272:55: (iv_ruleComponent_Impl= ruleComponent_Impl EOF )
            // InternalIDSL.g:273:2: iv_ruleComponent_Impl= ruleComponent_Impl EOF
            {
             newCompositeNode(grammarAccess.getComponent_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent_Impl=ruleComponent_Impl();

            state._fsp--;

             current =iv_ruleComponent_Impl; 
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
    // $ANTLR end "entryRuleComponent_Impl"


    // $ANTLR start "ruleComponent_Impl"
    // InternalIDSL.g:279:1: ruleComponent_Impl returns [EObject current=null] : ( () otherlv_1= '<Component>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? otherlv_8= '</Component>' ) ;
    public final EObject ruleComponent_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_samplingRate_4_0 = null;

        EObject lv_data_6_0 = null;

        EObject lv_data_7_0 = null;



        	enterRule();

        try {
            // InternalIDSL.g:285:2: ( ( () otherlv_1= '<Component>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? otherlv_8= '</Component>' ) )
            // InternalIDSL.g:286:2: ( () otherlv_1= '<Component>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? otherlv_8= '</Component>' )
            {
            // InternalIDSL.g:286:2: ( () otherlv_1= '<Component>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? otherlv_8= '</Component>' )
            // InternalIDSL.g:287:3: () otherlv_1= '<Component>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? otherlv_8= '</Component>'
            {
            // InternalIDSL.g:287:3: ()
            // InternalIDSL.g:288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponent_ImplAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponent_ImplAccess().getComponentKeyword_1());
            		
            // InternalIDSL.g:298:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIDSL.g:299:4: (lv_name_2_0= ruleEString )
            {
            // InternalIDSL.g:299:4: (lv_name_2_0= ruleEString )
            // InternalIDSL.g:300:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v2.xtext.IDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDSL.g:317:3: (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIDSL.g:318:4: otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponent_ImplAccess().getSamplingRateKeyword_3_0());
                    			
                    // InternalIDSL.g:322:4: ( (lv_samplingRate_4_0= ruleEInt ) )
                    // InternalIDSL.g:323:5: (lv_samplingRate_4_0= ruleEInt )
                    {
                    // InternalIDSL.g:323:5: (lv_samplingRate_4_0= ruleEInt )
                    // InternalIDSL.g:324:6: lv_samplingRate_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getSamplingRateEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_samplingRate_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						set(
                    							current,
                    							"samplingRate",
                    							lv_samplingRate_4_0,
                    							"n7.intern.v2.xtext.IDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponent_ImplAccess().getSamplingRateKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalIDSL.g:346:3: ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIDSL.g:347:4: ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )*
                    {
                    // InternalIDSL.g:347:4: ( (lv_data_6_0= ruleData ) )
                    // InternalIDSL.g:348:5: (lv_data_6_0= ruleData )
                    {
                    // InternalIDSL.g:348:5: (lv_data_6_0= ruleData )
                    // InternalIDSL.g:349:6: lv_data_6_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getDataDataParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_data_6_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_6_0,
                    							"n7.intern.v2.xtext.IDSL.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:366:4: ( (lv_data_7_0= ruleData ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalIDSL.g:367:5: (lv_data_7_0= ruleData )
                    	    {
                    	    // InternalIDSL.g:367:5: (lv_data_7_0= ruleData )
                    	    // InternalIDSL.g:368:6: lv_data_7_0= ruleData
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getDataDataParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_data_7_0=ruleData();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"data",
                    	    							lv_data_7_0,
                    	    							"n7.intern.v2.xtext.IDSL.Data");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getComponent_ImplAccess().getComponentKeyword_5());
            		

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
    // $ANTLR end "ruleComponent_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalIDSL.g:394:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalIDSL.g:394:47: (iv_ruleEString= ruleEString EOF )
            // InternalIDSL.g:395:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalIDSL.g:401:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalIDSL.g:407:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalIDSL.g:408:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalIDSL.g:408:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIDSL.g:409:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIDSL.g:417:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleOutput"
    // InternalIDSL.g:428:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalIDSL.g:428:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalIDSL.g:429:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalIDSL.g:435:1: ruleOutput returns [EObject current=null] : ( () otherlv_1= '<Output>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Output>' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalIDSL.g:441:2: ( ( () otherlv_1= '<Output>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Output>' ) )
            // InternalIDSL.g:442:2: ( () otherlv_1= '<Output>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Output>' )
            {
            // InternalIDSL.g:442:2: ( () otherlv_1= '<Output>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Output>' )
            // InternalIDSL.g:443:3: () otherlv_1= '<Output>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Output>'
            {
            // InternalIDSL.g:443:3: ()
            // InternalIDSL.g:444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getOutputKeyword_1());
            		
            // InternalIDSL.g:454:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIDSL.g:455:4: (lv_name_2_0= ruleEString )
            {
            // InternalIDSL.g:455:4: (lv_name_2_0= ruleEString )
            // InternalIDSL.g:456:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v2.xtext.IDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDSL.g:473:3: (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIDSL.g:474:4: otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalIDSL.g:478:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalIDSL.g:479:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalIDSL.g:479:5: (lv_description_4_0= ruleEString )
                    // InternalIDSL.g:480:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"n7.intern.v2.xtext.IDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getDescriptionKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalIDSL.g:502:3: ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIDSL.g:503:4: ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )*
                    {
                    // InternalIDSL.g:503:4: ( (lv_parameters_6_0= ruleParameter ) )
                    // InternalIDSL.g:504:5: (lv_parameters_6_0= ruleParameter )
                    {
                    // InternalIDSL.g:504:5: (lv_parameters_6_0= ruleParameter )
                    // InternalIDSL.g:505:6: lv_parameters_6_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getParametersParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_parameters_6_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"n7.intern.v2.xtext.IDSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:522:4: ( (lv_parameters_7_0= ruleParameter ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==39) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalIDSL.g:523:5: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalIDSL.g:523:5: (lv_parameters_7_0= ruleParameter )
                    	    // InternalIDSL.g:524:6: lv_parameters_7_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getOutputAccess().getParametersParameterParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameters_7_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_7_0,
                    	    							"n7.intern.v2.xtext.IDSL.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getOutputKeyword_5());
            		

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleEInt"
    // InternalIDSL.g:550:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalIDSL.g:550:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalIDSL.g:551:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalIDSL.g:557:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalIDSL.g:563:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalIDSL.g:564:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalIDSL.g:564:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalIDSL.g:565:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalIDSL.g:565:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIDSL.g:566:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleData"
    // InternalIDSL.g:583:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalIDSL.g:583:45: (iv_ruleData= ruleData EOF )
            // InternalIDSL.g:584:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalIDSL.g:590:1: ruleData returns [EObject current=null] : ( () otherlv_1= '<data>' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_dataTypes_3_0= ruleDataType ) ) ( (lv_dataTypes_4_0= ruleDataType ) )* )? ( ( (lv_data_5_0= ruleData ) ) ( (lv_data_6_0= ruleData ) )* )? otherlv_7= '</data>' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_dataTypes_3_0 = null;

        EObject lv_dataTypes_4_0 = null;

        EObject lv_data_5_0 = null;

        EObject lv_data_6_0 = null;



        	enterRule();

        try {
            // InternalIDSL.g:596:2: ( ( () otherlv_1= '<data>' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_dataTypes_3_0= ruleDataType ) ) ( (lv_dataTypes_4_0= ruleDataType ) )* )? ( ( (lv_data_5_0= ruleData ) ) ( (lv_data_6_0= ruleData ) )* )? otherlv_7= '</data>' ) )
            // InternalIDSL.g:597:2: ( () otherlv_1= '<data>' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_dataTypes_3_0= ruleDataType ) ) ( (lv_dataTypes_4_0= ruleDataType ) )* )? ( ( (lv_data_5_0= ruleData ) ) ( (lv_data_6_0= ruleData ) )* )? otherlv_7= '</data>' )
            {
            // InternalIDSL.g:597:2: ( () otherlv_1= '<data>' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_dataTypes_3_0= ruleDataType ) ) ( (lv_dataTypes_4_0= ruleDataType ) )* )? ( ( (lv_data_5_0= ruleData ) ) ( (lv_data_6_0= ruleData ) )* )? otherlv_7= '</data>' )
            // InternalIDSL.g:598:3: () otherlv_1= '<data>' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_dataTypes_3_0= ruleDataType ) ) ( (lv_dataTypes_4_0= ruleDataType ) )* )? ( ( (lv_data_5_0= ruleData ) ) ( (lv_data_6_0= ruleData ) )* )? otherlv_7= '</data>'
            {
            // InternalIDSL.g:598:3: ()
            // InternalIDSL.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataAccess().getDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getDataKeyword_1());
            		
            // InternalIDSL.g:609:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIDSL.g:610:4: (lv_name_2_0= ruleEString )
            {
            // InternalIDSL.g:610:4: (lv_name_2_0= ruleEString )
            // InternalIDSL.g:611:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v2.xtext.IDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDSL.g:628:3: ( ( (lv_dataTypes_3_0= ruleDataType ) ) ( (lv_dataTypes_4_0= ruleDataType ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIDSL.g:629:4: ( (lv_dataTypes_3_0= ruleDataType ) ) ( (lv_dataTypes_4_0= ruleDataType ) )*
                    {
                    // InternalIDSL.g:629:4: ( (lv_dataTypes_3_0= ruleDataType ) )
                    // InternalIDSL.g:630:5: (lv_dataTypes_3_0= ruleDataType )
                    {
                    // InternalIDSL.g:630:5: (lv_dataTypes_3_0= ruleDataType )
                    // InternalIDSL.g:631:6: lv_dataTypes_3_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getDataTypesDataTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_dataTypes_3_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						add(
                    							current,
                    							"dataTypes",
                    							lv_dataTypes_3_0,
                    							"n7.intern.v2.xtext.IDSL.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:648:4: ( (lv_dataTypes_4_0= ruleDataType ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==33) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalIDSL.g:649:5: (lv_dataTypes_4_0= ruleDataType )
                    	    {
                    	    // InternalIDSL.g:649:5: (lv_dataTypes_4_0= ruleDataType )
                    	    // InternalIDSL.g:650:6: lv_dataTypes_4_0= ruleDataType
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataAccess().getDataTypesDataTypeParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_dataTypes_4_0=ruleDataType();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"dataTypes",
                    	    							lv_dataTypes_4_0,
                    	    							"n7.intern.v2.xtext.IDSL.DataType");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalIDSL.g:668:3: ( ( (lv_data_5_0= ruleData ) ) ( (lv_data_6_0= ruleData ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIDSL.g:669:4: ( (lv_data_5_0= ruleData ) ) ( (lv_data_6_0= ruleData ) )*
                    {
                    // InternalIDSL.g:669:4: ( (lv_data_5_0= ruleData ) )
                    // InternalIDSL.g:670:5: (lv_data_5_0= ruleData )
                    {
                    // InternalIDSL.g:670:5: (lv_data_5_0= ruleData )
                    // InternalIDSL.g:671:6: lv_data_5_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getDataDataParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_data_5_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_5_0,
                    							"n7.intern.v2.xtext.IDSL.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:688:4: ( (lv_data_6_0= ruleData ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==22) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalIDSL.g:689:5: (lv_data_6_0= ruleData )
                    	    {
                    	    // InternalIDSL.g:689:5: (lv_data_6_0= ruleData )
                    	    // InternalIDSL.g:690:6: lv_data_6_0= ruleData
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataAccess().getDataDataParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_data_6_0=ruleData();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"data",
                    	    							lv_data_6_0,
                    	    							"n7.intern.v2.xtext.IDSL.Data");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDataAccess().getDataKeyword_5());
            		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleDataProvider"
    // InternalIDSL.g:716:1: entryRuleDataProvider returns [EObject current=null] : iv_ruleDataProvider= ruleDataProvider EOF ;
    public final EObject entryRuleDataProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataProvider = null;


        try {
            // InternalIDSL.g:716:53: (iv_ruleDataProvider= ruleDataProvider EOF )
            // InternalIDSL.g:717:2: iv_ruleDataProvider= ruleDataProvider EOF
            {
             newCompositeNode(grammarAccess.getDataProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataProvider=ruleDataProvider();

            state._fsp--;

             current =iv_ruleDataProvider; 
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
    // $ANTLR end "entryRuleDataProvider"


    // $ANTLR start "ruleDataProvider"
    // InternalIDSL.g:723:1: ruleDataProvider returns [EObject current=null] : ( () otherlv_1= '<DataProvider>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? ( ( (lv_connections_8_0= ruleConnection ) ) ( (lv_connections_9_0= ruleConnection ) )* )? otherlv_10= '</DataProvider>' ) ;
    public final EObject ruleDataProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_samplingRate_4_0 = null;

        EObject lv_data_6_0 = null;

        EObject lv_data_7_0 = null;

        EObject lv_connections_8_0 = null;

        EObject lv_connections_9_0 = null;



        	enterRule();

        try {
            // InternalIDSL.g:729:2: ( ( () otherlv_1= '<DataProvider>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? ( ( (lv_connections_8_0= ruleConnection ) ) ( (lv_connections_9_0= ruleConnection ) )* )? otherlv_10= '</DataProvider>' ) )
            // InternalIDSL.g:730:2: ( () otherlv_1= '<DataProvider>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? ( ( (lv_connections_8_0= ruleConnection ) ) ( (lv_connections_9_0= ruleConnection ) )* )? otherlv_10= '</DataProvider>' )
            {
            // InternalIDSL.g:730:2: ( () otherlv_1= '<DataProvider>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? ( ( (lv_connections_8_0= ruleConnection ) ) ( (lv_connections_9_0= ruleConnection ) )* )? otherlv_10= '</DataProvider>' )
            // InternalIDSL.g:731:3: () otherlv_1= '<DataProvider>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )? ( ( (lv_connections_8_0= ruleConnection ) ) ( (lv_connections_9_0= ruleConnection ) )* )? otherlv_10= '</DataProvider>'
            {
            // InternalIDSL.g:731:3: ()
            // InternalIDSL.g:732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataProviderAccess().getDataProviderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataProviderAccess().getDataProviderKeyword_1());
            		
            // InternalIDSL.g:742:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIDSL.g:743:4: (lv_name_2_0= ruleEString )
            {
            // InternalIDSL.g:743:4: (lv_name_2_0= ruleEString )
            // InternalIDSL.g:744:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataProviderAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataProviderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v2.xtext.IDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDSL.g:761:3: (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIDSL.g:762:4: otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataProviderAccess().getSamplingRateKeyword_3_0());
                    			
                    // InternalIDSL.g:766:4: ( (lv_samplingRate_4_0= ruleEInt ) )
                    // InternalIDSL.g:767:5: (lv_samplingRate_4_0= ruleEInt )
                    {
                    // InternalIDSL.g:767:5: (lv_samplingRate_4_0= ruleEInt )
                    // InternalIDSL.g:768:6: lv_samplingRate_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDataProviderAccess().getSamplingRateEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_samplingRate_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataProviderRule());
                    						}
                    						set(
                    							current,
                    							"samplingRate",
                    							lv_samplingRate_4_0,
                    							"n7.intern.v2.xtext.IDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataProviderAccess().getSamplingRateKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalIDSL.g:790:3: ( ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalIDSL.g:791:4: ( (lv_data_6_0= ruleData ) ) ( (lv_data_7_0= ruleData ) )*
                    {
                    // InternalIDSL.g:791:4: ( (lv_data_6_0= ruleData ) )
                    // InternalIDSL.g:792:5: (lv_data_6_0= ruleData )
                    {
                    // InternalIDSL.g:792:5: (lv_data_6_0= ruleData )
                    // InternalIDSL.g:793:6: lv_data_6_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getDataProviderAccess().getDataDataParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_data_6_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataProviderRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_6_0,
                    							"n7.intern.v2.xtext.IDSL.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:810:4: ( (lv_data_7_0= ruleData ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==22) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalIDSL.g:811:5: (lv_data_7_0= ruleData )
                    	    {
                    	    // InternalIDSL.g:811:5: (lv_data_7_0= ruleData )
                    	    // InternalIDSL.g:812:6: lv_data_7_0= ruleData
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataProviderAccess().getDataDataParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_data_7_0=ruleData();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataProviderRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"data",
                    	    							lv_data_7_0,
                    	    							"n7.intern.v2.xtext.IDSL.Data");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalIDSL.g:830:3: ( ( (lv_connections_8_0= ruleConnection ) ) ( (lv_connections_9_0= ruleConnection ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIDSL.g:831:4: ( (lv_connections_8_0= ruleConnection ) ) ( (lv_connections_9_0= ruleConnection ) )*
                    {
                    // InternalIDSL.g:831:4: ( (lv_connections_8_0= ruleConnection ) )
                    // InternalIDSL.g:832:5: (lv_connections_8_0= ruleConnection )
                    {
                    // InternalIDSL.g:832:5: (lv_connections_8_0= ruleConnection )
                    // InternalIDSL.g:833:6: lv_connections_8_0= ruleConnection
                    {

                    						newCompositeNode(grammarAccess.getDataProviderAccess().getConnectionsConnectionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_connections_8_0=ruleConnection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataProviderRule());
                    						}
                    						add(
                    							current,
                    							"connections",
                    							lv_connections_8_0,
                    							"n7.intern.v2.xtext.IDSL.Connection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:850:4: ( (lv_connections_9_0= ruleConnection ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==37) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalIDSL.g:851:5: (lv_connections_9_0= ruleConnection )
                    	    {
                    	    // InternalIDSL.g:851:5: (lv_connections_9_0= ruleConnection )
                    	    // InternalIDSL.g:852:6: lv_connections_9_0= ruleConnection
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataProviderAccess().getConnectionsConnectionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_connections_9_0=ruleConnection();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataProviderRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"connections",
                    	    							lv_connections_9_0,
                    	    							"n7.intern.v2.xtext.IDSL.Connection");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDataProviderAccess().getDataProviderKeyword_6());
            		

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
    // $ANTLR end "ruleDataProvider"


    // $ANTLR start "entryRuleDataProcessor"
    // InternalIDSL.g:878:1: entryRuleDataProcessor returns [EObject current=null] : iv_ruleDataProcessor= ruleDataProcessor EOF ;
    public final EObject entryRuleDataProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataProcessor = null;


        try {
            // InternalIDSL.g:878:54: (iv_ruleDataProcessor= ruleDataProcessor EOF )
            // InternalIDSL.g:879:2: iv_ruleDataProcessor= ruleDataProcessor EOF
            {
             newCompositeNode(grammarAccess.getDataProcessorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataProcessor=ruleDataProcessor();

            state._fsp--;

             current =iv_ruleDataProcessor; 
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
    // $ANTLR end "entryRuleDataProcessor"


    // $ANTLR start "ruleDataProcessor"
    // InternalIDSL.g:885:1: ruleDataProcessor returns [EObject current=null] : ( () otherlv_1= '<DataProcessor>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? (otherlv_6= '<dataProviders>' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '</dataProviders>' )? (otherlv_11= '<outputs>' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '</outputs>' )? ( ( (lv_data_16_0= ruleData ) ) ( (lv_data_17_0= ruleData ) )* )? otherlv_18= '</DataProcessor>' ) ;
    public final EObject ruleDataProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_samplingRate_4_0 = null;

        EObject lv_data_16_0 = null;

        EObject lv_data_17_0 = null;



        	enterRule();

        try {
            // InternalIDSL.g:891:2: ( ( () otherlv_1= '<DataProcessor>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? (otherlv_6= '<dataProviders>' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '</dataProviders>' )? (otherlv_11= '<outputs>' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '</outputs>' )? ( ( (lv_data_16_0= ruleData ) ) ( (lv_data_17_0= ruleData ) )* )? otherlv_18= '</DataProcessor>' ) )
            // InternalIDSL.g:892:2: ( () otherlv_1= '<DataProcessor>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? (otherlv_6= '<dataProviders>' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '</dataProviders>' )? (otherlv_11= '<outputs>' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '</outputs>' )? ( ( (lv_data_16_0= ruleData ) ) ( (lv_data_17_0= ruleData ) )* )? otherlv_18= '</DataProcessor>' )
            {
            // InternalIDSL.g:892:2: ( () otherlv_1= '<DataProcessor>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? (otherlv_6= '<dataProviders>' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '</dataProviders>' )? (otherlv_11= '<outputs>' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '</outputs>' )? ( ( (lv_data_16_0= ruleData ) ) ( (lv_data_17_0= ruleData ) )* )? otherlv_18= '</DataProcessor>' )
            // InternalIDSL.g:893:3: () otherlv_1= '<DataProcessor>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )? (otherlv_6= '<dataProviders>' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '</dataProviders>' )? (otherlv_11= '<outputs>' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '</outputs>' )? ( ( (lv_data_16_0= ruleData ) ) ( (lv_data_17_0= ruleData ) )* )? otherlv_18= '</DataProcessor>'
            {
            // InternalIDSL.g:893:3: ()
            // InternalIDSL.g:894:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataProcessorAccess().getDataProcessorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataProcessorAccess().getDataProcessorKeyword_1());
            		
            // InternalIDSL.g:904:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIDSL.g:905:4: (lv_name_2_0= ruleEString )
            {
            // InternalIDSL.g:905:4: (lv_name_2_0= ruleEString )
            // InternalIDSL.g:906:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataProcessorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataProcessorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v2.xtext.IDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDSL.g:923:3: (otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIDSL.g:924:4: otherlv_3= '<samplingRate>' ( (lv_samplingRate_4_0= ruleEInt ) ) otherlv_5= '</samplingRate>'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataProcessorAccess().getSamplingRateKeyword_3_0());
                    			
                    // InternalIDSL.g:928:4: ( (lv_samplingRate_4_0= ruleEInt ) )
                    // InternalIDSL.g:929:5: (lv_samplingRate_4_0= ruleEInt )
                    {
                    // InternalIDSL.g:929:5: (lv_samplingRate_4_0= ruleEInt )
                    // InternalIDSL.g:930:6: lv_samplingRate_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDataProcessorAccess().getSamplingRateEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_samplingRate_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataProcessorRule());
                    						}
                    						set(
                    							current,
                    							"samplingRate",
                    							lv_samplingRate_4_0,
                    							"n7.intern.v2.xtext.IDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataProcessorAccess().getSamplingRateKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalIDSL.g:952:3: (otherlv_6= '<dataProviders>' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '</dataProviders>' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIDSL.g:953:4: otherlv_6= '<dataProviders>' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '</dataProviders>'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataProcessorAccess().getDataProvidersKeyword_4_0());
                    			
                    // InternalIDSL.g:957:4: ( ( ruleEString ) )
                    // InternalIDSL.g:958:5: ( ruleEString )
                    {
                    // InternalIDSL.g:958:5: ( ruleEString )
                    // InternalIDSL.g:959:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataProcessorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataProcessorAccess().getDataProvidersDataProviderCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:973:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==28) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalIDSL.g:974:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDataProcessorAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalIDSL.g:978:5: ( ( ruleEString ) )
                    	    // InternalIDSL.g:979:6: ( ruleEString )
                    	    {
                    	    // InternalIDSL.g:979:6: ( ruleEString )
                    	    // InternalIDSL.g:980:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataProcessorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataProcessorAccess().getDataProvidersDataProviderCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getDataProcessorAccess().getDataProvidersKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalIDSL.g:1000:3: (otherlv_11= '<outputs>' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '</outputs>' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalIDSL.g:1001:4: otherlv_11= '<outputs>' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '</outputs>'
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getDataProcessorAccess().getOutputsKeyword_5_0());
                    			
                    // InternalIDSL.g:1005:4: ( ( ruleEString ) )
                    // InternalIDSL.g:1006:5: ( ruleEString )
                    {
                    // InternalIDSL.g:1006:5: ( ruleEString )
                    // InternalIDSL.g:1007:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataProcessorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataProcessorAccess().getOutputsOutputCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:1021:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==28) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalIDSL.g:1022:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDataProcessorAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalIDSL.g:1026:5: ( ( ruleEString ) )
                    	    // InternalIDSL.g:1027:6: ( ruleEString )
                    	    {
                    	    // InternalIDSL.g:1027:6: ( ruleEString )
                    	    // InternalIDSL.g:1028:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataProcessorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataProcessorAccess().getOutputsOutputCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getDataProcessorAccess().getOutputsKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalIDSL.g:1048:3: ( ( (lv_data_16_0= ruleData ) ) ( (lv_data_17_0= ruleData ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIDSL.g:1049:4: ( (lv_data_16_0= ruleData ) ) ( (lv_data_17_0= ruleData ) )*
                    {
                    // InternalIDSL.g:1049:4: ( (lv_data_16_0= ruleData ) )
                    // InternalIDSL.g:1050:5: (lv_data_16_0= ruleData )
                    {
                    // InternalIDSL.g:1050:5: (lv_data_16_0= ruleData )
                    // InternalIDSL.g:1051:6: lv_data_16_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getDataProcessorAccess().getDataDataParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_data_16_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataProcessorRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_16_0,
                    							"n7.intern.v2.xtext.IDSL.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:1068:4: ( (lv_data_17_0= ruleData ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==22) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalIDSL.g:1069:5: (lv_data_17_0= ruleData )
                    	    {
                    	    // InternalIDSL.g:1069:5: (lv_data_17_0= ruleData )
                    	    // InternalIDSL.g:1070:6: lv_data_17_0= ruleData
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataProcessorAccess().getDataDataParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_data_17_0=ruleData();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataProcessorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"data",
                    	    							lv_data_17_0,
                    	    							"n7.intern.v2.xtext.IDSL.Data");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getDataProcessorAccess().getDataProcessorKeyword_7());
            		

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
    // $ANTLR end "ruleDataProcessor"


    // $ANTLR start "entryRuleDataType"
    // InternalIDSL.g:1096:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalIDSL.g:1096:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalIDSL.g:1097:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalIDSL.g:1103:1: ruleDataType returns [EObject current=null] : (otherlv_0= '<dataComponent>' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<type>' ( (lv_type_3_0= ruleType ) ) otherlv_4= '</type>' otherlv_5= '</dataComponent>' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalIDSL.g:1109:2: ( (otherlv_0= '<dataComponent>' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<type>' ( (lv_type_3_0= ruleType ) ) otherlv_4= '</type>' otherlv_5= '</dataComponent>' ) )
            // InternalIDSL.g:1110:2: (otherlv_0= '<dataComponent>' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<type>' ( (lv_type_3_0= ruleType ) ) otherlv_4= '</type>' otherlv_5= '</dataComponent>' )
            {
            // InternalIDSL.g:1110:2: (otherlv_0= '<dataComponent>' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<type>' ( (lv_type_3_0= ruleType ) ) otherlv_4= '</type>' otherlv_5= '</dataComponent>' )
            // InternalIDSL.g:1111:3: otherlv_0= '<dataComponent>' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<type>' ( (lv_type_3_0= ruleType ) ) otherlv_4= '</type>' otherlv_5= '</dataComponent>'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDataComponentKeyword_0());
            		
            // InternalIDSL.g:1115:3: ( (lv_name_1_0= ruleEString ) )
            // InternalIDSL.g:1116:4: (lv_name_1_0= ruleEString )
            {
            // InternalIDSL.g:1116:4: (lv_name_1_0= ruleEString )
            // InternalIDSL.g:1117:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"n7.intern.v2.xtext.IDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getTypeKeyword_2());
            		
            // InternalIDSL.g:1138:3: ( (lv_type_3_0= ruleType ) )
            // InternalIDSL.g:1139:4: (lv_type_3_0= ruleType )
            {
            // InternalIDSL.g:1139:4: (lv_type_3_0= ruleType )
            // InternalIDSL.g:1140:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDataTypeAccess().getTypeTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"n7.intern.v2.xtext.IDSL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getDataComponentKeyword_5());
            		

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleConnection"
    // InternalIDSL.g:1169:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalIDSL.g:1169:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalIDSL.g:1170:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalIDSL.g:1176:1: ruleConnection returns [EObject current=null] : ( () otherlv_1= '<Connection>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Connection>' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalIDSL.g:1182:2: ( ( () otherlv_1= '<Connection>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Connection>' ) )
            // InternalIDSL.g:1183:2: ( () otherlv_1= '<Connection>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Connection>' )
            {
            // InternalIDSL.g:1183:2: ( () otherlv_1= '<Connection>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Connection>' )
            // InternalIDSL.g:1184:3: () otherlv_1= '<Connection>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )? ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )? otherlv_8= '</Connection>'
            {
            // InternalIDSL.g:1184:3: ()
            // InternalIDSL.g:1185:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectionAccess().getConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getConnectionKeyword_1());
            		
            // InternalIDSL.g:1195:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIDSL.g:1196:4: (lv_name_2_0= ruleEString )
            {
            // InternalIDSL.g:1196:4: (lv_name_2_0= ruleEString )
            // InternalIDSL.g:1197:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v2.xtext.IDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDSL.g:1214:3: (otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==12) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIDSL.g:1215:4: otherlv_3= '<description>' ( (lv_description_4_0= ruleEString ) ) otherlv_5= '</description>'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalIDSL.g:1219:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalIDSL.g:1220:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalIDSL.g:1220:5: (lv_description_4_0= ruleEString )
                    // InternalIDSL.g:1221:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"n7.intern.v2.xtext.IDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,13,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getDescriptionKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalIDSL.g:1243:3: ( ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalIDSL.g:1244:4: ( (lv_parameters_6_0= ruleParameter ) ) ( (lv_parameters_7_0= ruleParameter ) )*
                    {
                    // InternalIDSL.g:1244:4: ( (lv_parameters_6_0= ruleParameter ) )
                    // InternalIDSL.g:1245:5: (lv_parameters_6_0= ruleParameter )
                    {
                    // InternalIDSL.g:1245:5: (lv_parameters_6_0= ruleParameter )
                    // InternalIDSL.g:1246:6: lv_parameters_6_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getParametersParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_parameters_6_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"n7.intern.v2.xtext.IDSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDSL.g:1263:4: ( (lv_parameters_7_0= ruleParameter ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==39) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalIDSL.g:1264:5: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalIDSL.g:1264:5: (lv_parameters_7_0= ruleParameter )
                    	    // InternalIDSL.g:1265:6: lv_parameters_7_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getConnectionAccess().getParametersParameterParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_parameters_7_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_7_0,
                    	    							"n7.intern.v2.xtext.IDSL.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectionAccess().getConnectionKeyword_5());
            		

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleParameter"
    // InternalIDSL.g:1291:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalIDSL.g:1291:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalIDSL.g:1292:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalIDSL.g:1298:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= '<parameter>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<content>' ( (lv_content_4_0= ruleEString ) ) otherlv_5= '</content>' )? otherlv_6= '</parameter>' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_content_4_0 = null;



        	enterRule();

        try {
            // InternalIDSL.g:1304:2: ( ( () otherlv_1= '<parameter>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<content>' ( (lv_content_4_0= ruleEString ) ) otherlv_5= '</content>' )? otherlv_6= '</parameter>' ) )
            // InternalIDSL.g:1305:2: ( () otherlv_1= '<parameter>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<content>' ( (lv_content_4_0= ruleEString ) ) otherlv_5= '</content>' )? otherlv_6= '</parameter>' )
            {
            // InternalIDSL.g:1305:2: ( () otherlv_1= '<parameter>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<content>' ( (lv_content_4_0= ruleEString ) ) otherlv_5= '</content>' )? otherlv_6= '</parameter>' )
            // InternalIDSL.g:1306:3: () otherlv_1= '<parameter>' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '<content>' ( (lv_content_4_0= ruleEString ) ) otherlv_5= '</content>' )? otherlv_6= '</parameter>'
            {
            // InternalIDSL.g:1306:3: ()
            // InternalIDSL.g:1307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalIDSL.g:1317:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIDSL.g:1318:4: (lv_name_2_0= ruleEString )
            {
            // InternalIDSL.g:1318:4: (lv_name_2_0= ruleEString )
            // InternalIDSL.g:1319:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"n7.intern.v2.xtext.IDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDSL.g:1336:3: (otherlv_3= '<content>' ( (lv_content_4_0= ruleEString ) ) otherlv_5= '</content>' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalIDSL.g:1337:4: otherlv_3= '<content>' ( (lv_content_4_0= ruleEString ) ) otherlv_5= '</content>'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getContentKeyword_3_0());
                    			
                    // InternalIDSL.g:1341:4: ( (lv_content_4_0= ruleEString ) )
                    // InternalIDSL.g:1342:5: (lv_content_4_0= ruleEString )
                    {
                    // InternalIDSL.g:1342:5: (lv_content_4_0= ruleEString )
                    // InternalIDSL.g:1343:6: lv_content_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getContentEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_content_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"content",
                    							lv_content_4_0,
                    							"n7.intern.v2.xtext.IDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,41,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getContentKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getParameterKeyword_4());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleType"
    // InternalIDSL.g:1373:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) ) ;
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
            // InternalIDSL.g:1379:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) ) )
            // InternalIDSL.g:1380:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) )
            {
            // InternalIDSL.g:1380:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'char' ) | (enumLiteral_8= 'boolean' ) )
            int alt35=9;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt35=1;
                }
                break;
            case 44:
                {
                alt35=2;
                }
                break;
            case 45:
                {
                alt35=3;
                }
                break;
            case 46:
                {
                alt35=4;
                }
                break;
            case 47:
                {
                alt35=5;
                }
                break;
            case 48:
                {
                alt35=6;
                }
                break;
            case 49:
                {
                alt35=7;
                }
                break;
            case 50:
                {
                alt35=8;
                }
                break;
            case 51:
                {
                alt35=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalIDSL.g:1381:3: (enumLiteral_0= 'String' )
                    {
                    // InternalIDSL.g:1381:3: (enumLiteral_0= 'String' )
                    // InternalIDSL.g:1382:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSL.g:1389:3: (enumLiteral_1= 'byte' )
                    {
                    // InternalIDSL.g:1389:3: (enumLiteral_1= 'byte' )
                    // InternalIDSL.g:1390:4: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getByteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getByteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIDSL.g:1397:3: (enumLiteral_2= 'short' )
                    {
                    // InternalIDSL.g:1397:3: (enumLiteral_2= 'short' )
                    // InternalIDSL.g:1398:4: enumLiteral_2= 'short'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getShortEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIDSL.g:1405:3: (enumLiteral_3= 'int' )
                    {
                    // InternalIDSL.g:1405:3: (enumLiteral_3= 'int' )
                    // InternalIDSL.g:1406:4: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalIDSL.g:1413:3: (enumLiteral_4= 'long' )
                    {
                    // InternalIDSL.g:1413:3: (enumLiteral_4= 'long' )
                    // InternalIDSL.g:1414:4: enumLiteral_4= 'long'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalIDSL.g:1421:3: (enumLiteral_5= 'float' )
                    {
                    // InternalIDSL.g:1421:3: (enumLiteral_5= 'float' )
                    // InternalIDSL.g:1422:4: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalIDSL.g:1429:3: (enumLiteral_6= 'double' )
                    {
                    // InternalIDSL.g:1429:3: (enumLiteral_6= 'double' )
                    // InternalIDSL.g:1430:4: enumLiteral_6= 'double'
                    {
                    enumLiteral_6=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalIDSL.g:1437:3: (enumLiteral_7= 'char' )
                    {
                    // InternalIDSL.g:1437:3: (enumLiteral_7= 'char' )
                    // InternalIDSL.g:1438:4: enumLiteral_7= 'char'
                    {
                    enumLiteral_7=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalIDSL.g:1445:3: (enumLiteral_8= 'boolean' )
                    {
                    // InternalIDSL.g:1445:3: (enumLiteral_8= 'boolean' )
                    // InternalIDSL.g:1446:4: enumLiteral_8= 'boolean'
                    {
                    enumLiteral_8=(Token)match(input,51,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000508D000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000508C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000450000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000101000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002002410000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002002400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000148410000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000148400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000140400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000FF80000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});

}