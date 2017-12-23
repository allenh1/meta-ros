# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package modeling the run-time dependencies for language bindings of messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common genpy roscpp-serialization roscpp-traits rostime"
SRC_URI = "https://github.com/ros-gbp/message_runtime-release/archive/release/kinetic/message_runtime/0.4.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2fb82a095bd29a6e2d4dd12aa8c502eb"
SRC_URI[sha256sum] = "9e29a95de191b68b2a6734663ff4eff585f7c8ef70cbc8e3b1e04c9f05f00d32"
S = "${WORKDIR}/message_runtime-release-release-kinetic-message_runtime-0.4.12-0"

inherit catkin
