# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages for storing calibration samples      to be used in"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/kinetic/calibration_msgs/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fa4fd60bb5c18a709dd0951e244e75c8"
SRC_URI[sha256sum] = "06091916a347322682b045d233b577b718eb339d4cd9c0fb2806346e45f7187d"
S = "${WORKDIR}/calibration-release-release-kinetic-calibration_msgs-0.10.14-0"

inherit catkin
