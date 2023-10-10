class ResistorColor {
   public static int colorCode(String color) {
        int code=-1;
        String[] colours=ResistorColor.colors();
        for(int i=0;i<colours.length;i++)
        {
            if (color.equals(colours[i])) {
                code = i;
            }
        }
        return code;
    }

   public static String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
