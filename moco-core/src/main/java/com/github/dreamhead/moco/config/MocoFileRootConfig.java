package com.github.dreamhead.moco.config;

import com.github.dreamhead.moco.MocoConfig;

import static com.github.dreamhead.moco.util.Files.join;

public class MocoFileRootConfig implements MocoConfig<String> {
    private final String fileRoot;

    public MocoFileRootConfig(String fileRoot) {
        this.fileRoot = fileRoot;
    }

    @Override
    public boolean isFor(final String id) {
        return FILE_ID.equals(id);
    }

    @Override
    public String apply(final String filename) {
        return join(this.fileRoot, filename);
    }
}
