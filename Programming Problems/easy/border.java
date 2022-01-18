String[] solution(String[] picture) {
    String[] framedPicture = new String[picture.length + 2];

    for(int i = 0 ; i < picture.length ; i++) {
        framedPicture[i+1] = '*' + picture[i] + '*';
    }

    framedPicture[0] = framedPicture[picture.length + 1] = framedPicture[1].replaceAll(".","*");

    return framedPicture;
}
