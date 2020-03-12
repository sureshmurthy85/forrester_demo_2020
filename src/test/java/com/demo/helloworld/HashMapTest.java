
// HashValueMapTest.java --
//
// HashValueMapTest.java is part of CloudBees Flow.
//
// Copyright (c) 2020 CloudBees, Inc.
// All rights reserved.
//

package com.demo.helloworld;

import org.jetbrains.annotations.NonNls;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HashMapTest
{

    //~ Static fields/initializers ---------------------------------------------

    @NonNls private static final Object VALUE1  = "value1";
    @NonNls private static final Object VALUE2  = "value2";
    @NonNls private static final String COMMAND = "command";

    //~ Instance fields --------------------------------------------------------

    private Map<String, Object> m_map = new HashMap<>();

    //~ Methods ----------------------------------------------------------------

    @SuppressWarnings("OverwrittenKey")
    @Test public void childOverride()
    {
        m_map.put(COMMAND, VALUE1);
        m_map.put(COMMAND, VALUE2); // override
        assertEquals("value2", VALUE2, m_map.get(COMMAND));
    }

    @Test public void constructor_map()
    {
        m_map = Collections.singletonMap("foo", "bar");
        assertEquals("result", "bar", m_map.get("foo"));
    }
}
