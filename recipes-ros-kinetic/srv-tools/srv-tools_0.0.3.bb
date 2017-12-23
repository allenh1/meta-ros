# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Stack with interesting ROS tools"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bag-tools catkin-native launch-tools plot-tools pointcloud-tools tf-tools"
SRC_URI = "https://github.com/srv/srv_tools-release/archive/release/kinetic/srv_tools/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "939741ebe8caeb0dc1c9fd9c3d853ca5"
SRC_URI[sha256sum] = "1ab6be9e947d3fe2f3ca32d6a3f2318d2dc769d5fca3ea25744e5d85a9da369b"
S = "${WORKDIR}/srv_tools-release-release-kinetic-srv_tools-0.0.3-0"

inherit catkin
