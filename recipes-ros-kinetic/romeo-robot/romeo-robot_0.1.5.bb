# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The romeo_robot metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native romeo-bringup romeo-description romeo-sensors-py"
SRC_URI = "https://github.com/ros-aldebaran/romeo_robot-release/archive/release/kinetic/romeo_robot/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1588be5b1453648877f10a51d40d4b0e"
SRC_URI[sha256sum] = "f410114726372ee2f24f2bf67ff4aa4976c5f0560024dde71cb6bcfa9f1841db"
S = "${WORKDIR}/romeo_robot-release-release-kinetic-romeo_robot-0.1.5-0"

inherit catkin
