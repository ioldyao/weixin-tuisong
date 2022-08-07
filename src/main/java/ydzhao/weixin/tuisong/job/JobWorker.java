package ydzhao.weixin.tuisong.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ydzhao.weixin.tuisong.util.Pusher;

/**
 *@ClassName JobWorker
 *@Description TODO
 *@Author ydzhao
 *@Date 2022/8/2 16:00
 */
@Component
public class JobWorker {
    //要推送的用户openid
    private static String openId = "oLUEX6Ahtw-O7EkjsgL0NcPC5dBM";
    private static String suz = "oLUEX6DdaoY2ZaI7figIQjFOCi-o";
    private static String mxp = "oLUEX6JFetIM5my9Pq10mYw3eMlI";

    @Scheduled(cron = "0 50 9 ? * MON-FRI")
    @Scheduled(cron = "0 00 19 ? * MON-FRI")
    public void goodMorning(){
        Pusher.push(openId);
        Pusher.push(suz);
        Pusher.push(mxp);

    }

}
