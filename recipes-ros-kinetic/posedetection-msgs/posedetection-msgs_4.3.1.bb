# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "posedetection_msgs provides messages and services to facilitate passing pose det"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge geometry-msgs message-filters message-generation message-runtime roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/kinetic/posedetection_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1ceb71685f980ee24c1e3d4ea0e23fdc"
SRC_URI[sha256sum] = "049d55fae694d1e3d4a63450b71cc99a3205dd807303b173616ce6fdc8ea90b5"
S = "${WORKDIR}/jsk_common_msgs-release-release-kinetic-posedetection_msgs-4.3.1-0"

inherit catkin
