# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Kobuki's capabilities"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kobuki-node nodelet rocon-app-manager rocon-apps std-capabilities"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_capabilities/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "73b8ffdf86ed7cc93c4f41e7dd149dc8"
SRC_URI[sha256sum] = "14615c110de41a7e184c83fda5875ae1eec79127ad139f2fe36e50ceb9239177"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_capabilities-0.7.4-0"

inherit catkin
