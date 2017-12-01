# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "System-wide logging mechanism for messages sent to the /rosout topic."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp rosgraph-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosout/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be391f3df61cc9c2ad16dfaa59cf36e5"
SRC_URI[sha256sum] = "fe9994f6903a4824319c2ae095fee64b25a203fe5ad06243f4d703aa9ff8c682"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosout-1.13.5-0"

inherit catkin
