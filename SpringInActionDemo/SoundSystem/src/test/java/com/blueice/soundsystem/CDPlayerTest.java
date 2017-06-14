package com.blueice.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Administrator on 2017/6/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private BlankDisc cd;

    @Autowired
    private SgtPeppers sp;

    @Test
    public void cdShouldNotBeNull(){
        cd.play();
        System.out.println(cd.getTitle());
        System.out.println(cd.getArtist());
        System.out.println(sp.getTitle());
        System.out.println(sp.getArtist());
        assertNotNull(cd);
//        assertEquals(
//                "Playing Sgt. Pepper的孤独的心灵俱乐部乐队 by 披头士\n",log.getLog()
//        );
    }
}
