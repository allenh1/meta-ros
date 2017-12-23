# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages for commonly used sensors, including     cameras a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/sensor_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c38a48e3c232d0eb5546d1dab4d76955"
SRC_URI[sha256sum] = "7fece41e988080526210f19d552d5774ec314e2ca09aa0ba5a3ecfccd201ed4a"
S = "${WORKDIR}/common_msgs-release-release-kinetic-sensor_msgs-1.12.5-0"

inherit catkin
