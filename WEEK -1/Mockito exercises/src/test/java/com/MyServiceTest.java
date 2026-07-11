package com;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class MyServiceTest {
    @Test
    public void testExternalApi(){
        ExternalApi mock= Mockito.mock(ExternalApi.class);
        when(mock.getData()).thenReturn("Mock Data");
        MyService s=new MyService(mock);
        assertEquals("Mock Data",s.fetchData());
        verify(mock).getData();
    }

}