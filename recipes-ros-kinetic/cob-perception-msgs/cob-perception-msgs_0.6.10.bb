# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains common message type definitions for perception tasks."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/kinetic/cob_perception_msgs/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "950b642586dc96390cab5136bdd26a8c"
SRC_URI[sha256sum] = "67c31f4b697c3fe729712b34ef00565e7cd2ca1cb39665054fb6f7de9fb31f38"
S = "${WORKDIR}/cob_perception_common-release-release-kinetic-cob_perception_msgs-0.6.10-0"

inherit catkin
