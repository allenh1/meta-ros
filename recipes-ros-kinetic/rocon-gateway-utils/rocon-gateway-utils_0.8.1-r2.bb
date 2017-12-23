# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities for gateway users (avoids large dependency requirements)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gateway-msgs rocon-console rocon-python-comms rosgraph rosservice rostest"
SRC_URI = "https://github.com/yujinrobot-release/rocon_multimaster-release/archive/release/kinetic/rocon_gateway_utils/0.8.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98e26dd14e858833734092fc34eba286"
SRC_URI[sha256sum] = "a9114e4cca859099aef130642d566207f6f75f5192fa3187f7d12c2c958c61b5"
S = "${WORKDIR}/rocon_multimaster-release-release-kinetic-rocon_gateway_utils-0.8.1-2"

inherit catkin
