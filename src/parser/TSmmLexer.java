// Generated from C:/Users/uo281860/Desktop/Lenuaje/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WHITES=3, COMMENT_1=4, COMMENT_2=5, INT_CONSTANT=6, REAL_CONSTANT=7, 
		CHAR_CONSTANT=8, IDENTIFIER=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WHITES", "COMMENT_1", "COMMENT_2", "INT_CONSTANT", "REAL_CONSTANT", 
			"BASE", "EXPONENT", "CHAR_CONSTANT", "ESCAPED_CHAR", "ASCII_CHAR", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WHITES", "COMMENT_1", "COMMENT_2", "INT_CONSTANT", 
			"REAL_CONSTANT", "CHAR_CONSTANT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TSmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TSmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\t\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0004\u0002!\b\u0002\u000b\u0002\f\u0002\"\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"+\b\u0003\n\u0003\f\u0003.\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u00049\b\u0004\n\u0004\f\u0004<\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005D\b\u0005"+
		"\n\u0005\f\u0005G\t\u0005\u0001\u0005\u0003\u0005J\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006N\b\u0006\n\u0006\f\u0006Q\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007U\b\u0007\n\u0007\f\u0007X\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\\\b\u0007\n\u0007\f\u0007_\t\u0007\u0003\u0007"+
		"a\b\u0007\u0001\b\u0001\b\u0003\be\b\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\tm\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0005\f{\b\f\n\f\f\f~\t\f\u0002,:\u0000\r\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\u0000"+
		"\u0013\b\u0015\u0000\u0017\u0000\u0019\t\u0001\u0000\n\u0003\u0000\t\n"+
		"\r\r  \u0001\u0000\n\n\u0001\u000019\u0001\u000009\u0002\u0000EEee\u0002"+
		"\u0000++--\u0004\u0000\n\n\r\r\'\'\\\\\u0002\u0000nntt\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0087\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001"+
		"\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005 \u0001\u0000"+
		"\u0000\u0000\u0007&\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000\u0000"+
		"\u000bI\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000f`\u0001"+
		"\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013h\u0001\u0000\u0000"+
		"\u0000\u0015p\u0001\u0000\u0000\u0000\u0017s\u0001\u0000\u0000\u0000\u0019"+
		"x\u0001\u0000\u0000\u0000\u001b\u001c\u0005+\u0000\u0000\u001c\u0002\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005-\u0000\u0000\u001e\u0004\u0001\u0000"+
		"\u0000\u0000\u001f!\u0007\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0006\u0002\u0000\u0000%\u0006"+
		"\u0001\u0000\u0000\u0000&\'\u0005/\u0000\u0000\'(\u0005*\u0000\u0000("+
		",\u0001\u0000\u0000\u0000)+\t\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005*\u0000"+
		"\u000001\u0005/\u0000\u000012\u0001\u0000\u0000\u000023\u0006\u0003\u0000"+
		"\u00003\b\u0001\u0000\u0000\u000045\u0005/\u0000\u000056\u0005/\u0000"+
		"\u00006:\u0001\u0000\u0000\u000079\t\u0000\u0000\u000087\u0001\u0000\u0000"+
		"\u00009<\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0007"+
		"\u0001\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0006\u0004\u0000\u0000"+
		"@\n\u0001\u0000\u0000\u0000AE\u0007\u0002\u0000\u0000BD\u0007\u0003\u0000"+
		"\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FJ\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HJ\u00050\u0000\u0000IA\u0001\u0000\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000J\f\u0001\u0000\u0000\u0000KO\u0003\u000f\u0007\u0000"+
		"LN\u0003\u0011\b\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u000e\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000Ra\u0003\u000b\u0005\u0000SU\u0003"+
		"\u000b\u0005\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000Y]\u0005.\u0000\u0000Z\\\u0003\u000b\u0005"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000`R\u0001\u0000\u0000\u0000`V\u0001\u0000\u0000\u0000"+
		"a\u0010\u0001\u0000\u0000\u0000bd\u0007\u0004\u0000\u0000ce\u0007\u0005"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0003\u000b\u0005\u0000g\u0012\u0001\u0000\u0000"+
		"\u0000hl\u0005\'\u0000\u0000im\b\u0006\u0000\u0000jm\u0003\u0015\n\u0000"+
		"km\u0003\u0017\u000b\u0000li\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\'\u0000"+
		"\u0000o\u0014\u0001\u0000\u0000\u0000pq\u0005\\\u0000\u0000qr\u0007\u0007"+
		"\u0000\u0000r\u0016\u0001\u0000\u0000\u0000st\u0005\\\u0000\u0000tu\u0007"+
		"\u0003\u0000\u0000uv\u0007\u0003\u0000\u0000vw\u0007\u0003\u0000\u0000"+
		"w\u0018\u0001\u0000\u0000\u0000x|\u0007\b\u0000\u0000y{\u0007\t\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u001a\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\r\u0000\",:EIOV]`dl|\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}