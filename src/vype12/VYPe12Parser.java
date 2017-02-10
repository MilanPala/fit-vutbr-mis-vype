// $ANTLR 3.4 C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g 2012-12-06 18:08:41

package vype12;

import vype12.ste.*;
import vype12.tac.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VYPe12Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMA", "COMMENT", "DO", "ELSE", "EQUAL", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "IF", "INT", "LBRACE", "LBRACKET", "MINUS", "MULTIPLY", "OCTAL_ESC", "PLUS", "RBRACE", "RBRACKET", "RETURN", "SEMICOLON", "STRING", "TYPE_CHAR", "TYPE_INT", "TYPE_STRING", "TYPE_VOID", "WHILE", "WS", "'!'", "'!='", "'%'", "'&&'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'get_at'", "'print'", "'read_char()'", "'read_int()'", "'read_string()'", "'set_at'", "'strcat'", "'||'"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public VYPe12Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public VYPe12Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return VYPe12Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g"; }


        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            // Now do something with hdr and msg...
            throw new SyntaxException("Syntax exception: "+hdr+" "+msg+".");
        }



    // $ANTLR start "vype12"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:42:1: vype12 : ( global )* EOF ;
    public final void vype12() throws RecognitionException {
        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:42:8: ( ( global )* EOF )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:42:10: ( global )* EOF
            {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:42:10: ( global )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= TYPE_CHAR && LA1_0 <= TYPE_VOID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:42:10: global
            	    {
            	    pushFollow(FOLLOW_global_in_vype1251);
            	    global();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_vype1254); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vype12"



    // $ANTLR start "global"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:43:1: global : functions ;
    public final void global() throws RecognitionException {
        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:43:8: ( functions )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:43:10: functions
            {
            pushFollow(FOLLOW_functions_in_global61);
            functions();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "global"



    // $ANTLR start "functions"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:45:1: functions : ( definition | declaration );
    public final void functions() throws RecognitionException {
        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:46:2: ( definition | declaration )
            int alt2=2;
            switch ( input.LA(1) ) {
            case TYPE_CHAR:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==LBRACKET) ) {
                        switch ( input.LA(4) ) {
                        case TYPE_CHAR:
                            {
                            int LA2_7 = input.LA(5);

                            if ( (LA2_7==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_7==COMMA||LA2_7==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 7, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_INT:
                            {
                            int LA2_8 = input.LA(5);

                            if ( (LA2_8==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_8==COMMA||LA2_8==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 8, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_STRING:
                            {
                            int LA2_9 = input.LA(5);

                            if ( (LA2_9==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_9==COMMA||LA2_9==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 9, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_VOID:
                            {
                            switch ( input.LA(5) ) {
                            case ID:
                                {
                                alt2=1;
                                }
                                break;
                            case RBRACKET:
                                {
                                int LA2_13 = input.LA(6);

                                if ( (LA2_13==LBRACE) ) {
                                    alt2=1;
                                }
                                else if ( (LA2_13==SEMICOLON) ) {
                                    alt2=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 13, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case COMMA:
                                {
                                alt2=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 10, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 6, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case TYPE_INT:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==ID) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==LBRACKET) ) {
                        switch ( input.LA(4) ) {
                        case TYPE_CHAR:
                            {
                            int LA2_7 = input.LA(5);

                            if ( (LA2_7==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_7==COMMA||LA2_7==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 7, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_INT:
                            {
                            int LA2_8 = input.LA(5);

                            if ( (LA2_8==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_8==COMMA||LA2_8==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 8, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_STRING:
                            {
                            int LA2_9 = input.LA(5);

                            if ( (LA2_9==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_9==COMMA||LA2_9==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 9, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_VOID:
                            {
                            switch ( input.LA(5) ) {
                            case ID:
                                {
                                alt2=1;
                                }
                                break;
                            case RBRACKET:
                                {
                                int LA2_13 = input.LA(6);

                                if ( (LA2_13==LBRACE) ) {
                                    alt2=1;
                                }
                                else if ( (LA2_13==SEMICOLON) ) {
                                    alt2=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 13, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case COMMA:
                                {
                                alt2=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 10, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 6, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case TYPE_STRING:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==ID) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==LBRACKET) ) {
                        switch ( input.LA(4) ) {
                        case TYPE_CHAR:
                            {
                            int LA2_7 = input.LA(5);

                            if ( (LA2_7==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_7==COMMA||LA2_7==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 7, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_INT:
                            {
                            int LA2_8 = input.LA(5);

                            if ( (LA2_8==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_8==COMMA||LA2_8==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 8, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_STRING:
                            {
                            int LA2_9 = input.LA(5);

                            if ( (LA2_9==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_9==COMMA||LA2_9==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 9, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_VOID:
                            {
                            switch ( input.LA(5) ) {
                            case ID:
                                {
                                alt2=1;
                                }
                                break;
                            case RBRACKET:
                                {
                                int LA2_13 = input.LA(6);

                                if ( (LA2_13==LBRACE) ) {
                                    alt2=1;
                                }
                                else if ( (LA2_13==SEMICOLON) ) {
                                    alt2=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 13, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case COMMA:
                                {
                                alt2=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 10, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 6, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            case TYPE_VOID:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==ID) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==LBRACKET) ) {
                        switch ( input.LA(4) ) {
                        case TYPE_CHAR:
                            {
                            int LA2_7 = input.LA(5);

                            if ( (LA2_7==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_7==COMMA||LA2_7==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 7, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_INT:
                            {
                            int LA2_8 = input.LA(5);

                            if ( (LA2_8==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_8==COMMA||LA2_8==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 8, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_STRING:
                            {
                            int LA2_9 = input.LA(5);

                            if ( (LA2_9==ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_9==COMMA||LA2_9==RBRACKET) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 9, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_VOID:
                            {
                            switch ( input.LA(5) ) {
                            case ID:
                                {
                                alt2=1;
                                }
                                break;
                            case RBRACKET:
                                {
                                int LA2_13 = input.LA(6);

                                if ( (LA2_13==LBRACE) ) {
                                    alt2=1;
                                }
                                else if ( (LA2_13==SEMICOLON) ) {
                                    alt2=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 13, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case COMMA:
                                {
                                alt2=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 10, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 6, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:46:4: definition
                    {
                    pushFollow(FOLLOW_definition_in_functions70);
                    definition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:47:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_functions75);
                    declaration();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functions"



    // $ANTLR start "declaration"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:49:1: declaration : dt= dataType ID LBRACKET ( declarationDataTypes ) RBRACKET SEMICOLON ;
    public final void declaration() throws RecognitionException {
        Token ID1=null;
        DataTypes dt =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:50:2: (dt= dataType ID LBRACKET ( declarationDataTypes ) RBRACKET SEMICOLON )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:50:4: dt= dataType ID LBRACKET ( declarationDataTypes ) RBRACKET SEMICOLON
            {
            pushFollow(FOLLOW_dataType_in_declaration86);
            dt=dataType();

            state._fsp--;


            ID1=(Token)match(input,ID,FOLLOW_ID_in_declaration88); 

            match(input,LBRACKET,FOLLOW_LBRACKET_in_declaration90); 

            SymbolTable.getInstance().pushLevel();

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:50:69: ( declarationDataTypes )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:50:70: declarationDataTypes
            {
            pushFollow(FOLLOW_declarationDataTypes_in_declaration95);
            declarationDataTypes();

            state._fsp--;


            }


            match(input,RBRACKET,FOLLOW_RBRACKET_in_declaration98); 

            SymbolTable.getInstance().addFunctionDeclaration(dt, (ID1!=null?ID1.getText():null));

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declaration102); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "declarationDataTypes"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:52:1: declarationDataTypes : dt= dataType ( COMMA dataType )* ;
    public final void declarationDataTypes() throws RecognitionException {
        DataTypes dt =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:53:2: (dt= dataType ( COMMA dataType )* )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:53:4: dt= dataType ( COMMA dataType )*
            {
            pushFollow(FOLLOW_dataType_in_declarationDataTypes113);
            dt=dataType();

            state._fsp--;


            SymbolTable.getInstance().addVariable(dt);

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:53:65: ( COMMA dataType )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:53:66: COMMA dataType
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_declarationDataTypes118); 

            	    pushFollow(FOLLOW_dataType_in_declarationDataTypes120);
            	    dataType();

            	    state._fsp--;


            	    SymbolTable.getInstance().addVariable(dt);

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declarationDataTypes"



    // $ANTLR start "definition"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:55:1: definition : dt= dataType ID LBRACKET ( functionArguments | TYPE_VOID ) RBRACKET codeBlock ;
    public final void definition() throws RecognitionException {
        Token ID2=null;
        DataTypes dt =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:56:2: (dt= dataType ID LBRACKET ( functionArguments | TYPE_VOID ) RBRACKET codeBlock )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:56:4: dt= dataType ID LBRACKET ( functionArguments | TYPE_VOID ) RBRACKET codeBlock
            {
            pushFollow(FOLLOW_dataType_in_definition135);
            dt=dataType();

            state._fsp--;


            ID2=(Token)match(input,ID,FOLLOW_ID_in_definition137); 

            match(input,LBRACKET,FOLLOW_LBRACKET_in_definition139); 

            SymbolTable.getInstance().pushLevel();

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:56:69: ( functionArguments | TYPE_VOID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= TYPE_CHAR && LA4_0 <= TYPE_STRING)) ) {
                alt4=1;
            }
            else if ( (LA4_0==TYPE_VOID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==ID) ) {
                    alt4=1;
                }
                else if ( (LA4_2==RBRACKET) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:56:70: functionArguments
                    {
                    pushFollow(FOLLOW_functionArguments_in_definition144);
                    functionArguments();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:56:88: TYPE_VOID
                    {
                    match(input,TYPE_VOID,FOLLOW_TYPE_VOID_in_definition146); 

                    }
                    break;

            }


            match(input,RBRACKET,FOLLOW_RBRACKET_in_definition149); 

            STEFunction el = SymbolTable.getInstance().addFunctionDefinition(dt, (ID2!=null?ID2.getText():null)); TACTable.getInstance().addFunction(el);

            pushFollow(FOLLOW_codeBlock_in_definition153);
            codeBlock();

            state._fsp--;


            ParserFactory.addEndFunction(el);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "definition"



    // $ANTLR start "functionArguments"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:58:1: functionArguments returns [SymbolTable value] : dt= dataType v= ID ( COMMA dt2= dataType v2= ID )* ;
    public final SymbolTable functionArguments() throws RecognitionException {
        SymbolTable value = null;


        Token v=null;
        Token v2=null;
        DataTypes dt =null;

        DataTypes dt2 =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:59:2: (dt= dataType v= ID ( COMMA dt2= dataType v2= ID )* )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:59:4: dt= dataType v= ID ( COMMA dt2= dataType v2= ID )*
            {
            pushFollow(FOLLOW_dataType_in_functionArguments170);
            dt=dataType();

            state._fsp--;


            v=(Token)match(input,ID,FOLLOW_ID_in_functionArguments174); 

            SymbolTable.getInstance().addVariable(dt, (v!=null?v.getText():null));

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:59:79: ( COMMA dt2= dataType v2= ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:59:80: COMMA dt2= dataType v2= ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_functionArguments179); 

            	    pushFollow(FOLLOW_dataType_in_functionArguments183);
            	    dt2=dataType();

            	    state._fsp--;


            	    v2=(Token)match(input,ID,FOLLOW_ID_in_functionArguments187); 

            	    SymbolTable.getInstance().addVariable(dt2, (v2!=null?v2.getText():null));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "functionArguments"



    // $ANTLR start "dataType"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:61:1: dataType returns [DataTypes dt] : ( TYPE_CHAR | TYPE_INT | TYPE_STRING | TYPE_VOID );
    public final DataTypes dataType() throws RecognitionException {
        DataTypes dt = null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:62:2: ( TYPE_CHAR | TYPE_INT | TYPE_STRING | TYPE_VOID )
            int alt6=4;
            switch ( input.LA(1) ) {
            case TYPE_CHAR:
                {
                alt6=1;
                }
                break;
            case TYPE_INT:
                {
                alt6=2;
                }
                break;
            case TYPE_STRING:
                {
                alt6=3;
                }
                break;
            case TYPE_VOID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:62:4: TYPE_CHAR
                    {
                    match(input,TYPE_CHAR,FOLLOW_TYPE_CHAR_in_dataType204); 

                     dt = DataTypes.CHAR; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:63:4: TYPE_INT
                    {
                    match(input,TYPE_INT,FOLLOW_TYPE_INT_in_dataType211); 

                     dt = DataTypes.INT; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:64:4: TYPE_STRING
                    {
                    match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_dataType218); 

                     dt = DataTypes.STRING; 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:65:4: TYPE_VOID
                    {
                    match(input,TYPE_VOID,FOLLOW_TYPE_VOID_in_dataType225); 

                     dt = DataTypes.VOID; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return dt;
    }
    // $ANTLR end "dataType"



    // $ANTLR start "variables"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:68:1: variables : dt= dataType v= ID ( COMMA v= ID )* SEMICOLON ;
    public final void variables() throws RecognitionException {
        Token v=null;
        DataTypes dt =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:69:2: (dt= dataType v= ID ( COMMA v= ID )* SEMICOLON )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:69:4: dt= dataType v= ID ( COMMA v= ID )* SEMICOLON
            {
            pushFollow(FOLLOW_dataType_in_variables240);
            dt=dataType();

            state._fsp--;


            v=(Token)match(input,ID,FOLLOW_ID_in_variables244); 

             STEVariable el = SymbolTable.getInstance().addVariable(dt, (v!=null?v.getText():null)); TACTable.getInstance().addVariable(el); 

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:69:138: ( COMMA v= ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:69:139: COMMA v= ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_variables249); 

            	    v=(Token)match(input,ID,FOLLOW_ID_in_variables253); 

            	     el = SymbolTable.getInstance().addVariable(dt, (v!=null?v.getText():null)); TACTable.getInstance().addVariable(el); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variables259); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "variables"



    // $ANTLR start "codeBlock"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:71:1: codeBlock returns [SymbolTableLevel value] : LBRACE ( statement )* RBRACE ;
    public final SymbolTableLevel codeBlock() throws RecognitionException {
        SymbolTableLevel value = null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:72:2: ( LBRACE ( statement )* RBRACE )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:72:4: LBRACE ( statement )* RBRACE
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_codeBlock272); 

            SymbolTable.getInstance().pushLevel();

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:72:52: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DO||(LA8_0 >= ID && LA8_0 <= IF)||LA8_0==LBRACE||LA8_0==RETURN||(LA8_0 >= TYPE_CHAR && LA8_0 <= WHILE)||LA8_0==45||LA8_0==49) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:72:52: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_codeBlock276);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_codeBlock279); 

            value = SymbolTable.getInstance().popLevel();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "codeBlock"



    // $ANTLR start "statement"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:74:1: statement : ( variables | whileStmt | doWhileStmt | ifElseStmt | returnStmt | assignStmt | procedureStmt | codeBlock );
    public final void statement() throws RecognitionException {
        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:75:2: ( variables | whileStmt | doWhileStmt | ifElseStmt | returnStmt | assignStmt | procedureStmt | codeBlock )
            int alt9=8;
            switch ( input.LA(1) ) {
            case TYPE_CHAR:
            case TYPE_INT:
            case TYPE_STRING:
            case TYPE_VOID:
                {
                alt9=1;
                }
                break;
            case WHILE:
                {
                alt9=2;
                }
                break;
            case DO:
                {
                alt9=3;
                }
                break;
            case IF:
                {
                alt9=4;
                }
                break;
            case RETURN:
                {
                alt9=5;
                }
                break;
            case ID:
                {
                int LA9_6 = input.LA(2);

                if ( (LA9_6==EQUAL) ) {
                    alt9=6;
                }
                else if ( (LA9_6==LBRACKET) ) {
                    alt9=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 6, input);

                    throw nvae;

                }
                }
                break;
            case 45:
            case 49:
                {
                alt9=7;
                }
                break;
            case LBRACE:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:75:4: variables
                    {
                    pushFollow(FOLLOW_variables_in_statement290);
                    variables();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:76:4: whileStmt
                    {
                    pushFollow(FOLLOW_whileStmt_in_statement295);
                    whileStmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:77:4: doWhileStmt
                    {
                    pushFollow(FOLLOW_doWhileStmt_in_statement300);
                    doWhileStmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:78:4: ifElseStmt
                    {
                    pushFollow(FOLLOW_ifElseStmt_in_statement305);
                    ifElseStmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:79:4: returnStmt
                    {
                    pushFollow(FOLLOW_returnStmt_in_statement310);
                    returnStmt();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:80:4: assignStmt
                    {
                    pushFollow(FOLLOW_assignStmt_in_statement315);
                    assignStmt();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:81:4: procedureStmt
                    {
                    pushFollow(FOLLOW_procedureStmt_in_statement320);
                    procedureStmt();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:82:4: codeBlock
                    {
                    pushFollow(FOLLOW_codeBlock_in_statement325);
                    codeBlock();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "whileStmt"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:85:1: whileStmt : WHILE LBRACKET e= expression RBRACKET codeBlock ;
    public final void whileStmt() throws RecognitionException {
        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:86:2: ( WHILE LBRACKET e= expression RBRACKET codeBlock )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:86:4: WHILE LBRACKET e= expression RBRACKET codeBlock
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStmt336); 

            match(input,LBRACKET,FOLLOW_LBRACKET_in_whileStmt338); 

            String label = TACTable.createLabel(); STEVariable compare = TACTable.getInstance().addWhileStart(label);

            pushFollow(FOLLOW_expression_in_whileStmt344);
            e=expression();

            state._fsp--;


            String label2 = TACTable.getInstance().addWhileCondition((STEVariable)e, compare);

            match(input,RBRACKET,FOLLOW_RBRACKET_in_whileStmt348); 

            pushFollow(FOLLOW_codeBlock_in_whileStmt350);
            codeBlock();

            state._fsp--;


            TACTable.getInstance().addWhileEnd(label, label2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whileStmt"



    // $ANTLR start "doWhileStmt"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:88:1: doWhileStmt : DO codeBlock WHILE LBRACKET e= expression RBRACKET SEMICOLON ;
    public final void doWhileStmt() throws RecognitionException {
        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:89:2: ( DO codeBlock WHILE LBRACKET e= expression RBRACKET SEMICOLON )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:89:4: DO codeBlock WHILE LBRACKET e= expression RBRACKET SEMICOLON
            {
            match(input,DO,FOLLOW_DO_in_doWhileStmt361); 

            String label = TACTable.createLabel(); STEVariable compare = TACTable.getInstance().addWhileStart(label);

            pushFollow(FOLLOW_codeBlock_in_doWhileStmt365);
            codeBlock();

            state._fsp--;


            match(input,WHILE,FOLLOW_WHILE_in_doWhileStmt367); 

            match(input,LBRACKET,FOLLOW_LBRACKET_in_doWhileStmt369); 

            pushFollow(FOLLOW_expression_in_doWhileStmt373);
            e=expression();

            state._fsp--;


            String label2 = TACTable.getInstance().addWhileCondition((STEVariable)e, compare);

            TACTable.getInstance().addWhileEnd(label, label2);

            match(input,RBRACKET,FOLLOW_RBRACKET_in_doWhileStmt379); 

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_doWhileStmt381); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "doWhileStmt"



    // $ANTLR start "ifElseStmt"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:91:1: ifElseStmt : IF LBRACKET e= expression RBRACKET a= codeBlock ELSE b= codeBlock ;
    public final void ifElseStmt() throws RecognitionException {
        SymbolTableElement e =null;

        SymbolTableLevel a =null;

        SymbolTableLevel b =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:92:2: ( IF LBRACKET e= expression RBRACKET a= codeBlock ELSE b= codeBlock )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:92:4: IF LBRACKET e= expression RBRACKET a= codeBlock ELSE b= codeBlock
            {
            match(input,IF,FOLLOW_IF_in_ifElseStmt390); 

            match(input,LBRACKET,FOLLOW_LBRACKET_in_ifElseStmt392); 

            pushFollow(FOLLOW_expression_in_ifElseStmt396);
            e=expression();

            state._fsp--;


            String label = ParserFactory.addIf((STEVariable)e);

            match(input,RBRACKET,FOLLOW_RBRACKET_in_ifElseStmt400); 

            pushFollow(FOLLOW_codeBlock_in_ifElseStmt404);
            a=codeBlock();

            state._fsp--;


            match(input,ELSE,FOLLOW_ELSE_in_ifElseStmt406); 

            String label2 = TACTable.getInstance().addElse(label);

            pushFollow(FOLLOW_codeBlock_in_ifElseStmt412);
            b=codeBlock();

            state._fsp--;


            TACTable.getInstance().addIfElseEnd(label2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ifElseStmt"



    // $ANTLR start "returnStmt"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:94:1: returnStmt : ( RETURN e= expression SEMICOLON | RETURN SEMICOLON );
    public final void returnStmt() throws RecognitionException {
        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:95:2: ( RETURN e= expression SEMICOLON | RETURN SEMICOLON )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RETURN) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==SEMICOLON) ) {
                    alt10=2;
                }
                else if ( (LA10_1==CHAR||LA10_1==ID||LA10_1==INT||LA10_1==LBRACKET||LA10_1==STRING||LA10_1==34||LA10_1==44||(LA10_1 >= 46 && LA10_1 <= 48)||LA10_1==50) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:95:4: RETURN e= expression SEMICOLON
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_returnStmt423); 

                    pushFollow(FOLLOW_expression_in_returnStmt427);
                    e=expression();

                    state._fsp--;


                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnStmt429); 

                    ParserFactory.addReturn((STEVariable)e);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:96:4: RETURN SEMICOLON
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_returnStmt436); 

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnStmt438); 

                    ParserFactory.addReturn(null);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "returnStmt"



    // $ANTLR start "assignStmt"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:98:1: assignStmt : ID EQUAL e= expression SEMICOLON ;
    public final void assignStmt() throws RecognitionException {
        Token ID3=null;
        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:99:2: ( ID EQUAL e= expression SEMICOLON )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:99:4: ID EQUAL e= expression SEMICOLON
            {
            ID3=(Token)match(input,ID,FOLLOW_ID_in_assignStmt449); 

            match(input,EQUAL,FOLLOW_EQUAL_in_assignStmt451); 

            pushFollow(FOLLOW_expression_in_assignStmt455);
            e=expression();

            state._fsp--;


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignStmt457); 

            ParserFactory.assignVariable((ID3!=null?ID3.getText():null), e);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignStmt"



    // $ANTLR start "expression"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:101:1: expression returns [SymbolTableElement value] : a= andExpr ( '||' b= andExpr )* ;
    public final SymbolTableElement expression() throws RecognitionException {
        SymbolTableElement value = null;


        SymbolTableElement a =null;

        SymbolTableElement b =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:102:2: (a= andExpr ( '||' b= andExpr )* )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:102:4: a= andExpr ( '||' b= andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_expression474);
            a=andExpr();

            state._fsp--;


            value = a;

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:102:35: ( '||' b= andExpr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==51) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:103:4: '||' b= andExpr
            	    {
            	    match(input,51,FOLLOW_51_in_expression483); 

            	    pushFollow(FOLLOW_andExpr_in_expression487);
            	    b=andExpr();

            	    state._fsp--;


            	    value = ParserFactory.orExpr(a, b);

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expression"



    // $ANTLR start "andExpr"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:106:1: andExpr returns [SymbolTableElement value] : e= eqExpr ( '&&' e= eqExpr )* ;
    public final SymbolTableElement andExpr() throws RecognitionException {
        SymbolTableElement value = null;


        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:107:2: (e= eqExpr ( '&&' e= eqExpr )* )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:107:4: e= eqExpr ( '&&' e= eqExpr )*
            {
            pushFollow(FOLLOW_eqExpr_in_andExpr509);
            e=eqExpr();

            state._fsp--;


            value = e;

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:107:34: ( '&&' e= eqExpr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:108:4: '&&' e= eqExpr
            	    {
            	    match(input,37,FOLLOW_37_in_andExpr518); 

            	    pushFollow(FOLLOW_eqExpr_in_andExpr522);
            	    e=eqExpr();

            	    state._fsp--;


            	    value = ParserFactory.andExpr(value, e);

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "andExpr"



    // $ANTLR start "eqExpr"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:111:1: eqExpr returns [SymbolTableElement value] : e= cmpExpr ( '==' e= cmpExpr | '!=' e= cmpExpr )? ;
    public final SymbolTableElement eqExpr() throws RecognitionException {
        SymbolTableElement value = null;


        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:112:2: (e= cmpExpr ( '==' e= cmpExpr | '!=' e= cmpExpr )? )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:112:4: e= cmpExpr ( '==' e= cmpExpr | '!=' e= cmpExpr )?
            {
            pushFollow(FOLLOW_cmpExpr_in_eqExpr544);
            e=cmpExpr();

            state._fsp--;


            value = e;

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:112:35: ( '==' e= cmpExpr | '!=' e= cmpExpr )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:113:4: '==' e= cmpExpr
                    {
                    match(input,41,FOLLOW_41_in_eqExpr553); 

                    pushFollow(FOLLOW_cmpExpr_in_eqExpr557);
                    e=cmpExpr();

                    state._fsp--;


                    value = ParserFactory.eqExpr(value, e);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:114:5: '!=' e= cmpExpr
                    {
                    match(input,35,FOLLOW_35_in_eqExpr565); 

                    pushFollow(FOLLOW_cmpExpr_in_eqExpr569);
                    e=cmpExpr();

                    state._fsp--;


                    value = ParserFactory.notEqExpr(value, e);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "eqExpr"



    // $ANTLR start "cmpExpr"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:117:1: cmpExpr returns [SymbolTableElement value] : a= plusExpr ( '<' b= plusExpr | '<=' b= plusExpr | '>' b= plusExpr | '>=' b= plusExpr )* ;
    public final SymbolTableElement cmpExpr() throws RecognitionException {
        SymbolTableElement value = null;


        SymbolTableElement a =null;

        SymbolTableElement b =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:118:2: (a= plusExpr ( '<' b= plusExpr | '<=' b= plusExpr | '>' b= plusExpr | '>=' b= plusExpr )* )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:118:4: a= plusExpr ( '<' b= plusExpr | '<=' b= plusExpr | '>' b= plusExpr | '>=' b= plusExpr )*
            {
            pushFollow(FOLLOW_plusExpr_in_cmpExpr591);
            a=plusExpr();

            state._fsp--;


            value = a;

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:118:36: ( '<' b= plusExpr | '<=' b= plusExpr | '>' b= plusExpr | '>=' b= plusExpr )*
            loop14:
            do {
                int alt14=5;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    alt14=1;
                    }
                    break;
                case 40:
                    {
                    alt14=2;
                    }
                    break;
                case 42:
                    {
                    alt14=3;
                    }
                    break;
                case 43:
                    {
                    alt14=4;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:119:4: '<' b= plusExpr
            	    {
            	    match(input,39,FOLLOW_39_in_cmpExpr600); 

            	    pushFollow(FOLLOW_plusExpr_in_cmpExpr604);
            	    b=plusExpr();

            	    state._fsp--;


            	    value = ParserFactory.lessExpr(a, b);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:120:5: '<=' b= plusExpr
            	    {
            	    match(input,40,FOLLOW_40_in_cmpExpr612); 

            	    pushFollow(FOLLOW_plusExpr_in_cmpExpr616);
            	    b=plusExpr();

            	    state._fsp--;


            	    value = ParserFactory.lessEqExpr(a, b);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:121:5: '>' b= plusExpr
            	    {
            	    match(input,42,FOLLOW_42_in_cmpExpr624); 

            	    pushFollow(FOLLOW_plusExpr_in_cmpExpr628);
            	    b=plusExpr();

            	    state._fsp--;


            	    value = ParserFactory.greaterExpr(a, b);

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:122:5: '>=' b= plusExpr
            	    {
            	    match(input,43,FOLLOW_43_in_cmpExpr636); 

            	    pushFollow(FOLLOW_plusExpr_in_cmpExpr640);
            	    b=plusExpr();

            	    state._fsp--;


            	    value = ParserFactory.greaterEqExpr(a, b);

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "cmpExpr"



    // $ANTLR start "plusExpr"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:126:1: plusExpr returns [SymbolTableElement value] : e= multExpr ( PLUS e= multExpr | MINUS e= multExpr )* ;
    public final SymbolTableElement plusExpr() throws RecognitionException {
        SymbolTableElement value = null;


        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:127:2: (e= multExpr ( PLUS e= multExpr | MINUS e= multExpr )* )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:127:4: e= multExpr ( PLUS e= multExpr | MINUS e= multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_plusExpr663);
            e=multExpr();

            state._fsp--;


            value = e;

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:127:36: ( PLUS e= multExpr | MINUS e= multExpr )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==PLUS) ) {
                    alt15=1;
                }
                else if ( (LA15_0==MINUS) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:128:4: PLUS e= multExpr
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_plusExpr672); 

            	    pushFollow(FOLLOW_multExpr_in_plusExpr676);
            	    e=multExpr();

            	    state._fsp--;


            	    value = ParserFactory.plusExpr(value, e);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:129:5: MINUS e= multExpr
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_plusExpr684); 

            	    pushFollow(FOLLOW_multExpr_in_plusExpr688);
            	    e=multExpr();

            	    state._fsp--;


            	    value = ParserFactory.minusExpr(value, e);

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "plusExpr"



    // $ANTLR start "multExpr"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:132:1: multExpr returns [SymbolTableElement value] : e= notExpr ( MULTIPLY e= notExpr | '/' e= notExpr | '%' e= notExpr )* ;
    public final SymbolTableElement multExpr() throws RecognitionException {
        SymbolTableElement value = null;


        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:133:2: (e= notExpr ( MULTIPLY e= notExpr | '/' e= notExpr | '%' e= notExpr )* )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:133:4: e= notExpr ( MULTIPLY e= notExpr | '/' e= notExpr | '%' e= notExpr )*
            {
            pushFollow(FOLLOW_notExpr_in_multExpr710);
            e=notExpr();

            state._fsp--;


            value = e;

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:133:35: ( MULTIPLY e= notExpr | '/' e= notExpr | '%' e= notExpr )*
            loop16:
            do {
                int alt16=4;
                switch ( input.LA(1) ) {
                case MULTIPLY:
                    {
                    alt16=1;
                    }
                    break;
                case 38:
                    {
                    alt16=2;
                    }
                    break;
                case 36:
                    {
                    alt16=3;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:134:4: MULTIPLY e= notExpr
            	    {
            	    match(input,MULTIPLY,FOLLOW_MULTIPLY_in_multExpr719); 

            	    pushFollow(FOLLOW_notExpr_in_multExpr723);
            	    e=notExpr();

            	    state._fsp--;


            	    value = ParserFactory.multExpr(value, e);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:135:5: '/' e= notExpr
            	    {
            	    match(input,38,FOLLOW_38_in_multExpr731); 

            	    pushFollow(FOLLOW_notExpr_in_multExpr735);
            	    e=notExpr();

            	    state._fsp--;


            	    value = ParserFactory.divideExpr(value, e);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:136:5: '%' e= notExpr
            	    {
            	    match(input,36,FOLLOW_36_in_multExpr743); 

            	    pushFollow(FOLLOW_notExpr_in_multExpr747);
            	    e=notExpr();

            	    state._fsp--;


            	    value = ParserFactory.moduloExpr(value, e);

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "notExpr"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:139:1: notExpr returns [SymbolTableElement value] : ( '!' a= reTypeExpr |a= reTypeExpr );
    public final SymbolTableElement notExpr() throws RecognitionException {
        SymbolTableElement value = null;


        SymbolTableElement a =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:140:2: ( '!' a= reTypeExpr |a= reTypeExpr )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==CHAR||LA17_0==ID||LA17_0==INT||LA17_0==LBRACKET||LA17_0==STRING||LA17_0==44||(LA17_0 >= 46 && LA17_0 <= 48)||LA17_0==50) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:140:4: '!' a= reTypeExpr
                    {
                    match(input,34,FOLLOW_34_in_notExpr767); 

                    pushFollow(FOLLOW_reTypeExpr_in_notExpr771);
                    a=reTypeExpr();

                    state._fsp--;


                    value = ParserFactory.notExpr(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:141:4: a= reTypeExpr
                    {
                    pushFollow(FOLLOW_reTypeExpr_in_notExpr780);
                    a=reTypeExpr();

                    state._fsp--;


                    value = a;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "notExpr"



    // $ANTLR start "reTypeExpr"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:143:1: reTypeExpr returns [SymbolTableElement value] : ( LBRACKET dataType RBRACKET e= atom | atom );
    public final SymbolTableElement reTypeExpr() throws RecognitionException {
        SymbolTableElement value = null;


        SymbolTableElement e =null;

        DataTypes dataType4 =null;

        SymbolTableElement atom5 =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:144:2: ( LBRACKET dataType RBRACKET e= atom | atom )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LBRACKET) ) {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1 >= TYPE_CHAR && LA18_1 <= TYPE_VOID)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==CHAR||LA18_1==ID||LA18_1==INT||LA18_1==LBRACKET||LA18_1==STRING||LA18_1==34||LA18_1==44||(LA18_1 >= 46 && LA18_1 <= 48)||LA18_1==50) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA18_0==CHAR||LA18_0==ID||LA18_0==INT||LA18_0==STRING||LA18_0==44||(LA18_0 >= 46 && LA18_0 <= 48)||LA18_0==50) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:144:4: LBRACKET dataType RBRACKET e= atom
                    {
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_reTypeExpr795); 

                    pushFollow(FOLLOW_dataType_in_reTypeExpr797);
                    dataType4=dataType();

                    state._fsp--;


                    match(input,RBRACKET,FOLLOW_RBRACKET_in_reTypeExpr799); 

                    pushFollow(FOLLOW_atom_in_reTypeExpr803);
                    e=atom();

                    state._fsp--;


                    value = ParserFactory.reType(dataType4, e);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:145:4: atom
                    {
                    pushFollow(FOLLOW_atom_in_reTypeExpr810);
                    atom5=atom();

                    state._fsp--;


                    value = atom5;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "reTypeExpr"



    // $ANTLR start "atom"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:148:1: atom returns [SymbolTableElement value] : ( INT |c= customFunctionStmt | ID | STRING | CHAR | 'read_char()' | 'read_int()' | 'read_string()' | 'get_at' LBRACKET ID COMMA e= expression RBRACKET | 'strcat' LBRACKET a= expression COMMA b= expression RBRACKET | LBRACKET e= expression RBRACKET );
    public final SymbolTableElement atom() throws RecognitionException {
        SymbolTableElement value = null;


        Token INT6=null;
        Token ID7=null;
        Token STRING8=null;
        Token CHAR9=null;
        Token ID10=null;
        SymbolTableElement c =null;

        SymbolTableElement e =null;

        SymbolTableElement a =null;

        SymbolTableElement b =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:149:2: ( INT |c= customFunctionStmt | ID | STRING | CHAR | 'read_char()' | 'read_int()' | 'read_string()' | 'get_at' LBRACKET ID COMMA e= expression RBRACKET | 'strcat' LBRACKET a= expression COMMA b= expression RBRACKET | LBRACKET e= expression RBRACKET )
            int alt19=11;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt19=1;
                }
                break;
            case ID:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==LBRACKET) ) {
                    alt19=2;
                }
                else if ( (LA19_2==COMMA||(LA19_2 >= MINUS && LA19_2 <= MULTIPLY)||LA19_2==PLUS||LA19_2==RBRACKET||LA19_2==SEMICOLON||(LA19_2 >= 35 && LA19_2 <= 43)||LA19_2==51) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                alt19=4;
                }
                break;
            case CHAR:
                {
                alt19=5;
                }
                break;
            case 46:
                {
                alt19=6;
                }
                break;
            case 47:
                {
                alt19=7;
                }
                break;
            case 48:
                {
                alt19=8;
                }
                break;
            case 44:
                {
                alt19=9;
                }
                break;
            case 50:
                {
                alt19=10;
                }
                break;
            case LBRACKET:
                {
                alt19=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:149:4: INT
                    {
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_atom827); 

                    value = ParserFactory.addInt(Integer.parseInt((INT6!=null?INT6.getText():null)));

                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:150:4: c= customFunctionStmt
                    {
                    pushFollow(FOLLOW_customFunctionStmt_in_atom836);
                    c=customFunctionStmt();

                    state._fsp--;


                    value =c;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:151:4: ID
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_atom843); 

                    value = SymbolTable.getInstance().findAndReturn((ID7!=null?ID7.getText():null));

                    }
                    break;
                case 4 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:152:4: STRING
                    {
                    STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_atom850); 

                    value = ParserFactory.addString((STRING8!=null?STRING8.getText():null));

                    }
                    break;
                case 5 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:153:4: CHAR
                    {
                    CHAR9=(Token)match(input,CHAR,FOLLOW_CHAR_in_atom857); 

                    value = ParserFactory.addChar((CHAR9!=null?CHAR9.getText():null));

                    }
                    break;
                case 6 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:154:4: 'read_char()'
                    {
                    match(input,46,FOLLOW_46_in_atom864); 

                    value = ParserFactory.addReadChar();

                    }
                    break;
                case 7 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:155:4: 'read_int()'
                    {
                    match(input,47,FOLLOW_47_in_atom871); 

                    value = ParserFactory.addReadInt();

                    }
                    break;
                case 8 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:156:4: 'read_string()'
                    {
                    match(input,48,FOLLOW_48_in_atom878); 

                    value = ParserFactory.addReadString();

                    }
                    break;
                case 9 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:157:4: 'get_at' LBRACKET ID COMMA e= expression RBRACKET
                    {
                    match(input,44,FOLLOW_44_in_atom885); 

                    match(input,LBRACKET,FOLLOW_LBRACKET_in_atom887); 

                    ID10=(Token)match(input,ID,FOLLOW_ID_in_atom889); 

                    match(input,COMMA,FOLLOW_COMMA_in_atom891); 

                    pushFollow(FOLLOW_expression_in_atom895);
                    e=expression();

                    state._fsp--;


                    match(input,RBRACKET,FOLLOW_RBRACKET_in_atom897); 

                    value = ParserFactory.addGetAt((ID10!=null?ID10.getText():null), e);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:158:4: 'strcat' LBRACKET a= expression COMMA b= expression RBRACKET
                    {
                    match(input,50,FOLLOW_50_in_atom904); 

                    match(input,LBRACKET,FOLLOW_LBRACKET_in_atom906); 

                    pushFollow(FOLLOW_expression_in_atom910);
                    a=expression();

                    state._fsp--;


                    match(input,COMMA,FOLLOW_COMMA_in_atom912); 

                    pushFollow(FOLLOW_expression_in_atom916);
                    b=expression();

                    state._fsp--;


                    match(input,RBRACKET,FOLLOW_RBRACKET_in_atom918); 

                    value = ParserFactory.addStrcat(a, b);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:159:4: LBRACKET e= expression RBRACKET
                    {
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_atom925); 

                    pushFollow(FOLLOW_expression_in_atom929);
                    e=expression();

                    state._fsp--;


                    match(input,RBRACKET,FOLLOW_RBRACKET_in_atom931); 

                    value = e;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "atom"



    // $ANTLR start "procedureStmt"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:162:1: procedureStmt : ( 'print' LBRACKET e= expression ( COMMA e= expression )* RBRACKET SEMICOLON | 'set_at' LBRACKET ID COMMA e= expression COMMA CHAR RBRACKET SEMICOLON | customProcedureStmt SEMICOLON );
    public final void procedureStmt() throws RecognitionException {
        Token ID11=null;
        Token CHAR12=null;
        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:163:2: ( 'print' LBRACKET e= expression ( COMMA e= expression )* RBRACKET SEMICOLON | 'set_at' LBRACKET ID COMMA e= expression COMMA CHAR RBRACKET SEMICOLON | customProcedureStmt SEMICOLON )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt21=1;
                }
                break;
            case 49:
                {
                alt21=2;
                }
                break;
            case ID:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:163:4: 'print' LBRACKET e= expression ( COMMA e= expression )* RBRACKET SEMICOLON
                    {
                    match(input,45,FOLLOW_45_in_procedureStmt944); 

                    match(input,LBRACKET,FOLLOW_LBRACKET_in_procedureStmt946); 

                    pushFollow(FOLLOW_expression_in_procedureStmt950);
                    e=expression();

                    state._fsp--;


                    TACTable.getInstance().addPrint((STEVariable)e);

                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:163:92: ( COMMA e= expression )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:163:93: COMMA e= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_procedureStmt955); 

                    	    pushFollow(FOLLOW_expression_in_procedureStmt959);
                    	    e=expression();

                    	    state._fsp--;


                    	    TACTable.getInstance().addPrint((STEVariable)e);

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    match(input,RBRACKET,FOLLOW_RBRACKET_in_procedureStmt965); 

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_procedureStmt967); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:164:4: 'set_at' LBRACKET ID COMMA e= expression COMMA CHAR RBRACKET SEMICOLON
                    {
                    match(input,49,FOLLOW_49_in_procedureStmt972); 

                    match(input,LBRACKET,FOLLOW_LBRACKET_in_procedureStmt974); 

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_procedureStmt976); 

                    match(input,COMMA,FOLLOW_COMMA_in_procedureStmt978); 

                    pushFollow(FOLLOW_expression_in_procedureStmt982);
                    e=expression();

                    state._fsp--;


                    match(input,COMMA,FOLLOW_COMMA_in_procedureStmt984); 

                    CHAR12=(Token)match(input,CHAR,FOLLOW_CHAR_in_procedureStmt986); 

                    match(input,RBRACKET,FOLLOW_RBRACKET_in_procedureStmt988); 

                    ParserFactory.addSetAt((ID11!=null?ID11.getText():null), e, (CHAR12!=null?CHAR12.getText():null));

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_procedureStmt992); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:165:4: customProcedureStmt SEMICOLON
                    {
                    pushFollow(FOLLOW_customProcedureStmt_in_procedureStmt997);
                    customProcedureStmt();

                    state._fsp--;


                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_procedureStmt999); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "procedureStmt"



    // $ANTLR start "customFunctionStmt"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:168:1: customFunctionStmt returns [SymbolTableElement value] : ID LBRACKET (e= expression ( COMMA e= expression )* )? RBRACKET ;
    public final SymbolTableElement customFunctionStmt() throws RecognitionException {
        SymbolTableElement value = null;


        Token ID13=null;
        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:169:2: ( ID LBRACKET (e= expression ( COMMA e= expression )* )? RBRACKET )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:169:4: ID LBRACKET (e= expression ( COMMA e= expression )* )? RBRACKET
            {
            ID13=(Token)match(input,ID,FOLLOW_ID_in_customFunctionStmt1014); 

            value = SymbolTable.getInstance().findFunctionAndReturn((ID13!=null?ID13.getText():null));

            match(input,LBRACKET,FOLLOW_LBRACKET_in_customFunctionStmt1018); 

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:169:86: (e= expression ( COMMA e= expression )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==CHAR||LA23_0==ID||LA23_0==INT||LA23_0==LBRACKET||LA23_0==STRING||LA23_0==34||LA23_0==44||(LA23_0 >= 46 && LA23_0 <= 48)||LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:169:87: e= expression ( COMMA e= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_customFunctionStmt1023);
                    e=expression();

                    state._fsp--;


                    SymbolTable.getInstance().addFunctionParam((STEFunction)value, e);

                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:169:177: ( COMMA e= expression )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==COMMA) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:169:178: COMMA e= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_customFunctionStmt1028); 

                    	    pushFollow(FOLLOW_expression_in_customFunctionStmt1032);
                    	    e=expression();

                    	    state._fsp--;


                    	    SymbolTable.getInstance().addFunctionParam((STEFunction)value, e);

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACKET,FOLLOW_RBRACKET_in_customFunctionStmt1040); 

            value = TACTable.getInstance().addFunctionCall((STEFunction)value);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "customFunctionStmt"



    // $ANTLR start "customProcedureStmt"
    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:172:1: customProcedureStmt returns [SymbolTableElement value] : ID LBRACKET (e= expression ( COMMA e= expression )* )? RBRACKET ;
    public final SymbolTableElement customProcedureStmt() throws RecognitionException {
        SymbolTableElement value = null;


        Token ID14=null;
        SymbolTableElement e =null;


        try {
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:173:2: ( ID LBRACKET (e= expression ( COMMA e= expression )* )? RBRACKET )
            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:173:4: ID LBRACKET (e= expression ( COMMA e= expression )* )? RBRACKET
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_customProcedureStmt1057); 

            value = SymbolTable.getInstance().findFunctionAndReturn((ID14!=null?ID14.getText():null));

            match(input,LBRACKET,FOLLOW_LBRACKET_in_customProcedureStmt1061); 

            // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:173:86: (e= expression ( COMMA e= expression )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==CHAR||LA25_0==ID||LA25_0==INT||LA25_0==LBRACKET||LA25_0==STRING||LA25_0==34||LA25_0==44||(LA25_0 >= 46 && LA25_0 <= 48)||LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:173:87: e= expression ( COMMA e= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_customProcedureStmt1066);
                    e=expression();

                    state._fsp--;


                    SymbolTable.getInstance().addFunctionParam((STEFunction)value, e);

                    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:173:177: ( COMMA e= expression )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==COMMA) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\Users\\Milan\\Documents\\VUT\\VYPe\\projekt\\VYP01\\frontend\\src\\vype12\\VYPe12.g:173:178: COMMA e= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_customProcedureStmt1071); 

                    	    pushFollow(FOLLOW_expression_in_customProcedureStmt1075);
                    	    e=expression();

                    	    state._fsp--;


                    	    SymbolTable.getInstance().addFunctionParam((STEFunction)value, e);

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACKET,FOLLOW_RBRACKET_in_customProcedureStmt1083); 

            TACTable.getInstance().addProcedureCall((STEFunction)value); value = null;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "customProcedureStmt"

    // Delegated rules


 

    public static final BitSet FOLLOW_global_in_vype1251 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_EOF_in_vype1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functions_in_global61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_in_functions70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_functions75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataType_in_declaration86 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_declaration88 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_declaration90 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_declarationDataTypes_in_declaration95 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_declaration98 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_declaration102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataType_in_declarationDataTypes113 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_declarationDataTypes118 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_dataType_in_declarationDataTypes120 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_dataType_in_definition135 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_definition137 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_definition139 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_functionArguments_in_definition144 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_TYPE_VOID_in_definition146 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_definition149 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_codeBlock_in_definition153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataType_in_functionArguments170 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_functionArguments174 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_functionArguments179 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_dataType_in_functionArguments183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_functionArguments187 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_TYPE_CHAR_in_dataType204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_INT_in_dataType211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_STRING_in_dataType218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_VOID_in_dataType225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataType_in_variables240 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_variables244 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_COMMA_in_variables249 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_variables253 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_SEMICOLON_in_variables259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_codeBlock272 = new BitSet(new long[]{0x00022001F282C080L});
    public static final BitSet FOLLOW_statement_in_codeBlock276 = new BitSet(new long[]{0x00022001F282C080L});
    public static final BitSet FOLLOW_RBRACE_in_codeBlock279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_statement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStmt_in_statement295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileStmt_in_statement300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifElseStmt_in_statement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStmt_in_statement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStmt_in_statement315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureStmt_in_statement320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_codeBlock_in_statement325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStmt336 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_whileStmt338 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_whileStmt344 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_whileStmt348 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_codeBlock_in_whileStmt350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doWhileStmt361 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_codeBlock_in_doWhileStmt365 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WHILE_in_doWhileStmt367 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_doWhileStmt369 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_doWhileStmt373 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_doWhileStmt379 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_doWhileStmt381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifElseStmt390 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_ifElseStmt392 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_ifElseStmt396 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_ifElseStmt400 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_codeBlock_in_ifElseStmt404 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ELSE_in_ifElseStmt406 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_codeBlock_in_ifElseStmt412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStmt423 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_returnStmt427 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnStmt429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStmt436 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnStmt438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignStmt449 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUAL_in_assignStmt451 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_assignStmt455 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignStmt457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_expression474 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_expression483 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_andExpr_in_expression487 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_eqExpr_in_andExpr509 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_andExpr518 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_eqExpr_in_andExpr522 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_cmpExpr_in_eqExpr544 = new BitSet(new long[]{0x0000020800000002L});
    public static final BitSet FOLLOW_41_in_eqExpr553 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_cmpExpr_in_eqExpr557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_eqExpr565 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_cmpExpr_in_eqExpr569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusExpr_in_cmpExpr591 = new BitSet(new long[]{0x00000D8000000002L});
    public static final BitSet FOLLOW_39_in_cmpExpr600 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_plusExpr_in_cmpExpr604 = new BitSet(new long[]{0x00000D8000000002L});
    public static final BitSet FOLLOW_40_in_cmpExpr612 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_plusExpr_in_cmpExpr616 = new BitSet(new long[]{0x00000D8000000002L});
    public static final BitSet FOLLOW_42_in_cmpExpr624 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_plusExpr_in_cmpExpr628 = new BitSet(new long[]{0x00000D8000000002L});
    public static final BitSet FOLLOW_43_in_cmpExpr636 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_plusExpr_in_cmpExpr640 = new BitSet(new long[]{0x00000D8000000002L});
    public static final BitSet FOLLOW_multExpr_in_plusExpr663 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_PLUS_in_plusExpr672 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_multExpr_in_plusExpr676 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_MINUS_in_plusExpr684 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_multExpr_in_plusExpr688 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_notExpr_in_multExpr710 = new BitSet(new long[]{0x0000005000100002L});
    public static final BitSet FOLLOW_MULTIPLY_in_multExpr719 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_notExpr_in_multExpr723 = new BitSet(new long[]{0x0000005000100002L});
    public static final BitSet FOLLOW_38_in_multExpr731 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_notExpr_in_multExpr735 = new BitSet(new long[]{0x0000005000100002L});
    public static final BitSet FOLLOW_36_in_multExpr743 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_notExpr_in_multExpr747 = new BitSet(new long[]{0x0000005000100002L});
    public static final BitSet FOLLOW_34_in_notExpr767 = new BitSet(new long[]{0x0005D00008054010L});
    public static final BitSet FOLLOW_reTypeExpr_in_notExpr771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reTypeExpr_in_notExpr780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_reTypeExpr795 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_dataType_in_reTypeExpr797 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_reTypeExpr799 = new BitSet(new long[]{0x0005D00008054010L});
    public static final BitSet FOLLOW_atom_in_reTypeExpr803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_reTypeExpr810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_customFunctionStmt_in_atom836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_atom857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_atom864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_atom871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_atom878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_atom885 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_atom887 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_atom889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_atom891 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_atom895 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_atom897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_atom904 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_atom906 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_atom910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_atom912 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_atom916 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_atom918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_atom925 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_atom929 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_atom931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureStmt944 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_procedureStmt946 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_procedureStmt950 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_COMMA_in_procedureStmt955 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_procedureStmt959 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_RBRACKET_in_procedureStmt965 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_procedureStmt967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_procedureStmt972 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_procedureStmt974 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_procedureStmt976 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_procedureStmt978 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_procedureStmt982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_procedureStmt984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHAR_in_procedureStmt986 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_procedureStmt988 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_procedureStmt992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_customProcedureStmt_in_procedureStmt997 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_procedureStmt999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_customFunctionStmt1014 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_customFunctionStmt1018 = new BitSet(new long[]{0x0005D00409054010L});
    public static final BitSet FOLLOW_expression_in_customFunctionStmt1023 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_COMMA_in_customFunctionStmt1028 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_customFunctionStmt1032 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_RBRACKET_in_customFunctionStmt1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_customProcedureStmt1057 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACKET_in_customProcedureStmt1061 = new BitSet(new long[]{0x0005D00409054010L});
    public static final BitSet FOLLOW_expression_in_customProcedureStmt1066 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_COMMA_in_customProcedureStmt1071 = new BitSet(new long[]{0x0005D00408054010L});
    public static final BitSet FOLLOW_expression_in_customProcedureStmt1075 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_RBRACKET_in_customProcedureStmt1083 = new BitSet(new long[]{0x0000000000000002L});

}