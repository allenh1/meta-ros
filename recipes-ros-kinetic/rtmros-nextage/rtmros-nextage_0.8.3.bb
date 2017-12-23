# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rtmros_nextage package is a ROS interface for  dual-armed robot from Kawada "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nextage-calibration nextage-description nextage-gazebo nextage-ik-plugin nextage-moveit-config nextage-ros-bridge"
SRC_URI = "https://github.com/tork-a/rtmros_nextage-release/archive/release/kinetic/rtmros_nextage/0.8.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "83fa46fb383baf7018f99a0463d4e7c8"
SRC_URI[sha256sum] = "e6a7fb1604f1749f2599e7e38a988f28a52a39b903d9d16ada5e02bb8e03be95"
S = "${WORKDIR}/rtmros_nextage-release-release-kinetic-rtmros_nextage-0.8.3-0"

inherit catkin
