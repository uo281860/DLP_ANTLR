package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		String content = str.substring(1, str.length() - 1);

		if (content.startsWith("\\")) {
			char nextChar = content.charAt(1);

			if (nextChar == 'n') return '\n';
			if (nextChar == 't') return '\t';

			try {
				int asciiCode = Integer.parseInt(content.substring(1));
				return (char) asciiCode;
			} catch (NumberFormatException e) {
				System.err.println("Error en formato ASCII: " + e);
			}
		}

		// 3. Caso normal: un solo carácter
		return content.charAt(0);
	}
	
}
