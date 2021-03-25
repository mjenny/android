package org.cryptomator.data.cloud.pcloud;

import org.cryptomator.domain.Cloud;
import org.cryptomator.domain.CloudFile;
import org.cryptomator.util.Optional;

import java.util.Date;

class PCloudFile implements CloudFile, PCloudNode {

	private final PCloudFolder parent;
	private final String name;
	private final String path;
	private final Long fileId;
	private final Optional<Long> size;
	private final Optional<Date> modified;

	public PCloudFile(PCloudFolder parent, String name, String path, Long fileId, Optional<Long> size, Optional<Date> modified) {
		this.parent = parent;
		this.name = name;
		this.path = path;
		this.fileId = fileId;
		this.size = size;
		this.modified = modified;
	}

	@Override
	public Cloud getCloud() {
		return parent.getCloud();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPath() {
		return path;
	}

	@Override
	public Long getId() {
		return fileId;
	}

	@Override
	public PCloudFolder getParent() {
		return parent;
	}

	@Override
	public Optional<Long> getSize() {
		return size;
	}

	@Override
	public Optional<Date> getModified() {
		return modified;
	}

}
