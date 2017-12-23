# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_cam3d_throttle: only for Trottel"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native message-filters nodelet pluginlib roscpp sensor-msgs"
SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/kinetic/cob_cam3d_throttle/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a463825eb19486dae159aef14571f3d4"
SRC_URI[sha256sum] = "e257c1e48887c1218657f3a98f1e5deec03a7422848de19dea6d4e0d0f52fd08"
S = "${WORKDIR}/cob_perception_common-release-release-kinetic-cob_cam3d_throttle-0.6.10-0"

inherit catkin
