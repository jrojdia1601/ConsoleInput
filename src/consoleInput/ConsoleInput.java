package consoleInput;

import static consoleInput.Colors.RED;
import static consoleInput.Colors.RESET;

import java.util.Scanner;

public class ConsoleInput {
	private Scanner key = new Scanner(System.in);
	// Numerical

	// Byte Input
	public byte readByte() {
		byte byt = 0;
		boolean error;
		do {
			try {
				byt = key.nextByte();
				error = false;
			} catch (java.util.InputMismatchException e) {
				System.out.println(
						RED + "ERROR. Introduced input isn't a byte or exceeds maximun byte range. Try again" + RESET);
				error = true;
			} finally {
				key.nextLine();// Buffer clear
			}
		} while (error == true);
		return byt;
	}

	public byte readByteLessThan(byte upperBound) {
		byte byt;
		do {
			byt = readByte();
			if (byt >= upperBound) {
				System.out.println(RED + "ERROR. Byte value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (byt >= upperBound);
		return byt;
	}

	public byte readByteLessOrEqualThan(byte upperBound) {
		byte byt;
		do {
			byt = readByte();
			if (byt > upperBound) {
				System.out.println(RED + "ERROR. Byte value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (byt > upperBound);
		return byt;
	}

	public byte readByteGreaterThan(byte lowerBound) {
		byte byt;
		do {
			byt = readByte();
			if (byt <= lowerBound) {
				System.out.println(RED + "ERROR. Byte value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (byt <= lowerBound);
		return byt;
	}

	public byte readByteGreaterOrEqualThan(byte lowerBound) {
		byte byt;
		do {
			byt = readByte();
			if (byt < lowerBound) {
				System.out.println(RED + "ERROR. Byte value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (byt < lowerBound);
		return byt;
	}

	public byte readByteInRange(byte lowerBound, byte upperBound) {
		byte byt;
		do {
			byt = readByte();
			if (byt < lowerBound || byt > upperBound) {
				System.out.println(
						RED + "ERROR. Byte value exceeds " + lowerBound + " or " + upperBound + ". Try again" + RESET);
			}
		} while (byt < lowerBound || byt > upperBound);
		return byt;
	}

	// Short Input
	public short readShort() {
		boolean error;
		short shrt = 0;
		do {
			try {
				shrt = key.nextShort();
				error = false;
			} catch (java.util.InputMismatchException e) {
				System.out.println(RED
						+ "ERROR. Introduced input isn't a short or exceeds maximun short range. Try again" + RESET);
				error = true;
			} finally {
				key.nextLine();// Buffer clear
			}
		} while (error == true);
		return shrt;
	}

	public short readShortLessThan(short upperBound) {
		short shrt;
		do {
			shrt = readShort();
			if (shrt >= upperBound) {
				System.out.println(RED + "ERROR. Short value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (shrt >= upperBound);
		return shrt;
	}

	public short readShortLessOrEqualThan(short upperBound) {
		short shrt;
		do {
			shrt = readShort();
			if (shrt > upperBound) {
				System.out.println(RED + "ERROR. Short value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (shrt > upperBound);
		return shrt;
	}

	public short readShortGreaterThan(short lowerBound) {
		short shrt;
		do {
			shrt = readShort();
			if (shrt <= lowerBound) {
				System.out.println(RED + "ERROR. Short value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (shrt <= lowerBound);
		return shrt;
	}

	public short readShortGreaterOrEqualThan(short lowerBound) {
		short shrt;
		do {
			shrt = readShort();
			if (shrt < lowerBound) {
				System.out.println(RED + "ERROR. Short value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (shrt < lowerBound);
		return shrt;
	}

	public short readShortInRange(short lowerBound, short upperBound) {
		short shrt;
		do {
			shrt = readShort();
			if (shrt < lowerBound || shrt > upperBound) {
				System.out.println(
						RED + "ERROR. Short value exceeds " + lowerBound + " or " + upperBound + ". Try again" + RESET);
			}
		} while (shrt < lowerBound || shrt > upperBound);
		return shrt;
	}

	// Int Input
	public int readInt() {
		boolean error;
		int in = 0;
		do {
			try {
				in = key.nextInt();
				error = false;
			} catch (java.util.InputMismatchException e) {
				System.out.println(
						RED + "ERROR. Introduced input isn't a int or exceeds maximun int range. Try again" + RESET);
				error = true;
			} finally {
				key.nextLine();// Buffer clear
			}
		} while (error == true);
		return in;
	}

	public int readIntLessThan(int upperBound) {
		int in;
		do {
			in = readInt();
			if (in >= upperBound) {
				System.out.println(RED + "ERROR. Int value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (in >= upperBound);
		return in;
	}

	public int readIntLessOrEqualThan(int upperBound) {
		int in;
		do {
			in = readInt();
			if (in > upperBound) {
				System.out.println(RED + "ERROR. Int value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (in > upperBound);
		return in;
	}

	public int readIntGreaterThan(int lowerBound) {
		int in;
		do {
			in = readInt();
			if (in <= lowerBound) {
				System.out.println(RED + "ERROR. Int value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (in <= lowerBound);
		return in;
	}

	public int readIntGreaterOrEqualThan(int lowerBound) {
		int in;
		do {
			in = readInt();
			if (in < lowerBound) {
				System.out.println(RED + "ERROR. Int value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (in < lowerBound);
		return in;
	}

	public int readIntInRange(int lowerBound, int upperBound) {
		int in;
		do {
			in = readInt();
			if (in < lowerBound || in > upperBound) {
				System.out.println(
						RED + "ERROR. Int value exceeds " + lowerBound + " or " + upperBound + ". Try again" + RESET);
			}
		} while (in < lowerBound || in > upperBound);
		return in;
	}

	// Long Input
	public long readLong() {
		boolean error;
		long lng = 0;
		do {
			try {
				lng = key.nextLong();
				error = false;
			} catch (java.util.InputMismatchException e) {
				System.out.println(
						RED + "ERROR. Introduced input isn't a long or exceeds maximun long range. Try again" + RESET);
				error = true;
			} finally {
				key.nextLine();// Buffer clear
			}
		} while (error == true);
		return lng;
	}

	public long readLongLessThan(long upperBound) {
		long lng;
		do {
			lng = readLong();
			if (lng >= upperBound) {
				System.out.println(RED + "ERROR. Long value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (lng >= upperBound);
		return lng;
	}

	public long readLongLessOrEqualThan(long upperBound) {
		long lng;
		do {
			lng = readLong();
			if (lng > upperBound) {
				System.out.println(RED + "ERROR. Long value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (lng > upperBound);
		return lng;
	}

	public long readLongGreaterThan(long lowerBound) {
		long lng;
		do {
			lng = readLong();
			if (lng <= lowerBound) {
				System.out.println(RED + "ERROR. Long value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (lng <= lowerBound);
		return lng;
	}

	public long readLongGreaterOrEqualThan(long lowerBound) {
		long lng;
		do {
			lng = readLong();
			if (lng < lowerBound) {
				System.out.println(RED + "ERROR. Long value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (lng < lowerBound);
		return lng;
	}

	public long readLongInRange(long lowerBound, long upperBound) {
		long lng;
		do {
			lng = readLong();
			if (lng < lowerBound || lng > upperBound) {
				System.out.println(
						RED + "ERROR. Long value exceeds " + lowerBound + " or " + upperBound + ". Try again" + RESET);
			}
		} while (lng < lowerBound || lng > upperBound);
		return lng;
	}

	// Float Input
	public float readFloat() {
		boolean error;
		float flt = 0;
		do {
			try {
				flt = key.nextFloat();
				error = false;
			} catch (java.util.InputMismatchException e) {
				System.out.println(RED
						+ "ERROR. Introduced input isn't a float or exceeds maximun float range. Try again" + RESET);
				error = true;
			} finally {
				key.nextLine();// Buffer clear
			}
		} while (error == true);
		return flt;
	}

	public float readFloatLessThan(float upperBound) {
		float flt;
		do {
			flt = readFloat();
			if (flt >= upperBound) {
				System.out.println(RED + "ERROR. Float value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (flt >= upperBound);
		return flt;
	}

	public float readFloatLessOrEqualThan(float upperBound) {
		float flt;
		do {
			flt = readFloat();
			if (flt > upperBound) {
				System.out.println(RED + "ERROR. Float value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (flt > upperBound);
		return flt;
	}

	public float readFloatGreaterThan(float lowerBound) {
		float flt;
		do {
			flt = readFloat();
			if (flt <= lowerBound) {
				System.out.println(RED + "ERROR. Float value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (flt <= lowerBound);
		return flt;
	}

	public float readFloatGreaterOrEqualThan(float lowerBound) {
		float flt;
		do {
			flt = readFloat();
			if (flt < lowerBound) {
				System.out.println(RED + "ERROR. Float value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (flt < lowerBound);
		return flt;
	}

	public float readFloatInRange(float lowerBound, float upperBound) {
		float flt;
		do {
			flt = readFloat();
			if (flt < lowerBound || flt > upperBound) {
				System.out.println(
						RED + "ERROR. Float value exceeds " + lowerBound + " or " + upperBound + ". Try again" + RESET);
			}
		} while (flt < lowerBound || flt > upperBound);
		return flt;
	}

	// Double Input
	public double readDouble() {
		boolean error;
		double dbl = 0;
		do {
			try {
				dbl = key.nextDouble();
				error = false;
			} catch (java.util.InputMismatchException e) {
				System.out.println(RED
						+ "ERROR. Introduced input isn't a double or exceeds maximun double range. Try again" + RESET);
				error = true;
			} finally {
				key.nextLine();// Buffer clear
			}
		} while (error == true);
		return dbl;
	}

	public double readDoubleLessThan(double upperBound) {
		double dbl;
		do {
			dbl = readDouble();
			if (dbl >= upperBound) {
				System.out.println(RED + "ERROR. Double value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (dbl >= upperBound);
		return dbl;
	}

	public double readDoubleLessOrEqualThan(double upperBound) {
		double dbl;
		do {
			dbl = readDouble();
			if (dbl > upperBound) {
				System.out.println(RED + "ERROR. Double value exceeds " + upperBound + ". Try again" + RESET);
			}
		} while (dbl > upperBound);
		return dbl;
	}

	public double readDoubleGreaterThan(double lowerBound) {
		double dbl;
		do {
			dbl = readDouble();
			if (dbl <= lowerBound) {
				System.out.println(RED + "ERROR. Double value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (dbl <= lowerBound);
		return dbl;
	}

	public double readDoubleGreaterOrEqualThan(double lowerBound) {
		double dbl;
		do {
			dbl = readDouble();
			if (dbl < lowerBound) {
				System.out.println(RED + "ERROR. Double value exceeds " + lowerBound + ". Try again" + RESET);
			}
		} while (dbl < lowerBound);
		return dbl;
	}

	public double readDoubleInRange(double lowerBound, double upperBound) {
		double dbl;
		do {
			dbl = readDouble();
			if (dbl < lowerBound || dbl > upperBound) {
				System.out.println(RED + "ERROR. Double value exceeds " + lowerBound + " or " + upperBound
						+ ". Try again" + RESET);
			}
		} while (dbl < lowerBound || dbl > upperBound);
		return dbl;
	}

	// Non-Numerical
	// Char Input
	public char readChar() {
		char ch;
		String str;
		do {
			str = key.next();
			ch = str.charAt(0);
			key.nextLine();// Buffer clear
			if (!(str.length() == 1)) {
				System.out.println(RED + "ERROR. Input was larger than one character. Try again" + RESET);
			}
		} while (!(str.length() == 1));
		return ch;
	}

	public char readChar(String validCharacters) {
		char ch;
		boolean error;
		char check = '?';
		int count = 0;
		do {
			ch = readChar();
			for (int i = 0; i < validCharacters.length() - 1; i++) {
				check = validCharacters.charAt(i);
				if (check == ch) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(RED + "ERROR. Input does not match allowed characters. Try again" + RESET);
				error = true;
			} else
				error = false;
		} while (error == true);
		return ch;
	}

	public char readVowel() {
		char ch;
		do {
			ch = readChar();
			if (!(String.valueOf(ch).matches("[aeiouAEIOUáéíóúÁÉÍÓÚ]"))) {
				System.out.println(RED + "ERROR. Input isn't a vowel. Try again" + RESET);
			}
		} while (!(String.valueOf(ch).matches("[aeiouAEIOUáéíóúÁÉÍÓÚ]")));
		return ch;
	}

	public char readDigit() {
		char ch;
		do {
			ch = readChar();
			if (!(String.valueOf(ch).matches("[0-9]"))) {
				System.out.println(RED + "ERROR. Input isn't a digit. Try again" + RESET);
			}
		} while (!(String.valueOf(ch).matches("[0-9]")));
		return ch;
	}

	public char readUpperCase() {
		char ch;
		do {
			ch = readChar();
			if (!(String.valueOf(ch).matches("[A-ZÑ]"))) {
				System.out.println(RED + "ERROR. Introduced character isn't valid. Try again" + RESET);
			}
		} while (!(String.valueOf(ch).matches("[A-ZÑ]")));
		return ch;

	}

	public char readLowerCase() {
		char ch;
		do {
			ch = readChar();
			if (!(String.valueOf(ch).matches("[a-zñ]"))) {
				System.out.println(RED + "ERROR. Introduced character isn't valid. Try again" + RESET);
			}
		} while (!(String.valueOf(ch).matches("[a-zñ]")));
		return ch;
	}

	// String Input
	public String readString() {
		String str;
		str = key.nextLine();
		return str;
	}

	public String readString(int maxLength) {
		String str;
		do {
			str = readString();
			if (str.length() > maxLength) {
				System.out.println(RED + "ERROR. Input exceeds " + maxLength + ". Try again" + RESET);
			}
		} while (str.length() > maxLength);
		return str;
	}

	// Boolean Input

	public boolean readBooleanUsingChar(char affirmativeValue) {
		char ch;
		ch = readChar();
		if (String.valueOf(ch).regionMatches(true, 0, String.valueOf(affirmativeValue), 0, 1)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {
		char ch;
		boolean error;
		do {
			ch = readChar();
			error = false;
			if (String.valueOf(ch).regionMatches(true, 0, String.valueOf(affirmativeValue), 0, 1)) {
				return true;
			} else if (String.valueOf(ch).regionMatches(true, 0, String.valueOf(negativeValue), 0, 1)) {
				return false;
			} else {
				System.out.println(RED + "ERROR. Input does not match " + affirmativeValue + " or " + negativeValue
						+ ". Try again" + RESET);
				error = true;
			}
		} while (error);
		return false;// Para evitar errores, nunca se devolverá.
	}

	public boolean readBooleanUsingInt(int affirmativeValue) {
		int in;
		in = readInt();
		if (in == affirmativeValue) {
			return true;
		} else {
			return false;
		}
	}

	public boolean readBooleanUsingInt() {
		int in;
		in = readInt();
		if (in == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean readBooleanUsingInt(int affirmativeValue, int negativeValue) {
		int in;
		boolean error;
		do {
			in = readInt();
			error = false;
			if (in == affirmativeValue) {
				return true;
			} else if (in == negativeValue) {
				return false;
			} else {
				System.out.println(RED + "ERROR. Input does not match " + affirmativeValue + " or " + negativeValue
						+ ". Try again" + RESET);
				error = true;
			}
		} while (error);
		return false;// Para evitar errores, nunca se devolverá.
	}

}
