# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack provides utilities commonly needed for a variety of computer vision t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-3d-mapping-msgs cob-cam3d-throttle cob-image-flip cob-object-detection-msgs cob-object-detection-visualizer cob-perception-msgs cob-vision-utils"
SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/kinetic/cob_perception_common/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d9144d6880b35ccaf6edecc0bee70a6"
SRC_URI[sha256sum] = "c0e8082c0cb78dbc275b7f33cb05746422639cb48717580e6514d9a11239320e"
S = "${WORKDIR}/cob_perception_common-release-release-kinetic-cob_perception_common-0.6.10-0"

inherit catkin
