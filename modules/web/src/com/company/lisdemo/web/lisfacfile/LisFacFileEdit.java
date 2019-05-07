package com.company.lisdemo.web.lisfacfile;

import com.haulmont.cuba.gui.screen.*;
import com.company.lisdemo.entity.LisFacFile;

@UiController("lisdemo_LisFacFile.edit")
@UiDescriptor("lis-fac-file-edit.xml")
@EditedEntityContainer("lisFacFileDc")
@LoadDataBeforeShow
public class LisFacFileEdit extends StandardEditor<LisFacFile> {
}