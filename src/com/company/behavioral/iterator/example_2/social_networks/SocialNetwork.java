package com.company.behavioral.iterator.example_2.social_networks;

import com.company.behavioral.iterator.example_2.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
