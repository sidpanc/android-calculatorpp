package org.solovyev.android.translations;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Transient;

import java.util.ArrayList;
import java.util.List;

@Root(strict = false)
public class Resources {
    @ElementList(inline = true)
    public List<ResourceString> strings = new ArrayList<>();
    @Transient
    public String comment;

    public Resources() {
    }
}
