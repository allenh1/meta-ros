# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rospatlite"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/${PN}/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ff3133c7fa629971913573548cde5b9d"
SRC_URI[sha256sum] = "fed6ee9aff990d894d9c8e4d8ad071d5ca7a130165be9ad43d5de672ec04a3a3"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-${PN}-2.1.6-0"

inherit catkin
