# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The um6 package provides a C++ implementation of the CH Robotics serial protocol"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime roscpp roslint sensor-msgs serial"
SRC_URI = "https://github.com/ros-drivers-gbp/${PN}-release/archive/release/kinetic/${PN}/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "95ad3786309f29766f03e065be21c7d0"
SRC_URI[sha256sum] = "1b683e0baa0ded774e95c807164fb115d6533f861a54dcc709007a2a4d4cd680"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.1.2-0"

inherit catkin
