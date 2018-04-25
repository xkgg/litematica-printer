package fi.dy.masa.litematica.gui;

import java.io.File;

public interface IDirectoryNavigator
{
    File getCurrentDirectory();

    void switchToDirectory(File dir);

    void switchToParentDirectory();

    void switchToRootDirectory();
}
