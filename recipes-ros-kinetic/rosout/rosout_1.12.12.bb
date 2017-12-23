# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "System-wide logging mechanism for messages sent to the /rosout topic."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp rosgraph-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c5421b9cb31a5a928d246a3f63622bf"
SRC_URI[sha256sum] = "fcf99cdd39d659f5b8e951006c91f82a0de704643eae0b068a94f23012337025"
S = "${WORKDIR}/ros_comm-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin
