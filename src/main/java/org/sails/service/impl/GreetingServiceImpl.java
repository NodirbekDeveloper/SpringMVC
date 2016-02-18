package org.sails.service.impl;

import org.sails.properties.MainProperties;
import org.sails.service.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Nodirbek on 12.02.2016. project
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Inject
    MainProperties mainProperties;

    @Override
    public String getName() {
        return mainProperties.getName() + " " + mainProperties.getName();
    }
}
