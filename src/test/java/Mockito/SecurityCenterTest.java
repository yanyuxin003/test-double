package Mockito;


import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

public class SecurityCenterTest {
    SecurityCenter securityCenter;
    DoorPanel doorPanel;

    @BeforeEach
    public  void setUp(){
        doorPanel= Mockito.mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(doorPanel).close();//看方法是否被调用
    }
}