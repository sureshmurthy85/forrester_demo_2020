
// ListTest.java --
//
// ListTest.java is part of CloudBees Flow.
//
// Copyright (c) 2020 CloudBees, Inc.
// All rights reserved.
//

package com.demo.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ListTest
{

    //~ Static fields/initializers ---------------------------------------------

    private static List<String> USERS = Arrays.asList("joe", "john", "mickey");

    //~ Instance fields --------------------------------------------------------

    private List<String> m_list = new ArrayList<>();

    //~ Methods ----------------------------------------------------------------

    @Test public void addExisting()
    {
        m_list.add("joe");
        assertTrue(m_list.contains("joe"));
    }

    @Test public void contains()
    {
        m_list.add("katie");
        assertTrue(m_list.contains("katie"));
    }

    @Ignore @Test public void ignored_test()
    {
        assertFalse(m_list.contains("matthew"));
    }

    @Test public void missing()
    {
        assertFalse(m_list.contains("matthew"));
    }
}
