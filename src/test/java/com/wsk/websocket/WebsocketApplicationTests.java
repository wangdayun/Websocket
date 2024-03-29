package com.wsk.websocket;

import com.wsk.websocket.server.WebSocket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebsocketApplicationTests {

    @Test
    public void contextLoads() throws Exception {
        for (WebSocket item : WebSocket.webSocketSet) {
            item.sendMessageAll("要下雨了..!");
        }
    }

}
