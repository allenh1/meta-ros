# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a generic CAN interface description with helpers for filte"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost catkin-native catkin class-loader linux-kernel-headers"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/socketcan_interface/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "829be97625b89e75087f5c4f3b9e59c7"
SRC_URI[sha256sum] = "74f25ecf97674906cc0de860316236531461c59c4b0a6610cb6ca3d55497d143"
S = "${WORKDIR}/ros_canopen-release-release-lunar-socketcan_interface-0.7.6-0"

inherit catkin
