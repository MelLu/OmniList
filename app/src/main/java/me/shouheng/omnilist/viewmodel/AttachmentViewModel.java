package me.shouheng.omnilist.viewmodel;

import android.arch.lifecycle.LiveData;

import me.shouheng.omnilist.model.Attachment;
import me.shouheng.omnilist.model.data.Resource;
import me.shouheng.omnilist.repository.AttachmentRepository;
import me.shouheng.omnilist.repository.BaseRepository;


/**
 * Created by WangShouheng on 2018/3/13.*/
public class AttachmentViewModel extends BaseViewModel<Attachment> {

    @Override
    protected BaseRepository<Attachment> getRepository() {
        return new AttachmentRepository();
    }

    public LiveData<Resource<Attachment>> saveIfNew(Attachment attachment) {
        return ((AttachmentRepository) getRepository()).saveIfNew(attachment);
    }
}
