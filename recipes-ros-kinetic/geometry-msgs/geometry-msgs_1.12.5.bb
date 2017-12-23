# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "geometry_msgs provides messages for common geometric primitives     such as poin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/geometry_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "95f85b676589e1ac28480813eb2a5e3f"
SRC_URI[sha256sum] = "31d4731ed246c583fb36e41bd38e585933e2cf887d946e7da81aecda8f43d805"
S = "${WORKDIR}/common_msgs-release-release-kinetic-geometry_msgs-1.12.5-0"

inherit catkin
