package 适配器模式.daoimpl;

import 适配器模式.dao.AdvancedMediaPlayer;

/***
 #Create by LCK on 2022/2/16
 # 用法:
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.Name:"+fileName);
    }
}
