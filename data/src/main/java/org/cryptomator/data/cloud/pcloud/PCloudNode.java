package org.cryptomator.data.cloud.pcloud;

import org.cryptomator.domain.CloudNode;

interface PCloudNode extends CloudNode {

	@Override
	PCloudFolder getParent();

}
