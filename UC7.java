public class UC7 {

    // Static inner class to store character and its pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Patterns for characters
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                "   ***   ",
                "  ** **  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "  ** **  ",
                "   ***   "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                "  *****  ",
                " **      ",
                " **      ",
                "  ****   ",
                "     **  ",
                "     **  ",
                " *****   "
        });

        // Banner characters (OOPS)
        CharacterPatternMap[] bannerChars = {O, O, P, S};

        // Build and print banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap c : bannerChars) {
                line.append(c.getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}