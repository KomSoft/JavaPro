package lection3;

public class StringDemo {
    public static void main(String[] args) {
/*
        String str1 = "Java";
        System.out.println(str1.length());
        String empty = "";
        if(empty.isEmpty()) {
            System.out.println("Empty");
        }
        str1 = null;
        String str2 = "str2" + str1;    // !!!! Внимание! результат будет "str2null"
        System.out.println(str2);
*/
        String line = "aaabccdddc";
        System.out.println(line + " ---> " +  line.chars().distinct().count() );

        line = "тестируем character в java";
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i == 0 || chars[i-1] == ' ' ) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(line + " ---> " + new String(chars));

        String line1 = "Hello";
        String line2 = "World";
        String line3 = "HelloWorld";
        String line4 = (line1 + line2).intern();
        System.out.println(line3 == line4);
        String line5 = "Hello" + "World";
        System.out.println(line3 == line5);
        System.out.println(line2.concat(line3));
        System.out.println(String.join(" _ ", line1, line2, line3));

        // equals()

        // boolean regiomMatches(.....);
        String str11 = "Hello world";
        String str12 = "I work";
        // compare  "wor" (str11 from 6)  and "wor" (str12 from 2), length 3 chars
        System.out.println(str11.regionMatches(6, str12, 2,3));

        String str21 = "hello";
        String str22 = "wolrd";
        String str23 = "hell";
        System.out.println(str21.compareTo(str22));
        System.out.println(str21.compareTo(str23));

        // replaceAll()
        String java = "Строки являются важной составляющей языка Java";
        String result = java.replaceAll("и", "1");
        System.out.println(result);
        result = result.replaceAll("й", "Й");
        System.out.println(result);
        result = result.replaceAll("о", "");
        System.out.println(result);
        result = result.replaceAll("J", "Дж");
        System.out.println(result);
        result = result.replaceAll("v", "b");
        System.out.println(result);

        String[] words = java.split("[а-ж]");
        for(String word : words) {
            System.out.println(word);
        }

        String str = "Java";
        System.out.println("\nStringBuffer " + str);
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("Емкость " + strBuffer.capacity());
        strBuffer.ensureCapacity(32);
        System.out.println("Емкость " + strBuffer.capacity());
        System.out.println("Длина " + strBuffer.length());
        String strNew = strBuffer.toString();
        System.out.println(strNew);
        strBuffer.setCharAt(0, 'c');
        System.out.println(strBuffer.toString());
        strBuffer.append(" world");
        strBuffer.insert(7, "**");
        System.out.println(strBuffer.toString());
        strBuffer.replace(3,5, "new text");
        System.out.println(strBuffer.toString());

    }

}