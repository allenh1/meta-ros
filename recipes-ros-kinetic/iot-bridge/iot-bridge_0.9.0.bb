# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The iot_bridge provides a bi-directional bridge between ROS and the OpenHAB Home"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-requests rospy rostopic"
SRC_URI = "https://github.com/ros-gbp/iot_bridge-release/archive/release/kinetic/iot_bridge/0.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c12ae790ae69a8b9678e635822a85ac0"
SRC_URI[sha256sum] = "4a4c794d1f100121b7bee42dcc83688aa0b98a3bf3412c8177ebba1d0345bf8b"
S = "${WORKDIR}/iot_bridge-release-release-kinetic-iot_bridge-0.9.0-0"

inherit catkin
