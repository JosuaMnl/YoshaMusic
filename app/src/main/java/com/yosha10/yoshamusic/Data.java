package com.yosha10.yoshamusic;

import java.util.ArrayList;

public class Data {
    public static String[][] data = new String[][]{
            {"YOASOBI PLAYLIST [All Yoasobi updated song_11/11/2021] Japanese+English version", "•Music and pictures all belongs to right owner \n" +
                    "Sorry for any mistakes\n" +
                    "Do not reupload\n" +
                    "Hope you guys enjoy this video\uD83D\uDC9C", "vYcDnSmFpxo"},
            {"Coldplay Greatest Hits Full Album 2021|| Coldplay Best Songs Playlist 2021", "Coldplay Greatest Hits Full Album 2021|| Coldplay Best Songs Playlist 2021\n" +
                    "Coldplay Greatest Hits Full Album 2021|| Coldplay Best Songs Playlist 2021\n" +
                    "Coldplay Greatest Hits Full Album 2021|| Coldplay Best Songs Playlist 2021\n" +
                    "link: https://youtu.be/iUyBzYK7GUw", "iUyBzYK7GUw"},
            {"TULUS FULL ALBUM", "Track List\n" +
                    "01. Hati-Hatidi Jalan\n" +
                    "02. Monookrom \n" +
                    "03. 1000 Tahun Lamanya\n" +
                    "04. Diri\n" +
                    "05. Interaksi\n" +
                    "06. Manusia Kuat\n" +
                    "07. Sewindu\n" +
                    "08. Pamit\n" +
                    "09. Jatuh Suka\n" +
                    "10. Remedi\n" +
                    "11. Sepatu\n" +
                    "12. Bunga Tidur\n" +
                    "13. Adaptasi\n" +
                    "14. Gajah\n" +
                    "15. Cahaya\n" +
                    "16. Jangan Cintai Aku Apa adanya\n" +
                    "17. Teman Hidup\n" +
                    "18. Langit Abu-Abu\n" +
                    "19. Mengaggumimu dari Jauh\n" +
                    "20. Satu Hari di Bulan Juni", "GDPKMXxQs5w"},
            {"Best Tiktok Song Playlist pt.1 | Can I call you baby - 가사 gasa lyrics", "Tracklist:\n" +
                    "01. Dhruv - Double Take\n" +
                    "02. Pink Sweat$ - At My Worst Cover by BlueD\n" +
                    "03. 24Kgoldn - Mood Cover by Salem ilense\n" +
                    "04. Bella Poarch - Build a B*itch\n" +
                    "05. Salem Ilese - Mad at Disney\n" +
                    "06. Tessa Violet - Crush", "pLUjtlulf94"}
    };

    public static ArrayList<DataModel> getData(){
        ArrayList<DataModel> dataModelArrayList = new ArrayList<>();
        for(String[] varData : data){
            DataModel dataModel = new DataModel();
            dataModel.setJudul(varData[0]);
            dataModel.setKeterangan(varData[1]);
            dataModel.setVideoid(varData[2]);

            dataModelArrayList.add(dataModel);
        }
        return dataModelArrayList;
    }
}
