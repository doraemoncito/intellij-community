/* The following code was generated by JFlex 1.4.1 on 3/8/07 5:38 PM */

 /* It's an automatically generated code. Do not modify it. */
package com.intellij.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.xml.XmlElementType;
import com.intellij.psi.xml.XmlTokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 3/8/07 5:38 PM from the specification file
 * <tt>C:/work/Irida/tools/lexer/_XmlLexer.flex</tt>
 */
public class __XmlLexer implements FlexLexer,ELHostLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int PROCESSING_INSTRUCTION = 2;
  public static final int ATTR_LIST = 5;
  public static final int END_TAG = 3;
  public static final int ATTR_VALUE_DQ = 8;
  public static final int DTD_MARKUP = 7;
  public static final int CDATA = 11;
  public static final int ATTR = 6;
  public static final int TAG = 1;
  public static final int YYINITIAL = 0;
  public static final int ATTR_VALUE_START = 7;
  public static final int COMMENT = 4;
  public static final int DOCTYPE = 10;
  public static final int ATTR_VALUE_SQ = 9;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\3\1\0\2\3\22\0\1\3\1\13\1\54\1\6\1\4"+
    "\1\62\1\23\1\55\5\0\1\10\1\7\1\60\12\2\1\11\1\26"+
    "\1\12\1\61\1\22\1\56\1\0\1\17\1\51\1\15\1\16\1\45"+
    "\1\41\2\1\1\53\2\1\1\52\1\47\1\1\1\42\1\44\2\1"+
    "\1\46\1\20\1\50\3\1\1\43\1\1\1\14\1\63\1\21\1\0"+
    "\1\1\1\0\1\27\1\36\4\41\1\24\4\1\1\24\1\37\1\35"+
    "\1\31\1\30\1\33\1\1\1\32\1\25\1\34\2\1\1\40\2\1"+
    "\1\5\1\0\1\57\54\0\1\1\12\0\1\1\4\0\1\1\5\0"+
    "\27\1\1\0\37\1\1\0\u013f\1\31\0\162\1\4\0\14\1\16\0"+
    "\5\1\11\0\1\1\213\0\1\1\13\0\1\1\1\0\3\1\1\0"+
    "\1\1\1\0\24\1\1\0\54\1\1\0\46\1\1\0\5\1\4\0"+
    "\202\1\10\0\105\1\1\0\46\1\2\0\2\1\6\0\20\1\41\0"+
    "\46\1\2\0\1\1\7\0\47\1\110\0\33\1\5\0\3\1\56\0"+
    "\32\1\5\0\13\1\43\0\2\1\1\0\143\1\1\0\1\1\17\0"+
    "\2\1\7\0\2\1\12\0\3\1\2\0\1\1\20\0\1\1\1\0"+
    "\36\1\35\0\3\1\60\0\46\1\13\0\1\1\u0152\0\66\1\3\0"+
    "\1\1\22\0\1\1\7\0\12\1\43\0\10\1\2\0\2\1\2\0"+
    "\26\1\1\0\7\1\1\0\1\1\3\0\4\1\3\0\1\1\36\0"+
    "\2\1\1\0\3\1\16\0\2\1\23\0\6\1\4\0\2\1\2\0"+
    "\26\1\1\0\7\1\1\0\2\1\1\0\2\1\1\0\2\1\37\0"+
    "\4\1\1\0\1\1\23\0\3\1\20\0\11\1\1\0\3\1\1\0"+
    "\26\1\1\0\7\1\1\0\2\1\1\0\5\1\3\0\1\1\22\0"+
    "\1\1\17\0\2\1\43\0\10\1\2\0\2\1\2\0\26\1\1\0"+
    "\7\1\1\0\2\1\1\0\5\1\3\0\1\1\36\0\2\1\1\0"+
    "\3\1\17\0\1\1\21\0\1\1\1\0\6\1\3\0\3\1\1\0"+
    "\4\1\3\0\2\1\1\0\1\1\1\0\2\1\3\0\2\1\3\0"+
    "\3\1\3\0\10\1\1\0\3\1\113\0\10\1\1\0\3\1\1\0"+
    "\27\1\1\0\12\1\1\0\5\1\46\0\2\1\43\0\10\1\1\0"+
    "\3\1\1\0\27\1\1\0\12\1\1\0\5\1\3\0\1\1\40\0"+
    "\1\1\1\0\2\1\43\0\10\1\1\0\3\1\1\0\27\1\1\0"+
    "\20\1\46\0\2\1\43\0\22\1\3\0\30\1\1\0\11\1\1\0"+
    "\1\1\2\0\7\1\72\0\60\1\1\0\2\1\14\0\7\1\72\0"+
    "\2\1\1\0\1\1\2\0\2\1\1\0\1\1\2\0\1\1\6\0"+
    "\4\1\1\0\7\1\1\0\3\1\1\0\1\1\1\0\1\1\2\0"+
    "\2\1\1\0\4\1\1\0\2\1\11\0\1\1\2\0\5\1\1\0"+
    "\1\1\25\0\2\1\42\0\1\1\77\0\10\1\1\0\42\1\35\0"+
    "\4\1\164\0\42\1\1\0\5\1\1\0\2\1\45\0\6\1\112\0"+
    "\46\1\12\0\51\1\7\0\132\1\5\0\104\1\5\0\122\1\6\0"+
    "\7\1\1\0\77\1\1\0\1\1\1\0\4\1\2\0\7\1\1\0"+
    "\1\1\1\0\4\1\2\0\47\1\1\0\1\1\1\0\4\1\2\0"+
    "\37\1\1\0\1\1\1\0\4\1\2\0\7\1\1\0\1\1\1\0"+
    "\4\1\2\0\7\1\1\0\7\1\1\0\27\1\1\0\37\1\1\0"+
    "\1\1\1\0\4\1\2\0\7\1\1\0\47\1\1\0\23\1\105\0"+
    "\125\1\14\0\u026c\1\2\0\10\1\12\0\32\1\5\0\113\1\25\0"+
    "\15\1\1\0\4\1\16\0\22\1\16\0\22\1\16\0\15\1\1\0"+
    "\3\1\17\0\64\1\43\0\1\1\4\0\1\1\103\0\130\1\10\0"+
    "\51\1\127\0\35\1\63\0\36\1\2\0\5\1\u038b\0\154\1\224\0"+
    "\234\1\4\0\132\1\6\0\26\1\2\0\6\1\2\0\46\1\2\0"+
    "\6\1\2\0\10\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\37\1\2\0\65\1\1\0\7\1\1\0\1\1\3\0\3\1\1\0"+
    "\7\1\3\0\4\1\2\0\6\1\4\0\15\1\5\0\3\1\1\0"+
    "\7\1\164\0\1\1\15\0\1\1\202\0\1\1\4\0\1\1\2\0"+
    "\12\1\1\0\1\1\3\0\5\1\6\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\4\1\1\0\3\1\1\0\7\1\3\0\3\1\5\0"+
    "\5\1\u0ebb\0\2\1\52\0\5\1\5\0\2\1\4\0\126\1\6\0"+
    "\3\1\1\0\132\1\1\0\4\1\5\0\50\1\4\0\136\1\21\0"+
    "\30\1\70\0\20\1\u0200\0\u19b6\1\112\0\u51a6\1\132\0\u048d\1\u0773\0"+
    "\u2ba4\1\u215c\0\u012e\1\2\0\73\1\225\0\7\1\14\0\5\1\5\0"+
    "\1\1\1\0\12\1\1\0\15\1\1\0\5\1\1\0\1\1\1\0"+
    "\2\1\1\0\2\1\1\0\154\1\41\0\u016b\1\22\0\100\1\2\0"+
    "\66\1\50\0\14\1\164\0\5\1\1\0\207\1\44\0\32\1\6\0"+
    "\32\1\13\0\131\1\3\0\6\1\2\0\6\1\2\0\6\1\2\0"+
    "\3\1\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\3\0\1\2\7\0\1\1\1\3\1\1\1\4"+
    "\1\5\1\1\1\5\1\6\1\7\1\5\1\10\1\5"+
    "\1\11\1\5\1\12\1\2\1\13\1\14\3\15\1\16"+
    "\1\17\1\20\3\21\1\13\1\22\3\21\1\5\1\23"+
    "\2\12\2\5\2\1\2\0\1\24\1\25\6\0\1\6"+
    "\1\0\1\26\1\11\1\27\1\12\2\0\1\14\5\0"+
    "\1\30\1\0\2\12\3\0\1\31\4\0\1\32\7\0"+
    "\1\33\1\34\1\35\2\12\1\36\1\37\2\0\1\40"+
    "\2\0\2\12\2\0\2\12\2\0\1\41\1\42\4\0"+
    "\1\43\1\44";

  private static int [] zzUnpackAction() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u03a8\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u03a8\0\u0444"+
    "\0\u0340\0\u03a8\0\u03a8\0\u03a8\0\u03a8\0\u05e4\0\u0444\0\u0340"+
    "\0\u03a8\0\u0618\0\u064c\0\u0680\0\u06b4\0\u03a8\0\u06e8\0\u071c"+
    "\0\u0750\0\u0784\0\u03a8\0\u07b8\0\u07ec\0\u0820\0\u03a8\0\u03a8"+
    "\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0"+
    "\0\u03a8\0\u09f4\0\u03a8\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8"+
    "\0\u0b2c\0\u0b60\0\u0b94\0\u06b4\0\u03a8\0\u0bc8\0\u0bfc\0\u0c30"+
    "\0\u0750\0\u0784\0\u0c64\0\u03a8\0\u0c98\0\u0ccc\0\u0d00\0\u0d34"+
    "\0\u03a8\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c\0\u0ea0"+
    "\0\u03a8\0\u03a8\0\u03a8\0\u0ed4\0\u0f08\0\u03a8\0\u03a8\0\u0f3c"+
    "\0\u0f70\0\u03a8\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\u1074\0\u10a8"+
    "\0\u10dc\0\u1110\0\u1144\0\u1178\0\u0514\0\u0514\0\u11ac\0\u11e0"+
    "\0\u1214\0\u1248\0\u03a8\0\u03a8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\15\1\16\1\17\1\15\1\17\3\15\1\20\10\15"+
    "\1\21\37\15\1\22\1\23\1\24\1\23\1\25\6\23"+
    "\1\26\2\23\4\24\1\23\1\27\1\21\2\24\1\23"+
    "\25\24\4\23\1\30\4\23\1\31\10\23\1\26\2\23"+
    "\4\31\2\23\1\21\2\31\1\23\25\31\2\23\1\32"+
    "\6\23\1\33\1\23\1\25\6\23\1\26\2\23\4\33"+
    "\1\23\1\27\1\21\2\33\1\23\25\33\10\23\10\34"+
    "\1\35\53\34\1\23\1\36\1\23\1\25\6\23\1\26"+
    "\2\23\4\36\2\23\1\21\2\36\1\23\25\36\10\23"+
    "\3\37\1\25\6\37\1\40\10\37\1\41\30\37\1\42"+
    "\1\43\3\37\1\44\2\37\12\23\1\26\10\23\1\21"+
    "\40\23\4\45\1\46\1\45\1\46\3\45\1\47\10\45"+
    "\1\50\30\45\1\51\5\45\1\52\5\45\1\53\1\45"+
    "\1\53\3\45\1\47\10\45\1\50\31\45\1\51\4\45"+
    "\1\54\1\45\1\23\1\33\1\23\1\25\6\23\1\26"+
    "\1\23\1\55\4\33\1\23\1\56\1\21\2\33\1\23"+
    "\15\33\1\57\1\33\1\60\5\33\1\61\1\62\6\23"+
    "\21\63\1\64\42\63\3\15\2\0\1\15\1\0\3\15"+
    "\1\0\10\15\1\0\37\15\1\22\3\0\1\16\65\0"+
    "\1\65\71\0\1\66\42\0\1\67\1\0\1\70\4\0"+
    "\1\71\4\0\1\72\6\0\4\71\3\0\1\73\1\71"+
    "\1\0\1\74\3\71\1\75\1\71\1\76\16\71\10\0"+
    "\3\15\1\0\6\15\1\0\10\15\1\0\37\15\1\22"+
    "\65\0\2\24\4\0\2\24\1\77\3\0\4\24\3\0"+
    "\2\24\1\0\25\24\13\0\1\25\73\0\1\100\72\0"+
    "\1\101\42\0\2\31\4\0\2\31\1\102\3\0\4\31"+
    "\3\0\2\31\1\0\25\31\32\0\1\103\42\0\2\33"+
    "\4\0\2\33\1\104\3\0\4\33\3\0\2\33\1\0"+
    "\25\33\10\0\10\34\1\105\63\34\1\106\53\34\1\0"+
    "\2\36\4\0\2\36\1\107\3\0\4\36\3\0\2\36"+
    "\1\0\25\36\15\0\1\110\137\0\1\111\7\0\1\112"+
    "\137\0\1\113\2\0\21\114\1\115\32\114\1\116\7\114"+
    "\1\0\2\33\4\0\2\33\1\104\3\0\4\33\3\0"+
    "\2\33\1\0\21\33\1\117\3\33\11\0\2\33\4\0"+
    "\2\33\1\104\3\0\4\33\3\0\2\33\1\0\14\33"+
    "\1\120\10\33\10\0\54\121\1\45\7\121\55\122\1\45"+
    "\6\122\21\0\1\123\42\0\12\65\1\0\44\65\1\124"+
    "\4\65\10\0\1\125\3\0\1\126\1\0\1\127\46\0"+
    "\2\71\4\0\2\71\1\130\3\0\4\71\3\0\2\71"+
    "\1\131\25\71\12\0\1\132\35\0\1\133\24\0\2\71"+
    "\4\0\2\71\1\130\3\0\4\71\3\0\1\71\1\134"+
    "\1\131\25\71\11\0\2\71\4\0\2\71\1\130\3\0"+
    "\4\71\3\0\2\71\1\131\1\71\1\135\6\71\1\136"+
    "\14\71\11\0\2\71\4\0\2\71\1\130\3\0\4\71"+
    "\3\0\2\71\1\131\5\71\1\137\17\71\11\0\2\71"+
    "\4\0\2\71\1\130\3\0\4\71\3\0\2\71\1\131"+
    "\7\71\1\140\15\71\11\0\2\77\4\0\2\77\4\0"+
    "\4\77\3\0\2\77\1\0\25\77\20\0\1\125\3\0"+
    "\1\126\50\0\2\102\4\0\2\102\4\0\4\102\3\0"+
    "\2\102\1\0\25\102\11\0\2\104\4\0\2\104\4\0"+
    "\4\104\3\0\2\104\1\0\25\104\10\0\10\34\1\0"+
    "\53\34\22\0\1\141\42\0\2\107\4\0\2\107\4\0"+
    "\4\107\3\0\2\107\1\0\25\107\10\0\54\110\1\0"+
    "\2\110\1\142\4\110\54\111\1\0\5\111\1\143\1\111"+
    "\55\112\1\0\1\112\1\142\4\112\55\113\1\0\4\113"+
    "\1\143\1\113\54\116\1\114\7\116\1\0\2\33\4\0"+
    "\2\33\1\104\3\0\4\33\3\0\2\33\1\0\22\33"+
    "\1\144\2\33\11\0\2\33\4\0\2\33\1\104\3\0"+
    "\4\33\3\0\2\33\1\0\17\33\1\145\5\33\32\0"+
    "\1\146\51\0\1\147\70\0\1\150\110\0\1\151\22\0"+
    "\2\130\4\0\2\130\4\0\4\130\3\0\2\130\1\131"+
    "\25\130\12\0\1\132\23\0\1\152\37\0\1\153\12\0"+
    "\3\153\7\0\1\153\6\0\1\153\2\0\1\153\3\0"+
    "\1\153\3\0\1\153\13\0\2\71\4\0\2\71\1\130"+
    "\3\0\4\71\3\0\2\71\1\152\25\71\11\0\2\71"+
    "\4\0\2\71\1\130\3\0\4\71\3\0\2\71\1\131"+
    "\2\71\1\154\22\71\11\0\2\71\4\0\2\71\1\130"+
    "\3\0\4\71\3\0\2\71\1\131\1\71\1\134\23\71"+
    "\11\0\2\71\4\0\2\71\1\130\3\0\4\71\3\0"+
    "\2\71\1\131\2\71\1\73\22\71\11\0\2\71\4\0"+
    "\2\71\1\130\3\0\4\71\3\0\2\71\1\131\3\71"+
    "\1\136\21\71\11\0\2\33\4\0\2\33\1\104\3\0"+
    "\4\33\3\0\2\33\1\0\23\33\1\155\1\33\11\0"+
    "\2\33\4\0\2\33\1\104\3\0\3\33\1\156\3\0"+
    "\2\33\1\0\25\33\26\0\1\157\62\0\1\160\50\0"+
    "\1\153\12\0\3\153\6\0\1\152\1\153\6\0\1\153"+
    "\2\0\1\153\3\0\1\153\3\0\1\153\13\0\2\71"+
    "\4\0\2\71\1\130\3\0\4\71\3\0\2\71\1\131"+
    "\3\71\1\134\21\71\11\0\2\33\4\0\2\33\1\104"+
    "\3\0\4\33\3\0\2\33\1\0\24\33\1\161\11\0"+
    "\2\33\4\0\2\33\1\104\3\0\4\33\3\0\2\33"+
    "\1\0\16\33\1\162\6\33\27\0\1\163\64\0\1\164"+
    "\44\0\2\33\4\0\2\33\1\104\3\0\1\165\3\33"+
    "\3\0\2\33\1\0\25\33\11\0\2\33\4\0\2\33"+
    "\1\104\3\0\4\33\3\0\2\33\1\0\20\33\1\166"+
    "\4\33\30\0\1\167\106\0\1\170\37\0\1\171\110\0"+
    "\1\172\33\0\1\173\114\0\1\174\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4732];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\3\0\1\1\7\0\6\1\1\11\3\1\1\11"+
    "\7\1\1\11\2\1\4\11\3\1\1\11\4\1\1\11"+
    "\4\1\1\11\1\1\2\0\2\11\6\0\1\1\1\0"+
    "\1\11\1\1\1\11\1\1\2\0\1\1\5\0\1\11"+
    "\1\0\2\1\3\0\1\11\4\0\1\11\7\0\3\11"+
    "\2\1\2\11\2\0\1\11\2\0\2\1\2\0\2\1"+
    "\2\0\2\1\4\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private IElementType elTokenType = XmlTokenType.XML_DATA_CHARACTERS;
  private IElementType elTokenType2 = XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
  private IElementType javaEmbeddedTokenType = XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;

  public void setElTypes(IElementType _elTokenType,IElementType _elTokenType2) {
    elTokenType = _elTokenType;
    elTokenType2 = _elTokenType2;
  }

  public void setJavaEmbeddedType(IElementType _tokenType) {
    javaEmbeddedTokenType = _tokenType;
  }

  private int myPrevState = YYINITIAL;

  public int yyprevstate() {
    return myPrevState;
  }

  private int popState(){
    final int prev = myPrevState;
    myPrevState = YYINITIAL;
    return prev;
  }

  protected void pushState(int state){
    myPrevState = state;
  }


  public __XmlLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public __XmlLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1244) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = zzLexicalState;


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]:zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]:zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 18: 
          { yybegin(ATTR_LIST); return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
          }
        case 37: break;
        case 17: 
          { return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
          }
        case 38: break;
        case 34: 
          { return XmlTokenType.XML_DOCTYPE_SYSTEM;
          }
        case 39: break;
        case 16: 
          { return XmlTokenType.XML_EQ;
          }
        case 40: break;
        case 35: 
          { yybegin(CDATA); return XmlTokenType.XML_CDATA_START;
          }
        case 41: break;
        case 6: 
          { yybegin(ATTR_LIST); pushState(TAG); return XmlTokenType.XML_NAME;
          }
        case 42: break;
        case 21: 
          { yybegin(END_TAG); return XmlTokenType.XML_END_TAG_START;
          }
        case 43: break;
        case 25: 
          { return elTokenType;
          }
        case 44: break;
        case 10: 
          { return XmlTokenType.XML_NAME;
          }
        case 45: break;
        case 33: 
          { return XmlTokenType.XML_DOCTYPE_PUBLIC;
          }
        case 46: break;
        case 31: 
          { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_START;
          }
        case 47: break;
        case 29: 
          { return javaEmbeddedTokenType;
          }
        case 48: break;
        case 24: 
          { return XmlElementType.XML_MARKUP;
          }
        case 49: break;
        case 9: 
          { yybegin(ATTR_LIST); pushState(PROCESSING_INSTRUCTION); return XmlTokenType.XML_NAME;
          }
        case 50: break;
        case 3: 
          { return XmlTokenType.XML_REAL_WHITE_SPACE;
          }
        case 51: break;
        case 1: 
          { return XmlTokenType.XML_DATA_CHARACTERS;
          }
        case 52: break;
        case 11: 
          { return XmlTokenType.XML_BAD_CHARACTER;
          }
        case 53: break;
        case 8: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_TAG_END;
          }
        case 54: break;
        case 5: 
          { if(yystate() == YYINITIAL){
        return XmlTokenType.XML_BAD_CHARACTER;
      }
      else yybegin(popState()); yypushback(yylength());
          }
        case 55: break;
        case 27: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_COMMENT_END;
          }
        case 56: break;
        case 4: 
          { yybegin(TAG); return XmlTokenType.XML_START_TAG_START;
          }
        case 57: break;
        case 22: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_EMPTY_ELEMENT_END;
          }
        case 58: break;
        case 20: 
          { yybegin(PROCESSING_INSTRUCTION); return XmlTokenType.XML_PI_START;
          }
        case 59: break;
        case 12: 
          { yybegin(ATTR); return XmlTokenType.XML_NAME;
          }
        case 60: break;
        case 13: 
          { yybegin(ATTR_LIST); yypushback(yylength());
          }
        case 61: break;
        case 19: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_DOCTYPE_END;
          }
        case 62: break;
        case 32: 
          { return XmlTokenType.XML_CHAR_ENTITY_REF;
          }
        case 63: break;
        case 7: 
          { return XmlTokenType.XML_WHITE_SPACE;
          }
        case 64: break;
        case 26: 
          { return XmlTokenType.XML_ENTITY_REF_TOKEN;
          }
        case 65: break;
        case 14: 
          { yybegin(ATTR_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 66: break;
        case 15: 
          { yybegin(ATTR_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 67: break;
        case 30: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_CDATA_END;
          }
        case 68: break;
        case 28: 
          { return elTokenType2;
          }
        case 69: break;
        case 23: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_PI_END;
          }
        case 70: break;
        case 36: 
          { yybegin(DOCTYPE); return XmlTokenType.XML_DOCTYPE_START;
          }
        case 71: break;
        case 2: 
          { return XmlTokenType.XML_COMMENT_CHARACTERS;
          }
        case 72: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
