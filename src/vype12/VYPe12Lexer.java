// $ANTLR 3.4 C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g 2012-12-06 18:08:42

package vype12;

import vype12.ste.*;
import vype12.tac.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VYPe12Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int CHAR=4;
    public static final int COMMA=5;
    public static final int COMMENT=6;
    public static final int DO=7;
    public static final int ELSE=8;
    public static final int EQUAL=9;
    public static final int ESC_SEQ=10;
    public static final int EXPONENT=11;
    public static final int FLOAT=12;
    public static final int HEX_DIGIT=13;
    public static final int ID=14;
    public static final int IF=15;
    public static final int INT=16;
    public static final int LBRACE=17;
    public static final int LBRACKET=18;
    public static final int MINUS=19;
    public static final int MULTIPLY=20;
    public static final int OCTAL_ESC=21;
    public static final int PLUS=22;
    public static final int RBRACE=23;
    public static final int RBRACKET=24;
    public static final int RETURN=25;
    public static final int SEMICOLON=26;
    public static final int STRING=27;
    public static final int TYPE_CHAR=28;
    public static final int TYPE_INT=29;
    public static final int TYPE_STRING=30;
    public static final int TYPE_VOID=31;
    public static final int WHILE=32;
    public static final int WS=33;

        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            // Now do something with hdr and msg...
            throw new LexicalException("Lexical exception: "+hdr+" "+msg+".");
        }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public VYPe12Lexer() {} 
    public VYPe12Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public VYPe12Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g"; }

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:18:7: ( '!' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:18:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:19:7: ( '!=' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:19:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:20:7: ( '%' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:20:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:21:7: ( '&&' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:21:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:22:7: ( '/' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:22:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:23:7: ( '<' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:23:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:24:7: ( '<=' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:24:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:25:7: ( '==' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:25:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:26:7: ( '>' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:26:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:27:7: ( '>=' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:27:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:28:7: ( 'get_at' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:28:9: 'get_at'
            {
            match("get_at"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:29:7: ( 'print' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:29:9: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:30:7: ( 'read_char()' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:30:9: 'read_char()'
            {
            match("read_char()"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:31:7: ( 'read_int()' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:31:9: 'read_int()'
            {
            match("read_int()"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:32:7: ( 'read_string()' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:32:9: 'read_string()'
            {
            match("read_string()"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:33:7: ( 'set_at' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:33:9: 'set_at'
            {
            match("set_at"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:34:7: ( 'strcat' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:34:9: 'strcat'
            {
            match("strcat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:35:7: ( '||' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:35:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "TYPE_STRING"
    public final void mTYPE_STRING() throws RecognitionException {
        try {
            int _type = TYPE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:178:2: ( 'string' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:178:4: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_STRING"

    // $ANTLR start "TYPE_CHAR"
    public final void mTYPE_CHAR() throws RecognitionException {
        try {
            int _type = TYPE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:180:2: ( 'char' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:180:4: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_CHAR"

    // $ANTLR start "TYPE_INT"
    public final void mTYPE_INT() throws RecognitionException {
        try {
            int _type = TYPE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:181:9: ( 'int' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:181:11: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_INT"

    // $ANTLR start "TYPE_VOID"
    public final void mTYPE_VOID() throws RecognitionException {
        try {
            int _type = TYPE_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:182:10: ( 'void' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:182:12: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_VOID"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:184:7: ( 'while' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:184:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:185:4: ( 'do' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:185:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:186:4: ( 'if' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:186:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:187:6: ( 'else' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:187:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:188:8: ( 'return' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:188:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:190:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:190:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:190:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:193:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:193:7: ( '0' .. '9' )+
            {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:193:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:197:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:197:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:197:9: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
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


                    match('.'); 

                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:197:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:197:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:197:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:198:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:198:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:198:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:198:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:199:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:199:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:203:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='/') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='*') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:203:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:203:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:203:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:203:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:204:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:204:14: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='/') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:204:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:207:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:207:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:215:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:215:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:215:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:215:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:215:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:218:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:218:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:218:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:218:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:218:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:223:10: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+ )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:223:12: ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:223:22: ( PLUS | MINUS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:223:36: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:226:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:230:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OCTAL_ESC )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='\"'||LA18_1=='\''||LA18_1=='\\'||LA18_1=='b'||LA18_1=='f'||LA18_1=='n'||LA18_1=='r'||LA18_1=='t') ) {
                    alt18=1;
                }
                else if ( ((LA18_1 >= '0' && LA18_1 <= '7')) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:230:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:231:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:236:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:236:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:237:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:238:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:241:2: ( ';' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:241:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:243:7: ( ',' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:243:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:245:7: ( '{' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:245:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:246:7: ( '}' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:246:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:252:2: ( '(' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:252:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:256:2: ( ')' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:256:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:260:2: ( '=' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:260:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:264:2: ( '+' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:264:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:268:2: ( '-' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:268:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:272:2: ( '*' )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:272:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTIPLY"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:8: ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | TYPE_STRING | TYPE_CHAR | TYPE_INT | TYPE_VOID | WHILE | DO | IF | ELSE | RETURN | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | SEMICOLON | COMMA | LBRACE | RBRACE | LBRACKET | RBRACKET | EQUAL | PLUS | MINUS | MULTIPLY )
        int alt20=44;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:10: T__34
                {
                mT__34(); 


                }
                break;
            case 2 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:16: T__35
                {
                mT__35(); 


                }
                break;
            case 3 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:22: T__36
                {
                mT__36(); 


                }
                break;
            case 4 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:28: T__37
                {
                mT__37(); 


                }
                break;
            case 5 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:34: T__38
                {
                mT__38(); 


                }
                break;
            case 6 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:40: T__39
                {
                mT__39(); 


                }
                break;
            case 7 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:46: T__40
                {
                mT__40(); 


                }
                break;
            case 8 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:52: T__41
                {
                mT__41(); 


                }
                break;
            case 9 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:58: T__42
                {
                mT__42(); 


                }
                break;
            case 10 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:64: T__43
                {
                mT__43(); 


                }
                break;
            case 11 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:70: T__44
                {
                mT__44(); 


                }
                break;
            case 12 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:76: T__45
                {
                mT__45(); 


                }
                break;
            case 13 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:82: T__46
                {
                mT__46(); 


                }
                break;
            case 14 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:88: T__47
                {
                mT__47(); 


                }
                break;
            case 15 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:94: T__48
                {
                mT__48(); 


                }
                break;
            case 16 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:100: T__49
                {
                mT__49(); 


                }
                break;
            case 17 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:106: T__50
                {
                mT__50(); 


                }
                break;
            case 18 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:112: T__51
                {
                mT__51(); 


                }
                break;
            case 19 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:118: TYPE_STRING
                {
                mTYPE_STRING(); 


                }
                break;
            case 20 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:130: TYPE_CHAR
                {
                mTYPE_CHAR(); 


                }
                break;
            case 21 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:140: TYPE_INT
                {
                mTYPE_INT(); 


                }
                break;
            case 22 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:149: TYPE_VOID
                {
                mTYPE_VOID(); 


                }
                break;
            case 23 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:159: WHILE
                {
                mWHILE(); 


                }
                break;
            case 24 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:165: DO
                {
                mDO(); 


                }
                break;
            case 25 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:168: IF
                {
                mIF(); 


                }
                break;
            case 26 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:171: ELSE
                {
                mELSE(); 


                }
                break;
            case 27 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:176: RETURN
                {
                mRETURN(); 


                }
                break;
            case 28 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:183: ID
                {
                mID(); 


                }
                break;
            case 29 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:186: INT
                {
                mINT(); 


                }
                break;
            case 30 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:190: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 31 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:196: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 32 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:204: WS
                {
                mWS(); 


                }
                break;
            case 33 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:207: STRING
                {
                mSTRING(); 


                }
                break;
            case 34 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:214: CHAR
                {
                mCHAR(); 


                }
                break;
            case 35 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:219: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 36 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:229: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 37 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:235: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 38 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:242: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 39 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:249: LBRACKET
                {
                mLBRACKET(); 


                }
                break;
            case 40 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:258: RBRACKET
                {
                mRBRACKET(); 


                }
                break;
            case 41 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:267: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 42 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:273: PLUS
                {
                mPLUS(); 


                }
                break;
            case 43 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:278: MINUS
                {
                mMINUS(); 


                }
                break;
            case 44 :
                // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:1:284: MULTIPLY
                {
                mMULTIPLY(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
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
            return "196:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\43\2\uffff\1\45\1\47\1\51\1\53\4\23\1\uffff\6\23\1\uffff"+
        "\1\70\27\uffff\7\23\1\101\2\23\1\104\1\23\1\uffff\7\23\1\116\1\uffff"+
        "\2\23\1\uffff\10\23\1\131\1\uffff\1\132\1\23\1\134\1\23\1\136\5"+
        "\23\2\uffff\1\146\1\uffff\1\147\1\uffff\3\23\1\153\1\154\1\155\1"+
        "\156\2\uffff\3\23\4\uffff\4\23\1\uffff\1\23\1\uffff\2\23\1\uffff";
    static final String DFA20_eofS =
        "\171\uffff";
    static final String DFA20_minS =
        "\1\11\1\75\2\uffff\1\52\3\75\1\145\1\162\2\145\1\uffff\1\150\1\146"+
        "\1\157\1\150\1\157\1\154\1\uffff\1\56\27\uffff\1\164\1\151\1\141"+
        "\1\164\1\162\1\141\1\164\1\60\2\151\1\60\1\163\1\uffff\1\137\1\156"+
        "\1\144\1\165\1\137\1\143\1\162\1\60\1\uffff\1\144\1\154\1\uffff"+
        "\1\145\1\141\1\164\1\137\1\162\2\141\1\156\1\60\1\uffff\1\60\1\145"+
        "\1\60\1\164\1\60\1\143\1\156\2\164\1\147\2\uffff\1\60\1\uffff\1"+
        "\60\1\uffff\1\150\1\156\1\164\4\60\2\uffff\1\141\1\164\1\162\4\uffff"+
        "\1\162\1\50\1\151\1\50\1\uffff\1\156\1\uffff\1\147\1\50\1\uffff";
    static final String DFA20_maxS =
        "\1\175\1\75\2\uffff\1\57\3\75\1\145\1\162\1\145\1\164\1\uffff\1"+
        "\150\1\156\1\157\1\150\1\157\1\154\1\uffff\1\145\27\uffff\1\164"+
        "\1\151\2\164\1\162\1\141\1\164\1\172\2\151\1\172\1\163\1\uffff\1"+
        "\137\1\156\1\144\1\165\1\137\1\151\1\162\1\172\1\uffff\1\144\1\154"+
        "\1\uffff\1\145\1\141\1\164\1\137\1\162\2\141\1\156\1\172\1\uffff"+
        "\1\172\1\145\1\172\1\164\1\172\1\163\1\156\2\164\1\147\2\uffff\1"+
        "\172\1\uffff\1\172\1\uffff\1\150\1\156\1\164\4\172\2\uffff\1\141"+
        "\1\164\1\162\4\uffff\1\162\1\50\1\151\1\50\1\uffff\1\156\1\uffff"+
        "\1\147\1\50\1\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\3\1\4\10\uffff\1\22\6\uffff\1\34\1\uffff\1\36\1\40\1"+
        "\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\52\1\53\1\54\1\2\1\1\1"+
        "\37\1\5\1\7\1\6\1\10\1\51\1\12\1\11\14\uffff\1\35\10\uffff\1\31"+
        "\2\uffff\1\30\11\uffff\1\25\12\uffff\1\24\1\26\1\uffff\1\32\1\uffff"+
        "\1\14\7\uffff\1\27\1\13\3\uffff\1\33\1\20\1\21\1\23\4\uffff\1\16"+
        "\1\uffff\1\15\2\uffff\1\17";
    static final String DFA20_specialS =
        "\171\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\26\2\uffff\1\26\22\uffff\1\26\1\1\1\27\2\uffff\1\2\1\3\1"+
            "\30\1\35\1\36\1\41\1\37\1\32\1\40\1\25\1\4\12\24\1\uffff\1\31"+
            "\1\5\1\6\1\7\2\uffff\32\23\4\uffff\1\23\1\uffff\2\23\1\15\1"+
            "\21\1\22\1\23\1\10\1\23\1\16\6\23\1\11\1\23\1\12\1\13\2\23\1"+
            "\17\1\20\3\23\1\33\1\14\1\34",
            "\1\42",
            "",
            "",
            "\1\44\4\uffff\1\44",
            "\1\46",
            "\1\50",
            "\1\52",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\16\uffff\1\60",
            "",
            "\1\61",
            "\1\63\7\uffff\1\62",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\25\1\uffff\12\24\13\uffff\1\25\37\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73\22\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\102",
            "\1\103",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113\5\uffff\1\114",
            "\1\115",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\133",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\135",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\137\5\uffff\1\140\11\uffff\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | TYPE_STRING | TYPE_CHAR | TYPE_INT | TYPE_VOID | WHILE | DO | IF | ELSE | RETURN | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | SEMICOLON | COMMA | LBRACE | RBRACE | LBRACKET | RBRACKET | EQUAL | PLUS | MINUS | MULTIPLY );";
        }
    }
 

}