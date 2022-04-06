package 适配器模式.dao;

/***
 #Create by LCK on 2022/2/16
 # 用法:更高级的媒体播放器
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
