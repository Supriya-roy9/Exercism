class ResistorColor {
    String[] color_names = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    int colorCode(String color) {
        for (int i = 0; i < 10 ; i++) {
            if(color_names[i].equals(color))
                return i;

        }
        return -1;
    }

    String[] colors() {
        return color_names;
    }
}
