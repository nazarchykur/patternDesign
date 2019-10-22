package com.company.behavioral.iterator.example_2.iterators;

import com.company.behavioral.iterator.example_2.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}