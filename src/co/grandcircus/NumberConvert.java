/**
 * 
 */
package co.grandcircus;

/**
 * @author cciric
 *
 */
public class NumberConvert {

	public String convertSingleDigit(int a) {
		String result = null;
		if (a == 0) {
			result = "zero";
		} else if (a == 1) {
			result = "one";
		}
		else if (a == 2) {
			result = "two";
		} else if (a == 3) {
			result = "three";
		} else if (a == 4) {
			result = "four";
		} else if (a == 5) {
			result = "five";
		} else if (a == 6) {
			result = "six";
		} else if (a == 7) {
			result = "seven";
		} else if (a == 8) {
			result = "eight";
		} else if (a == 9) {
			result = "nine";
		}

		return result;
	}

	public String convertTens(int a) {
		String result = null;
		if (a < 10) {
			result = convertSingleDigit(a);

		} else if (a == 10) {
			result = "ten";
		}
		else if (a == 11) {
			result = "eleven";
		} else if (a == 12) {
			result = "twelve";
		} else if (a == 13) {
			result = "thirteen";
		} else if (a == 14) {
			result = "fourteen";
		} else if (a == 15) {
			result = "fifteen";
		} else if (a == 16) {
			result = "sixteen";
		} else if (a == 17) {
			result = "seventeen";
		} else if (a == 18) {
			result = "eighteen";
		} else if (a == 19) {
			result = "nineteen";
		}
		return result;

	}

	public String twenty() {
		return "twenty";
	}

	public String convertTwenty(int a) {
		int x = a - 20;
		String result = null;
		if (a < 10) {
			result = convertSingleDigit(a);

		} else if (a < 20 && a > 9) {
			result = convertTens(a);

		} else if (a < 30 && a > 19) {
			if (a == 20) {
				result = twenty();
			}
			else if (a == 21) {
				result = twenty() + "-" + convertSingleDigit(x);
			}
			else if (a == 22) {
				result = twenty() + "-" + convertSingleDigit(x);
			} else if (a == 23) {
				result = twenty() + "-" + convertSingleDigit(x);
			} else if (a == 24) {
				result = twenty() + "-" + convertSingleDigit(x);
			} else if (a == 25) {
				result = twenty() + "-" + convertSingleDigit(x);
			} else if (a == 26) {
				result = twenty() + "-" + convertSingleDigit(x);
			} else if (a == 27) {
				result = twenty() + "-" + convertSingleDigit(x);
			} else if (a == 28) {
				result = twenty() + "-" + convertSingleDigit(x);
			} else if (a == 29) {
				result = twenty() + "-" + convertSingleDigit(x);
			}
		}

		return result;
	}

	public String thirty() {
		return "thirty";
	}

	public String convertThirty(int a) {
		int x = a - 30;
		String result = null;
		if (a < 10) {
			result = convertSingleDigit(a);

		} else if (a < 20 && a > 9) {
			result = convertTens(a);

		} else if (a < 30 && a > 19) {
			result = convertTwenty(a);

		}

		else if (a < 40 && a > 29) {
			if (a == 30) {
				result = thirty();
			} else if (a == 31) {
				result = thirty() + "-" + convertSingleDigit(x);
			} else if (a == 32) {
				result = thirty() + "-" + convertSingleDigit(x);
			} else if (a == 33) {
				result = thirty() + "-" + convertSingleDigit(x);
			} else if (a == 34) {
				result = thirty() + "-" + convertSingleDigit(x);
			} else if (a == 35) {
				result = thirty() + "-" + convertSingleDigit(x);
			} else if (a == 36) {
				result = thirty() + "-" + convertSingleDigit(x);
			} else if (a == 37) {
				result = thirty() + "-" + convertSingleDigit(x);
			} else if (a == 38) {
				result = thirty() + "-" + convertSingleDigit(x);
			} else if (a == 39) {
				result = thirty() + "-" + convertSingleDigit(x);
			}
		}

		return result;
	}

	public String forty() {
		return "forty";
	}

	public String convertForty(int a) {
		int x = a - 40;
		String result = null;
		if (a < 10) {
			result = convertSingleDigit(a);

		} else if (a < 20 && a > 9) {
			result = convertTens(a);

		} else if (a < 30 && a > 19) {
			result = convertTwenty(a);

		} else if (a < 40 && a > 29) {
			result = convertThirty(a);

		}

		else if (a < 50 && a > 39) {
			if (a == 40) {
				result = forty();
			} else if (a == 41) {
				result = forty() + "-" + convertSingleDigit(x);
			} else if (a == 42) {
				result = forty() + "-" + convertSingleDigit(x);
			} else if (a == 43) {
				result = forty() + "-" + convertSingleDigit(x);
			} else if (a == 44) {
				result = forty() + "-" + convertSingleDigit(x);
			} else if (a == 45) {
				result = forty() + "-" + convertSingleDigit(x);
			} else if (a == 46) {
				result = forty() + "-" + convertSingleDigit(x);
			} else if (a == 47) {
				result = forty() + "-" + convertSingleDigit(x);
			} else if (a == 48) {
				result = forty() + "-" + convertSingleDigit(x);
			} else if (a == 49) {
				result = forty() + "-" + convertSingleDigit(x);
			}
		}

		return result;
	}

	public String fifty() {
		return "fifty";
	}

	public String concat(String prefix, int a, int constant) {
		int x = a - constant;
		return prefix + "-" + convertSingleDigit(x);
	}

	// master convertor

	public String converter(int a) {
		String result = null;
		if (a < 10) {
			result = convertSingleDigit(a);

		} else if (a < 20 && a > 9) {
			result = convertTens(a);

		} else if (a < 30 && a > 19) {
			result = convertTwenty(a);

		} else if (a < 40 && a > 29) {
			result = convertThirty(a);

		} else if (a < 50 && a > 39) {
			result = convertForty(a);

		} else if (a < 60 && a > 49) {
			result = convertFifty(a);
		}
		else if (a < 70 && a > 59) {
			result = convertSixty(a);
		}
		else if (a < 80 && a > 69) {
			result = convertSeventy(a);
		}
		else if (a < 90 && a > 79) {
			result = convertEighty(a);
		}
		else if (a < 100 && a > 89) {
			result = convertNinety(a);
		}
		return result;

	}
	// master convertor

	public String convertFifty(int a) {
		int x = a - 50;
		String result = null;
		if (a < 50) {
			result = converter(a);
		}

		else if (a < 60 && a > 49) {
			if (a == 50) {
				result = fifty();
			} else if (a == 51) {
				result = concat("fifty", 51, 50);
			} else if (a == 52) {
				result = concat("fifty", 52, 50);
			} else if (a == 53) {
				result = concat("fifty", 53, 50);
			} else if (a == 54) {
				result = concat("fifty", 54, 50);
			} else if (a == 55) {
				result = concat("fifty", 55, 50);
			} else if (a == 56) {
				result = concat("fifty", 56, 50);
			} else if (a == 57) {
				result = concat("fifty", 57, 50);
			} else if (a == 58) {
				result = concat("fifty", 58, 50);
			} else if (a == 59) {
				result = concat("fifty", 59, 50);
			}
		}

		return result;
	}

	public String convertSixty(int a) {
		int x = a - 50;
		String num = "sixty";
		String result = null;
		if (a < 60) {
			result = converter(a);
		}

		else if (a < 70 && a > 59) {
			if (a == 60) {
				result = num;
			} else if (a == 61) {
				result = concat(num, 61, 60);
			} else if (a == 62) {
				result = concat(num, 62, 60);
			} else if (a == 63) {
				result = concat(num, 63, 60);
			} else if (a == 64) {
				result = concat(num, 64, 60);
			} else if (a == 65) {
				result = concat(num, 65, 60);
			} else if (a == 66) {
				result = concat(num, 66, 60);
			} else if (a == 67) {
				result = concat(num, 67, 60);
			} else if (a == 68) {
				result = concat(num, 68, 60);
			} else if (a == 69) {
				result = concat(num, 69, 60);
			}
		}

		return result;
	}

	public String convertSeventy(int a) {
		int x = a - 50;
		String num = "seventy";
		int y = 70;
		String result = null;
		if (a < 70) {
			result = converter(a);
		}

		else if (a < 80 && a > 69) {
			if (a == 70) {
				result = num;
			} else if (a == 71) {
				result = concat(num, 71, y);
			} else if (a == 72) {
				result = concat(num, 72, y);
			} else if (a == 73) {
				result = concat(num, 73, y);
			} else if (a == 74) {
				result = concat(num, 74, y);
			} else if (a == 75) {
				result = concat(num, 75, y);
			} else if (a == 76) {
				result = concat(num, 76, y);
			} else if (a == 77) {
				result = concat(num, 77, y);
			} else if (a == 78) {
				result = concat(num, 78, y);
			} else if (a == 79) {
				result = concat(num, 79, y);
			}
		}

		return result;
	}

	public String convertEighty(int a) {
		String num = "eighty";
		int y = 80;
		String result = null;
		if (a < 80) {
			result = converter(a);
		}

		else if (a < 90 && a > 79) {
			if (a == 80) {
				result = num;
			} else if (a == 81) {
				result = concat(num, 81, y);
			} else if (a == 82) {
				result = concat(num, 82, y);
			} else if (a == 83) {
				result = concat(num, 83, y);
			} else if (a == 84) {
				result = concat(num, 84, y);
			} else if (a == 85) {
				result = concat(num, 85, y);
			} else if (a == 86) {
				result = concat(num, 86, y);
			} else if (a == 87) {
				result = concat(num, 87, y);
			} else if (a == 88) {
				result = concat(num, 88, y);
			} else if (a == 89) {
				result = concat(num, 89, y);
			}
		}

		return result;
	}

	public String convertNinety(int a) {
		String num = "ninety";
		int y = 90;
		String result = null;
		if (a < 90) {
			result = converter(a);
		}

		else if (a < 100 && a > 89) {
			if (a == 90) {
				result = num;
			} else if (a == 91) {
				result = concat(num, 91, y);
			} else if (a == 92) {
				result = concat(num, 92, y);
			} else if (a == 93) {
				result = concat(num, 93, y);
			} else if (a == 94) {
				result = concat(num, 94, y);
			} else if (a == 95) {
				result = concat(num, 95, y);
			} else if (a == 96) {
				result = concat(num, 96, y);
			} else if (a == 97) {
				result = concat(num, 97, y);
			} else if (a == 98) {
				result = concat(num, 98, y);
			} else if (a == 99) {
				result = concat(num, 99, y);
			}
		}

		return result;
	}

}
