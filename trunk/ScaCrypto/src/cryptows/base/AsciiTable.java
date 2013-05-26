package cryptows.base;

import java.util.ArrayList;
import java.util.List;

public class AsciiTable
{

    private List<Symbol> symbols;

    public AsciiTable()
    {
        symbols = new ArrayList<Symbol>();
        symbols.add(new Symbol("0", "000", "00", "00000000", "(NUL)"));
        symbols.add(new Symbol("1", "001", "01", "00000001", "(SOH)"));
        symbols.add(new Symbol("2", "002", "02", "00000010", "(STX)"));
        symbols.add(new Symbol("3", "003", "03", "00000011", "(ETX)"));
        symbols.add(new Symbol("4", "004", "04", "00000100", "(EOT)"));
        symbols.add(new Symbol("5", "005", "05", "00000101", "(ENQ)"));
        symbols.add(new Symbol("6", "006", "06", "00000110", "(ACK)"));
        symbols.add(new Symbol("7", "007", "07", "00000111", "(BEL)"));
        symbols.add(new Symbol("8", "010", "08", "00001000", "(BS)"));
        symbols.add(new Symbol("9", "011", "09", "00001001", "(HT)"));
        symbols.add(new Symbol("10", "012", "0A", "00001010", "(LF)"));
        symbols.add(new Symbol("11", "013", "0B", "00001011", "(VT)"));
        symbols.add(new Symbol("12", "014", "0C", "00001100", "(FF)"));
        symbols.add(new Symbol("13", "015", "0D", "00001101", "(CR)"));
        symbols.add(new Symbol("14", "016", "0E", "00001110", "(SO)"));
        symbols.add(new Symbol("15", "017", "0F", "00001111", "(SI)"));
        symbols.add(new Symbol("16", "020", "10", "00010000", "(DLE)"));
        symbols.add(new Symbol("17", "021", "11", "00010001", "(DC1)"));
        symbols.add(new Symbol("18", "022", "12", "00010010", "(DC2)"));
        symbols.add(new Symbol("19", "023", "13", "00010011", "(DC3)"));
        symbols.add(new Symbol("20", "024", "14", "00010100", "(DC4)"));
        symbols.add(new Symbol("21", "025", "15", "00010101", "(NAK)"));
        symbols.add(new Symbol("22", "026", "16", "00010110", "(SYN)"));
        symbols.add(new Symbol("23", "027", "17", "00010111", "(ETB)"));
        symbols.add(new Symbol("24", "030", "18", "00011000", "(CAN)"));
        symbols.add(new Symbol("25", "031", "19", "00011001", "(EM)"));
        symbols.add(new Symbol("26", "032", "1A", "00011010", "(SUB)"));
        symbols.add(new Symbol("27", "033", "1B", "00011011", "(ESC)"));
        symbols.add(new Symbol("28", "034", "1C", "00011100", "(FS)"));
        symbols.add(new Symbol("29", "035", "1D", "00011101", "(GS)"));
        symbols.add(new Symbol("30", "036", "1E", "00011110", "(RS)"));
        symbols.add(new Symbol("31", "037", "1F", "00011111", "(US)"));
        symbols.add(new Symbol("32", "040", "20", "00100000", " "));
        symbols.add(new Symbol("33", "041", "21", "00100001", "!"));
        symbols.add(new Symbol("34", "042", "22", "00100010", "\""));
        symbols.add(new Symbol("35", "043", "23", "00100011", "#"));
        symbols.add(new Symbol("36", "044", "24", "00100100", "$"));
        symbols.add(new Symbol("37", "045", "25", "00100101", "%"));
        symbols.add(new Symbol("38", "046", "26", "00100110", "&"));
        symbols.add(new Symbol("39", "047", "27", "00100111", "'"));
        symbols.add(new Symbol("40", "050", "28", "00101000", "("));
        symbols.add(new Symbol("41", "051", "29", "00101001", ")"));
        symbols.add(new Symbol("42", "052", "2A", "00101010", "*"));
        symbols.add(new Symbol("43", "053", "2B", "00101011", "+"));
        symbols.add(new Symbol("44", "054", "2C", "00101100", ","));
        symbols.add(new Symbol("45", "055", "2D", "00101101", "-"));
        symbols.add(new Symbol("46", "056", "2E", "00101110", "."));
        symbols.add(new Symbol("47", "057", "2F", "00101111", "/"));
        symbols.add(new Symbol("48", "060", "30", "00110000", "0"));
        symbols.add(new Symbol("49", "061", "31", "00110001", "1"));
        symbols.add(new Symbol("50", "062", "32", "00110010", "2"));
        symbols.add(new Symbol("51", "063", "33", "00110011", "3"));
        symbols.add(new Symbol("52", "064", "34", "00110100", "4"));
        symbols.add(new Symbol("53", "065", "35", "00110101", "5"));
        symbols.add(new Symbol("54", "066", "36", "00110110", "6"));
        symbols.add(new Symbol("55", "067", "37", "00110111", "7"));
        symbols.add(new Symbol("56", "070", "38", "00111000", "8"));
        symbols.add(new Symbol("57", "071", "39", "00111001", "9"));
        symbols.add(new Symbol("58", "072", "3A", "00111010", ":"));
        symbols.add(new Symbol("59", "073", "3B", "00111011", ";"));
        symbols.add(new Symbol("60", "074", "3C", "00111100", "<"));
        symbols.add(new Symbol("61", "075", "3D", "00111101", "="));
        symbols.add(new Symbol("62", "076", "3E", "00111110", ">"));
        symbols.add(new Symbol("63", "077", "3F", "00111111", "?"));
        symbols.add(new Symbol("64", "100", "40", "01000000", "@"));
        symbols.add(new Symbol("65", "101", "41", "01000001", "A"));
        symbols.add(new Symbol("66", "102", "42", "01000010", "B"));
        symbols.add(new Symbol("67", "103", "43", "01000011", "C"));
        symbols.add(new Symbol("68", "104", "44", "01000100", "D"));
        symbols.add(new Symbol("69", "105", "45", "01000101", "E"));
        symbols.add(new Symbol("70", "106", "46", "01000110", "F"));
        symbols.add(new Symbol("71", "107", "47", "01000111", "G"));
        symbols.add(new Symbol("72", "110", "48", "01001000", "H"));
        symbols.add(new Symbol("73", "111", "49", "01001001", "I"));
        symbols.add(new Symbol("74", "112", "4A", "01001010", "J"));
        symbols.add(new Symbol("75", "113", "4B", "01001011", "K"));
        symbols.add(new Symbol("76", "114", "4C", "01001100", "L"));
        symbols.add(new Symbol("77", "115", "4D", "01001101", "M"));
        symbols.add(new Symbol("78", "116", "4E", "01001110", "N"));
        symbols.add(new Symbol("79", "117", "4F", "01001111", "O"));
        symbols.add(new Symbol("80", "120", "50", "01010000", "P"));
        symbols.add(new Symbol("81", "121", "51", "01010001", "Q"));
        symbols.add(new Symbol("82", "122", "52", "01010010", "R"));
        symbols.add(new Symbol("83", "123", "53", "01010011", "S"));
        symbols.add(new Symbol("84", "124", "54", "01010100", "T"));
        symbols.add(new Symbol("85", "125", "55", "01010101", "U"));
        symbols.add(new Symbol("86", "126", "56", "01010110", "V"));
        symbols.add(new Symbol("87", "127", "57", "01010111", "W"));
        symbols.add(new Symbol("88", "130", "58", "01011000", "X"));
        symbols.add(new Symbol("89", "131", "59", "01011001", "Y"));
        symbols.add(new Symbol("90", "132", "5A", "01011010", "Z"));
        symbols.add(new Symbol("91", "133", "5B", "01011011", "["));
        symbols.add(new Symbol("92", "134", "5C", "01011100", "\\"));
        symbols.add(new Symbol("93", "135", "5D", "01011101", "]"));
        symbols.add(new Symbol("94", "136", "5E", "01011110", "^"));
        symbols.add(new Symbol("95", "137", "5F", "01011111", "_"));
        symbols.add(new Symbol("96", "140", "60", "01100000", "`"));
        symbols.add(new Symbol("97", "141", "61", "01100001", "a"));
        symbols.add(new Symbol("98", "142", "62", "01100010", "b"));
        symbols.add(new Symbol("99", "143", "63", "01100011", "c"));
        symbols.add(new Symbol("100", "144", "64", "01100100", "d"));
        symbols.add(new Symbol("101", "145", "65", "01100101", "e"));
        symbols.add(new Symbol("102", "146", "66", "01100110", "f"));
        symbols.add(new Symbol("103", "147", "67", "01100111", "g"));
        symbols.add(new Symbol("104", "150", "68", "01101000", "h"));
        symbols.add(new Symbol("105", "151", "69", "01101001", "i"));
        symbols.add(new Symbol("106", "152", "6A", "01101010", "j"));
        symbols.add(new Symbol("107", "153", "6B", "01101011", "k"));
        symbols.add(new Symbol("108", "154", "6C", "01101100", "l"));
        symbols.add(new Symbol("109", "155", "6D", "01101101", "m"));
        symbols.add(new Symbol("110", "156", "6E", "01101110", "n"));
        symbols.add(new Symbol("111", "157", "6F", "01101111", "o"));
        symbols.add(new Symbol("112", "160", "70", "01110000", "p"));
        symbols.add(new Symbol("113", "161", "71", "01110001", "q"));
        symbols.add(new Symbol("114", "162", "72", "01110010", "r"));
        symbols.add(new Symbol("115", "163", "73", "01110011", "s"));
        symbols.add(new Symbol("116", "164", "74", "01110100", "t"));
        symbols.add(new Symbol("117", "165", "75", "01110101", "u"));
        symbols.add(new Symbol("118", "166", "76", "01110110", "v"));
        symbols.add(new Symbol("119", "167", "77", "01110111", "w"));
        symbols.add(new Symbol("120", "170", "78", "01111000", "x"));
        symbols.add(new Symbol("121", "171", "79", "01111001", "y"));
        symbols.add(new Symbol("122", "172", "7A", "01111010", "z"));
        symbols.add(new Symbol("123", "173", "7B", "01111011", "{"));
        symbols.add(new Symbol("124", "174", "7C", "01111100", "|"));
        symbols.add(new Symbol("125", "175", "7D", "01111101", "}"));
        symbols.add(new Symbol("126", "176", "7E", "01111110", "~"));
        symbols.add(new Symbol("127", "177", "7F", "01111111", "(DEL)"));
        symbols.add(new Symbol("128", "200", "80", "10000000", "€"));
        symbols.add(new Symbol("129", "201", "81", "10000001", " "));
        symbols.add(new Symbol("130", "202", "82", "10000010", "‚"));
        symbols.add(new Symbol("131", "203", "83", "10000011", "ƒ"));
        symbols.add(new Symbol("132", "204", "84", "10000100", "„"));
        symbols.add(new Symbol("133", "205", "85", "10000101", "…"));
        symbols.add(new Symbol("134", "206", "86", "10000110", "†"));
        symbols.add(new Symbol("135", "207", "87", "10000111", "‡"));
        symbols.add(new Symbol("136", "210", "88", "10001000", "ˆ"));
        symbols.add(new Symbol("137", "211", "89", "10001001", "‰"));
        symbols.add(new Symbol("138", "212", "8A", "10001010", "Š"));
        symbols.add(new Symbol("139", "213", "8B", "10001011", "‹"));
        symbols.add(new Symbol("140", "214", "8C", "10001100", "Œ"));
        symbols.add(new Symbol("141", "215", "8D", "10001101", " "));
        symbols.add(new Symbol("142", "216", "8E", "10001110", "Ž"));
        symbols.add(new Symbol("143", "217", "8F", "10001111", " "));
        symbols.add(new Symbol("144", "220", "90", "10010000", " "));
        symbols.add(new Symbol("145", "221", "91", "10010001", "‘"));
        symbols.add(new Symbol("146", "222", "92", "10010010", "’"));
        symbols.add(new Symbol("147", "223", "93", "10010011", "“"));
        symbols.add(new Symbol("148", "224", "94", "10010100", "�?"));
        symbols.add(new Symbol("149", "225", "95", "10010101", "•"));
        symbols.add(new Symbol("150", "226", "96", "10010110", "–"));
        symbols.add(new Symbol("151", "227", "97", "10010111", "—"));
        symbols.add(new Symbol("152", "230", "98", "10011000", "˜"));
        symbols.add(new Symbol("153", "231", "99", "10011001", "™"));
        symbols.add(new Symbol("154", "232", "9A", "10011010", "š"));
        symbols.add(new Symbol("155", "233", "9B", "10011011", "›"));
        symbols.add(new Symbol("156", "234", "9C", "10011100", "œ"));
        symbols.add(new Symbol("157", "235", "9D", "10011101", " "));
        symbols.add(new Symbol("158", "236", "9E", "10011110", "ž"));
        symbols.add(new Symbol("159", "237", "9F", "10011111", "Ÿ"));
        symbols.add(new Symbol("160", "240", "A0", "10100000", " "));
        symbols.add(new Symbol("161", "241", "A1", "10100001", "¡"));
        symbols.add(new Symbol("162", "242", "A2", "10100010", "¢"));
        symbols.add(new Symbol("163", "243", "A3", "10100011", "£"));
        symbols.add(new Symbol("164", "244", "A4", "10100100", "¤"));
        symbols.add(new Symbol("165", "245", "A5", "10100101", "¥"));
        symbols.add(new Symbol("166", "246", "A6", "10100110", "¦"));
        symbols.add(new Symbol("167", "247", "A7", "10100111", "§"));
        symbols.add(new Symbol("168", "250", "A8", "10101000", "¨"));
        symbols.add(new Symbol("169", "251", "A9", "10101001", "©"));
        symbols.add(new Symbol("170", "252", "AA", "10101010", "ª"));
        symbols.add(new Symbol("171", "253", "AB", "10101011", "«"));
        symbols.add(new Symbol("172", "254", "AC", "10101100", "¬"));
        symbols.add(new Symbol("173", "255", "AD", "10101101", "­"));
        symbols.add(new Symbol("174", "256", "AE", "10101110", "®"));
        symbols.add(new Symbol("175", "257", "AF", "10101111", "¯"));
        symbols.add(new Symbol("176", "260", "B0", "10110000", "°"));
        symbols.add(new Symbol("177", "261", "B1", "10110001", "±"));
        symbols.add(new Symbol("178", "262", "B2", "10110010", "²"));
        symbols.add(new Symbol("179", "263", "B3", "10110011", "³"));
        symbols.add(new Symbol("180", "264", "B4", "10110100", "´"));
        symbols.add(new Symbol("181", "265", "B5", "10110101", "µ"));
        symbols.add(new Symbol("182", "266", "B6", "10110110", "¶"));
        symbols.add(new Symbol("183", "267", "B7", "10110111", "•"));
        symbols.add(new Symbol("184", "270", "B8", "10111000", "¸"));
        symbols.add(new Symbol("185", "271", "B9", "10111001", "¹"));
        symbols.add(new Symbol("186", "272", "BA", "10111010", "º"));
        symbols.add(new Symbol("187", "273", "BB", "10111011", "»"));
        symbols.add(new Symbol("188", "274", "BC", "10111100", "¼"));
        symbols.add(new Symbol("189", "275", "BD", "10111101", "½"));
        symbols.add(new Symbol("190", "276", "BE", "10111110", "¾"));
        symbols.add(new Symbol("191", "277", "BF", "10111111", "¿"));
        symbols.add(new Symbol("192", "300", "C0", "11000000", "À"));
        symbols.add(new Symbol("193", "301", "C1", "11000001", "�?"));
        symbols.add(new Symbol("194", "302", "C2", "11000010", "Â"));
        symbols.add(new Symbol("195", "303", "C3", "11000011", "Ã"));
        symbols.add(new Symbol("196", "304", "C4", "11000100", "Ä"));
        symbols.add(new Symbol("197", "305", "C5", "11000101", "Å"));
        symbols.add(new Symbol("198", "306", "C6", "11000110", "Æ"));
        symbols.add(new Symbol("199", "307", "C7", "11000111", "Ç"));
        symbols.add(new Symbol("200", "310", "C8", "11001000", "È"));
        symbols.add(new Symbol("201", "311", "C9", "11001001", "É"));
        symbols.add(new Symbol("202", "312", "CA", "11001010", "Ê"));
        symbols.add(new Symbol("203", "313", "CB", "11001011", "Ë"));
        symbols.add(new Symbol("204", "314", "CC", "11001100", "Ì"));
        symbols.add(new Symbol("205", "315", "CD", "11001101", "�?"));
        symbols.add(new Symbol("206", "316", "CE", "11001110", "Î"));
        symbols.add(new Symbol("207", "317", "CF", "11001111", "�?"));
        symbols.add(new Symbol("208", "320", "D0", "11010000", "�?"));
        symbols.add(new Symbol("209", "321", "D1", "11010001", "Ñ"));
        symbols.add(new Symbol("210", "322", "D2", "11010010", "Ò"));
        symbols.add(new Symbol("211", "323", "D3", "11010011", "Ó"));
        symbols.add(new Symbol("212", "324", "D4", "11010100", "Ô"));
        symbols.add(new Symbol("213", "325", "D5", "11010101", "Õ"));
        symbols.add(new Symbol("214", "326", "D6", "11010110", "Ö"));
        symbols.add(new Symbol("215", "327", "D7", "11010111", "×"));
        symbols.add(new Symbol("216", "330", "D8", "11011000", "Ø"));
        symbols.add(new Symbol("217", "331", "D9", "11011001", "Ù"));
        symbols.add(new Symbol("218", "332", "DA", "11011010", "Ú"));
        symbols.add(new Symbol("219", "333", "DB", "11011011", "Û"));
        symbols.add(new Symbol("220", "334", "DC", "11011100", "Ü"));
        symbols.add(new Symbol("221", "335", "DD", "11011101", "�?"));
        symbols.add(new Symbol("222", "336", "DE", "11011110", "Þ"));
        symbols.add(new Symbol("223", "337", "DF", "11011111", "ß"));
        symbols.add(new Symbol("224", "340", "E0", "11100000", "à"));
        symbols.add(new Symbol("225", "341", "E1", "11100001", "á"));
        symbols.add(new Symbol("226", "342", "E2", "11100010", "â"));
        symbols.add(new Symbol("227", "343", "E3", "11100011", "ã"));
        symbols.add(new Symbol("228", "344", "E4", "11100100", "ä"));
        symbols.add(new Symbol("229", "345", "E5", "11100101", "å"));
        symbols.add(new Symbol("230", "346", "E6", "11100110", "æ"));
        symbols.add(new Symbol("231", "347", "E7", "11100111", "ç"));
        symbols.add(new Symbol("232", "350", "E8", "11101000", "è"));
        symbols.add(new Symbol("233", "351", "E9", "11101001", "é"));
        symbols.add(new Symbol("234", "352", "EA", "11101010", "ê"));
        symbols.add(new Symbol("235", "353", "EB", "11101011", "ë"));
        symbols.add(new Symbol("236", "354", "EC", "11101100", "ì"));
        symbols.add(new Symbol("237", "355", "ED", "11101101", "í"));
        symbols.add(new Symbol("238", "356", "EE", "11101110", "î"));
        symbols.add(new Symbol("239", "357", "EF", "11101111", "ï"));
        symbols.add(new Symbol("240", "360", "F0", "11110000", "ð"));
        symbols.add(new Symbol("241", "361", "F1", "11110001", "ñ"));
        symbols.add(new Symbol("242", "362", "F2", "11110010", "ò"));
        symbols.add(new Symbol("243", "363", "F3", "11110011", "ó"));
        symbols.add(new Symbol("244", "364", "F4", "11110100", "ô"));
        symbols.add(new Symbol("245", "365", "F5", "11110101", "õ"));
        symbols.add(new Symbol("246", "366", "F6", "11110110", "ö"));
        symbols.add(new Symbol("247", "367", "F7", "11110111", "÷"));
        symbols.add(new Symbol("248", "370", "F8", "11111000", "ø"));
        symbols.add(new Symbol("249", "371", "F9", "11111001", "ù"));
        symbols.add(new Symbol("250", "372", "FA", "11111010", "ú"));
        symbols.add(new Symbol("251", "373", "FB", "11111011", "û"));
        symbols.add(new Symbol("252", "374", "FC", "11111100", "ü"));
        symbols.add(new Symbol("253", "375", "FD", "11111101", "ý"));
        symbols.add(new Symbol("254", "376", "FE", "11111110", "þ"));
        symbols.add(new Symbol("255", "377", "FF", "11111111", "ÿ"));
    }

    public List<Symbol> getTable()
    {
        return this.symbols;
    }

    public Symbol getSymbolGivenBinary(String binary)
    {
        if (binary != null)
        {
            for (Symbol symbol : this.symbols)
            {
                if (symbol.getBinary().equals(binary))
                {
                    return symbol;
                }
            }
        }
        return null;
    }

    public Symbol getSymbolGivenOctal(String octal)
    {
        if (octal != null)
        {
            for (Symbol symbol : this.symbols)
            {
                if (symbol.getOctal().equals(octal))
                {
                    return symbol;
                }
            }
        }
        return null;
    }

    public Symbol getSymbolGivenDecimal(String decimal)
    {
        if (decimal != null)
        {
            for (Symbol symbol : this.symbols)
            {
                if (symbol.getDecimal().equals(decimal))
                {
                    return symbol;
                }
            }
        }
        return null;
    }

    public Symbol getSymbolGivenHexa(String hexa)
    {
        if (hexa != null)
        {
            String hexaUC = hexa.toUpperCase();
            for (Symbol symbol : this.symbols)
            {
                if (symbol.getHexa().equals(hexaUC))
                {
                    return symbol;
                }
            }
        }
        return null;
    }

    public Symbol getSymbolGivenCaracter(String symbol)
    {
        if (symbol != null)
        {
            for (Symbol objSymbol : this.symbols)
            {
                if (objSymbol.getCaracter().equals(symbol))
                {
                    return objSymbol;
                }
            }
        }
        return null;
    }

    public StringBuffer stringToBinary(StringBuffer str)
    {
        if (str != null)
        {
            int tam = str.length();
            StringBuffer sbBinary = new StringBuffer("");
            for (int i = 0; i < tam; i++)
            {
                String ch = str.substring(i, i + 1);
                Symbol s = this.getSymbolGivenCaracter(ch);
                if (s != null)
                {
                    sbBinary.append(s.getBinary());
                }
            }
            return sbBinary;
        }
        return null;
    }

    public StringBuffer hexaToString(StringBuffer hexa)
    {
        if (hexa != null)
        {
            int tam = hexa.length();
            StringBuffer sb = new StringBuffer("");
            if ((tam >= 2) && (tam % 2 == 0))
            {
                for (int i = 0; i < tam; i += 2)
                {
                    String hex = hexa.substring(i, i + 2);
                    Symbol s = this.getSymbolGivenHexa(hex);
                    if (s != null)
                    {
                        sb.append(s.getCaracter());
                    }
                }
                return sb;
            }
        }
        return null;
    }

    public StringBuffer hexaToBinary(StringBuffer hexa)
    {
        if (hexa != null)
        {
            int tam = hexa.length();
            StringBuffer sbBinary = new StringBuffer("");
            for (int i = 0; i < tam; i += 2)
            {
                String hex = hexa.substring(i, i + 2);
                Symbol s = this.getSymbolGivenHexa(hex);
                if (s != null)
                {
                    sbBinary.append(s.getBinary());
                }
            }
            return sbBinary;
        }
        return null;
    }

    public StringBuffer binaryToString(StringBuffer binary)
    {
        if (binary != null)
        {
            int tam = binary.length();
            int resto = tam % 8;
            if(resto != 0)
            {
                for(int j = 0; j < (8-resto); j++)
                {
                    binary = binary.insert(0, "0");
                }
            }
            tam = binary.length();
            resto = tam % 8;
            StringBuffer sb = new StringBuffer("");
            StringBuffer binaryAux = binary.reverse();
            for (int i = 0; (i+8) <= tam; i += 8)
            {
                StringBuffer hex = new StringBuffer(binaryAux.substring(i, i + 8));
                hex = hex.reverse();
                Symbol s = this.getSymbolGivenBinary(hex.toString());
                if (s != null)
                {
                    sb.append(s.getCaracter());
                }
            }
            return sb.reverse();
        }
        return null;
    }

    public StringBuffer binaryToHexa(StringBuffer binary)
    {
        if (binary != null)
        {
            int tam = binary.length();
            StringBuffer sbHexa = new StringBuffer("");
            for (int i = 0; i < tam; i += 8)
            {
                String bin = binary.substring(i, i + 8);
                Symbol s = this.getSymbolGivenBinary(bin);
                if (s != null)
                {
                    sbHexa.append(s.getHexa());
                }
            }
            return sbHexa;
        }
        return null;
    }
}
