# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "posedetection_msgs provides messages and services to facilitate passing pose det"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cv-bridge geometry-msgs message-filters message-generation message-runtime roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/posedetection_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "56306d851a4a8521969b30db3d5e0168"
SRC_URI[sha256sum] = "a153c3833620a76b5a7511ff97df8ce759c461cf9e84858192be8ad36918f9d3"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-posedetection_msgs-4.3.1-0"

inherit catkin
