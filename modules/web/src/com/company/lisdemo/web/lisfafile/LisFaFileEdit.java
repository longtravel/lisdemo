package com.company.lisdemo.web.lisfafile;

import com.haulmont.cuba.gui.screen.*;
import com.company.lisdemo.entity.LisFaFile;

@UiController("lisdemo_LisFaFile.edit")
@UiDescriptor("lis-fa-file-edit.xml")
@EditedEntityContainer("lisFaFileDc")
@LoadDataBeforeShow
public class LisFaFileEdit extends StandardEditor<LisFaFile> {
}