# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a generic CAN interface description with helpers for filte"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost catkin-native class-loader linux-kernel-headers"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/socketcan_interface/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b642511d1c50d93fc6c0a7f019fc0d21"
SRC_URI[sha256sum] = "df6527c2739f946d163a118b25e1be562e061ea0f8810e688f63d0f6ec60b940"
S = "${WORKDIR}/ros_canopen-release-release-lunar-socketcan_interface-0.7.5-0"

inherit catkin
