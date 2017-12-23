# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "openrtm_ros_bridge package provides basic functionalities to bind     two roboti"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation openrtm-tools roscpp rostest rtmbuild std-msgs"
SRC_URI = "https://github.com/tork-a/rtmros_common-release/archive/release/kinetic/openrtm_ros_bridge/1.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "286e494fa48a8a73207e3a913a4292c4"
SRC_URI[sha256sum] = "bd98d729dfa985d85e8812fec751c9dbf1fba5cbc71a1afb5a31679a1dad2e76"
S = "${WORKDIR}/rtmros_common-release-release-kinetic-openrtm_ros_bridge-1.4.2-0"

inherit catkin
