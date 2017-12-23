# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ur_bringup package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native tf2-ros ur-description ur-driver"
SRC_URI = "https://github.com/ros-industrial-release/universal_robot-release/archive/release/kinetic/ur_bringup/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bd53794fb4eb6b676c6418e08d4d7ae5"
SRC_URI[sha256sum] = "24d83dfabff0b571bc426b6aa1c36508f69d18755b11738f8c6006939e5cab5a"
S = "${WORKDIR}/universal_robot-release-release-kinetic-ur_bringup-1.2.0-0"

inherit catkin
