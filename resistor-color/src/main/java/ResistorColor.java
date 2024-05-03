class ResistorColor {
    String[] color_names = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    int colorCode(String color) {
        for (int index = 0; index < 10 ; index++) {
            if(color_names[index].equals(color))
                return index;

        }
        return -1;
    }

    String[] colors() {
        return color_names;
    }
}
