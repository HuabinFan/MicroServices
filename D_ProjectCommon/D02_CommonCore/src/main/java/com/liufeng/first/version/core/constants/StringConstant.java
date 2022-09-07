package com.liufeng.first.version.core.constants;

import com.baomidou.mybatisplus.core.toolkit.StringPool;

/**
 * @author: HB
 * @dateTime: 2022/8/26 10:43
 * @WeChatAccount: Java技术与生活
 * @description: 字符串常量
 */
public interface StringConstant {

    String AMPERSAND = "&";
    String WHERE = "where";
    String DEFAULT_WHERE = "where 1=1";
    String SQL_CONDITION = "and 1=1";
    String DEFAULT_TRUE = "1=1";
    String AND = "and";
    String OR = "or";
    String AT = "@";
    String UP = "UP";
    String DOWN = "DOWN";
    String ASTERISK = "*";
    String BACK_SLASH = "\\";
    String COLON = ":";
    String COMMA = ",";
    String DASH = "-";
    String DOLLAR = "$";
    String DOT = ".";
    String DOT_DOT = "..";
    String CLASS = "class";
    String DOT_CLASS = ".class";
    String DOT_JAVA = ".java";
    String DOT_XML = ".xml";
    String EMPTY = "";
    String BLANK_SPACE = " ";
    String EQUALS = "=";
    String IN = "in";
    String NOT_IN = "not in";
    String FALSE = "false";
    String SLASH = "/";
    String HASH = "#";
    String HAT = "^";
    String LEFT_BRACE = "{";
    String LEFT_BRACKET = "(";
    String LEFT_CHEV = "<";
    String DOT_NEWLINE = "," + System.getProperty("line.separator");
    String NEWLINE = System.getProperty("line.separator");
    String N = "n";
    String NO = "no";
    String NULL = "null";
    String IS_NULL = "is null";
    String OFF = "off";
    String ON = "on";
    String PERCENT = "%";
    String PIPE = "|";
    String PLUS = "+";
    String QUESTION_MARK = "?";
    String EXCLAMATION_MARK = "!";
    String QUOTE = "\"";
    String RETURN = "\r";
    String TAB = "\t";
    String RIGHT_BRACE = "}";
    String RIGHT_BRACKET = ")";
    String RIGHT_CHEV = ">";
    String SEMICOLON = ";";
    String SINGLE_QUOTE = "'";
    String BACKTICK = "`";
    String SPACE = " ";
    String TILDA = "~";
    String LEFT_SQ_BRACKET = "[";
    String RIGHT_SQ_BRACKET = "]";
    String TRUE = "true";
    String UNDERSCORE = "_";
    String UTF_8 = "UTF-8";
    String US_ASCII = "US-ASCII";
    String ISO_8859_1 = "ISO-8859-1";
    String UTF_16LE = "UTF-16LE";
    String GBK = "GBK";
    String Y = "y";
    String YES = "yes";
    String ONE = "1";
    String ZERO = "0";
    String MINUS_ONE = "-1";
    String DOLLAR_LEFT_BRACE = "${";
    String HASH_LEFT_BRACE = "#{";
    String CRLF = "\r\n";
    String LIKE = "like";
    String NOT_LIKE = "not like";
    String A = "A";
    String B = "B";
    String NONE = "NONE";
    String COM = "COM";
    String LAN = "LAN";
    String LOG_SERVER = "LogServer";
    String SQLSERVER = "SQLServer";
    String MYSQL = "MySQL";
    String ORACLE = "Oracle";
    String FTP_NAME = "FileZillaServer";
    String GATEWAY_SERVICE = "WebGatewayService";
    String OTRPC_GATEWAY_SERVER = "OTRPCGatewayServer";
    String BASIC_DICTIONARY_SERVICE = "BasicDictionaryService";
    String CONFIG_SERVICE = "ConfigService";
    String BIG_Y = "Y";
    String BIG_N = "N";
    String BIG_YES = "YES";
    String NODE = "Node";
    String GS = "GS";
    String REPORT = "report";
    String SIGNATURE = "signature";
    String REPORT_ODS = "ods";
    String REPORT_HTML = "html";
    String REPORT_XLS = "xls";
    String REPORT_PDF = "pdf";
    String REPORT_EXIST = "exist";
    String CSV = "csv";
    String UNKNOWN = "UnKnown";
    String VOICE = "voice";
    String DEFAULT_SOUND_FILE_NAME = "default.wav";
    String DEFINED = "defined";
    String UNDEFINED = "undefined";
    String NA = "N/A";
    String OFFLINE = "offline";
    String ONLINE = "online";
    String BAR = ".bar";
    String ZIP = ".zip";
    String HTML_NBSP = "&nbsp;";
    String HTML_AMP = "&amp";
    String HTML_QUOTE = "&quot;";
    String HTML_LT = "&lt;";
    String HTML_GT = "&gt;";
    String NOT_EXIST = "not exist";
    String EXIST = "exist";
    String ROOT = "控制系统设置";

    Integer SUCCESS = 0;
    Integer FAILED = 1;
    Integer REPEAT = 2;

    String[] EMPTY_ARRAY = new String[0];

    byte[] BYTES_NEW_LINE = StringPool.NEWLINE.getBytes();

}
