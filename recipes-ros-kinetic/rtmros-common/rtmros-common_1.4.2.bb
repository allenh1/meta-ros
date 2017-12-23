# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package suite that provides all the capabilities for     the ROS users to conn"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hrpsys-ros-bridge hrpsys-tools openrtm-ros-bridge openrtm-tools rosnode-rtc rtmbuild"
SRC_URI = "https://github.com/tork-a/rtmros_common-release/archive/release/kinetic/rtmros_common/1.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f265c541ec7af89cc49734ba62d51ef9"
SRC_URI[sha256sum] = "9cd6690acd1914cd304d17c541f0ed1f59627720614b505f223b168e16c38641"
S = "${WORKDIR}/rtmros_common-release-release-kinetic-rtmros_common-1.4.2-0"

inherit catkin
