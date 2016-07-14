package com.laoniu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFoo {
    @Test
    public void test() {
        Foo foo = new Foo();
        assertEquals(foo.hello(1), "bar");
    }
}
