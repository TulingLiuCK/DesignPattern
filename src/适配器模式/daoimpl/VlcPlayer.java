package 适配器模式.daoimpl;

import 适配器模式.dao.AdvancedMediaPlayer;

/***
 #Create by LCK on 2022/2/16
 # 用法:
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name :"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
