package com.company.lisdemo.web.lisfafile;

import com.haulmont.cuba.gui.screen.*;
import com.company.lisdemo.entity.LisFaFile;

@UiController("lisdemo_LisFaFile.browse")
@UiDescriptor("lis-fa-file-browse.xml")
@LookupComponent("lisFaFilesTable")
@LoadDataBeforeShow
public class LisFaFileBrowse extends StandardLookup<LisFaFile> {
}