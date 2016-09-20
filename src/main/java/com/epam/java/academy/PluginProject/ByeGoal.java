package com.epam.java.academy.PluginProject;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo( name = "saybye")
public class ByeGoal extends AbstractMojo{
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Bye");
    }
}
