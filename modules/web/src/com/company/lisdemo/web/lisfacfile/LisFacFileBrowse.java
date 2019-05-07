package com.company.lisdemo.web.lisfacfile;

import com.haulmont.cuba.gui.screen.*;
import com.company.lisdemo.entity.LisFacFile;

@UiController("lisdemo_LisFacFile.browse")
@UiDescriptor("lis-fac-file-browse.xml")
@LookupComponent("lisFacFilesTable")
@LoadDataBeforeShow
public class LisFacFileBrowse extends StandardLookup<LisFacFile> {
}