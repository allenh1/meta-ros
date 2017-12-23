# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains utilities used within the object detection tool chain."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cmake-modules libopencv-dev roscpp libtinyxml visualization-msgs"
SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/kinetic/cob_vision_utils/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8240a5e7876736264338749aaeaa0029"
SRC_URI[sha256sum] = "94ddb7961ac5f6faebb4ef0ee43713e6fa72cecfd26c4e594e3a4ba872421291"
S = "${WORKDIR}/cob_perception_common-release-release-kinetic-cob_vision_utils-0.6.10-0"

inherit catkin
