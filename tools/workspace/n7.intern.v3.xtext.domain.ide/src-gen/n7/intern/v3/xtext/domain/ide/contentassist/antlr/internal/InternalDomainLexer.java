package n7.intern.v3.xtext.domain.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainLexer extends Lexer {
    public static final int RULE_NINT=7;
    public static final int T__50=50;
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
    public static final int T__49=49;
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

    public InternalDomainLexer() {;} 
    public InternalDomainLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDomainLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDomain.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:11:7: ( 'Interpolation' )
            // InternalDomain.g:11:9: 'Interpolation'
            {
            match("Interpolation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:12:7: ( 'python' )
            // InternalDomain.g:12:9: 'python'
            {
            match("python"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:13:7: ( 'java' )
            // InternalDomain.g:13:9: 'java'
            {
            match("java"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:14:7: ( 'c' )
            // InternalDomain.g:14:9: 'c'
            {
            match('c'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:15:7: ( 'string' )
            // InternalDomain.g:15:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:16:7: ( 'byte' )
            // InternalDomain.g:16:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:17:7: ( 'short' )
            // InternalDomain.g:17:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:18:7: ( 'int' )
            // InternalDomain.g:18:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:19:7: ( 'long' )
            // InternalDomain.g:19:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:20:7: ( 'float' )
            // InternalDomain.g:20:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:21:7: ( 'double' )
            // InternalDomain.g:21:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:22:7: ( 'char' )
            // InternalDomain.g:22:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:23:7: ( 'boolean' )
            // InternalDomain.g:23:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:24:7: ( 'domain' )
            // InternalDomain.g:24:9: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:25:7: ( '{' )
            // InternalDomain.g:25:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:26:7: ( '}' )
            // InternalDomain.g:26:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:27:7: ( '@description' )
            // InternalDomain.g:27:9: '@description'
            {
            match("@description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:28:7: ( '(' )
            // InternalDomain.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:29:7: ( ')' )
            // InternalDomain.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:30:7: ( '=' )
            // InternalDomain.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:31:7: ( '@assign' )
            // InternalDomain.g:31:9: '@assign'
            {
            match("@assign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:32:7: ( '@do' )
            // InternalDomain.g:32:9: '@do'
            {
            match("@do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:33:7: ( 'this' )
            // InternalDomain.g:33:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:34:7: ( ',' )
            // InternalDomain.g:34:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:35:7: ( 'def' )
            // InternalDomain.g:35:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:36:7: ( ':' )
            // InternalDomain.g:36:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:37:7: ( '@' )
            // InternalDomain.g:37:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:38:7: ( '::' )
            // InternalDomain.g:38:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:39:7: ( 'imports' )
            // InternalDomain.g:39:9: 'imports'
            {
            match("imports"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:40:7: ( '.' )
            // InternalDomain.g:40:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_DEFAULT_PARAMETER"
    public final void mRULE_DEFAULT_PARAMETER() throws RecognitionException {
        try {
            int _type = RULE_DEFAULT_PARAMETER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4246:24: ( '$' RULE_INT )
            // InternalDomain.g:4246:26: '$' RULE_INT
            {
            match('$'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFAULT_PARAMETER"

    // $ANTLR start "RULE_UNQUOTEDSTRING"
    public final void mRULE_UNQUOTEDSTRING() throws RecognitionException {
        try {
            int _type = RULE_UNQUOTEDSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4248:21: ( '>' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '>' | '<' | '\\\\' ) | ~ ( ( '\\\\' | '<' ) ) )* '<' )
            // InternalDomain.g:4248:23: '>' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '>' | '<' | '\\\\' ) | ~ ( ( '\\\\' | '<' ) ) )* '<'
            {
            match('>'); 
            // InternalDomain.g:4248:27: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '>' | '<' | '\\\\' ) | ~ ( ( '\\\\' | '<' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=';')||(LA1_0>='=' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomain.g:4248:28: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '>' | '<' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='<'||input.LA(1)=='>'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:4248:81: ~ ( ( '\\\\' | '<' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNQUOTEDSTRING"

    // $ANTLR start "RULE_QUALIFIED_NAME"
    public final void mRULE_QUALIFIED_NAME() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4250:21: ( RULE_ID '.' RULE_ID )
            // InternalDomain.g:4250:23: RULE_ID '.' RULE_ID
            {
            mRULE_ID(); 
            match('.'); 
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIED_NAME"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4252:14: ( ( 'true' | 'false' ) )
            // InternalDomain.g:4252:16: ( 'true' | 'false' )
            {
            // InternalDomain.g:4252:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomain.g:4252:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalDomain.g:4252:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_NINT"
    public final void mRULE_NINT() throws RecognitionException {
        try {
            int _type = RULE_NINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4254:11: ( '-' RULE_INT )
            // InternalDomain.g:4254:13: '-' RULE_INT
            {
            match('-'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NINT"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4256:11: ( ( RULE_NINT | RULE_INT ) ( 'l' | 'L' ) )
            // InternalDomain.g:4256:13: ( RULE_NINT | RULE_INT ) ( 'l' | 'L' )
            {
            // InternalDomain.g:4256:13: ( RULE_NINT | RULE_INT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomain.g:4256:14: RULE_NINT
                    {
                    mRULE_NINT(); 

                    }
                    break;
                case 2 :
                    // InternalDomain.g:4256:24: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4258:12: ( ( RULE_NINT | RULE_INT ) ( '.' RULE_INT )? ( 'f' | 'F' ) )
            // InternalDomain.g:4258:14: ( RULE_NINT | RULE_INT ) ( '.' RULE_INT )? ( 'f' | 'F' )
            {
            // InternalDomain.g:4258:14: ( RULE_NINT | RULE_INT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomain.g:4258:15: RULE_NINT
                    {
                    mRULE_NINT(); 

                    }
                    break;
                case 2 :
                    // InternalDomain.g:4258:25: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalDomain.g:4258:35: ( '.' RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomain.g:4258:36: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4260:13: ( ( RULE_NINT | RULE_INT ) ( '.' RULE_INT )? ( 'd' | 'D' ) )
            // InternalDomain.g:4260:15: ( RULE_NINT | RULE_INT ) ( '.' RULE_INT )? ( 'd' | 'D' )
            {
            // InternalDomain.g:4260:15: ( RULE_NINT | RULE_INT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            else if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomain.g:4260:16: RULE_NINT
                    {
                    mRULE_NINT(); 

                    }
                    break;
                case 2 :
                    // InternalDomain.g:4260:26: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalDomain.g:4260:36: ( '.' RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomain.g:4260:37: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4262:11: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) ) '\\'' )
            // InternalDomain.g:4262:13: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) ) '\\''
            {
            match('\''); 
            // InternalDomain.g:4262:18: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                alt8=1;
            }
            else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDomain.g:4262:19: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalDomain.g:4262:64: ~ ( ( '\\\\' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_BYTE"
    public final void mRULE_BYTE() throws RecognitionException {
        try {
            int _type = RULE_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4264:11: ( '0x' ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ) )
            // InternalDomain.g:4264:13: '0x' ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )
            {
            match("0x"); 

            // InternalDomain.g:4264:18: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalDomain.g:4264:19: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalDomain.g:4264:77: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // InternalDomain.g:4264:193: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 4 :
                    // InternalDomain.g:4264:367: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4266:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDomain.g:4266:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDomain.g:4266:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomain.g:4266:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDomain.g:4266:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDomain.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4268:10: ( ( '0' .. '9' )+ )
            // InternalDomain.g:4268:12: ( '0' .. '9' )+
            {
            // InternalDomain.g:4268:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDomain.g:4268:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4270:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDomain.g:4270:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDomain.g:4270:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomain.g:4270:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDomain.g:4270:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDomain.g:4270:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDomain.g:4270:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDomain.g:4270:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDomain.g:4270:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDomain.g:4270:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDomain.g:4270:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4272:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDomain.g:4272:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDomain.g:4272:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDomain.g:4272:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4274:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDomain.g:4274:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDomain.g:4274:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDomain.g:4274:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalDomain.g:4274:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDomain.g:4274:41: ( '\\r' )? '\\n'
                    {
                    // InternalDomain.g:4274:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDomain.g:4274:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4276:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDomain.g:4276:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDomain.g:4276:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDomain.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomain.g:4278:16: ( . )
            // InternalDomain.g:4278:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDomain.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_DEFAULT_PARAMETER | RULE_UNQUOTEDSTRING | RULE_QUALIFIED_NAME | RULE_BOOLEAN | RULE_NINT | RULE_LONG | RULE_FLOAT | RULE_DOUBLE | RULE_CHAR | RULE_BYTE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=47;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalDomain.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalDomain.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalDomain.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalDomain.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalDomain.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalDomain.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalDomain.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalDomain.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalDomain.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalDomain.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalDomain.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalDomain.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // InternalDomain.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // InternalDomain.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // InternalDomain.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // InternalDomain.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // InternalDomain.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // InternalDomain.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // InternalDomain.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // InternalDomain.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // InternalDomain.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // InternalDomain.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // InternalDomain.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // InternalDomain.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // InternalDomain.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // InternalDomain.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // InternalDomain.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // InternalDomain.g:1:172: T__48
                {
                mT__48(); 

                }
                break;
            case 29 :
                // InternalDomain.g:1:178: T__49
                {
                mT__49(); 

                }
                break;
            case 30 :
                // InternalDomain.g:1:184: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // InternalDomain.g:1:190: RULE_DEFAULT_PARAMETER
                {
                mRULE_DEFAULT_PARAMETER(); 

                }
                break;
            case 32 :
                // InternalDomain.g:1:213: RULE_UNQUOTEDSTRING
                {
                mRULE_UNQUOTEDSTRING(); 

                }
                break;
            case 33 :
                // InternalDomain.g:1:233: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 34 :
                // InternalDomain.g:1:253: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 35 :
                // InternalDomain.g:1:266: RULE_NINT
                {
                mRULE_NINT(); 

                }
                break;
            case 36 :
                // InternalDomain.g:1:276: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 37 :
                // InternalDomain.g:1:286: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 38 :
                // InternalDomain.g:1:297: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 39 :
                // InternalDomain.g:1:309: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 40 :
                // InternalDomain.g:1:319: RULE_BYTE
                {
                mRULE_BYTE(); 

                }
                break;
            case 41 :
                // InternalDomain.g:1:329: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // InternalDomain.g:1:337: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 43 :
                // InternalDomain.g:1:346: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // InternalDomain.g:1:358: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // InternalDomain.g:1:374: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // InternalDomain.g:1:390: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // InternalDomain.g:1:398: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA9_eotS =
        "\2\uffff\1\4\2\uffff\1\7\2\uffff\1\12\2\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\4\60\1\uffff\2\60\1\uffff\1\60\2\uffff";
    static final String DFA9_maxS =
        "\4\172\1\uffff\2\172\1\uffff\1\172\2\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\1\2\uffff\1\2\1\uffff\1\4\1\3";
    static final String DFA9_specialS =
        "\13\uffff}>";
    static final String[] DFA9_transitionS = {
            "\12\1\7\uffff\32\1\6\uffff\32\1",
            "\12\2\7\uffff\32\2\6\uffff\32\2",
            "\12\3\7\uffff\32\3\6\uffff\32\3",
            "\12\5\7\uffff\32\5\6\uffff\32\5",
            "",
            "\12\6\7\uffff\32\6\6\uffff\32\6",
            "\12\10\7\uffff\32\10\6\uffff\32\10",
            "",
            "\12\11\7\uffff\32\11\6\uffff\32\11",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "4264:18: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\3\43\1\50\6\43\2\uffff\1\70\3\uffff\1\43\1\uffff\1\100\1\uffff\3\40\1\43\1\40\1\107\1\40\1\107\2\40\2\uffff\2\43\2\uffff\3\43\1\uffff\13\43\10\uffff\2\43\6\uffff\1\43\1\147\4\uffff\1\107\10\uffff\10\43\1\163\6\43\1\172\2\uffff\2\43\4\uffff\2\43\1\u0080\1\u0081\2\43\1\u0084\1\43\1\uffff\1\43\1\u0087\4\43\1\uffff\1\u008c\1\u008d\1\uffff\2\43\2\uffff\1\43\1\u0091\1\uffff\2\43\1\uffff\1\u0094\1\u008d\2\43\2\uffff\1\43\1\u0098\1\u0099\1\uffff\2\43\1\uffff\1\u009c\1\u009d\1\43\2\uffff\1\u009f\1\u00a0\2\uffff\1\43\2\uffff\4\43\1\u00a6\1\uffff";
    static final String DFA21_eofS =
        "\u00a7\uffff";
    static final String DFA21_minS =
        "\1\0\12\56\2\uffff\1\141\3\uffff\1\56\1\uffff\1\72\1\uffff\1\60\1\0\1\101\1\56\1\60\1\56\1\0\1\56\1\0\1\52\2\uffff\2\56\2\uffff\3\56\1\uffff\13\56\2\uffff\1\145\5\uffff\2\56\6\uffff\2\56\2\uffff\1\60\1\uffff\1\56\2\uffff\2\0\4\uffff\20\56\2\uffff\2\56\1\uffff\1\60\1\0\1\uffff\10\56\1\uffff\6\56\1\uffff\2\56\1\uffff\2\56\2\uffff\2\56\1\uffff\2\56\1\uffff\4\56\2\uffff\3\56\1\uffff\2\56\1\uffff\3\56\2\uffff\2\56\2\uffff\1\56\2\uffff\5\56\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\12\172\2\uffff\1\144\3\uffff\1\172\1\uffff\1\72\1\uffff\1\71\1\uffff\2\172\1\71\1\170\1\uffff\1\154\1\uffff\1\57\2\uffff\2\172\2\uffff\3\172\1\uffff\13\172\2\uffff\1\157\5\uffff\2\172\6\uffff\1\172\1\154\2\uffff\1\71\1\uffff\1\154\2\uffff\2\uffff\4\uffff\20\172\2\uffff\2\172\1\uffff\1\146\1\uffff\1\uffff\10\172\1\uffff\6\172\1\uffff\2\172\1\uffff\2\172\2\uffff\2\172\1\uffff\2\172\1\uffff\4\172\2\uffff\3\172\1\uffff\2\172\1\uffff\3\172\2\uffff\2\172\2\uffff\1\172\2\uffff\5\172\1\uffff";
    static final String DFA21_acceptS =
        "\13\uffff\1\17\1\20\1\uffff\1\22\1\23\1\24\1\uffff\1\30\1\uffff\1\36\12\uffff\1\56\1\57\2\uffff\1\51\1\41\3\uffff\1\4\13\uffff\1\17\1\20\1\uffff\1\25\1\33\1\22\1\23\1\24\2\uffff\1\30\1\34\1\32\1\36\1\37\1\40\2\uffff\1\50\1\52\1\uffff\1\45\1\uffff\1\44\1\46\2\uffff\1\53\1\54\1\55\1\56\20\uffff\1\21\1\26\2\uffff\1\43\2\uffff\1\47\10\uffff\1\10\6\uffff\1\31\2\uffff\1\47\2\uffff\1\3\1\14\2\uffff\1\6\2\uffff\1\11\4\uffff\1\27\1\42\3\uffff\1\7\2\uffff\1\12\3\uffff\1\2\1\5\2\uffff\1\13\1\16\1\uffff\1\15\1\35\5\uffff\1\1";
    static final String DFA21_specialS =
        "\1\1\25\uffff\1\6\4\uffff\1\2\1\uffff\1\4\57\uffff\1\0\1\5\32\uffff\1\3\75\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\35\1\40\1\25\2\40\1\33\1\16\1\17\2\40\1\22\1\31\1\24\1\36\1\32\11\34\1\23\2\40\1\20\1\26\1\40\1\15\10\30\1\1\21\30\3\40\1\27\1\30\1\40\1\30\1\6\1\4\1\12\1\30\1\11\2\30\1\7\1\3\1\30\1\10\3\30\1\2\2\30\1\5\1\21\6\30\1\13\1\40\1\14\uff82\40",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\41\14\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\30\42\1\45\1\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\46\31\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\7\42\1\47\22\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\7\42\1\52\13\42\1\51\6\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\54\11\42\1\53\1\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\14\42\1\56\1\55\14\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\57\13\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\61\12\42\1\60\16\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\63\11\42\1\62\13\42",
            "",
            "",
            "\1\67\2\uffff\1\66",
            "",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\7\42\1\74\11\42\1\75\10\42",
            "",
            "\1\77",
            "",
            "\12\102",
            "\0\103",
            "\32\104\4\uffff\1\104\1\uffff\32\104",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\105",
            "\1\110\1\uffff\12\112\12\uffff\1\114\1\uffff\1\111\5\uffff\1\113\27\uffff\1\114\1\uffff\1\111\5\uffff\1\113\13\uffff\1\106",
            "\47\116\1\117\64\116\1\115\uffa3\116",
            "\1\110\1\uffff\12\112\12\uffff\1\114\1\uffff\1\111\5\uffff\1\113\27\uffff\1\114\1\uffff\1\111\5\uffff\1\113",
            "\0\117",
            "\1\120\4\uffff\1\121",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\123\6\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\124\6\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\25\42\1\125\4\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\126\31\42",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\127\10\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\130\13\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\131\6\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\132\13\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\133\6\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\17\42\1\134\12\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\135\14\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\136\13\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\137\16\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\14\42\1\141\7\42\1\140\5\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\5\42\1\142\24\42",
            "",
            "",
            "\1\143\11\uffff\1\144",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\145\21\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\24\42\1\146\5\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\110\1\uffff\12\105\12\uffff\1\114\1\uffff\1\111\5\uffff\1\113\27\uffff\1\114\1\uffff\1\111\5\uffff\1\113",
            "",
            "",
            "\12\150",
            "",
            "\1\110\1\uffff\12\112\12\uffff\1\114\1\uffff\1\111\5\uffff\1\113\27\uffff\1\114\1\uffff\1\111\5\uffff\1\113",
            "",
            "",
            "\42\117\1\151\4\117\1\151\64\117\1\151\5\117\1\151\3\117\1\151\7\117\1\151\3\117\1\151\1\117\2\151\uff8a\117",
            "\47\117\1\152\uffd8\117",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\153\25\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\7\42\1\154\22\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\155\31\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\156\10\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\157\21\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\160\10\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\161\25\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\162\16\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\164\13\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\6\42\1\165\23\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\166\31\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\167\7\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\42\1\170\30\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\171\31\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\173\7\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\174\25\42",
            "",
            "\12\150\12\uffff\1\114\1\uffff\1\111\35\uffff\1\114\1\uffff\1\111",
            "\47\117\1\152\uffd8\117",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\176\10\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\177\13\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u0082\14\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u0083\6\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0085\25\42",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\u0086\10\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u0088\6\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0089\25\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\u008a\16\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u008b\21\42",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\17\42\1\u008e\12\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u008f\14\42",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\6\42\1\u0090\23\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\u0092\31\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u0093\6\42",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0095\25\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u0096\14\42",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\u0097\13\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u009a\14\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u009b\7\42",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\u009e\16\42",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\u00a1\31\42",
            "",
            "",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u00a2\6\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u00a3\21\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\u00a4\13\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u00a5\14\42",
            "\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_DEFAULT_PARAMETER | RULE_UNQUOTEDSTRING | RULE_QUALIFIED_NAME | RULE_BOOLEAN | RULE_NINT | RULE_LONG | RULE_FLOAT | RULE_DOUBLE | RULE_CHAR | RULE_BYTE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_77 = input.LA(1);

                        s = -1;
                        if ( (LA21_77=='\"'||LA21_77=='\''||LA21_77=='\\'||LA21_77=='b'||LA21_77=='f'||LA21_77=='n'||LA21_77=='r'||(LA21_77>='t' && LA21_77<='u')) ) {s = 105;}

                        else if ( ((LA21_77>='\u0000' && LA21_77<='!')||(LA21_77>='#' && LA21_77<='&')||(LA21_77>='(' && LA21_77<='[')||(LA21_77>=']' && LA21_77<='a')||(LA21_77>='c' && LA21_77<='e')||(LA21_77>='g' && LA21_77<='m')||(LA21_77>='o' && LA21_77<='q')||LA21_77=='s'||(LA21_77>='v' && LA21_77<='\uFFFF')) ) {s = 79;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='I') ) {s = 1;}

                        else if ( (LA21_0=='p') ) {s = 2;}

                        else if ( (LA21_0=='j') ) {s = 3;}

                        else if ( (LA21_0=='c') ) {s = 4;}

                        else if ( (LA21_0=='s') ) {s = 5;}

                        else if ( (LA21_0=='b') ) {s = 6;}

                        else if ( (LA21_0=='i') ) {s = 7;}

                        else if ( (LA21_0=='l') ) {s = 8;}

                        else if ( (LA21_0=='f') ) {s = 9;}

                        else if ( (LA21_0=='d') ) {s = 10;}

                        else if ( (LA21_0=='{') ) {s = 11;}

                        else if ( (LA21_0=='}') ) {s = 12;}

                        else if ( (LA21_0=='@') ) {s = 13;}

                        else if ( (LA21_0=='(') ) {s = 14;}

                        else if ( (LA21_0==')') ) {s = 15;}

                        else if ( (LA21_0=='=') ) {s = 16;}

                        else if ( (LA21_0=='t') ) {s = 17;}

                        else if ( (LA21_0==',') ) {s = 18;}

                        else if ( (LA21_0==':') ) {s = 19;}

                        else if ( (LA21_0=='.') ) {s = 20;}

                        else if ( (LA21_0=='$') ) {s = 21;}

                        else if ( (LA21_0=='>') ) {s = 22;}

                        else if ( (LA21_0=='^') ) {s = 23;}

                        else if ( ((LA21_0>='A' && LA21_0<='H')||(LA21_0>='J' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='a'||LA21_0=='e'||(LA21_0>='g' && LA21_0<='h')||LA21_0=='k'||(LA21_0>='m' && LA21_0<='o')||(LA21_0>='q' && LA21_0<='r')||(LA21_0>='u' && LA21_0<='z')) ) {s = 24;}

                        else if ( (LA21_0=='-') ) {s = 25;}

                        else if ( (LA21_0=='0') ) {s = 26;}

                        else if ( (LA21_0=='\'') ) {s = 27;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 28;}

                        else if ( (LA21_0=='\"') ) {s = 29;}

                        else if ( (LA21_0=='/') ) {s = 30;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 31;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||LA21_0=='#'||(LA21_0>='%' && LA21_0<='&')||(LA21_0>='*' && LA21_0<='+')||(LA21_0>=';' && LA21_0<='<')||LA21_0=='?'||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_27 = input.LA(1);

                        s = -1;
                        if ( (LA21_27=='\\') ) {s = 77;}

                        else if ( ((LA21_27>='\u0000' && LA21_27<='&')||(LA21_27>='(' && LA21_27<='[')||(LA21_27>=']' && LA21_27<='\uFFFF')) ) {s = 78;}

                        else if ( (LA21_27=='\'') ) {s = 79;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_105 = input.LA(1);

                        s = -1;
                        if ( (LA21_105=='\'') ) {s = 106;}

                        else if ( ((LA21_105>='\u0000' && LA21_105<='&')||(LA21_105>='(' && LA21_105<='\uFFFF')) ) {s = 79;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_29 = input.LA(1);

                        s = -1;
                        if ( ((LA21_29>='\u0000' && LA21_29<='\uFFFF')) ) {s = 79;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_78 = input.LA(1);

                        s = -1;
                        if ( (LA21_78=='\'') ) {s = 106;}

                        else if ( ((LA21_78>='\u0000' && LA21_78<='&')||(LA21_78>='(' && LA21_78<='\uFFFF')) ) {s = 79;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_22 = input.LA(1);

                        s = -1;
                        if ( ((LA21_22>='\u0000' && LA21_22<='\uFFFF')) ) {s = 67;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}