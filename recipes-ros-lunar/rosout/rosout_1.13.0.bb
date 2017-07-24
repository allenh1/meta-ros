# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "System-wide logging mechanism for messages sent to the /rosout topic."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native roscpp rosgraph-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosout/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "465f5163bf2907e84b71d447677b8fa2"
SRC_URI[sha256sum] = "7ae62287cf9fd2a708fa2975d7c07a108bccf953a735c09d7522f61938b7ca85"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosout-1.13.0-0"

inherit catkin
